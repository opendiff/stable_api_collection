# openapi-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

- target/openapi-android-client-1.0.0.jar
- target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.api.V1alphaEnginesApi;

public class V1alphaEnginesApiExample {

    public static void main(String[] args) {
        V1alphaEnginesApi apiInstance = new V1alphaEnginesApi();
        String organization = org-123456; // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
        try {
            ListEnginesResponseBody result = apiInstance.v1alphaEnginesListEngines(organization);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling V1alphaEnginesApi#v1alphaEnginesListEngines");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.stability.ai*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*V1alphaEnginesApi* | [**v1alphaEnginesListEngines**](docs/V1alphaEnginesApi.md#v1alphaEnginesListEngines) | **GET** /v1alpha/engines/list | list
*V1alphaGenerationApi* | [**v1alphaGenerationImageToImage**](docs/V1alphaGenerationApi.md#v1alphaGenerationImageToImage) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
*V1alphaGenerationApi* | [**v1alphaGenerationMasking**](docs/V1alphaGenerationApi.md#v1alphaGenerationMasking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
*V1alphaGenerationApi* | [**v1alphaGenerationTextToImage**](docs/V1alphaGenerationApi.md#v1alphaGenerationTextToImage) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image
*V1alphaUserApi* | [**v1alphaUserAccount**](docs/V1alphaUserApi.md#v1alphaUserAccount) | **GET** /v1alpha/user/account | account
*V1alphaUserApi* | [**v1alphaUserBalance**](docs/V1alphaUserApi.md#v1alphaUserBalance) | **GET** /v1alpha/user/balance | balance


## Documentation for Models

 - [AccountResponseBody](docs/AccountResponseBody.md)
 - [BalanceResponseBody](docs/BalanceResponseBody.md)
 - [Engine](docs/Engine.md)
 - [Error](docs/Error.md)
 - [ListEnginesResponseBody](docs/ListEnginesResponseBody.md)
 - [OrganizationMembership](docs/OrganizationMembership.md)
 - [TextPrompt](docs/TextPrompt.md)
 - [TextToImageRequestBody](docs/TextToImageRequestBody.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key_header_Authorization

- **Type**: API key

- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@stability.ai

