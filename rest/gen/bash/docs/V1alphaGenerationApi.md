# V1alphaGenerationApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaGenerationImageToImage**](V1alphaGenerationApi.md#v1alphaGenerationImageToImage) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
[**v1alphaGenerationMasking**](V1alphaGenerationApi.md#v1alphaGenerationMasking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
[**v1alphaGenerationTextToImage**](V1alphaGenerationApi.md#v1alphaGenerationTextToImage) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image



## v1alphaGenerationImageToImage

image-to-image

Generate big fancy pictures from small fancy pictures

### Example

```bash
 v1alphaGenerationImageToImage engine_id=value Accept:value Organization:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **string** |  | [default to null]
 **accept** | **string** |  | [default to null]
 **initImage** | **binary** | Initial image to use for the image-to-image generation | [default to null]
 **options** | [**ImageToImageOptions**](ImageToImageOptions.md) |  | [default to null]
 **organization** | **string** | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## v1alphaGenerationMasking

image-to-image/masking

Paint fancy things into fancy pictures

### Example

```bash
 v1alphaGenerationMasking engine_id=value Accept:value Organization:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **string** |  | [default to null]
 **accept** | **string** |  | [default to null]
 **initImage** | **binary** | Initial image to use for the image-to-image generation | [default to null]
 **options** | [**MaskingOptions**](MaskingOptions.md) |  | [default to null]
 **organization** | **string** | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. | [optional] [default to null]
 **maskImage** | **binary** | Optional mask image to use for masking. Must be the same dimensions as the 'init_image'. Use the 'mask_source' option to specify whether the white or black pixels should be inpainted. (Note: if you set 'mask_source' to 'INIT_IMAGE_ALPHA' you can omit the 'mask_image' parameter completely.) | [optional] [default to null]

### Return type

(empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## v1alphaGenerationTextToImage

text-to-image

Generate an image from text

### Example

```bash
 v1alphaGenerationTextToImage engine_id=value Accept:value Organization:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **string** |  | [default to null]
 **accept** | **string** |  | [default to null]
 **textToImageRequestBody** | [**TextToImageRequestBody**](TextToImageRequestBody.md) |  |
 **organization** | **string** | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. | [optional] [default to null]

### Return type

(empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

