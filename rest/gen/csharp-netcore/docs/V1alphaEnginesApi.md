# Org.OpenAPITools.Api.V1alphaEnginesApi

All URIs are relative to *https://api.stability.ai*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**V1alphaEnginesListEngines**](V1alphaEnginesApi.md#v1alphaengineslistengines) | **GET** /v1alpha/engines/list | list |

<a name="v1alphaengineslistengines"></a>
# **V1alphaEnginesListEngines**
> ListEnginesResponseBody V1alphaEnginesListEngines (string organization = null)

list

List all engines available to your organization/user

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class V1alphaEnginesListEnginesExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.stability.ai";
            // Configure API key authorization: api_key_header_Authorization
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new V1alphaEnginesApi(config);
            var organization = org-123456;  // string | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional) 

            try
            {
                // list
                ListEnginesResponseBody result = apiInstance.V1alphaEnginesListEngines(organization);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling V1alphaEnginesApi.V1alphaEnginesListEngines: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the V1alphaEnginesListEnginesWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // list
    ApiResponse<ListEnginesResponseBody> response = apiInstance.V1alphaEnginesListEnginesWithHttpInfo(organization);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling V1alphaEnginesApi.V1alphaEnginesListEnginesWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **organization** | **string** | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

