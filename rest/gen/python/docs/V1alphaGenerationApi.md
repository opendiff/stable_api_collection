# openapi_client.V1alphaGenerationApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alpha_generation_image_to_image**](V1alphaGenerationApi.md#v1alpha_generation_image_to_image) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
[**v1alpha_generation_masking**](V1alphaGenerationApi.md#v1alpha_generation_masking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
[**v1alpha_generation_text_to_image**](V1alphaGenerationApi.md#v1alpha_generation_text_to_image) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image


# **v1alpha_generation_image_to_image**
> v1alpha_generation_image_to_image(engine_id, accept, init_image, options)

image-to-image

Generate big fancy pictures from small fancy pictures

### Example

* Api Key Authentication (api_key_header_Authorization):

```python
import time
import openapi_client
from openapi_client.api import v1alpha_generation_api
from openapi_client.model.image_to_image_options import ImageToImageOptions
from openapi_client.model.error import Error
from pprint import pprint
# Defining the host is optional and defaults to https://api.stability.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.stability.ai"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: api_key_header_Authorization
configuration.api_key['api_key_header_Authorization'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api_key_header_Authorization'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = v1alpha_generation_api.V1alphaGenerationApi(api_client)
    engine_id = "stable-diffusion-512-v2-0" # str |  
    accept = "application/json" # str |  
    init_image = open('/path/to/file', 'rb') # file_type | Initial image to use for the image-to-image generation
    options = ImageToImageOptions(
        cfg_scale=7,
        clip_guidance_preset="FAST_BLUE",
        height=512,
        sampler="K_DPM_2_ANCESTRAL",
        samples=1,
        seed=0,
        step_schedule_end=0.01,
        step_schedule_start=0.4,
        steps=75,
        text_prompts=[
            TextPrompt(
                text="jum",
                weight=0.80305135,
            ),
        ],
        width=512,
    ) # ImageToImageOptions | 
    organization = "org-123456" # str | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)

    # example passing only required values which don't have defaults set
    try:
        # image-to-image
        api_instance.v1alpha_generation_image_to_image(engine_id, accept, init_image, options)
    except openapi_client.ApiException as e:
        print("Exception when calling V1alphaGenerationApi->v1alpha_generation_image_to_image: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # image-to-image
        api_instance.v1alpha_generation_image_to_image(engine_id, accept, init_image, options, organization=organization)
    except openapi_client.ApiException as e:
        print("Exception when calling V1alphaGenerationApi->v1alpha_generation_image_to_image: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **str**|   |
 **accept** | **str**|   |
 **init_image** | **file_type**| Initial image to use for the image-to-image generation |
 **options** | [**ImageToImageOptions**](ImageToImageOptions.md)|  |
 **organization** | **str**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional]

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
**200** | OK response. |  * Content-Length -  <br>  * Content-Type -  <br>  * Finish-Reason - The result of the generation process. - &#x60;SUCCESS&#x60; indicates success - &#x60;ERROR&#x60; indicates an error - &#x60;CONTENT_FILTERED&#x60; indicates the result affected by the content filter and may be blurred. <br>  * Seed -  <br>  |
**400** | bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to &#x60;application/json&#x60; - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_file_size: The file size of one or more of the provided files is invalid - invalid_mime_type: The mime type of one or more of the provided files is invalid - invalid_prompts: One or more of the prompts contains filtered words  |  -  |
**401** | unauthorized: API key missing or invalid |  -  |
**403** | permission_denied: You lack the necessary permissions to perform this action |  -  |
**404** | not_found: The requested resource was not found (e.g. specifing a model that does not exist) |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1alpha_generation_masking**
> v1alpha_generation_masking(engine_id, accept, init_image, options)

image-to-image/masking

Paint fancy things into fancy pictures

### Example

* Api Key Authentication (api_key_header_Authorization):

```python
import time
import openapi_client
from openapi_client.api import v1alpha_generation_api
from openapi_client.model.masking_options import MaskingOptions
from openapi_client.model.error import Error
from pprint import pprint
# Defining the host is optional and defaults to https://api.stability.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.stability.ai"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: api_key_header_Authorization
configuration.api_key['api_key_header_Authorization'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api_key_header_Authorization'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = v1alpha_generation_api.V1alphaGenerationApi(api_client)
    engine_id = "stable-diffusion-512-v2-0" # str |  
    accept = "application/json" # str |  
    init_image = open('/path/to/file', 'rb') # file_type | Initial image to use for the image-to-image generation
    options = MaskingOptions(
        cfg_scale=7,
        clip_guidance_preset="FAST_BLUE",
        height=512,
        mask_source="INIT_IMAGE_ALPHA",
        sampler="K_DPM_2_ANCESTRAL",
        samples=1,
        seed=0,
        steps=75,
        text_prompts=[
            TextPrompt(
                text="jum",
                weight=0.80305135,
            ),
        ],
        width=512,
    ) # MaskingOptions | 
    organization = "org-123456" # str | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)
    mask_image = open('/path/to/file', 'rb') # file_type | Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.) (optional)

    # example passing only required values which don't have defaults set
    try:
        # image-to-image/masking
        api_instance.v1alpha_generation_masking(engine_id, accept, init_image, options)
    except openapi_client.ApiException as e:
        print("Exception when calling V1alphaGenerationApi->v1alpha_generation_masking: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # image-to-image/masking
        api_instance.v1alpha_generation_masking(engine_id, accept, init_image, options, organization=organization, mask_image=mask_image)
    except openapi_client.ApiException as e:
        print("Exception when calling V1alphaGenerationApi->v1alpha_generation_masking: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **str**|   |
 **accept** | **str**|   |
 **init_image** | **file_type**| Initial image to use for the image-to-image generation |
 **options** | [**MaskingOptions**](MaskingOptions.md)|  |
 **organization** | **str**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional]
 **mask_image** | **file_type**| Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.) | [optional]

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
**200** | OK response. |  * Content-Length -  <br>  * Content-Type -  <br>  * Finish-Reason - The result of the generation process. - &#x60;SUCCESS&#x60; indicates success - &#x60;ERROR&#x60; indicates an error - &#x60;CONTENT_FILTERED&#x60; indicates the result affected by the content filter and may be blurred. <br>  * Seed -  <br>  |
**400** | bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to &#x60;application/json&#x60; - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_file_size: The file size of one or more of the provided files is invalid - invalid_mime_type: The mime type of one or more of the provided files is invalid - invalid_image_dimensions: The dimensions of the provided &#x60;init_image&#x60; and &#x60;mask_image&#x60; do not match - invalid_mask_image: The parameter &#x60;mask_source&#x60; was set to &#x60;MASK_IMAGE_WHITE&#x60; or &#x60;MASK_IMAGE_BLACK&#x60; but no &#x60;mask_image&#x60; was provided - invalid_prompts: One or more of the prompts contains filtered words  |  -  |
**401** | unauthorized: API key missing or invalid |  -  |
**403** | permission_denied: You lack the necessary permissions to perform this action |  -  |
**404** | not_found: The requested resource was not found (e.g. specifing a model that does not exist) |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1alpha_generation_text_to_image**
> v1alpha_generation_text_to_image(engine_id, accept, text_to_image_request_body)

text-to-image

Generate an image from text

### Example

* Api Key Authentication (api_key_header_Authorization):

```python
import time
import openapi_client
from openapi_client.api import v1alpha_generation_api
from openapi_client.model.text_to_image_request_body import TextToImageRequestBody
from openapi_client.model.error import Error
from pprint import pprint
# Defining the host is optional and defaults to https://api.stability.ai
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.stability.ai"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: api_key_header_Authorization
configuration.api_key['api_key_header_Authorization'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['api_key_header_Authorization'] = 'Bearer'

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = v1alpha_generation_api.V1alphaGenerationApi(api_client)
    engine_id = "stable-diffusion-512-v2-0" # str |  
    accept = "application/json" # str |  
    text_to_image_request_body = TextToImageRequestBody(
        cfg_scale=7,
        clip_guidance_preset="FAST_BLUE",
        height=512,
        sampler="K_DPM_2_ANCESTRAL",
        samples=1,
        seed=0,
        steps=75,
        text_prompts=[
            TextPrompt(
                text="jum",
                weight=0.80305135,
            ),
        ],
        width=512,
    ) # TextToImageRequestBody | 
    organization = "org-123456" # str | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)

    # example passing only required values which don't have defaults set
    try:
        # text-to-image
        api_instance.v1alpha_generation_text_to_image(engine_id, accept, text_to_image_request_body)
    except openapi_client.ApiException as e:
        print("Exception when calling V1alphaGenerationApi->v1alpha_generation_text_to_image: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # text-to-image
        api_instance.v1alpha_generation_text_to_image(engine_id, accept, text_to_image_request_body, organization=organization)
    except openapi_client.ApiException as e:
        print("Exception when calling V1alphaGenerationApi->v1alpha_generation_text_to_image: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **str**|   |
 **accept** | **str**|   |
 **text_to_image_request_body** | [**TextToImageRequestBody**](TextToImageRequestBody.md)|  |
 **organization** | **str**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional]

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
**200** | OK response. |  * Content-Length -  <br>  * Content-Type -  <br>  * Finish-Reason - The result of the generation process. - &#x60;SUCCESS&#x60; indicates success - &#x60;ERROR&#x60; indicates an error - &#x60;CONTENT_FILTERED&#x60; indicates the result affected by the content filter and may be blurred. <br>  * Seed -  <br>  |
**400** | bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to &#x60;application/json&#x60; - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_prompts: One or more of the prompts contains filtered words  |  -  |
**401** | unauthorized: API key missing or invalid |  -  |
**403** | permission_denied: You lack the necessary permissions to perform this action |  -  |
**404** | not_found: The requested resource was not found (e.g. specifing a model that does not exist) |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

