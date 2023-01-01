# V1alphaUserApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaUserAccount**](V1alphaUserApi.md#v1alphaUserAccount) | **GET** /v1alpha/user/account | account
[**v1alphaUserBalance**](V1alphaUserApi.md#v1alphaUserBalance) | **GET** /v1alpha/user/balance | balance


<a name="v1alphaUserAccount"></a>
# **v1alphaUserAccount**
> AccountResponseBody v1alphaUserAccount()

account

Get information about the account associated with the provided API key

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = V1alphaUserApi()
try {
    val result : AccountResponseBody = apiInstance.v1alphaUserAccount()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling V1alphaUserApi#v1alphaUserAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling V1alphaUserApi#v1alphaUserAccount")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountResponseBody**](AccountResponseBody.md)

### Authorization


Configure api_key_header_Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v1alphaUserBalance"></a>
# **v1alphaUserBalance**
> BalanceResponseBody v1alphaUserBalance(organization)

balance

Get the credit balance of the account/organization associated with the API key

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = V1alphaUserApi()
val organization : kotlin.String = org-123456 // kotlin.String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
try {
    val result : BalanceResponseBody = apiInstance.v1alphaUserBalance(organization)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling V1alphaUserApi#v1alphaUserBalance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling V1alphaUserApi#v1alphaUserBalance")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **kotlin.String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional]

### Return type

[**BalanceResponseBody**](BalanceResponseBody.md)

### Authorization


Configure api_key_header_Authorization:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

