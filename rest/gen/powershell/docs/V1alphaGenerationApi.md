# PSOpenAPITools.PSOpenAPITools/Api.V1alphaGenerationApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-V1alphaGenerationImageToImage**](V1alphaGenerationApi.md#Invoke-V1alphaGenerationImageToImage) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
[**Invoke-V1alphaGenerationMasking**](V1alphaGenerationApi.md#Invoke-V1alphaGenerationMasking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
[**Invoke-V1alphaGenerationTextToImage**](V1alphaGenerationApi.md#Invoke-V1alphaGenerationTextToImage) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image


<a name="Invoke-V1alphaGenerationImageToImage"></a>
# **Invoke-V1alphaGenerationImageToImage**
> void Invoke-V1alphaGenerationImageToImage<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EngineId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Accept] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-InitImage] <System.IO.FileInfo><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Options] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Organization] <String><br>

image-to-image

Generate big fancy pictures from small fancy pictures

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure API key authorization: api_key_header_Authorization
$Configuration.ApiKey.Authorization = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.Authorization = "Bearer"

$EngineId = "stable-diffusion-512-v2-0" # String |  
$Accept = "image/png" # String |  
$InitImage =  # System.IO.FileInfo | Initial image to use for the image-to-image generation
 # ImageToImageOptions | 
$Organization = "org-123456" # String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)

# image-to-image
try {
    $Result = Invoke-V1alphaGenerationImageToImage -EngineId $EngineId -Accept $Accept -InitImage $InitImage -Options $Options -Organization $Organization
} catch {
    Write-Host ("Exception occurred when calling Invoke-V1alphaGenerationImageToImage: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **EngineId** | **String**|   | 
 **Accept** | **String**|   | 
 **InitImage** | **System.IO.FileInfo****System.IO.FileInfo**| Initial image to use for the image-to-image generation | 
 **Options** | [**ImageToImageOptions**](ImageToImageOptions.md)|  | 
 **Organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

### Return type

void (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Invoke-V1alphaGenerationMasking"></a>
# **Invoke-V1alphaGenerationMasking**
> void Invoke-V1alphaGenerationMasking<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EngineId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Accept] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-InitImage] <System.IO.FileInfo><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Options] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Organization] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MaskImage] <System.IO.FileInfo><br>

image-to-image/masking

Paint fancy things into fancy pictures

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure API key authorization: api_key_header_Authorization
$Configuration.ApiKey.Authorization = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.Authorization = "Bearer"

$EngineId = "stable-diffusion-512-v2-0" # String |  
$Accept = "image/png" # String |  
$InitImage =  # System.IO.FileInfo | Initial image to use for the image-to-image generation
 # MaskingOptions | 
$Organization = "org-123456" # String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)
$MaskImage =  # System.IO.FileInfo | Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.) (optional)

# image-to-image/masking
try {
    $Result = Invoke-V1alphaGenerationMasking -EngineId $EngineId -Accept $Accept -InitImage $InitImage -Options $Options -Organization $Organization -MaskImage $MaskImage
} catch {
    Write-Host ("Exception occurred when calling Invoke-V1alphaGenerationMasking: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **EngineId** | **String**|   | 
 **Accept** | **String**|   | 
 **InitImage** | **System.IO.FileInfo****System.IO.FileInfo**| Initial image to use for the image-to-image generation | 
 **Options** | [**MaskingOptions**](MaskingOptions.md)|  | 
 **Organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 
 **MaskImage** | **System.IO.FileInfo****System.IO.FileInfo**| Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.) | [optional] 

### Return type

void (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Invoke-V1alphaGenerationTextToImage"></a>
# **Invoke-V1alphaGenerationTextToImage**
> void Invoke-V1alphaGenerationTextToImage<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EngineId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Accept] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-TextToImageRequestBody] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Organization] <String><br>

text-to-image

Generate an image from text

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure API key authorization: api_key_header_Authorization
$Configuration.ApiKey.Authorization = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.Authorization = "Bearer"

$EngineId = "stable-diffusion-512-v2-0" # String |  
$Accept = "image/png" # String |  
$TextPrompt = Initialize-TextPrompt -Text "jum" -Weight 0.80305135
$TextToImageRequestBody = Initialize-TextToImageRequestBody -CfgScale 7 -ClipGuidancePreset "FAST_BLUE" -Height 512 -Sampler "DDIM" -Samples 1 -Seed 0 -Steps 75 -TextPrompts $TextPrompt -Width 512 # TextToImageRequestBody | 
$Organization = "org-123456" # String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)

# text-to-image
try {
    $Result = Invoke-V1alphaGenerationTextToImage -EngineId $EngineId -Accept $Accept -TextToImageRequestBody $TextToImageRequestBody -Organization $Organization
} catch {
    Write-Host ("Exception occurred when calling Invoke-V1alphaGenerationTextToImage: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **EngineId** | **String**|   | 
 **Accept** | **String**|   | 
 **TextToImageRequestBody** | [**TextToImageRequestBody**](TextToImageRequestBody.md)|  | 
 **Organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

### Return type

void (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

