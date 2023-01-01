# openapi.api.V1alphaUserApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaUserAccount**](V1alphaUserApi.md#v1alphauseraccount) | **GET** /v1alpha/user/account | account
[**v1alphaUserBalance**](V1alphaUserApi.md#v1alphauserbalance) | **GET** /v1alpha/user/balance | balance


# **v1alphaUserAccount**
> AccountResponseBody v1alphaUserAccount()

account

Get information about the account associated with the provided API key

### Example
```dart
import 'package:openapi/api.dart';
// TODO Configure API key authorization: api_key_header_Authorization
//defaultApiClient.getAuthentication<ApiKeyAuth>('api_key_header_Authorization').apiKey = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//defaultApiClient.getAuthentication<ApiKeyAuth>('api_key_header_Authorization').apiKeyPrefix = 'Bearer';

final api = Openapi().getV1alphaUserApi();

try {
    final response = api.v1alphaUserAccount();
    print(response);
} catch on DioError (e) {
    print('Exception when calling V1alphaUserApi->v1alphaUserAccount: $e\n');
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1alphaUserBalance**
> BalanceResponseBody v1alphaUserBalance(organization)

balance

Get the credit balance of the account/organization associated with the API key

### Example
```dart
import 'package:openapi/api.dart';
// TODO Configure API key authorization: api_key_header_Authorization
//defaultApiClient.getAuthentication<ApiKeyAuth>('api_key_header_Authorization').apiKey = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//defaultApiClient.getAuthentication<ApiKeyAuth>('api_key_header_Authorization').apiKeyPrefix = 'Bearer';

final api = Openapi().getV1alphaUserApi();
final String organization = org-123456; // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.

try {
    final response = api.v1alphaUserBalance(organization);
    print(response);
} catch on DioError (e) {
    print('Exception when calling V1alphaUserApi->v1alphaUserBalance: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. | [optional] 

### Return type

[**BalanceResponseBody**](BalanceResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

