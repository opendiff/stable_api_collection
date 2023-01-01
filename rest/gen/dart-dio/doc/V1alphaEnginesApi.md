# openapi.api.V1alphaEnginesApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaEnginesListEngines**](V1alphaEnginesApi.md#v1alphaengineslistengines) | **GET** /v1alpha/engines/list | list


# **v1alphaEnginesListEngines**
> ListEnginesResponseBody v1alphaEnginesListEngines(organization)

list

List all engines available to your organization/user

### Example
```dart
import 'package:openapi/api.dart';
// TODO Configure API key authorization: api_key_header_Authorization
//defaultApiClient.getAuthentication<ApiKeyAuth>('api_key_header_Authorization').apiKey = 'YOUR_API_KEY';
// uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//defaultApiClient.getAuthentication<ApiKeyAuth>('api_key_header_Authorization').apiKeyPrefix = 'Bearer';

final api = Openapi().getV1alphaEnginesApi();
final String organization = org-123456; // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.

try {
    final response = api.v1alphaEnginesListEngines(organization);
    print(response);
} catch on DioError (e) {
    print('Exception when calling V1alphaEnginesApi->v1alphaEnginesListEngines: $e\n');
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. | [optional] 

### Return type

[**ListEnginesResponseBody**](ListEnginesResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

