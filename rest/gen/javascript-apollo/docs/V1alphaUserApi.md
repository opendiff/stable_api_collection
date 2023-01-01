# StabilityAiRestApi.V1alphaUserApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaUserAccount**](V1alphaUserApi.md#v1alphaUserAccount) | **GET** /v1alpha/user/account | account
[**v1alphaUserBalance**](V1alphaUserApi.md#v1alphaUserBalance) | **GET** /v1alpha/user/balance | balance



## v1alphaUserAccount

> AccountResponseBody v1alphaUserAccount()

account

Get information about the account associated with the provided API key

### Example

```javascript
import StabilityAiRestApi from 'stability_ai_rest_api';
let defaultClient = StabilityAiRestApi.ApiClient.instance;
// Configure API key authorization: api_key_header_Authorization
let api_key_header_Authorization = defaultClient.authentications['api_key_header_Authorization'];
api_key_header_Authorization.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key_header_Authorization.apiKeyPrefix = 'Token';

let apiInstance = new StabilityAiRestApi.V1alphaUserApi();
apiInstance.v1alphaUserAccount((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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


## v1alphaUserBalance

> BalanceResponseBody v1alphaUserBalance(opts)

balance

Get the credit balance of the account/organization associated with the API key

### Example

```javascript
import StabilityAiRestApi from 'stability_ai_rest_api';
let defaultClient = StabilityAiRestApi.ApiClient.instance;
// Configure API key authorization: api_key_header_Authorization
let api_key_header_Authorization = defaultClient.authentications['api_key_header_Authorization'];
api_key_header_Authorization.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key_header_Authorization.apiKeyPrefix = 'Token';

let apiInstance = new StabilityAiRestApi.V1alphaUserApi();
let opts = {
  'organization': org-123456 // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
};
apiInstance.v1alphaUserBalance(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

### Return type

[**BalanceResponseBody**](BalanceResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

