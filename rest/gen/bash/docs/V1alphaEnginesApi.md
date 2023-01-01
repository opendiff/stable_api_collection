# V1alphaEnginesApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaEnginesListEngines**](V1alphaEnginesApi.md#v1alphaEnginesListEngines) | **GET** /v1alpha/engines/list | list



## v1alphaEnginesListEngines

list

List all engines available to your organization/user

### Example

```bash
 v1alphaEnginesListEngines Organization:value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **string** | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. | [optional] [default to null]

### Return type

[**ListEnginesResponseBody**](ListEnginesResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

