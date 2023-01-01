# V1alphaGenerationApi

All URIs are relative to *https://api.stability.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1alphaGenerationImageToImage**](V1alphaGenerationApi.md#v1alphaGenerationImageToImage) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image |
| [**v1alphaGenerationMasking**](V1alphaGenerationApi.md#v1alphaGenerationMasking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking |
| [**v1alphaGenerationTextToImage**](V1alphaGenerationApi.md#v1alphaGenerationTextToImage) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image |


<a name="v1alphaGenerationImageToImage"></a>
# **v1alphaGenerationImageToImage**
> v1alphaGenerationImageToImage(engineId, accept, initImage, options, organization)

image-to-image

Generate big fancy pictures from small fancy pictures

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.V1alphaGenerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.stability.ai");
    
    // Configure API key authorization: api_key_header_Authorization
    ApiKeyAuth api_key_header_Authorization = (ApiKeyAuth) defaultClient.getAuthentication("api_key_header_Authorization");
    api_key_header_Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_header_Authorization.setApiKeyPrefix("Token");

    V1alphaGenerationApi apiInstance = new V1alphaGenerationApi(defaultClient);
    String engineId = "stable-diffusion-512-v2-0"; // String |  
    String accept = "image/png"; // String |  
    File initImage = new File("/path/to/file"); // File | Initial image to use for the image-to-image generation
    ImageToImageOptions options = new ImageToImageOptions(); // ImageToImageOptions | 
    String organization = "org-123456"; // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
    try {
      apiInstance.v1alphaGenerationImageToImage(engineId, accept, initImage, options, organization);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1alphaGenerationApi#v1alphaGenerationImageToImage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **engineId** | **String**|   | |
| **accept** | **String**|   | [enum: image/png, application/json] |
| **initImage** | **File**| Initial image to use for the image-to-image generation | |
| **options** | [**ImageToImageOptions**](ImageToImageOptions.md)|  | |
| **organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] |

### Return type

null (empty response body)

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

<a name="v1alphaGenerationMasking"></a>
# **v1alphaGenerationMasking**
> v1alphaGenerationMasking(engineId, accept, initImage, options, organization, maskImage)

image-to-image/masking

Paint fancy things into fancy pictures

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.V1alphaGenerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.stability.ai");
    
    // Configure API key authorization: api_key_header_Authorization
    ApiKeyAuth api_key_header_Authorization = (ApiKeyAuth) defaultClient.getAuthentication("api_key_header_Authorization");
    api_key_header_Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_header_Authorization.setApiKeyPrefix("Token");

    V1alphaGenerationApi apiInstance = new V1alphaGenerationApi(defaultClient);
    String engineId = "stable-diffusion-512-v2-0"; // String |  
    String accept = "image/png"; // String |  
    File initImage = new File("/path/to/file"); // File | Initial image to use for the image-to-image generation
    MaskingOptions options = new MaskingOptions(); // MaskingOptions | 
    String organization = "org-123456"; // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
    File maskImage = new File("/path/to/file"); // File | Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.)
    try {
      apiInstance.v1alphaGenerationMasking(engineId, accept, initImage, options, organization, maskImage);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1alphaGenerationApi#v1alphaGenerationMasking");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **engineId** | **String**|   | |
| **accept** | **String**|   | [enum: image/png, application/json] |
| **initImage** | **File**| Initial image to use for the image-to-image generation | |
| **options** | [**MaskingOptions**](MaskingOptions.md)|  | |
| **organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] |
| **maskImage** | **File**| Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.) | [optional] |

### Return type

null (empty response body)

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

<a name="v1alphaGenerationTextToImage"></a>
# **v1alphaGenerationTextToImage**
> v1alphaGenerationTextToImage(engineId, accept, textToImageRequestBody, organization)

text-to-image

Generate an image from text

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.V1alphaGenerationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.stability.ai");
    
    // Configure API key authorization: api_key_header_Authorization
    ApiKeyAuth api_key_header_Authorization = (ApiKeyAuth) defaultClient.getAuthentication("api_key_header_Authorization");
    api_key_header_Authorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key_header_Authorization.setApiKeyPrefix("Token");

    V1alphaGenerationApi apiInstance = new V1alphaGenerationApi(defaultClient);
    String engineId = "stable-diffusion-512-v2-0"; // String |  
    String accept = "image/png"; // String |  
    TextToImageRequestBody textToImageRequestBody = new TextToImageRequestBody(); // TextToImageRequestBody | 
    String organization = "org-123456"; // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
    try {
      apiInstance.v1alphaGenerationTextToImage(engineId, accept, textToImageRequestBody, organization);
    } catch (ApiException e) {
      System.err.println("Exception when calling V1alphaGenerationApi#v1alphaGenerationTextToImage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **engineId** | **String**|   | |
| **accept** | **String**|   | [enum: image/png, application/json] |
| **textToImageRequestBody** | [**TextToImageRequestBody**](TextToImageRequestBody.md)|  | |
| **organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] |

### Return type

null (empty response body)

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

