# \V1alphaUserApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alpha_user_account**](V1alphaUserApi.md#v1alpha_user_account) | **GET** /v1alpha/user/account | account
[**v1alpha_user_balance**](V1alphaUserApi.md#v1alpha_user_balance) | **GET** /v1alpha/user/balance | balance



## v1alpha_user_account

> crate::models::AccountResponseBody v1alpha_user_account()
account

Get information about the account associated with the provided API key

### Parameters

This endpoint does not need any parameter.

### Return type

[**crate::models::AccountResponseBody**](AccountResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## v1alpha_user_balance

> crate::models::BalanceResponseBody v1alpha_user_balance(organization)
balance

Get the credit balance of the account/organization associated with the API key

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**organization** | Option<**String**> | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. |  |

### Return type

[**crate::models::BalanceResponseBody**](BalanceResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

