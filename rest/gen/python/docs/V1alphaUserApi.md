# openapi_client.V1alphaUserApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alpha_user_account**](V1alphaUserApi.md#v1alpha_user_account) | **GET** /v1alpha/user/account | account
[**v1alpha_user_balance**](V1alphaUserApi.md#v1alpha_user_balance) | **GET** /v1alpha/user/balance | balance


# **v1alpha_user_account**
> AccountResponseBody v1alpha_user_account()

account

Get information about the account associated with the provided API key

### Example

* Api Key Authentication (api_key_header_Authorization):

```python
import time
import openapi_client
from openapi_client.api import v1alpha_user_api
from openapi_client.model.account_response_body import AccountResponseBody
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
    api_instance = v1alpha_user_api.V1alphaUserApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # account
        api_response = api_instance.v1alpha_user_account()
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling V1alphaUserApi->v1alpha_user_account: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountResponseBody**](AccountResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1alpha_user_balance**
> BalanceResponseBody v1alpha_user_balance()

balance

Get the credit balance of the account/organization associated with the API key

### Example

* Api Key Authentication (api_key_header_Authorization):

```python
import time
import openapi_client
from openapi_client.api import v1alpha_user_api
from openapi_client.model.balance_response_body import BalanceResponseBody
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
    api_instance = v1alpha_user_api.V1alphaUserApi(api_client)
    organization = "org-123456" # str | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # balance
        api_response = api_instance.v1alpha_user_balance(organization=organization)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling V1alphaUserApi->v1alpha_user_balance: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **str**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional]

### Return type

[**BalanceResponseBody**](BalanceResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

