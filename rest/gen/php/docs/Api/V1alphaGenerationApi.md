# OpenAPI\Client\V1alphaGenerationApi

All URIs are relative to https://api.stability.ai.

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaGenerationImageToImage()**](V1alphaGenerationApi.md#v1alphaGenerationImageToImage) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
[**v1alphaGenerationMasking()**](V1alphaGenerationApi.md#v1alphaGenerationMasking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
[**v1alphaGenerationTextToImage()**](V1alphaGenerationApi.md#v1alphaGenerationTextToImage) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image


## `v1alphaGenerationImageToImage()`

```php
v1alphaGenerationImageToImage($engine_id, $accept, $init_image, $options, $organization)
```

image-to-image

Generate big fancy pictures from small fancy pictures

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: api_key_header_Authorization
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\V1alphaGenerationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$engine_id = stable-diffusion-512-v2-0; // string |  
$accept = application/json; // string |  
$init_image = "/path/to/file.txt"; // \SplFileObject | Initial image to use for the image-to-image generation
$options = new \OpenAPI\Client\Model\ImageToImageOptions(); // \OpenAPI\Client\Model\ImageToImageOptions
$organization = org-123456; // string | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.

try {
    $apiInstance->v1alphaGenerationImageToImage($engine_id, $accept, $init_image, $options, $organization);
} catch (Exception $e) {
    echo 'Exception when calling V1alphaGenerationApi->v1alphaGenerationImageToImage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **string**|   |
 **accept** | **string**|   |
 **init_image** | **\SplFileObject****\SplFileObject**| Initial image to use for the image-to-image generation |
 **options** | [**\OpenAPI\Client\Model\ImageToImageOptions**](../Model/ImageToImageOptions.md)|  |
 **organization** | **string**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional]

### Return type

void (empty response body)

### Authorization

[api_key_header_Authorization](../../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/vnd.goa.error`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `v1alphaGenerationMasking()`

```php
v1alphaGenerationMasking($engine_id, $accept, $init_image, $options, $organization, $mask_image)
```

image-to-image/masking

Paint fancy things into fancy pictures

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: api_key_header_Authorization
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\V1alphaGenerationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$engine_id = stable-diffusion-512-v2-0; // string |  
$accept = application/json; // string |  
$init_image = "/path/to/file.txt"; // \SplFileObject | Initial image to use for the image-to-image generation
$options = new \OpenAPI\Client\Model\MaskingOptions(); // \OpenAPI\Client\Model\MaskingOptions
$organization = org-123456; // string | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
$mask_image = "/path/to/file.txt"; // \SplFileObject | Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.)

try {
    $apiInstance->v1alphaGenerationMasking($engine_id, $accept, $init_image, $options, $organization, $mask_image);
} catch (Exception $e) {
    echo 'Exception when calling V1alphaGenerationApi->v1alphaGenerationMasking: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **string**|   |
 **accept** | **string**|   |
 **init_image** | **\SplFileObject****\SplFileObject**| Initial image to use for the image-to-image generation |
 **options** | [**\OpenAPI\Client\Model\MaskingOptions**](../Model/MaskingOptions.md)|  |
 **organization** | **string**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional]
 **mask_image** | **\SplFileObject****\SplFileObject**| Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.) | [optional]

### Return type

void (empty response body)

### Authorization

[api_key_header_Authorization](../../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/vnd.goa.error`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `v1alphaGenerationTextToImage()`

```php
v1alphaGenerationTextToImage($engine_id, $accept, $text_to_image_request_body, $organization)
```

text-to-image

Generate an image from text

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: api_key_header_Authorization
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\V1alphaGenerationApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$engine_id = stable-diffusion-512-v2-0; // string |  
$accept = application/json; // string |  
$text_to_image_request_body = {"cfg_scale":7,"clip_guidance_preset":"FAST_BLUE","height":512,"sampler":"K_DPM_2_ANCESTRAL","samples":1,"seed":0,"steps":75,"text_prompts":[{"text":"A lighthouse on a cliff","weight":1}],"width":512}; // \OpenAPI\Client\Model\TextToImageRequestBody
$organization = org-123456; // string | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.

try {
    $apiInstance->v1alphaGenerationTextToImage($engine_id, $accept, $text_to_image_request_body, $organization);
} catch (Exception $e) {
    echo 'Exception when calling V1alphaGenerationApi->v1alphaGenerationTextToImage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engine_id** | **string**|   |
 **accept** | **string**|   |
 **text_to_image_request_body** | [**\OpenAPI\Client\Model\TextToImageRequestBody**](../Model/TextToImageRequestBody.md)|  |
 **organization** | **string**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional]

### Return type

void (empty response body)

### Authorization

[api_key_header_Authorization](../../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/vnd.goa.error`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
