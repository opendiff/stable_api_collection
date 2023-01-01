# OpenapiClient::V1alphaGenerationApi

All URIs are relative to *https://api.stability.ai*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**v1alpha_generation_image_to_image**](V1alphaGenerationApi.md#v1alpha_generation_image_to_image) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image |
| [**v1alpha_generation_masking**](V1alphaGenerationApi.md#v1alpha_generation_masking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking |
| [**v1alpha_generation_text_to_image**](V1alphaGenerationApi.md#v1alpha_generation_text_to_image) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image |


## v1alpha_generation_image_to_image

> v1alpha_generation_image_to_image(engine_id, accept, init_image, options, opts)

image-to-image

Generate big fancy pictures from small fancy pictures

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: api_key_header_Authorization
  config.api_key['api_key_header_Authorization'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['api_key_header_Authorization'] = 'Bearer'
end

api_instance = OpenapiClient::V1alphaGenerationApi.new
engine_id = 'stable-diffusion-512-v2-0' # String |  
accept = 'image/png' # String |  
init_image = File.new('/path/to/some/file') # File | Initial image to use for the image-to-image generation
options = TODO # ImageToImageOptions | 
opts = {
  organization: 'org-123456' # String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
}

begin
  # image-to-image
  api_instance.v1alpha_generation_image_to_image(engine_id, accept, init_image, options, opts)
rescue OpenapiClient::ApiError => e
  puts "Error when calling V1alphaGenerationApi->v1alpha_generation_image_to_image: #{e}"
end
```

#### Using the v1alpha_generation_image_to_image_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> v1alpha_generation_image_to_image_with_http_info(engine_id, accept, init_image, options, opts)

```ruby
begin
  # image-to-image
  data, status_code, headers = api_instance.v1alpha_generation_image_to_image_with_http_info(engine_id, accept, init_image, options, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue OpenapiClient::ApiError => e
  puts "Error when calling V1alphaGenerationApi->v1alpha_generation_image_to_image_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **engine_id** | **String** |   |  |
| **accept** | **String** |   |  |
| **init_image** | **File** | Initial image to use for the image-to-image generation |  |
| **options** | [**ImageToImageOptions**](ImageToImageOptions.md) |  |  |
| **organization** | **String** | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] |

### Return type

nil (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/vnd.goa.error


## v1alpha_generation_masking

> v1alpha_generation_masking(engine_id, accept, init_image, options, opts)

image-to-image/masking

Paint fancy things into fancy pictures

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: api_key_header_Authorization
  config.api_key['api_key_header_Authorization'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['api_key_header_Authorization'] = 'Bearer'
end

api_instance = OpenapiClient::V1alphaGenerationApi.new
engine_id = 'stable-diffusion-512-v2-0' # String |  
accept = 'image/png' # String |  
init_image = File.new('/path/to/some/file') # File | Initial image to use for the image-to-image generation
options = TODO # MaskingOptions | 
opts = {
  organization: 'org-123456', # String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
  mask_image: File.new('/path/to/some/file') # File | Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.)
}

begin
  # image-to-image/masking
  api_instance.v1alpha_generation_masking(engine_id, accept, init_image, options, opts)
rescue OpenapiClient::ApiError => e
  puts "Error when calling V1alphaGenerationApi->v1alpha_generation_masking: #{e}"
end
```

#### Using the v1alpha_generation_masking_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> v1alpha_generation_masking_with_http_info(engine_id, accept, init_image, options, opts)

```ruby
begin
  # image-to-image/masking
  data, status_code, headers = api_instance.v1alpha_generation_masking_with_http_info(engine_id, accept, init_image, options, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue OpenapiClient::ApiError => e
  puts "Error when calling V1alphaGenerationApi->v1alpha_generation_masking_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **engine_id** | **String** |   |  |
| **accept** | **String** |   |  |
| **init_image** | **File** | Initial image to use for the image-to-image generation |  |
| **options** | [**MaskingOptions**](MaskingOptions.md) |  |  |
| **organization** | **String** | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] |
| **mask_image** | **File** | Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.) | [optional] |

### Return type

nil (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/vnd.goa.error


## v1alpha_generation_text_to_image

> v1alpha_generation_text_to_image(engine_id, accept, text_to_image_request_body, opts)

text-to-image

Generate an image from text

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure API key authorization: api_key_header_Authorization
  config.api_key['api_key_header_Authorization'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['api_key_header_Authorization'] = 'Bearer'
end

api_instance = OpenapiClient::V1alphaGenerationApi.new
engine_id = 'stable-diffusion-512-v2-0' # String |  
accept = 'image/png' # String |  
text_to_image_request_body = OpenapiClient::TextToImageRequestBody.new({text_prompts: [{"text": "A lighthouse on a cliff", "weight": 1}]}) # TextToImageRequestBody | 
opts = {
  organization: 'org-123456' # String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
}

begin
  # text-to-image
  api_instance.v1alpha_generation_text_to_image(engine_id, accept, text_to_image_request_body, opts)
rescue OpenapiClient::ApiError => e
  puts "Error when calling V1alphaGenerationApi->v1alpha_generation_text_to_image: #{e}"
end
```

#### Using the v1alpha_generation_text_to_image_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> v1alpha_generation_text_to_image_with_http_info(engine_id, accept, text_to_image_request_body, opts)

```ruby
begin
  # text-to-image
  data, status_code, headers = api_instance.v1alpha_generation_text_to_image_with_http_info(engine_id, accept, text_to_image_request_body, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue OpenapiClient::ApiError => e
  puts "Error when calling V1alphaGenerationApi->v1alpha_generation_text_to_image_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **engine_id** | **String** |   |  |
| **accept** | **String** |   |  |
| **text_to_image_request_body** | [**TextToImageRequestBody**](TextToImageRequestBody.md) |  |  |
| **organization** | **String** | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] |

### Return type

nil (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.goa.error

