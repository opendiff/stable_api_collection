# V1alphaUserApi

All URIs are relative to *https://api.stability.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1alphaUserAccount**](V1alphaUserApi.md#v1alphaUserAccount) | **GET** /v1alpha/user/account | account |
| [**v1alphaUserBalance**](V1alphaUserApi.md#v1alphaUserBalance) | **GET** /v1alpha/user/balance | balance |


<a name="v1alphaUserAccount"></a>
# **v1alphaUserAccount**
> AccountResponseBody v1alphaUserAccount()

account

Get information about the account associated with the provided API key

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.V1alphaUserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.stability.ai");
    
    // Configure API key authorization: api_key_header_Authorization
    ApiKeyAuth api_key_header_Authorization = (ApiKeyAuth) defaultClient.getAuthentication("api_key_header_Authorization");
    api_key_header_Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_header_Authorization.setApiKeyPrefix("Token");

    V1alphaUserApi apiInstance = new V1alphaUserApi(defaultClient);
    try {
      AccountResponseBody result = apiInstance.v1alphaUserAccount();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1alphaUserApi#v1alphaUserAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK response. |  -  |

<a name="v1alphaUserBalance"></a>
# **v1alphaUserBalance**
> BalanceResponseBody v1alphaUserBalance(organization)

balance

Get the credit balance of the account/organization associated with the API key

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.V1alphaUserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.stability.ai");
    
    // Configure API key authorization: api_key_header_Authorization
    ApiKeyAuth api_key_header_Authorization = (ApiKeyAuth) defaultClient.getAuthentication("api_key_header_Authorization");
    api_key_header_Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_header_Authorization.setApiKeyPrefix("Token");

    V1alphaUserApi apiInstance = new V1alphaUserApi(defaultClient);
    String organization = "org-123456"; // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
    try {
      BalanceResponseBody result = apiInstance.v1alphaUserBalance(organization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1alphaUserApi#v1alphaUserBalance");
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

[**BalanceResponseBody**](BalanceResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK response. |  -  |

