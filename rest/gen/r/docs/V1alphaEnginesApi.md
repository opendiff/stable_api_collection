# V1alphaEnginesApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1alphaEnginesListEngines**](V1alphaEnginesApi.md#V1alphaEnginesListEngines) | **GET** /v1alpha/engines/list | list


# **V1alphaEnginesListEngines**
> ListEnginesResponseBody V1alphaEnginesListEngines(organization = var.organization)

list

List all engines available to your organization/user

### Example
```R
library(openapi)

var_organization <- "org-123456" # character | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.

#list
api_instance <- V1alphaEnginesApi$new()
# Configure API key authorization: api_key_header_Authorization
api_instance$api_client$api_keys['Authorization'] <- 'TODO_YOUR_API_KEY';
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$V1alphaEnginesListEngines(organization = var_organizationdata_file = "result.txt")
result <- api_instance$V1alphaEnginesListEngines(organization = var_organization)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **character**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

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

