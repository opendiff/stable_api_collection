# V1alphaEnginesApi

All URIs are relative to *https://api.stability.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1alphaEnginesListEngines**](V1alphaEnginesApi.md#v1alphaEnginesListEngines) | **GET** /v1alpha/engines/list | list |


<a name="v1alphaEnginesListEngines"></a>
# **v1alphaEnginesListEngines**
> ListEnginesResponseBody v1alphaEnginesListEngines(organization)

list

List all engines available to your organization/user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.V1alphaEnginesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.stability.ai");
    
    // Configure API key authorization: api_key_header_Authorization
    ApiKeyAuth api_key_header_Authorization = (ApiKeyAuth) defaultClient.getAuthentication("api_key_header_Authorization");
    api_key_header_Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_header_Authorization.setApiKeyPrefix("Token");

    V1alphaEnginesApi apiInstance = new V1alphaEnginesApi(defaultClient);
    String organization = "org-123456"; // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
    try {
      ListEnginesResponseBody result = apiInstance.v1alphaEnginesListEngines(organization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1alphaEnginesApi#v1alphaEnginesListEngines");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] |

### Return type

[**ListEnginesResponseBody**](ListEnginesResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK response. |  -  |

