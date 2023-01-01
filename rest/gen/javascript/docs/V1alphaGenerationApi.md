# StabilityAiRestApi.V1alphaGenerationApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaGenerationImageToImage**](V1alphaGenerationApi.md#v1alphaGenerationImageToImage) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
[**v1alphaGenerationMasking**](V1alphaGenerationApi.md#v1alphaGenerationMasking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
[**v1alphaGenerationTextToImage**](V1alphaGenerationApi.md#v1alphaGenerationTextToImage) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image



## v1alphaGenerationImageToImage

> v1alphaGenerationImageToImage(engineId, accept, initImage, options, opts)

image-to-image

Generate big fancy pictures from small fancy pictures

### Example

```javascript
import StabilityAiRestApi from 'stability_ai_rest_api';
let defaultClient = StabilityAiRestApi.ApiClient.instance;
// Configure API key authorization: api_key_header_Authorization
let api_key_header_Authorization = defaultClient.authentications['api_key_header_Authorization'];
api_key_header_Authorization.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key_header_Authorization.apiKeyPrefix = 'Token';

let apiInstance = new StabilityAiRestApi.V1alphaGenerationApi();
let engineId = stable-diffusion-512-v2-0; // String |  
let accept = application/json; // String |  
let initImage = "/path/to/file"; // File | Initial image to use for the image-to-image generation
let options = new StabilityAiRestApi.ImageToImageOptions(); // ImageToImageOptions | 
let opts = {
  'organization': org-123456 // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
};
apiInstance.v1alphaGenerationImageToImage(engineId, accept, initImage, options, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **String**|   | 
 **accept** | **String**|   | 
 **initImage** | **File**| Initial image to use for the image-to-image generation | 
 **options** | [**ImageToImageOptions**](ImageToImageOptions.md)|  | 
 **organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

### Return type

null (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/vnd.goa.error


## v1alphaGenerationMasking

> v1alphaGenerationMasking(engineId, accept, initImage, options, opts)

image-to-image/masking

Paint fancy things into fancy pictures

### Example

```javascript
import StabilityAiRestApi from 'stability_ai_rest_api';
let defaultClient = StabilityAiRestApi.ApiClient.instance;
// Configure API key authorization: api_key_header_Authorization
let api_key_header_Authorization = defaultClient.authentications['api_key_header_Authorization'];
api_key_header_Authorization.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key_header_Authorization.apiKeyPrefix = 'Token';

let apiInstance = new StabilityAiRestApi.V1alphaGenerationApi();
let engineId = stable-diffusion-512-v2-0; // String |  
let accept = application/json; // String |  
let initImage = "/path/to/file"; // File | Initial image to use for the image-to-image generation
let options = new StabilityAiRestApi.MaskingOptions(); // MaskingOptions | 
let opts = {
  'organization': org-123456, // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
  'maskImage': "/path/to/file" // File | Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.)
};
apiInstance.v1alphaGenerationMasking(engineId, accept, initImage, options, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **String**|   | 
 **accept** | **String**|   | 
 **initImage** | **File**| Initial image to use for the image-to-image generation | 
 **options** | [**MaskingOptions**](MaskingOptions.md)|  | 
 **organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 
 **maskImage** | **File**| Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.) | [optional] 

### Return type

null (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/vnd.goa.error


## v1alphaGenerationTextToImage

> v1alphaGenerationTextToImage(engineId, accept, textToImageRequestBody, opts)

text-to-image

Generate an image from text

### Example

```javascript
import StabilityAiRestApi from 'stability_ai_rest_api';
let defaultClient = StabilityAiRestApi.ApiClient.instance;
// Configure API key authorization: api_key_header_Authorization
let api_key_header_Authorization = defaultClient.authentications['api_key_header_Authorization'];
api_key_header_Authorization.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key_header_Authorization.apiKeyPrefix = 'Token';

let apiInstance = new StabilityAiRestApi.V1alphaGenerationApi();
let engineId = stable-diffusion-512-v2-0; // String |  
let accept = application/json; // String |  
let textToImageRequestBody = {"cfg_scale":7,"clip_guidance_preset":"FAST_BLUE","height":512,"sampler":"K_DPM_2_ANCESTRAL","samples":1,"seed":0,"steps":75,"text_prompts":[{"text":"A lighthouse on a cliff","weight":1}],"width":512}; // TextToImageRequestBody | 
let opts = {
  'organization': org-123456 // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
};
apiInstance.v1alphaGenerationTextToImage(engineId, accept, textToImageRequestBody, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **String**|   | 
 **accept** | **String**|   | 
 **textToImageRequestBody** | [**TextToImageRequestBody**](TextToImageRequestBody.md)|  | 
 **organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

### Return type

null (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.goa.error

