# openapi_client.V1alphaGenerationApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alpha_generation_image_to_image**](V1alphaGenerationApi.md#v1alpha_generation_image_to_image) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
[**v1alpha_generation_masking**](V1alphaGenerationApi.md#v1alpha_generation_masking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
[**v1alpha_generation_text_to_image**](V1alphaGenerationApi.md#v1alpha_generation_text_to_image) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image

# **v1alpha_generation_image_to_image**
> v1alpha_generation_image_to_image(engine_idaccept)

image-to-image

Generate big fancy pictures from small fancy pictures

### Example

* Api Key Authentication (api_key_header_Authorization):
```python
import openapi_client
from openapi_client.api import v1alpha_generation_api
from openapi_client.model.error import Error
from openapi_client.model.image_to_image_request_body import ImageToImageRequestBody
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

    # example passing only required values which don't have defaults set
    path_params = {
        'engine_id': "stable-diffusion-512-v2-0",
    }
    header_params = {
        'Accept': "application/json",
    }
    try:
        # image-to-image
        api_response = api_instance.v1alpha_generation_image_to_image(
            path_params=path_params,
            header_params=header_params,
        )
    except openapi_client.ApiException as e:
        print("Exception when calling V1alphaGenerationApi->v1alpha_generation_image_to_image: %s\n" % e)

    # example passing only optional values
    path_params = {
        'engine_id': "stable-diffusion-512-v2-0",
    }
    header_params = {
        'Accept': "application/json",
        'Organization': "org-123456",
    }
    body = dict(
        init_image=open('/path/to/file', 'rb'),
        options=ImageToImageOptions(
            cfg_scale=7,
            clip_guidance_preset="FAST_BLUE",
            height=512,
            sampler="K_DPM_2_ANCESTRAL",
            samples=1,
            seed=0,
            step_schedule_end=0.01,
            step_schedule_start=0.4,
            steps=75,
            text_prompts=[{"text":"A lighthouse on a cliff","weight":1}],
            width=512,
        ),
    )
    try:
        # image-to-image
        api_response = api_instance.v1alpha_generation_image_to_image(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
    except openapi_client.ApiException as e:
        print("Exception when calling V1alphaGenerationApi->v1alpha_generation_image_to_image: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyMultipartFormData, Unset] | optional, default is unset |
header_params | RequestHeaderParams | |
path_params | RequestPathParams | |
content_type | str | optional, default is 'multipart/form-data' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/vnd.goa.error', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

#### SchemaForRequestBodyMultipartFormData
Type | Description  | Notes
------------- | ------------- | -------------
[**ImageToImageRequestBody**](ImageToImageRequestBody.md) |  | 


### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
Accept | AcceptSchema | | 
Organization | OrganizationSchema | | optional

#### AcceptSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  |  must be one of ["image/png", "application/json", ]

#### OrganizationSchema

Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.

Type | Description | Notes
------------- | ------------- | -------------
**str** | Optional: Allows for requests to be scoped to an organization other than the user&#x27;s default.  If not provided, the user&#x27;s default organization will be used. | 

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
engine_id | EngineIdSchema | | 

#### EngineIdSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | ApiResponseFor200 | OK response.
400 | ApiResponseFor400 | bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to &#x60;application/json&#x60; - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_file_size: The file size of one or more of the provided files is invalid - invalid_mime_type: The mime type of one or more of the provided files is invalid - invalid_prompts: One or more of the prompts contains filtered words 
401 | ApiResponseFor401 | unauthorized: API key missing or invalid
403 | ApiResponseFor403 | permission_denied: You lack the necessary permissions to perform this action
404 | ApiResponseFor404 | not_found: The requested resource was not found (e.g. specifing a model that does not exist)

#### ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | ResponseHeadersFor200 |  |
#### ResponseHeadersFor200

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
Content-Length | ContentLengthSchema | | 
Content-Type | ContentTypeSchema | | optional
Finish-Reason | FinishReasonSchema | | optional
Seed | SeedSchema | | optional

#### ContentLengthSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | 

#### ContentTypeSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  |  must be one of ["image/png", "application/json", ]

#### FinishReasonSchema

The result of the generation process. - `SUCCESS` indicates success - `ERROR` indicates an error - `CONTENT_FILTERED` indicates the result affected by the content filter and may be blurred.

Type | Description | Notes
------------- | ------------- | -------------
**str** | The result of the generation process. - &#x60;SUCCESS&#x60; indicates success - &#x60;ERROR&#x60; indicates an error - &#x60;CONTENT_FILTERED&#x60; indicates the result affected by the content filter and may be blurred. |  must be one of ["SUCCESS", "ERROR", "CONTENT_FILTERED", ]

#### SeedSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | 


#### ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationVndGoaError, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor400ResponseBodyApplicationVndGoaError
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](Error.md) |  | 


#### ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationVndGoaError, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor401ResponseBodyApplicationVndGoaError
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](Error.md) |  | 


#### ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationVndGoaError, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor403ResponseBodyApplicationVndGoaError
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](Error.md) |  | 


#### ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationVndGoaError, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor404ResponseBodyApplicationVndGoaError
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](Error.md) |  | 



void (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1alpha_generation_masking**
> v1alpha_generation_masking(engine_idaccept)

image-to-image/masking

Paint fancy things into fancy pictures

### Example

* Api Key Authentication (api_key_header_Authorization):
```python
import openapi_client
from openapi_client.api import v1alpha_generation_api
from openapi_client.model.error import Error
from openapi_client.model.masking_request_body import MaskingRequestBody
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

    # example passing only required values which don't have defaults set
    path_params = {
        'engine_id': "stable-diffusion-512-v2-0",
    }
    header_params = {
        'Accept': "application/json",
    }
    try:
        # image-to-image/masking
        api_response = api_instance.v1alpha_generation_masking(
            path_params=path_params,
            header_params=header_params,
        )
    except openapi_client.ApiException as e:
        print("Exception when calling V1alphaGenerationApi->v1alpha_generation_masking: %s\n" % e)

    # example passing only optional values
    path_params = {
        'engine_id': "stable-diffusion-512-v2-0",
    }
    header_params = {
        'Accept': "application/json",
        'Organization': "org-123456",
    }
    body = dict(
        init_image=open('/path/to/file', 'rb'),
        mask_image=open('/path/to/file', 'rb'),
        options=MaskingOptions(
            cfg_scale=7,
            clip_guidance_preset="FAST_BLUE",
            height=512,
            mask_source="INIT_IMAGE_ALPHA",
            sampler="K_DPM_2_ANCESTRAL",
            samples=1,
            seed=0,
            steps=75,
            text_prompts=[{"text":"A lighthouse on a cliff","weight":1}],
            width=512,
        ),
    )
    try:
        # image-to-image/masking
        api_response = api_instance.v1alpha_generation_masking(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
    except openapi_client.ApiException as e:
        print("Exception when calling V1alphaGenerationApi->v1alpha_generation_masking: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyMultipartFormData, Unset] | optional, default is unset |
header_params | RequestHeaderParams | |
path_params | RequestPathParams | |
content_type | str | optional, default is 'multipart/form-data' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/vnd.goa.error', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

#### SchemaForRequestBodyMultipartFormData
Type | Description  | Notes
------------- | ------------- | -------------
[**MaskingRequestBody**](MaskingRequestBody.md) |  | 


### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
Accept | AcceptSchema | | 
Organization | OrganizationSchema | | optional

#### AcceptSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  |  must be one of ["image/png", "application/json", ]

#### OrganizationSchema

Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.

Type | Description | Notes
------------- | ------------- | -------------
**str** | Optional: Allows for requests to be scoped to an organization other than the user&#x27;s default.  If not provided, the user&#x27;s default organization will be used. | 

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
engine_id | EngineIdSchema | | 

#### EngineIdSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | ApiResponseFor200 | OK response.
400 | ApiResponseFor400 | bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to &#x60;application/json&#x60; - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_file_size: The file size of one or more of the provided files is invalid - invalid_mime_type: The mime type of one or more of the provided files is invalid - invalid_image_dimensions: The dimensions of the provided &#x60;init_image&#x60; and &#x60;mask_image&#x60; do not match - invalid_mask_image: The parameter &#x60;mask_source&#x60; was set to &#x60;MASK_IMAGE_WHITE&#x60; or &#x60;MASK_IMAGE_BLACK&#x60; but no &#x60;mask_image&#x60; was provided - invalid_prompts: One or more of the prompts contains filtered words 
401 | ApiResponseFor401 | unauthorized: API key missing or invalid
403 | ApiResponseFor403 | permission_denied: You lack the necessary permissions to perform this action
404 | ApiResponseFor404 | not_found: The requested resource was not found (e.g. specifing a model that does not exist)

#### ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | ResponseHeadersFor200 |  |
#### ResponseHeadersFor200

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
Content-Length | ContentLengthSchema | | 
Content-Type | ContentTypeSchema | | optional
Finish-Reason | FinishReasonSchema | | optional
Seed | SeedSchema | | optional

#### ContentLengthSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | 

#### ContentTypeSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  |  must be one of ["image/png", "application/json", ]

#### FinishReasonSchema

The result of the generation process. - `SUCCESS` indicates success - `ERROR` indicates an error - `CONTENT_FILTERED` indicates the result affected by the content filter and may be blurred.

Type | Description | Notes
------------- | ------------- | -------------
**str** | The result of the generation process. - &#x60;SUCCESS&#x60; indicates success - &#x60;ERROR&#x60; indicates an error - &#x60;CONTENT_FILTERED&#x60; indicates the result affected by the content filter and may be blurred. |  must be one of ["SUCCESS", "ERROR", "CONTENT_FILTERED", ]

#### SeedSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | 


#### ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationVndGoaError, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor400ResponseBodyApplicationVndGoaError
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](Error.md) |  | 


#### ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationVndGoaError, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor401ResponseBodyApplicationVndGoaError
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](Error.md) |  | 


#### ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationVndGoaError, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor403ResponseBodyApplicationVndGoaError
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](Error.md) |  | 


#### ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationVndGoaError, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor404ResponseBodyApplicationVndGoaError
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](Error.md) |  | 



void (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1alpha_generation_text_to_image**
> v1alpha_generation_text_to_image(engine_idaccepttext_to_image_request_body)

text-to-image

Generate an image from text

### Example

* Api Key Authentication (api_key_header_Authorization):
```python
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

    # example passing only required values which don't have defaults set
    path_params = {
        'engine_id': "stable-diffusion-512-v2-0",
    }
    header_params = {
        'Accept': "application/json",
    }
    body = TextToImageRequestBody(
        cfg_scale=7,
        clip_guidance_preset="FAST_BLUE",
        height=512,
        sampler="K_DPM_2_ANCESTRAL",
        samples=1,
        seed=0,
        steps=75,
        text_prompts=[{"text":"A lighthouse on a cliff","weight":1}],
        width=512,
    )
    try:
        # text-to-image
        api_response = api_instance.v1alpha_generation_text_to_image(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
    except openapi_client.ApiException as e:
        print("Exception when calling V1alphaGenerationApi->v1alpha_generation_text_to_image: %s\n" % e)

    # example passing only optional values
    path_params = {
        'engine_id': "stable-diffusion-512-v2-0",
    }
    header_params = {
        'Accept': "application/json",
        'Organization': "org-123456",
    }
    body = TextToImageRequestBody(
        cfg_scale=7,
        clip_guidance_preset="FAST_BLUE",
        height=512,
        sampler="K_DPM_2_ANCESTRAL",
        samples=1,
        seed=0,
        steps=75,
        text_prompts=[{"text":"A lighthouse on a cliff","weight":1}],
        width=512,
    )
    try:
        # text-to-image
        api_response = api_instance.v1alpha_generation_text_to_image(
            path_params=path_params,
            header_params=header_params,
            body=body,
        )
    except openapi_client.ApiException as e:
        print("Exception when calling V1alphaGenerationApi->v1alpha_generation_text_to_image: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
header_params | RequestHeaderParams | |
path_params | RequestPathParams | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/vnd.goa.error', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

#### SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**TextToImageRequestBody**](TextToImageRequestBody.md) |  | 


### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
Accept | AcceptSchema | | 
Organization | OrganizationSchema | | optional

#### AcceptSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  |  must be one of ["image/png", "application/json", ]

#### OrganizationSchema

Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.

Type | Description | Notes
------------- | ------------- | -------------
**str** | Optional: Allows for requests to be scoped to an organization other than the user&#x27;s default.  If not provided, the user&#x27;s default organization will be used. | 

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
engine_id | EngineIdSchema | | 

#### EngineIdSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | ApiResponseFor200 | OK response.
400 | ApiResponseFor400 | bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to &#x60;application/json&#x60; - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_prompts: One or more of the prompts contains filtered words 
401 | ApiResponseFor401 | unauthorized: API key missing or invalid
403 | ApiResponseFor403 | permission_denied: You lack the necessary permissions to perform this action
404 | ApiResponseFor404 | not_found: The requested resource was not found (e.g. specifing a model that does not exist)

#### ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | Unset | body was not defined |
headers | ResponseHeadersFor200 |  |
#### ResponseHeadersFor200

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
Content-Length | ContentLengthSchema | | 
Content-Type | ContentTypeSchema | | optional
Finish-Reason | FinishReasonSchema | | optional
Seed | SeedSchema | | optional

#### ContentLengthSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | 

#### ContentTypeSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  |  must be one of ["image/png", "application/json", ]

#### FinishReasonSchema

The result of the generation process. - `SUCCESS` indicates success - `ERROR` indicates an error - `CONTENT_FILTERED` indicates the result affected by the content filter and may be blurred.

Type | Description | Notes
------------- | ------------- | -------------
**str** | The result of the generation process. - &#x60;SUCCESS&#x60; indicates success - &#x60;ERROR&#x60; indicates an error - &#x60;CONTENT_FILTERED&#x60; indicates the result affected by the content filter and may be blurred. |  must be one of ["SUCCESS", "ERROR", "CONTENT_FILTERED", ]

#### SeedSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | 


#### ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationVndGoaError, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor400ResponseBodyApplicationVndGoaError
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](Error.md) |  | 


#### ApiResponseFor401
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor401ResponseBodyApplicationVndGoaError, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor401ResponseBodyApplicationVndGoaError
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](Error.md) |  | 


#### ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationVndGoaError, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor403ResponseBodyApplicationVndGoaError
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](Error.md) |  | 


#### ApiResponseFor404
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor404ResponseBodyApplicationVndGoaError, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor404ResponseBodyApplicationVndGoaError
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](Error.md) |  | 



void (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

