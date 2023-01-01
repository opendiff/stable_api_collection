/**
 * Stability.ai REST API
 * Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
 *
 * OpenAPI spec version: 0.1
 * Contact: info@stability.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"
#include "OpenAPIV1alphaUserApi.h"

#include "OpenAPIAccountResponseBody.h"
#include "OpenAPIBalanceResponseBody.h"

namespace OpenAPI
{

/* account
 *
 * Get information about the account associated with the provided API key
*/
class OPENAPI_API OpenAPIV1alphaUserApi::V1alphaUserAccountRequest : public Request
{
public:
    virtual ~V1alphaUserAccountRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

};

class OPENAPI_API OpenAPIV1alphaUserApi::V1alphaUserAccountResponse : public Response
{
public:
    virtual ~V1alphaUserAccountResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIAccountResponseBody Content;
};

/* balance
 *
 * Get the credit balance of the account/organization associated with the API key
*/
class OPENAPI_API OpenAPIV1alphaUserApi::V1alphaUserBalanceRequest : public Request
{
public:
    virtual ~V1alphaUserBalanceRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	/* Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. */
	TOptional<FString> Organization;
};

class OPENAPI_API OpenAPIV1alphaUserApi::V1alphaUserBalanceResponse : public Response
{
public:
    virtual ~V1alphaUserBalanceResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIBalanceResponseBody Content;
};

}