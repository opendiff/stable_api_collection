# C API client for stability_ai_rest_api

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project. By using the [OpenAPI spec](https://openapis.org) from a remote server, you can easily generate an API client.

- API version: 0.1
- Package version: 
- Build package: org.openapitools.codegen.languages.CLibcurlClientCodegen
For more information, please visit [https://stability.ai/](https://stability.ai/)

## Installation
You'll need the `curl 7.58.0` package in order to build the API. To have code formatted nicely, you also need to have uncrustify version 0.67 or later.

# Prerequisites

## Install the `curl 7.58.0` package with the following command on Linux.
```bash
sudo apt remove curl
wget http://curl.haxx.se/download/curl-7.58.0.tar.gz
tar -xvf curl-7.58.0.tar.gz
cd curl-7.58.0/
./configure
make
sudo make install
```
## Install the `uncrustify 0.67` package with the following command on Linux.
```bash
git clone https://github.com/uncrustify/uncrustify.git
cd uncrustify
mkdir build
cd build
cmake ..
make
sudo make install
```

## Compile the sample:
This will compile the generated code and create a library in the build folder which has to be linked to the codes where API will be used.
```bash
mkdir build
cd build
// To install library to specific location, use following commands
cmake -DCMAKE_INSTALL_PREFIX=/pathtolocation ..
// for normal install use following command
cmake ..
make
sudo make install
```
## How to use compiled library
Considering the test/source code which uses the API is written in main.c(respective api include is written and all objects necessary are defined and created)

To compile main.c(considering the file is present in build folder) use following command
-L - location of the library(not required if cmake with normal installation is performed)
-l library name
```bash
gcc main.c -L. -lstability_ai_rest_api -o main
```
Once compiled, you can run it with ``` ./main ```

Note: You don't need to specify includes for models and include folder separately as they are path linked. You just have to import the api.h file in your code, the include linking will work.

## Documentation for API Endpoints

All URIs are relative to *https://api.stability.ai*

Category | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*V1alphaEnginesAPI* | [**V1alphaEnginesAPI_v1alphaEnginesListEngines**](docs/V1alphaEnginesAPI.md#V1alphaEnginesAPI_v1alphaEnginesListEngines) | **GET** /v1alpha/engines/list | list
*V1alphaGenerationAPI* | [**V1alphaGenerationAPI_v1alphaGenerationImageToImage**](docs/V1alphaGenerationAPI.md#V1alphaGenerationAPI_v1alphaGenerationImageToImage) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
*V1alphaGenerationAPI* | [**V1alphaGenerationAPI_v1alphaGenerationMasking**](docs/V1alphaGenerationAPI.md#V1alphaGenerationAPI_v1alphaGenerationMasking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
*V1alphaGenerationAPI* | [**V1alphaGenerationAPI_v1alphaGenerationTextToImage**](docs/V1alphaGenerationAPI.md#V1alphaGenerationAPI_v1alphaGenerationTextToImage) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image
*V1alphaUserAPI* | [**V1alphaUserAPI_v1alphaUserAccount**](docs/V1alphaUserAPI.md#V1alphaUserAPI_v1alphaUserAccount) | **GET** /v1alpha/user/account | account
*V1alphaUserAPI* | [**V1alphaUserAPI_v1alphaUserBalance**](docs/V1alphaUserAPI.md#V1alphaUserAPI_v1alphaUserBalance) | **GET** /v1alpha/user/balance | balance


## Documentation for Models

 - [account_response_body_t](docs/account_response_body.md)
 - [balance_response_body_t](docs/balance_response_body.md)
 - [engine_t](docs/engine.md)
 - [error_t](docs/error.md)
 - [list_engines_response_body_t](docs/list_engines_response_body.md)
 - [organization_membership_t](docs/organization_membership.md)
 - [text_prompt_t](docs/text_prompt.md)
 - [text_to_image_request_body_t](docs/text_to_image_request_body.md)


## Documentation for Authorization


### api_key_header_Authorization

- **Type**: API key

- **API key parameter name**: Authorization
- **Location**: HTTP header


## Author

info@stability.ai
