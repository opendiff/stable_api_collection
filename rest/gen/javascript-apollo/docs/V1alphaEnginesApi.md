# StabilityAiRestApi.V1alphaEnginesApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaEnginesListEngines**](V1alphaEnginesApi.md#v1alphaEnginesListEngines) | **GET** /v1alpha/engines/list | list



## v1alphaEnginesListEngines

> ListEnginesResponseBody v1alphaEnginesListEngines(opts)

list

List all engines available to your organization/user

### Example

```javascript
import StabilityAiRestApi from 'stability_ai_rest_api';
let defaultClient = StabilityAiRestApi.ApiClient.instance;
// Configure API key authorization: api_key_header_Authorization
let api_key_header_Authorization = defaultClient.authentications['api_key_header_Authorization'];
api_key_header_Authorization.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key_header_Authorization.apiKeyPrefix = 'Token';

let apiInstance = new StabilityAiRestApi.V1alphaEnginesApi();
let opts = {
  'organization': org-123456 // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
};
apiInstance.v1alphaEnginesListEngines(opts, (error, data, response) => {
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

[**ListEnginesResponseBody**](ListEnginesResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

