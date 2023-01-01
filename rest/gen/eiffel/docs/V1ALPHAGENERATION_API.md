# V1ALPHAGENERATION_API

All URIs are relative to *https://api.stability.ai*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**v1alpha_generation_image_to_image**](V1ALPHAGENERATION_API.md#v1alpha_generation_image_to_image) | **Post** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
[**v1alpha_generation_masking**](V1ALPHAGENERATION_API.md#v1alpha_generation_masking) | **Post** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
[**v1alpha_generation_text_to_image**](V1ALPHAGENERATION_API.md#v1alpha_generation_text_to_image) | **Post** /v1alpha/generation/{engine_id}/text-to-image | text-to-image


# **v1alpha_generation_image_to_image**
> v1alpha_generation_image_to_image (engine_id: STRING_32 ; accept: STRING_32 ; init_image: FILE ; options: IMAGE_TO_IMAGE_OPTIONS ; organization:  detachable STRING_32 )


image-to-image

Generate big fancy pictures from small fancy pictures


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **STRING_32**|   | [default to null]
 **accept** | **STRING_32**|   | [default to null]
 **init_image** | **FILE**| Initial image to use for the image-to-image generation | [default to null]
 **options** | [**IMAGE_TO_IMAGE_OPTIONS**](ImageToImageOptions.md)|  | [default to null]
 **organization** | **STRING_32**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1alpha_generation_masking**
> v1alpha_generation_masking (engine_id: STRING_32 ; accept: STRING_32 ; init_image: FILE ; options: MASKING_OPTIONS ; organization:  detachable STRING_32 ; mask_image:  detachable FILE )


image-to-image/masking

Paint fancy things into fancy pictures


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **STRING_32**|   | [default to null]
 **accept** | **STRING_32**|   | [default to null]
 **init_image** | **FILE**| Initial image to use for the image-to-image generation | [default to null]
 **options** | [**MASKING_OPTIONS**](MaskingOptions.md)|  | [default to null]
 **organization** | **STRING_32**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] [default to null]
 **mask_image** | **FILE**| Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.) | [optional] [default to null]

### Return type

{empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1alpha_generation_text_to_image**
> v1alpha_generation_text_to_image (engine_id: STRING_32 ; accept: STRING_32 ; text_to_image_request_body: TEXT_TO_IMAGE_REQUEST_BODY ; organization:  detachable STRING_32 )


text-to-image

Generate an image from text


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **STRING_32**|   | [default to null]
 **accept** | **STRING_32**|   | [default to null]
 **text_to_image_request_body** | [**TEXT_TO_IMAGE_REQUEST_BODY**](TEXT_TO_IMAGE_REQUEST_BODY.md)|  | 
 **organization** | **STRING_32**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] [default to null]

### Return type

{empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

