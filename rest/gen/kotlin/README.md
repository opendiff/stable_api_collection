# org.openapitools.client - Kotlin client library for Stability.ai REST API

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.stability.ai*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*V1alphaEnginesApi* | [**v1alphaEnginesListEngines**](docs/V1alphaEnginesApi.md#v1alphaengineslistengines) | **GET** /v1alpha/engines/list | list
*V1alphaGenerationApi* | [**v1alphaGenerationImageToImage**](docs/V1alphaGenerationApi.md#v1alphagenerationimagetoimage) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
*V1alphaGenerationApi* | [**v1alphaGenerationMasking**](docs/V1alphaGenerationApi.md#v1alphagenerationmasking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
*V1alphaGenerationApi* | [**v1alphaGenerationTextToImage**](docs/V1alphaGenerationApi.md#v1alphagenerationtexttoimage) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image
*V1alphaUserApi* | [**v1alphaUserAccount**](docs/V1alphaUserApi.md#v1alphauseraccount) | **GET** /v1alpha/user/account | account
*V1alphaUserApi* | [**v1alphaUserBalance**](docs/V1alphaUserApi.md#v1alphauserbalance) | **GET** /v1alpha/user/balance | balance


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.AccountResponseBody](docs/AccountResponseBody.md)
 - [org.openapitools.client.models.BalanceResponseBody](docs/BalanceResponseBody.md)
 - [org.openapitools.client.models.Engine](docs/Engine.md)
 - [org.openapitools.client.models.Error](docs/Error.md)
 - [org.openapitools.client.models.ListEnginesResponseBody](docs/ListEnginesResponseBody.md)
 - [org.openapitools.client.models.OrganizationMembership](docs/OrganizationMembership.md)
 - [org.openapitools.client.models.TextPrompt](docs/TextPrompt.md)
 - [org.openapitools.client.models.TextToImageRequestBody](docs/TextToImageRequestBody.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="api_key_header_Authorization"></a>
### api_key_header_Authorization

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

