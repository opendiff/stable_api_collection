# Org.OpenAPITools.Api.V1alphaGenerationApi

All URIs are relative to *https://api.stability.ai*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**V1alphaGenerationImageToImage**](V1alphaGenerationApi.md#v1alphagenerationimagetoimage) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image |
| [**V1alphaGenerationMasking**](V1alphaGenerationApi.md#v1alphagenerationmasking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking |
| [**V1alphaGenerationTextToImage**](V1alphaGenerationApi.md#v1alphagenerationtexttoimage) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image |

<a name="v1alphagenerationimagetoimage"></a>
# **V1alphaGenerationImageToImage**
> void V1alphaGenerationImageToImage (string engineId, string accept, System.IO.Stream initImage, ImageToImageOptions options, string organization = null)

image-to-image

Generate big fancy pictures from small fancy pictures

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class V1alphaGenerationImageToImageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.stability.ai";
            // Configure API key authorization: api_key_header_Authorization
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new V1alphaGenerationApi(config);
            var engineId = stable-diffusion-512-v2-0;  // string |  
            var accept = application/json;  // string |  
            var initImage = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // System.IO.Stream | Initial image to use for the image-to-image generation
            var options = new ImageToImageOptions(); // ImageToImageOptions | 
            var organization = org-123456;  // string | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional) 

            try
            {
                // image-to-image
                apiInstance.V1alphaGenerationImageToImage(engineId, accept, initImage, options, organization);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling V1alphaGenerationApi.V1alphaGenerationImageToImage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the V1alphaGenerationImageToImageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // image-to-image
    apiInstance.V1alphaGenerationImageToImageWithHttpInfo(engineId, accept, initImage, options, organization);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling V1alphaGenerationApi.V1alphaGenerationImageToImageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **engineId** | **string** |   |  |
| **accept** | **string** |   |  |
| **initImage** | **System.IO.Stream****System.IO.Stream** | Initial image to use for the image-to-image generation |  |
| **options** | [**ImageToImageOptions**](ImageToImageOptions.md) |  |  |
| **organization** | **string** | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional]  |

### Return type

void (empty response body)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1alphagenerationmasking"></a>
# **V1alphaGenerationMasking**
> void V1alphaGenerationMasking (string engineId, string accept, System.IO.Stream initImage, MaskingOptions options, string organization = null, System.IO.Stream maskImage = null)

image-to-image/masking

Paint fancy things into fancy pictures

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class V1alphaGenerationMaskingExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.stability.ai";
            // Configure API key authorization: api_key_header_Authorization
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new V1alphaGenerationApi(config);
            var engineId = stable-diffusion-512-v2-0;  // string |  
            var accept = application/json;  // string |  
            var initImage = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // System.IO.Stream | Initial image to use for the image-to-image generation
            var options = new MaskingOptions(); // MaskingOptions | 
            var organization = org-123456;  // string | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional) 
            var maskImage = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // System.IO.Stream | Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.) (optional) 

            try
            {
                // image-to-image/masking
                apiInstance.V1alphaGenerationMasking(engineId, accept, initImage, options, organization, maskImage);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling V1alphaGenerationApi.V1alphaGenerationMasking: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the V1alphaGenerationMaskingWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // image-to-image/masking
    apiInstance.V1alphaGenerationMaskingWithHttpInfo(engineId, accept, initImage, options, organization, maskImage);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling V1alphaGenerationApi.V1alphaGenerationMaskingWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **engineId** | **string** |   |  |
| **accept** | **string** |   |  |
| **initImage** | **System.IO.Stream****System.IO.Stream** | Initial image to use for the image-to-image generation |  |
| **options** | [**MaskingOptions**](MaskingOptions.md) |  |  |
| **organization** | **string** | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional]  |
| **maskImage** | **System.IO.Stream****System.IO.Stream** | Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.) | [optional]  |

### Return type

void (empty response body)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="v1alphagenerationtexttoimage"></a>
# **V1alphaGenerationTextToImage**
> void V1alphaGenerationTextToImage (string engineId, string accept, TextToImageRequestBody textToImageRequestBody, string organization = null)

text-to-image

Generate an image from text

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class V1alphaGenerationTextToImageExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.stability.ai";
            // Configure API key authorization: api_key_header_Authorization
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new V1alphaGenerationApi(config);
            var engineId = stable-diffusion-512-v2-0;  // string |  
            var accept = application/json;  // string |  
            var textToImageRequestBody = new TextToImageRequestBody(); // TextToImageRequestBody | 
            var organization = org-123456;  // string | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional) 

            try
            {
                // text-to-image
                apiInstance.V1alphaGenerationTextToImage(engineId, accept, textToImageRequestBody, organization);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling V1alphaGenerationApi.V1alphaGenerationTextToImage: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the V1alphaGenerationTextToImageWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // text-to-image
    apiInstance.V1alphaGenerationTextToImageWithHttpInfo(engineId, accept, textToImageRequestBody, organization);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling V1alphaGenerationApi.V1alphaGenerationTextToImageWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **engineId** | **string** |   |  |
| **accept** | **string** |   |  |
| **textToImageRequestBody** | [**TextToImageRequestBody**](TextToImageRequestBody.md) |  |  |
| **organization** | **string** | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional]  |

### Return type

void (empty response body)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

