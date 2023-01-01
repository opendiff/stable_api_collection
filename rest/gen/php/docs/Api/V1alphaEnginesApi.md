# OpenAPI\Client\V1alphaEnginesApi

All URIs are relative to https://api.stability.ai.

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaEnginesListEngines()**](V1alphaEnginesApi.md#v1alphaEnginesListEngines) | **GET** /v1alpha/engines/list | list


## `v1alphaEnginesListEngines()`

```php
v1alphaEnginesListEngines($organization): \OpenAPI\Client\Model\ListEnginesResponseBody
```

list

List all engines available to your organization/user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: api_key_header_Authorization
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\V1alphaEnginesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$organization = org-123456; // string | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.

try {
    $result = $apiInstance->v1alphaEnginesListEngines($organization);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling V1alphaEnginesApi->v1alphaEnginesListEngines: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **string**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional]

### Return type

[**\OpenAPI\Client\Model\ListEnginesResponseBody**](../Model/ListEnginesResponseBody.md)

### Authorization

[api_key_header_Authorization](../../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
