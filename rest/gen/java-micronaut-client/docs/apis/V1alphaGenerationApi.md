# V1alphaGenerationApi

All URIs are relative to *https://api.stability.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1alphaGenerationImageToImage**](V1alphaGenerationApi.md#v1alphaGenerationImageToImage) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image |
| [**v1alphaGenerationMasking**](V1alphaGenerationApi.md#v1alphaGenerationMasking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking |
| [**v1alphaGenerationTextToImage**](V1alphaGenerationApi.md#v1alphaGenerationTextToImage) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image |


## Creating V1alphaGenerationApi

To initiate an instance of `V1alphaGenerationApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.V1alphaGenerationApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(V1alphaGenerationApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    V1alphaGenerationApi v1alphaGenerationApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a name="v1alphaGenerationImageToImage"></a>
# **v1alphaGenerationImageToImage**
```java
Mono<Void> V1alphaGenerationApi.v1alphaGenerationImageToImage(engineIdacceptinitImageoptionsorganization)
```

image-to-image

Generate big fancy pictures from small fancy pictures

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **engineId** | `String`|   | |
| **accept** | `String`|   | [enum: `image/png`, `application/json`] |
| **initImage** | `File`| Initial image to use for the image-to-image generation | |
| **options** | [**ImageToImageOptions**](ImageToImageOptions.md)|  | |
| **organization** | `String`| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional parameter] |




### Authorization
* **[api_key_header_Authorization](auth.md#api_key_header_Authorization)**

### HTTP request headers
 - **Content-Type**: `multipart/form-data`
 - **Accept**: `application/vnd.goa.error`

<a name="v1alphaGenerationMasking"></a>
# **v1alphaGenerationMasking**
```java
Mono<Void> V1alphaGenerationApi.v1alphaGenerationMasking(engineIdacceptinitImageoptionsorganizationmaskImage)
```

image-to-image/masking

Paint fancy things into fancy pictures

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **engineId** | `String`|   | |
| **accept** | `String`|   | [enum: `image/png`, `application/json`] |
| **initImage** | `File`| Initial image to use for the image-to-image generation | |
| **options** | [**MaskingOptions**](MaskingOptions.md)|  | |
| **organization** | `String`| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional parameter] |
| **maskImage** | `File`| Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.) | [optional parameter] |




### Authorization
* **[api_key_header_Authorization](auth.md#api_key_header_Authorization)**

### HTTP request headers
 - **Content-Type**: `multipart/form-data`
 - **Accept**: `application/vnd.goa.error`

<a name="v1alphaGenerationTextToImage"></a>
# **v1alphaGenerationTextToImage**
```java
Mono<Void> V1alphaGenerationApi.v1alphaGenerationTextToImage(engineIdaccepttextToImageRequestBodyorganization)
```

text-to-image

Generate an image from text

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **engineId** | `String`|   | |
| **accept** | `String`|   | [enum: `image/png`, `application/json`] |
| **textToImageRequestBody** | [**TextToImageRequestBody**](TextToImageRequestBody.md)|  | |
| **organization** | `String`| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional parameter] |




### Authorization
* **[api_key_header_Authorization](auth.md#api_key_header_Authorization)**

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/vnd.goa.error`

