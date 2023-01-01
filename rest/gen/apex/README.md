# Stability.ai REST API API Client


Welcome to the Stability.ai REST API developer preview!\n\nPlease note, this is an alpha version of our new REST API, and is subject to change according to\nyour feedback.\n\nFeedback during this test is crucial for us to understand what the pain points are and how we can\nimprove it going forward.\n\nChanges will be communicated here, as well as on our online REST API documentation, which can be\nfound at: https://api.stability.ai/docs\n\nYour DreamStudio API key will be required for authentication. You can learn more about API keys\nhere: https://platform.stability.ai/docs/getting-started/authentication\n\nIf you encounter any issues, please let us know in the #API discord channel:\nhttps://discord.gg/stablediffusion\n

## Requirements

- [Salesforce DX](https://www.salesforce.com/products/platform/products/salesforce-dx/)

If everything is set correctly:

- Running `sfdx version` in a command prompt should output something like:

  ```bash
  sfdx-cli/5.7.5-05549de (darwin-amd64) go1.7.5 sfdxstable
  ```

## Installation

1. Copy the output into your Salesforce DX folder - or alternatively deploy the output directly into the workspace.
2. Deploy the code via Salesforce DX to your Scratch Org

   ```bash
      sfdx force:source:push
   ```

3. If the API needs authentication update the Named Credential in Setup.
4. Run your Apex tests using

   ```bash
       sfdx sfdx force:apex:test:run
   ```

5. Retrieve the job id from the console and check the test results.

  ```bash
  sfdx force:apex:test:report -i theJobId
  ```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Apex code:

```java
OASV1alphaEnginesApi api = new OASV1alphaEnginesApi();
OASClient client = api.getClient();


Map<String, Object> params = new Map<String, Object>{
    'organization' => org-123456
};

try {
    // cross your fingers
    OASListEnginesResponseBody result = api.v1alphaEnginesListEngines(params);
    System.debug(result);
} catch (OAS.ApiException e) {
    // ...handle your exceptions
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.stability.ai*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OASV1alphaEnginesApi* | [**v1alphaEnginesListEngines**](OASV1alphaEnginesApi.md#v1alphaEnginesListEngines) | **GET** /v1alpha/engines/list | list
*OASV1alphaGenerationApi* | [**v1alphaGenerationImageToImage**](OASV1alphaGenerationApi.md#v1alphaGenerationImageToImage) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
*OASV1alphaGenerationApi* | [**v1alphaGenerationMasking**](OASV1alphaGenerationApi.md#v1alphaGenerationMasking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
*OASV1alphaGenerationApi* | [**v1alphaGenerationTextToImage**](OASV1alphaGenerationApi.md#v1alphaGenerationTextToImage) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image
*OASV1alphaUserApi* | [**v1alphaUserAccount**](OASV1alphaUserApi.md#v1alphaUserAccount) | **GET** /v1alpha/user/account | account
*OASV1alphaUserApi* | [**v1alphaUserBalance**](OASV1alphaUserApi.md#v1alphaUserBalance) | **GET** /v1alpha/user/balance | balance


## Documentation for Models

 - [OASAccountResponseBody](OASAccountResponseBody.md)
 - [OASBalanceResponseBody](OASBalanceResponseBody.md)
 - [OASEngine](OASEngine.md)
 - [OASError](OASError.md)
 - [OASListEnginesResponseBody](OASListEnginesResponseBody.md)
 - [OASOrganizationMembership](OASOrganizationMembership.md)
 - [OASTextPrompt](OASTextPrompt.md)
 - [OASTextToImageRequestBody](OASTextToImageRequestBody.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key_header_Authorization


- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Author

info@stability.ai

