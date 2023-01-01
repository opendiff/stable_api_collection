# V1alphaEnginesApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaEnginesListEngines**](V1alphaEnginesApi.md#v1alphaEnginesListEngines) | **GET** /v1alpha/engines/list | list



## v1alphaEnginesListEngines

> ListEnginesResponseBody v1alphaEnginesListEngines(organization)

list

List all engines available to your organization/user

### Example

```java
// Import classes:
//import org.openapitools.client.api.V1alphaEnginesApi;

V1alphaEnginesApi apiInstance = new V1alphaEnginesApi();
String organization = org-123456; // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
try {
    ListEnginesResponseBody result = apiInstance.v1alphaEnginesListEngines(organization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling V1alphaEnginesApi#v1alphaEnginesListEngines");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] [default to null]

### Return type

[**ListEnginesResponseBody**](ListEnginesResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

