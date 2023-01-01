# V1alphaUserApi

All URIs are relative to *https://api.stability.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1alphaUserAccount**](V1alphaUserApi.md#v1alphaUserAccount) | **GET** /v1alpha/user/account | account |
| [**v1alphaUserBalance**](V1alphaUserApi.md#v1alphaUserBalance) | **GET** /v1alpha/user/balance | balance |


## Creating V1alphaUserApi

To initiate an instance of `V1alphaUserApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.V1alphaUserApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(V1alphaUserApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    V1alphaUserApi v1alphaUserApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a name="v1alphaUserAccount"></a>
# **v1alphaUserAccount**
```java
Mono<AccountResponseBody> V1alphaUserApi.v1alphaUserAccount()
```

account

Get information about the account associated with the provided API key



### Return type
[**AccountResponseBody**](AccountResponseBody.md)

### Authorization
* **[api_key_header_Authorization](auth.md#api_key_header_Authorization)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a name="v1alphaUserBalance"></a>
# **v1alphaUserBalance**
```java
Mono<BalanceResponseBody> V1alphaUserApi.v1alphaUserBalance(organization)
```

balance

Get the credit balance of the account/organization associated with the API key

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organization** | `String`| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional parameter] |


### Return type
[**BalanceResponseBody**](BalanceResponseBody.md)

### Authorization
* **[api_key_header_Authorization](auth.md#api_key_header_Authorization)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

