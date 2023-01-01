# V1alphaUserApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaUserAccount**](V1alphaUserApi.md#v1alphaUserAccount) | **GET** /v1alpha/user/account | account
[**v1alphaUserAccountWithHttpInfo**](V1alphaUserApi.md#v1alphaUserAccountWithHttpInfo) | **GET** /v1alpha/user/account | account
[**v1alphaUserBalance**](V1alphaUserApi.md#v1alphaUserBalance) | **GET** /v1alpha/user/balance | balance
[**v1alphaUserBalanceWithHttpInfo**](V1alphaUserApi.md#v1alphaUserBalanceWithHttpInfo) | **GET** /v1alpha/user/balance | balance



## v1alphaUserAccount

> v1alphaUserAccount(): ApiRequest[AccountResponseBody]

account

Get information about the account associated with the provided API key

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: api_key_header_Authorization
    implicit val api_key_header_Authorization: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = V1alphaUserApi("https://api.stability.ai")    
    val request = apiInstance.v1alphaUserAccount()
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling V1alphaUserApi#v1alphaUserAccount")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling V1alphaUserApi#v1alphaUserAccount")
            exception.printStackTrace();
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiRequest[[**AccountResponseBody**](AccountResponseBody.md)]


### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK response. |  -  |


## v1alphaUserBalance

> v1alphaUserBalance(v1alphaUserBalanceRequest): ApiRequest[BalanceResponseBody]

balance

Get the credit balance of the account/organization associated with the API key

### Example

```scala
// Import classes:
import 
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

import akka.actor.ActorSystem
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Example extends App {
    
    implicit val system: ActorSystem = ActorSystem()
    import system.dispatcher
    
    // Configure API key authorization: api_key_header_Authorization
    implicit val api_key_header_Authorization: ApiKeyValue = ApiKeyValue("YOUR API KEY")

    val apiInvoker = ApiInvoker()
    val apiInstance = V1alphaUserApi("https://api.stability.ai")
    val organization: String = org-123456 // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
    
    val request = apiInstance.v1alphaUserBalance(organization)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
            System.out.println(s"Response body: $content")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling V1alphaUserApi#v1alphaUserBalance")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling V1alphaUserApi#v1alphaUserBalance")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional]

### Return type

ApiRequest[[**BalanceResponseBody**](BalanceResponseBody.md)]


### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK response. |  -  |

