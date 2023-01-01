# V1alphaEnginesApi

All URIs are relative to *https://api.stability.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1alphaEnginesListEngines**](V1alphaEnginesApi.md#v1alphaEnginesListEngines) | **GET** /v1alpha/engines/list | list |


## Creating V1alphaEnginesApi

To initiate an instance of `V1alphaEnginesApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.V1alphaEnginesApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(V1alphaEnginesApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    V1alphaEnginesApi v1alphaEnginesApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a name="v1alphaEnginesListEngines"></a>
# **v1alphaEnginesListEngines**
```java
Mono<ListEnginesResponseBody> V1alphaEnginesApi.v1alphaEnginesListEngines(organization)
```

list

List all engines available to your organization/user

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **organization** | `String`| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional parameter] |


### Return type
[**ListEnginesResponseBody**](ListEnginesResponseBody.md)

### Authorization
* **[api_key_header_Authorization](auth.md#api_key_header_Authorization)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

