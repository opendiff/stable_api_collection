# V1alphaGenerationAPI

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1alphaGenerationAPI_v1alphaGenerationImageToImage**](V1alphaGenerationAPI.md#V1alphaGenerationAPI_v1alphaGenerationImageToImage) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
[**V1alphaGenerationAPI_v1alphaGenerationMasking**](V1alphaGenerationAPI.md#V1alphaGenerationAPI_v1alphaGenerationMasking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
[**V1alphaGenerationAPI_v1alphaGenerationTextToImage**](V1alphaGenerationAPI.md#V1alphaGenerationAPI_v1alphaGenerationTextToImage) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image


# **V1alphaGenerationAPI_v1alphaGenerationImageToImage**
```c
// image-to-image
//
// Generate big fancy pictures from small fancy pictures
//
void V1alphaGenerationAPI_v1alphaGenerationImageToImage(apiClient_t *apiClient, char * engine_id, stability_ai_rest_api_v1alphaGenerationImageToImage_Accept_e Accept, binary_t* init_image, image_to_image_options_t * options, char * Organization);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**engine_id** | **char \*** |   | 
**Accept** | **stability_ai_rest_api_v1alphaGenerationImageToImage_Accept_e** |   | 
**init_image** | **binary_t*** | Initial image to use for the image-to-image generation | 
**options** | **[image_to_image_options_t](image_to_image_options.md) \*** |  | 
**Organization** | **char \*** | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

### Return type

void

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1alphaGenerationAPI_v1alphaGenerationMasking**
```c
// image-to-image/masking
//
// Paint fancy things into fancy pictures
//
void V1alphaGenerationAPI_v1alphaGenerationMasking(apiClient_t *apiClient, char * engine_id, stability_ai_rest_api_v1alphaGenerationMasking_Accept_e Accept, binary_t* init_image, masking_options_t * options, char * Organization, binary_t* mask_image);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**engine_id** | **char \*** |   | 
**Accept** | **stability_ai_rest_api_v1alphaGenerationMasking_Accept_e** |   | 
**init_image** | **binary_t*** | Initial image to use for the image-to-image generation | 
**options** | **[masking_options_t](masking_options.md) \*** |  | 
**Organization** | **char \*** | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 
**mask_image** | **binary_t*** | Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.) | [optional] 

### Return type

void

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1alphaGenerationAPI_v1alphaGenerationTextToImage**
```c
// text-to-image
//
// Generate an image from text
//
void V1alphaGenerationAPI_v1alphaGenerationTextToImage(apiClient_t *apiClient, char * engine_id, stability_ai_rest_api_v1alphaGenerationTextToImage_Accept_e Accept, text_to_image_request_body_t * text_to_image_request_body, char * Organization);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**engine_id** | **char \*** |   | 
**Accept** | **stability_ai_rest_api_v1alphaGenerationTextToImage_Accept_e** |   | 
**text_to_image_request_body** | **[text_to_image_request_body_t](text_to_image_request_body.md) \*** |  | 
**Organization** | **char \*** | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

### Return type

void

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

