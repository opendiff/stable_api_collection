# \V1alphaEnginesApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1alphaEnginesListEngines**](V1alphaEnginesApi.md#V1alphaEnginesListEngines) | **Get** /v1alpha/engines/list | list



## V1alphaEnginesListEngines

> ListEnginesResponseBody V1alphaEnginesListEngines(ctx).Organization(organization).Execute()

list



### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "./openapi"
)

func main() {
    organization := "org-123456" // string | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.V1alphaEnginesApi.V1alphaEnginesListEngines(context.Background()).Organization(organization).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `V1alphaEnginesApi.V1alphaEnginesListEngines``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `V1alphaEnginesListEngines`: ListEnginesResponseBody
    fmt.Fprintf(os.Stdout, "Response from `V1alphaEnginesApi.V1alphaEnginesListEngines`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiV1alphaEnginesListEnginesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **string** | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | 

### Return type

[**ListEnginesResponseBody**](ListEnginesResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

