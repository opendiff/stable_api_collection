# V1alphaUserApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**V1alphaUserAccount**](V1alphaUserApi.md#V1alphaUserAccount) | **GET** /v1alpha/user/account | account
[**V1alphaUserBalance**](V1alphaUserApi.md#V1alphaUserBalance) | **GET** /v1alpha/user/balance | balance


# **V1alphaUserAccount**
> AccountResponseBody V1alphaUserAccount()

account

Get information about the account associated with the provided API key

### Example
```R
library(openapi)


#account
api_instance <- V1alphaUserApi$new()
# Configure API key authorization: api_key_header_Authorization
api_instance$api_client$api_keys['Authorization'] <- 'TODO_YOUR_API_KEY';
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$V1alphaUserAccount(data_file = "result.txt")
result <- api_instance$V1alphaUserAccount()
dput(result)
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

# **V1alphaUserBalance**
> BalanceResponseBody V1alphaUserBalance(organization = var.organization)

balance

Get the credit balance of the account/organization associated with the API key

### Example
```R
library(openapi)

var_organization <- "org-123456" # character | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.

#balance
api_instance <- V1alphaUserApi$new()
# Configure API key authorization: api_key_header_Authorization
api_instance$api_client$api_keys['Authorization'] <- 'TODO_YOUR_API_KEY';
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$V1alphaUserBalance(organization = var_organizationdata_file = "result.txt")
result <- api_instance$V1alphaUserBalance(organization = var_organization)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **character**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

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

