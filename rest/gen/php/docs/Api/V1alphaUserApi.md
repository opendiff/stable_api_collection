# OpenAPI\Client\V1alphaUserApi

All URIs are relative to https://api.stability.ai.

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaUserAccount()**](V1alphaUserApi.md#v1alphaUserAccount) | **GET** /v1alpha/user/account | account
[**v1alphaUserBalance()**](V1alphaUserApi.md#v1alphaUserBalance) | **GET** /v1alpha/user/balance | balance


## `v1alphaUserAccount()`

```php
v1alphaUserAccount(): \OpenAPI\Client\Model\AccountResponseBody
```

account

Get information about the account associated with the provided API key

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: api_key_header_Authorization
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\V1alphaUserApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->v1alphaUserAccount();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling V1alphaUserApi->v1alphaUserAccount: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\AccountResponseBody**](../Model/AccountResponseBody.md)

### Authorization

[api_key_header_Authorization](../../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `v1alphaUserBalance()`

```php
v1alphaUserBalance($organization): \OpenAPI\Client\Model\BalanceResponseBody
```

balance

Get the credit balance of the account/organization associated with the API key

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: api_key_header_Authorization
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\V1alphaUserApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$organization = org-123456; // string | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.

try {
    $result = $apiInstance->v1alphaUserBalance($organization);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling V1alphaUserApi->v1alphaUserBalance: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **string**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional]

### Return type

[**\OpenAPI\Client\Model\BalanceResponseBody**](../Model/BalanceResponseBody.md)

### Authorization

[api_key_header_Authorization](../../README.md#api_key_header_Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
