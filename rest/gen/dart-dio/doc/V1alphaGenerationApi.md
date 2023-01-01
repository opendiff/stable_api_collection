# openapi.api.V1alphaGenerationApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaGenerationImageToImage**](V1alphaGenerationApi.md#v1alphagenerationimagetoimage) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
[**v1alphaGenerationMasking**](V1alphaGenerationApi.md#v1alphagenerationmasking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
[**v1alphaGenerationTextToImage**](V1alphaGenerationApi.md#v1alphagenerationtexttoimage) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image


# **v1alphaGenerationImageToImage**
> v1alphaGenerationImageToImage(engineId, accept, initImage, options, organization)

image-to-image

Generate big fancy pictures from small fancy pictures

### Example
```dart
import 'package:openapi/api.dart';
// TODO Configure API key authorization: api_key_header_Authorization
//defaultApiClient.getAuthentication<ApiKeyAuth>('api_key_header_Authorization').apiKey = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//defaultApiClient.getAuthentication<ApiKeyAuth>('api_key_header_Authorization').apiKeyPrefix = 'Bearer';

final api = Openapi().getV1alphaGenerationApi();
final String engineId = stable-diffusion-512-v2-0; // String |  
final String accept = application/json; // String |  
final MultipartFile initImage = BINARY_DATA_HERE; // MultipartFile | Initial image to use for the image-to-image generation
final ImageToImageOptions options = ; // ImageToImageOptions | 
final String organization = org-123456; // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.

try {
    api.v1alphaGenerationImageToImage(engineId, accept, initImage, options, organization);
} catch on DioError (e) {
    print('Exception when calling V1alphaGenerationApi->v1alphaGenerationImageToImage: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **String**|   | 
 **accept** | **String**|   | 
 **initImage** | **MultipartFile**| Initial image to use for the image-to-image generation | 
 **options** | [**ImageToImageOptions**](ImageToImageOptions.md)|  | 
 **organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. | [optional] 

### Return type

void (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1alphaGenerationMasking**
> v1alphaGenerationMasking(engineId, accept, initImage, options, organization, maskImage)

image-to-image/masking

Paint fancy things into fancy pictures

### Example
```dart
import 'package:openapi/api.dart';
// TODO Configure API key authorization: api_key_header_Authorization
//defaultApiClient.getAuthentication<ApiKeyAuth>('api_key_header_Authorization').apiKey = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//defaultApiClient.getAuthentication<ApiKeyAuth>('api_key_header_Authorization').apiKeyPrefix = 'Bearer';

final api = Openapi().getV1alphaGenerationApi();
final String engineId = stable-diffusion-512-v2-0; // String |  
final String accept = application/json; // String |  
final MultipartFile initImage = BINARY_DATA_HERE; // MultipartFile | Initial image to use for the image-to-image generation
final MaskingOptions options = ; // MaskingOptions | 
final String organization = org-123456; // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
final MultipartFile maskImage = BINARY_DATA_HERE; // MultipartFile | Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.)

try {
    api.v1alphaGenerationMasking(engineId, accept, initImage, options, organization, maskImage);
} catch on DioError (e) {
    print('Exception when calling V1alphaGenerationApi->v1alphaGenerationMasking: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **String**|   | 
 **accept** | **String**|   | 
 **initImage** | **MultipartFile**| Initial image to use for the image-to-image generation | 
 **options** | [**MaskingOptions**](MaskingOptions.md)|  | 
 **organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. | [optional] 
 **maskImage** | **MultipartFile**| Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.) | [optional] 

### Return type

void (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1alphaGenerationTextToImage**
> v1alphaGenerationTextToImage(engineId, accept, textToImageRequestBody, organization)

text-to-image

Generate an image from text

### Example
```dart
import 'package:openapi/api.dart';
// TODO Configure API key authorization: api_key_header_Authorization
//defaultApiClient.getAuthentication<ApiKeyAuth>('api_key_header_Authorization').apiKey = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//defaultApiClient.getAuthentication<ApiKeyAuth>('api_key_header_Authorization').apiKeyPrefix = 'Bearer';

final api = Openapi().getV1alphaGenerationApi();
final String engineId = stable-diffusion-512-v2-0; // String |  
final String accept = application/json; // String |  
final TextToImageRequestBody textToImageRequestBody = {"cfg_scale":7,"clip_guidance_preset":"FAST_BLUE","height":512,"sampler":"K_DPM_2_ANCESTRAL","samples":1,"seed":0,"steps":75,"text_prompts":[{"text":"A lighthouse on a cliff","weight":1}],"width":512}; // TextToImageRequestBody | 
final String organization = org-123456; // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.

try {
    api.v1alphaGenerationTextToImage(engineId, accept, textToImageRequestBody, organization);
} catch on DioError (e) {
    print('Exception when calling V1alphaGenerationApi->v1alphaGenerationTextToImage: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **String**|   | 
 **accept** | **String**|   | 
 **textToImageRequestBody** | [**TextToImageRequestBody**](TextToImageRequestBody.md)|  | 
 **organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. | [optional] 

### Return type

void (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

