# \V1alphaGenerationApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alpha_generation_image_to_image**](V1alphaGenerationApi.md#v1alpha_generation_image_to_image) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
[**v1alpha_generation_masking**](V1alphaGenerationApi.md#v1alpha_generation_masking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
[**v1alpha_generation_text_to_image**](V1alphaGenerationApi.md#v1alpha_generation_text_to_image) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image



## v1alpha_generation_image_to_image

> v1alpha_generation_image_to_image(engine_id, accept, init_image, options, organization)
image-to-image

Generate big fancy pictures from small fancy pictures

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**engine_id** | **String** |   | [required] |
**accept** | **String** |   | [required] |
**init_image** | **std::path::PathBuf** | Initial image to use for the image-to-image generation | [required] |
**options** | [**crate::models::ImageToImageOptions**](ImageToImageOptions.md) |  | [required] |
**organization** | Option<**String**> | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. |  |

### Return type

 (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## v1alpha_generation_masking

> v1alpha_generation_masking(engine_id, accept, init_image, options, organization, mask_image)
image-to-image/masking

Paint fancy things into fancy pictures

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**engine_id** | **String** |   | [required] |
**accept** | **String** |   | [required] |
**init_image** | **std::path::PathBuf** | Initial image to use for the image-to-image generation | [required] |
**options** | [**crate::models::MaskingOptions**](MaskingOptions.md) |  | [required] |
**organization** | Option<**String**> | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. |  |
**mask_image** | Option<**std::path::PathBuf**> | Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.) |  |

### Return type

 (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## v1alpha_generation_text_to_image

> v1alpha_generation_text_to_image(engine_id, accept, text_to_image_request_body, organization)
text-to-image

Generate an image from text

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**engine_id** | **String** |   | [required] |
**accept** | **String** |   | [required] |
**text_to_image_request_body** | [**TextToImageRequestBody**](TextToImageRequestBody.md) |  | [required] |
**organization** | Option<**String**> | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. |  |

### Return type

 (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

