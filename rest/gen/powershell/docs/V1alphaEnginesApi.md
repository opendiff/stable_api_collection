# PSOpenAPITools.PSOpenAPITools/Api.V1alphaEnginesApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-V1alphaEnginesListEngines**](V1alphaEnginesApi.md#Invoke-V1alphaEnginesListEngines) | **GET** /v1alpha/engines/list | list


<a name="Invoke-V1alphaEnginesListEngines"></a>
# **Invoke-V1alphaEnginesListEngines**
> ListEnginesResponseBody Invoke-V1alphaEnginesListEngines<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Organization] <String><br>

list

List all engines available to your organization/user

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure API key authorization: api_key_header_Authorization
$Configuration.ApiKey.Authorization = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.Authorization = "Bearer"

$Organization = "org-123456" # String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)

# list
try {
    $Result = Invoke-V1alphaEnginesListEngines -Organization $Organization
} catch {
    Write-Host ("Exception occurred when calling Invoke-V1alphaEnginesListEngines: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

### Return type

[**ListEnginesResponseBody**](ListEnginesResponseBody.md) (PSCustomObject)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

