# OpenAPIClient-php

Welcome to the Stability.ai REST API developer preview!

Please note, this is an alpha version of our new REST API, and is subject to change according to
your feedback.

Feedback during this test is crucial for us to understand what the pain points are and how we can
improve it going forward.

Changes will be communicated here, as well as on our online REST API documentation, which can be
found at: https://api.stability.ai/docs

Your DreamStudio API key will be required for authentication. You can learn more about API keys
here: https://platform.stability.ai/docs/getting-started/authentication

If you encounter any issues, please let us know in the #API discord channel:
https://discord.gg/stablediffusion


For more information, please visit [https://stability.ai/](https://stability.ai/).

## Installation & Usage

### Requirements

PHP 7.4 and later.
Should also work with PHP 8.0.

### Composer

To install the bindings via [Composer](https://getcomposer.org/), add the following to `composer.json`:

```json
{
  "repositories": [
    {
      "type": "vcs",
      "url": "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
    }
  ],
  "require": {
    "GIT_USER_ID/GIT_REPO_ID": "*@dev"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
<?php
require_once('/path/to/OpenAPIClient-php/vendor/autoload.php');
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

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

## API Endpoints

All URIs are relative to *https://api.stability.ai*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*V1alphaEnginesApi* | [**v1alphaEnginesListEngines**](docs/Api/V1alphaEnginesApi.md#v1alphaengineslistengines) | **GET** /v1alpha/engines/list | list
*V1alphaGenerationApi* | [**v1alphaGenerationImageToImage**](docs/Api/V1alphaGenerationApi.md#v1alphagenerationimagetoimage) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
*V1alphaGenerationApi* | [**v1alphaGenerationMasking**](docs/Api/V1alphaGenerationApi.md#v1alphagenerationmasking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
*V1alphaGenerationApi* | [**v1alphaGenerationTextToImage**](docs/Api/V1alphaGenerationApi.md#v1alphagenerationtexttoimage) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image
*V1alphaUserApi* | [**v1alphaUserAccount**](docs/Api/V1alphaUserApi.md#v1alphauseraccount) | **GET** /v1alpha/user/account | account
*V1alphaUserApi* | [**v1alphaUserBalance**](docs/Api/V1alphaUserApi.md#v1alphauserbalance) | **GET** /v1alpha/user/balance | balance

## Models

- [AccountResponseBody](docs/Model/AccountResponseBody.md)
- [BalanceResponseBody](docs/Model/BalanceResponseBody.md)
- [Engine](docs/Model/Engine.md)
- [Error](docs/Model/Error.md)
- [ListEnginesResponseBody](docs/Model/ListEnginesResponseBody.md)
- [OrganizationMembership](docs/Model/OrganizationMembership.md)
- [TextPrompt](docs/Model/TextPrompt.md)
- [TextToImageRequestBody](docs/Model/TextToImageRequestBody.md)

## Authorization

### api_key_header_Authorization

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Tests

To run the tests, use:

```bash
composer install
vendor/bin/phpunit
```

## Author

info@stability.ai

## About this package

This PHP package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: `0.1`
- Build package: `org.openapitools.codegen.languages.PhpClientCodegen`
