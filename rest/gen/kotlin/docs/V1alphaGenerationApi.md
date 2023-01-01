# V1alphaGenerationApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaGenerationImageToImage**](V1alphaGenerationApi.md#v1alphaGenerationImageToImage) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
[**v1alphaGenerationMasking**](V1alphaGenerationApi.md#v1alphaGenerationMasking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
[**v1alphaGenerationTextToImage**](V1alphaGenerationApi.md#v1alphaGenerationTextToImage) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image


<a name="v1alphaGenerationImageToImage"></a>
# **v1alphaGenerationImageToImage**
> v1alphaGenerationImageToImage(engineId, accept, initImage, options, organization)

image-to-image

Generate big fancy pictures from small fancy pictures

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = V1alphaGenerationApi()
val engineId : kotlin.String = stable-diffusion-512-v2-0 // kotlin.String |  
val accept : kotlin.String = application/json // kotlin.String |  
val initImage : java.io.File = BINARY_DATA_HERE // java.io.File | Initial image to use for the image-to-image generation
val options : ImageToImageOptions =  // ImageToImageOptions | 
val organization : kotlin.String = org-123456 // kotlin.String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
try {
    apiInstance.v1alphaGenerationImageToImage(engineId, accept, initImage, options, organization)
} catch (e: ClientException) {
    println("4xx response calling V1alphaGenerationApi#v1alphaGenerationImageToImage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling V1alphaGenerationApi#v1alphaGenerationImageToImage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **kotlin.String**|   |
 **accept** | **kotlin.String**|   | [enum: image/png, application/json]
 **initImage** | **java.io.File**| Initial image to use for the image-to-image generation |
 **options** | [**ImageToImageOptions**](ImageToImageOptions.md)|  |
 **organization** | **kotlin.String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional]

### Return type

null (empty response body)

### Authorization


Configure api_key_header_Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="v1alphaGenerationMasking"></a>
# **v1alphaGenerationMasking**
> v1alphaGenerationMasking(engineId, accept, initImage, options, organization, maskImage)

image-to-image/masking

Paint fancy things into fancy pictures

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = V1alphaGenerationApi()
val engineId : kotlin.String = stable-diffusion-512-v2-0 // kotlin.String |  
val accept : kotlin.String = application/json // kotlin.String |  
val initImage : java.io.File = BINARY_DATA_HERE // java.io.File | Initial image to use for the image-to-image generation
val options : MaskingOptions =  // MaskingOptions | 
val organization : kotlin.String = org-123456 // kotlin.String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
val maskImage : java.io.File = BINARY_DATA_HERE // java.io.File | Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.)
try {
    apiInstance.v1alphaGenerationMasking(engineId, accept, initImage, options, organization, maskImage)
} catch (e: ClientException) {
    println("4xx response calling V1alphaGenerationApi#v1alphaGenerationMasking")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling V1alphaGenerationApi#v1alphaGenerationMasking")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **kotlin.String**|   |
 **accept** | **kotlin.String**|   | [enum: image/png, application/json]
 **initImage** | **java.io.File**| Initial image to use for the image-to-image generation |
 **options** | [**MaskingOptions**](MaskingOptions.md)|  |
 **organization** | **kotlin.String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional]
 **maskImage** | **java.io.File**| Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.) | [optional]

### Return type

null (empty response body)

### Authorization


Configure api_key_header_Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="v1alphaGenerationTextToImage"></a>
# **v1alphaGenerationTextToImage**
> v1alphaGenerationTextToImage(engineId, accept, textToImageRequestBody, organization)

text-to-image

Generate an image from text

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = V1alphaGenerationApi()
val engineId : kotlin.String = stable-diffusion-512-v2-0 // kotlin.String |  
val accept : kotlin.String = application/json // kotlin.String |  
val textToImageRequestBody : TextToImageRequestBody = {"cfg_scale":7,"clip_guidance_preset":"FAST_BLUE","height":512,"sampler":"K_DPM_2_ANCESTRAL","samples":1,"seed":0,"steps":75,"text_prompts":[{"text":"A lighthouse on a cliff","weight":1}],"width":512} // TextToImageRequestBody | 
val organization : kotlin.String = org-123456 // kotlin.String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
try {
    apiInstance.v1alphaGenerationTextToImage(engineId, accept, textToImageRequestBody, organization)
} catch (e: ClientException) {
    println("4xx response calling V1alphaGenerationApi#v1alphaGenerationTextToImage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling V1alphaGenerationApi#v1alphaGenerationTextToImage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **kotlin.String**|   |
 **accept** | **kotlin.String**|   | [enum: image/png, application/json]
 **textToImageRequestBody** | [**TextToImageRequestBody**](TextToImageRequestBody.md)|  |
 **organization** | **kotlin.String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional]

### Return type

null (empty response body)

### Authorization


Configure api_key_header_Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

