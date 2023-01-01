# V1alphaGenerationApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaGenerationImageToImage**](V1alphaGenerationApi.md#v1alphaGenerationImageToImage) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
[**v1alphaGenerationMasking**](V1alphaGenerationApi.md#v1alphaGenerationMasking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
[**v1alphaGenerationTextToImage**](V1alphaGenerationApi.md#v1alphaGenerationTextToImage) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image



## v1alphaGenerationImageToImage

> v1alphaGenerationImageToImage(engineId, accept, initImage, options, organization)

image-to-image

Generate big fancy pictures from small fancy pictures

### Example

```java
// Import classes:
//import org.openapitools.client.api.V1alphaGenerationApi;

V1alphaGenerationApi apiInstance = new V1alphaGenerationApi();
String engineId = stable-diffusion-512-v2-0; // String |  
String accept = application/json; // String |  
File initImage = null; // File | Initial image to use for the image-to-image generation
ImageToImageOptions options = null; // ImageToImageOptions | 
String organization = org-123456; // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
try {
    apiInstance.v1alphaGenerationImageToImage(engineId, accept, initImage, options, organization);
} catch (ApiException e) {
    System.err.println("Exception when calling V1alphaGenerationApi#v1alphaGenerationImageToImage");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **String**|   | [default to null]
 **accept** | **String**|   | [default to null] [enum: image/png, application/json]
 **initImage** | **File**| Initial image to use for the image-to-image generation | [default to null]
 **options** | [**ImageToImageOptions**](ImageToImageOptions.md)|  | [default to null]
 **organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/vnd.goa.error


## v1alphaGenerationMasking

> v1alphaGenerationMasking(engineId, accept, initImage, options, organization, maskImage)

image-to-image/masking

Paint fancy things into fancy pictures

### Example

```java
// Import classes:
//import org.openapitools.client.api.V1alphaGenerationApi;

V1alphaGenerationApi apiInstance = new V1alphaGenerationApi();
String engineId = stable-diffusion-512-v2-0; // String |  
String accept = application/json; // String |  
File initImage = null; // File | Initial image to use for the image-to-image generation
MaskingOptions options = null; // MaskingOptions | 
String organization = org-123456; // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
File maskImage = null; // File | Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.)
try {
    apiInstance.v1alphaGenerationMasking(engineId, accept, initImage, options, organization, maskImage);
} catch (ApiException e) {
    System.err.println("Exception when calling V1alphaGenerationApi#v1alphaGenerationMasking");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **String**|   | [default to null]
 **accept** | **String**|   | [default to null] [enum: image/png, application/json]
 **initImage** | **File**| Initial image to use for the image-to-image generation | [default to null]
 **options** | [**MaskingOptions**](MaskingOptions.md)|  | [default to null]
 **organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] [default to null]
 **maskImage** | **File**| Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.) | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/vnd.goa.error


## v1alphaGenerationTextToImage

> v1alphaGenerationTextToImage(engineId, accept, textToImageRequestBody, organization)

text-to-image

Generate an image from text

### Example

```java
// Import classes:
//import org.openapitools.client.api.V1alphaGenerationApi;

V1alphaGenerationApi apiInstance = new V1alphaGenerationApi();
String engineId = stable-diffusion-512-v2-0; // String |  
String accept = application/json; // String |  
TextToImageRequestBody textToImageRequestBody = {"cfg_scale":7,"clip_guidance_preset":"FAST_BLUE","height":512,"sampler":"K_DPM_2_ANCESTRAL","samples":1,"seed":0,"steps":75,"text_prompts":[{"text":"A lighthouse on a cliff","weight":1}],"width":512}; // TextToImageRequestBody | 
String organization = org-123456; // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
try {
    apiInstance.v1alphaGenerationTextToImage(engineId, accept, textToImageRequestBody, organization);
} catch (ApiException e) {
    System.err.println("Exception when calling V1alphaGenerationApi#v1alphaGenerationTextToImage");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **String**|   | [default to null]
 **accept** | **String**|   | [default to null] [enum: image/png, application/json]
 **textToImageRequestBody** | [**TextToImageRequestBody**](TextToImageRequestBody.md)|  |
 **organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.goa.error

