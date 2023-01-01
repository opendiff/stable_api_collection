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

#include "CoreMinimal.h"
#include "OpenAPIBaseModel.h"

namespace OpenAPI
{

class OPENAPI_API OpenAPIV1alphaGenerationApi
{
public:
	OpenAPIV1alphaGenerationApi();
	~OpenAPIV1alphaGenerationApi();

	/* Sets the URL Endpoint.
	* Note: several fallback endpoints can be configured in request retry policies, see Request::SetShouldRetry */
	void SetURL(const FString& Url);

	/* Adds global header params to all requests */
	void AddHeaderParam(const FString& Key, const FString& Value);
	void ClearHeaderParams();

	/* Sets the retry manager to the user-defined retry manager. User must manage the lifetime of the retry manager.
	* If no retry manager is specified and a request needs retries, a default retry manager will be used.
	* See also: Request::SetShouldRetry */
	void SetHttpRetryManager(FHttpRetrySystem::FManager& RetryManager);
	FHttpRetrySystem::FManager& GetHttpRetryManager();

	class V1alphaGenerationImageToImageRequest;
	class V1alphaGenerationImageToImageResponse;
	class V1alphaGenerationMaskingRequest;
	class V1alphaGenerationMaskingResponse;
	class V1alphaGenerationTextToImageRequest;
	class V1alphaGenerationTextToImageResponse;
	
    DECLARE_DELEGATE_OneParam(FV1alphaGenerationImageToImageDelegate, const V1alphaGenerationImageToImageResponse&);
    DECLARE_DELEGATE_OneParam(FV1alphaGenerationMaskingDelegate, const V1alphaGenerationMaskingResponse&);
    DECLARE_DELEGATE_OneParam(FV1alphaGenerationTextToImageDelegate, const V1alphaGenerationTextToImageResponse&);
    
    FHttpRequestPtr V1alphaGenerationImageToImage(const V1alphaGenerationImageToImageRequest& Request, const FV1alphaGenerationImageToImageDelegate& Delegate = FV1alphaGenerationImageToImageDelegate()) const;
    FHttpRequestPtr V1alphaGenerationMasking(const V1alphaGenerationMaskingRequest& Request, const FV1alphaGenerationMaskingDelegate& Delegate = FV1alphaGenerationMaskingDelegate()) const;
    FHttpRequestPtr V1alphaGenerationTextToImage(const V1alphaGenerationTextToImageRequest& Request, const FV1alphaGenerationTextToImageDelegate& Delegate = FV1alphaGenerationTextToImageDelegate()) const;
    
private:
    void OnV1alphaGenerationImageToImageResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FV1alphaGenerationImageToImageDelegate Delegate) const;
    void OnV1alphaGenerationMaskingResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FV1alphaGenerationMaskingDelegate Delegate) const;
    void OnV1alphaGenerationTextToImageResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FV1alphaGenerationTextToImageDelegate Delegate) const;
    
	FHttpRequestRef CreateHttpRequest(const Request& Request) const;
	bool IsValid() const;
	void HandleResponse(FHttpResponsePtr HttpResponse, bool bSucceeded, Response& InOutResponse) const;

	FString Url;
	TMap<FString,FString> AdditionalHeaderParams;
	mutable FHttpRetrySystem::FManager* RetryManager = nullptr;
	mutable TUniquePtr<HttpRetryManager> DefaultRetryManager;
};

}
