# openapi_client.V1alphaEnginesApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alpha_engines_list_engines**](V1alphaEnginesApi.md#v1alpha_engines_list_engines) | **GET** /v1alpha/engines/list | list

# **v1alpha_engines_list_engines**
> ListEnginesResponseBody v1alpha_engines_list_engines()

list

List all engines available to your organization/user

### Example

* Api Key Authentication (api_key_header_Authorization):
```python
import openapi_client
from openapi_client.api import v1alpha_engines_api
from openapi_client.model.list_engines_response_body import ListEnginesResponseBody
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
    api_instance = v1alpha_engines_api.V1alphaEnginesApi(api_client)

    # example passing only optional values
    header_params = {
        'Organization': "org-123456",
    }
    try:
        # list
        api_response = api_instance.v1alpha_engines_list_engines(
            header_params=header_params,
        )
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling V1alphaEnginesApi->v1alpha_engines_list_engines: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
header_params | RequestHeaderParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### header_params
#### RequestHeaderParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
Organization | OrganizationSchema | | optional

#### OrganizationSchema

Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.

Type | Description | Notes
------------- | ------------- | -------------
**str** | Optional: Allows for requests to be scoped to an organization other than the user&#x27;s default.  If not provided, the user&#x27;s default organization will be used. | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | ApiResponseFor200 | OK response.

#### ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ListEnginesResponseBody**](ListEnginesResponseBody.md) |  | 



[**ListEnginesResponseBody**](ListEnginesResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

