# V1alphaEnginesApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaEnginesListEngines**](V1alphaEnginesApi.md#v1alphaEnginesListEngines) | **GET** /v1alpha/engines/list | list


<a name="v1alphaEnginesListEngines"></a>
# **v1alphaEnginesListEngines**
> ListEnginesResponseBody v1alphaEnginesListEngines(organization)

list

List all engines available to your organization/user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = V1alphaEnginesApi()
val organization : kotlin.String = org-123456 // kotlin.String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
try {
    val result : ListEnginesResponseBody = apiInstance.v1alphaEnginesListEngines(organization)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling V1alphaEnginesApi#v1alphaEnginesListEngines")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling V1alphaEnginesApi#v1alphaEnginesListEngines")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **kotlin.String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional]

### Return type

[**ListEnginesResponseBody**](ListEnginesResponseBody.md)

### Authorization


Configure api_key_header_Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

