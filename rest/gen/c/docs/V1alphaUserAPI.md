# V1alphaUserAPI

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1alphaUserAPI_v1alphaUserAccount**](V1alphaUserAPI.md#V1alphaUserAPI_v1alphaUserAccount) | **GET** /v1alpha/user/account | account
[**V1alphaUserAPI_v1alphaUserBalance**](V1alphaUserAPI.md#V1alphaUserAPI_v1alphaUserBalance) | **GET** /v1alpha/user/balance | balance


# **V1alphaUserAPI_v1alphaUserAccount**
```c
// account
//
// Get information about the account associated with the provided API key
//
account_response_body_t* V1alphaUserAPI_v1alphaUserAccount(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |

### Return type

[account_response_body_t](account_response_body.md) *


### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **V1alphaUserAPI_v1alphaUserBalance**
```c
// balance
//
// Get the credit balance of the account/organization associated with the API key
//
balance_response_body_t* V1alphaUserAPI_v1alphaUserBalance(apiClient_t *apiClient, char * Organization);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**Organization** | **char \*** | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

### Return type

[balance_response_body_t](balance_response_body.md) *


### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

