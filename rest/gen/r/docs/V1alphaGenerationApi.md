# V1alphaGenerationApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1alphaGenerationImageToImage**](V1alphaGenerationApi.md#V1alphaGenerationImageToImage) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
[**V1alphaGenerationMasking**](V1alphaGenerationApi.md#V1alphaGenerationMasking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
[**V1alphaGenerationTextToImage**](V1alphaGenerationApi.md#V1alphaGenerationTextToImage) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image


# **V1alphaGenerationImageToImage**
> V1alphaGenerationImageToImage(engine_id, accept, init_image, options, organization = var.organization)

image-to-image

Generate big fancy pictures from small fancy pictures

### Example
```R
library(openapi)

var_engine_id <- "stable-diffusion-512-v2-0" # character |  
var_accept <- "application/json" # character |  
var_init_image <- File.new('/path/to/file') # data.frame | Initial image to use for the image-to-image generation
var_options <- TODO # ImageToImageOptions | 
var_organization <- "org-123456" # character | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.

#image-to-image
api_instance <- V1alphaGenerationApi$new()
# Configure API key authorization: api_key_header_Authorization
api_instance$api_client$api_keys['Authorization'] <- 'TODO_YOUR_API_KEY';
api_instance$V1alphaGenerationImageToImage(var_engine_id, var_accept, var_init_image, var_options, organization = var_organization)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **character**|   | 
 **accept** | Enum [image/png, application/json] |   | 
 **init_image** | **data.frame**| Initial image to use for the image-to-image generation | 
 **options** | [**ImageToImageOptions**](ImageToImageOptions.md)|  | 
 **organization** | **character**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

### Return type

void (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/vnd.goa.error

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK response. |  * Content-Length -  <br>  * Content-Type -  <br>  * Finish-Reason - The result of the generation process. - &#x60;SUCCESS&#x60; indicates success - &#x60;ERROR&#x60; indicates an error - &#x60;CONTENT_FILTERED&#x60; indicates the result affected by the content filter and may be blurred. <br>  * Seed -  <br>  |
| **400** | bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to &#x60;application/json&#x60; - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_file_size: The file size of one or more of the provided files is invalid - invalid_mime_type: The mime type of one or more of the provided files is invalid - invalid_prompts: One or more of the prompts contains filtered words  |  -  |
| **401** | unauthorized: API key missing or invalid |  -  |
| **403** | permission_denied: You lack the necessary permissions to perform this action |  -  |
| **404** | not_found: The requested resource was not found (e.g. specifing a model that does not exist) |  -  |

# **V1alphaGenerationMasking**
> V1alphaGenerationMasking(engine_id, accept, init_image, options, organization = var.organization, mask_image = var.mask_image)

image-to-image/masking

Paint fancy things into fancy pictures

### Example
```R
library(openapi)

var_engine_id <- "stable-diffusion-512-v2-0" # character |  
var_accept <- "application/json" # character |  
var_init_image <- File.new('/path/to/file') # data.frame | Initial image to use for the image-to-image generation
var_options <- TODO # MaskingOptions | 
var_organization <- "org-123456" # character | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
var_mask_image <- File.new('/path/to/file') # data.frame | Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.)

#image-to-image/masking
api_instance <- V1alphaGenerationApi$new()
# Configure API key authorization: api_key_header_Authorization
api_instance$api_client$api_keys['Authorization'] <- 'TODO_YOUR_API_KEY';
api_instance$V1alphaGenerationMasking(var_engine_id, var_accept, var_init_image, var_options, organization = var_organization, mask_image = var_mask_image)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **character**|   | 
 **accept** | Enum [image/png, application/json] |   | 
 **init_image** | **data.frame**| Initial image to use for the image-to-image generation | 
 **options** | [**MaskingOptions**](MaskingOptions.md)|  | 
 **organization** | **character**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 
 **mask_image** | **data.frame**| Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.) | [optional] 

### Return type

void (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/vnd.goa.error

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK response. |  * Content-Length -  <br>  * Content-Type -  <br>  * Finish-Reason - The result of the generation process. - &#x60;SUCCESS&#x60; indicates success - &#x60;ERROR&#x60; indicates an error - &#x60;CONTENT_FILTERED&#x60; indicates the result affected by the content filter and may be blurred. <br>  * Seed -  <br>  |
| **400** | bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to &#x60;application/json&#x60; - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_file_size: The file size of one or more of the provided files is invalid - invalid_mime_type: The mime type of one or more of the provided files is invalid - invalid_image_dimensions: The dimensions of the provided &#x60;init_image&#x60; and &#x60;mask_image&#x60; do not match - invalid_mask_image: The parameter &#x60;mask_source&#x60; was set to &#x60;MASK_IMAGE_WHITE&#x60; or &#x60;MASK_IMAGE_BLACK&#x60; but no &#x60;mask_image&#x60; was provided - invalid_prompts: One or more of the prompts contains filtered words  |  -  |
| **401** | unauthorized: API key missing or invalid |  -  |
| **403** | permission_denied: You lack the necessary permissions to perform this action |  -  |
| **404** | not_found: The requested resource was not found (e.g. specifing a model that does not exist) |  -  |

# **V1alphaGenerationTextToImage**
> V1alphaGenerationTextToImage(engine_id, accept, text_to_image_request_body, organization = var.organization)

text-to-image

Generate an image from text

### Example
```R
library(openapi)

var_engine_id <- "stable-diffusion-512-v2-0" # character |  
var_accept <- "application/json" # character |  
var_text_to_image_request_body <- TextToImageRequestBody$new(list(TextPrompt$new("text_example", 123)), 123, "FAST_BLUE", 123, "DDIM", 123, 123, 123, 123) # TextToImageRequestBody | 
var_organization <- "org-123456" # character | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.

#text-to-image
api_instance <- V1alphaGenerationApi$new()
# Configure API key authorization: api_key_header_Authorization
api_instance$api_client$api_keys['Authorization'] <- 'TODO_YOUR_API_KEY';
api_instance$V1alphaGenerationTextToImage(var_engine_id, var_accept, var_text_to_image_request_body, organization = var_organization)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **character**|   | 
 **accept** | Enum [image/png, application/json] |   | 
 **text_to_image_request_body** | [**TextToImageRequestBody**](TextToImageRequestBody.md)|  | 
 **organization** | **character**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

### Return type

void (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.goa.error

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK response. |  * Content-Length -  <br>  * Content-Type -  <br>  * Finish-Reason - The result of the generation process. - &#x60;SUCCESS&#x60; indicates success - &#x60;ERROR&#x60; indicates an error - &#x60;CONTENT_FILTERED&#x60; indicates the result affected by the content filter and may be blurred. <br>  * Seed -  <br>  |
| **400** | bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to &#x60;application/json&#x60; - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_prompts: One or more of the prompts contains filtered words  |  -  |
| **401** | unauthorized: API key missing or invalid |  -  |
| **403** | permission_denied: You lack the necessary permissions to perform this action |  -  |
| **404** | not_found: The requested resource was not found (e.g. specifing a model that does not exist) |  -  |

