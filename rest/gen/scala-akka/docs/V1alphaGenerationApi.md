# V1alphaGenerationApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaGenerationImageToImage**](V1alphaGenerationApi.md#v1alphaGenerationImageToImage) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
[**v1alphaGenerationImageToImageWithHttpInfo**](V1alphaGenerationApi.md#v1alphaGenerationImageToImageWithHttpInfo) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
[**v1alphaGenerationMasking**](V1alphaGenerationApi.md#v1alphaGenerationMasking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
[**v1alphaGenerationMaskingWithHttpInfo**](V1alphaGenerationApi.md#v1alphaGenerationMaskingWithHttpInfo) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
[**v1alphaGenerationTextToImage**](V1alphaGenerationApi.md#v1alphaGenerationTextToImage) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image
[**v1alphaGenerationTextToImageWithHttpInfo**](V1alphaGenerationApi.md#v1alphaGenerationTextToImageWithHttpInfo) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image



## v1alphaGenerationImageToImage

> v1alphaGenerationImageToImage(v1alphaGenerationImageToImageRequest): ApiRequest[Unit]

image-to-image

Generate big fancy pictures from small fancy pictures

### Example

```scala
// Import classes:
import 
import 
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
    val apiInstance = V1alphaGenerationApi("https://api.stability.ai")
    val engineId: String = stable-diffusion-512-v2-0 // String |  

    val accept: String = application/json // String |  

    val initImage: File = BINARY_DATA_HERE // File | Initial image to use for the image-to-image generation

    val options: ImageToImageOptions =  // ImageToImageOptions | 

    val organization: String = org-123456 // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
    
    val request = apiInstance.v1alphaGenerationImageToImage(engineId, accept, initImage, options, organization)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling V1alphaGenerationApi#v1alphaGenerationImageToImage")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling V1alphaGenerationApi#v1alphaGenerationImageToImage")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **String**|   |
 **accept** | **String**|   | [enum: image/png, application/json]
 **initImage** | **File**| Initial image to use for the image-to-image generation |
 **options** | [**ImageToImageOptions**](ImageToImageOptions.md)|  |
 **organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional]

### Return type


ApiRequest[Unit] (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/vnd.goa.error

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK response. |  * Content-Length -  <br>  * Content-Type -  <br>  * Finish-Reason - The result of the generation process. - &#x60;SUCCESS&#x60; indicates success - &#x60;ERROR&#x60; indicates an error - &#x60;CONTENT_FILTERED&#x60; indicates the result affected by the content filter and may be blurred. <br>  * Seed -  <br>  |
| **400** | bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to &#x60;application/json&#x60; - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_file_size: The file size of one or more of the provided files is invalid - invalid_mime_type: The mime type of one or more of the provided files is invalid - invalid_prompts: One or more of the prompts contains filtered words  |  -  |
| **401** | unauthorized: API key missing or invalid |  -  |
| **403** | permission_denied: You lack the necessary permissions to perform this action |  -  |
| **404** | not_found: The requested resource was not found (e.g. specifing a model that does not exist) |  -  |


## v1alphaGenerationMasking

> v1alphaGenerationMasking(v1alphaGenerationMaskingRequest): ApiRequest[Unit]

image-to-image/masking

Paint fancy things into fancy pictures

### Example

```scala
// Import classes:
import 
import 
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
    val apiInstance = V1alphaGenerationApi("https://api.stability.ai")
    val engineId: String = stable-diffusion-512-v2-0 // String |  

    val accept: String = application/json // String |  

    val initImage: File = BINARY_DATA_HERE // File | Initial image to use for the image-to-image generation

    val options: MaskingOptions =  // MaskingOptions | 

    val organization: String = org-123456 // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.

    val maskImage: File = BINARY_DATA_HERE // File | Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.)
    
    val request = apiInstance.v1alphaGenerationMasking(engineId, accept, initImage, options, organization, maskImage)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling V1alphaGenerationApi#v1alphaGenerationMasking")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling V1alphaGenerationApi#v1alphaGenerationMasking")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **String**|   |
 **accept** | **String**|   | [enum: image/png, application/json]
 **initImage** | **File**| Initial image to use for the image-to-image generation |
 **options** | [**MaskingOptions**](MaskingOptions.md)|  |
 **organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional]
 **maskImage** | **File**| Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.) | [optional]

### Return type


ApiRequest[Unit] (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/vnd.goa.error

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK response. |  * Content-Length -  <br>  * Content-Type -  <br>  * Finish-Reason - The result of the generation process. - &#x60;SUCCESS&#x60; indicates success - &#x60;ERROR&#x60; indicates an error - &#x60;CONTENT_FILTERED&#x60; indicates the result affected by the content filter and may be blurred. <br>  * Seed -  <br>  |
| **400** | bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to &#x60;application/json&#x60; - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_file_size: The file size of one or more of the provided files is invalid - invalid_mime_type: The mime type of one or more of the provided files is invalid - invalid_image_dimensions: The dimensions of the provided &#x60;init_image&#x60; and &#x60;mask_image&#x60; do not match - invalid_mask_image: The parameter &#x60;mask_source&#x60; was set to &#x60;MASK_IMAGE_WHITE&#x60; or &#x60;MASK_IMAGE_BLACK&#x60; but no &#x60;mask_image&#x60; was provided - invalid_prompts: One or more of the prompts contains filtered words  |  -  |
| **401** | unauthorized: API key missing or invalid |  -  |
| **403** | permission_denied: You lack the necessary permissions to perform this action |  -  |
| **404** | not_found: The requested resource was not found (e.g. specifing a model that does not exist) |  -  |


## v1alphaGenerationTextToImage

> v1alphaGenerationTextToImage(v1alphaGenerationTextToImageRequest): ApiRequest[Unit]

text-to-image

Generate an image from text

### Example

```scala
// Import classes:
import 
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
    val apiInstance = V1alphaGenerationApi("https://api.stability.ai")
    val engineId: String = stable-diffusion-512-v2-0 // String |  

    val accept: String = application/json // String |  

    val textToImageRequestBody: TextToImageRequestBody = {"cfg_scale":7,"clip_guidance_preset":"FAST_BLUE","height":512,"sampler":"K_DPM_2_ANCESTRAL","samples":1,"seed":0,"steps":75,"text_prompts":[{"text":"A lighthouse on a cliff","weight":1}],"width":512} // TextToImageRequestBody | 

    val organization: String = org-123456 // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
    
    val request = apiInstance.v1alphaGenerationTextToImage(engineId, accept, textToImageRequestBody, organization)
    val response = apiInvoker.execute(request)

    response.onComplete {
        case Success(ApiResponse(code, content, headers)) =>
            System.out.println(s"Status code: $code}")
            System.out.println(s"Response headers: ${headers.mkString(", ")}")
        
        case Failure(error @ ApiError(code, message, responseContent, cause, headers)) =>
            System.err.println("Exception when calling V1alphaGenerationApi#v1alphaGenerationTextToImage")
            System.err.println(s"Status code: $code}")
            System.err.println(s"Reason: $responseContent")
            System.err.println(s"Response headers: ${headers.mkString(", ")}")
            error.printStackTrace();

        case Failure(exception) => 
            System.err.println("Exception when calling V1alphaGenerationApi#v1alphaGenerationTextToImage")
            exception.printStackTrace();
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **String**|   |
 **accept** | **String**|   | [enum: image/png, application/json]
 **textToImageRequestBody** | [**TextToImageRequestBody**](TextToImageRequestBody.md)|  |
 **organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional]

### Return type


ApiRequest[Unit] (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.goa.error

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK response. |  * Content-Length -  <br>  * Content-Type -  <br>  * Finish-Reason - The result of the generation process. - &#x60;SUCCESS&#x60; indicates success - &#x60;ERROR&#x60; indicates an error - &#x60;CONTENT_FILTERED&#x60; indicates the result affected by the content filter and may be blurred. <br>  * Seed -  <br>  |
| **400** | bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to &#x60;application/json&#x60; - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_prompts: One or more of the prompts contains filtered words  |  -  |
| **401** | unauthorized: API key missing or invalid |  -  |
| **403** | permission_denied: You lack the necessary permissions to perform this action |  -  |
| **404** | not_found: The requested resource was not found (e.g. specifing a model that does not exist) |  -  |

