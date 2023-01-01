# V1ALPHAUSER_API

All URIs are relative to *https://api.stability.ai*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**v1alpha_user_account**](V1ALPHAUSER_API.md#v1alpha_user_account) | **Get** /v1alpha/user/account | account
[**v1alpha_user_balance**](V1ALPHAUSER_API.md#v1alpha_user_balance) | **Get** /v1alpha/user/balance | balance


# **v1alpha_user_account**
> v1alpha_user_account : detachable ACCOUNT_RESPONSE_BODY


account

Get information about the account associated with the provided API key


### Parameters
This endpoint does not need any parameter.

### Return type

[**ACCOUNT_RESPONSE_BODY**](AccountResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1alpha_user_balance**
> v1alpha_user_balance (organization:  detachable STRING_32 ): detachable BALANCE_RESPONSE_BODY


balance

Get the credit balance of the account/organization associated with the API key


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **STRING_32**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] [default to null]

### Return type

[**BALANCE_RESPONSE_BODY**](BalanceResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

