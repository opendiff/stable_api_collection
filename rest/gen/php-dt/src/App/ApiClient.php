<?php
declare(strict_types=1);

namespace App;

use Articus\DataTransfer as DT;
use OpenAPIGenerator\APIClient as OAGAC;
use Psr\Http\Client\ClientExceptionInterface;
use Psr\Http\Message\ResponseInterface;

/**
 * Stability.ai REST API
 * Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion
 * The version of the OpenAPI document: 0.1
 */
class ApiClient extends OAGAC\AbstractApiClient
{
    //region v1alphaEnginesListEngines
    /**
     * list
     * @param \App\DTO\V1alphaEnginesListEnginesParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function v1alphaEnginesListEnginesRaw(
        \App\DTO\V1alphaEnginesListEnginesParameterData $parameters,
        iterable $security = ['api_key_header_Authorization' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/v1alpha/engines/list', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * list
     * @param \App\DTO\V1alphaEnginesListEnginesParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function v1alphaEnginesListEngines(
        \App\DTO\V1alphaEnginesListEnginesParameterData $parameters,
        iterable $security = ['api_key_header_Authorization' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->v1alphaEnginesListEnginesRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK response. */
                $responseContent = new \App\DTO\ListEnginesResponseBody();
                break;
        }
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * list
     * @param \App\DTO\V1alphaEnginesListEnginesParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return \App\DTO\ListEnginesResponseBody
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function v1alphaEnginesListEnginesResult(
        \App\DTO\V1alphaEnginesListEnginesParameterData $parameters,
        iterable $security = ['api_key_header_Authorization' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\ListEnginesResponseBody
    {
        return $this->getSuccessfulContent(...$this->v1alphaEnginesListEngines($parameters, $security, $responseMediaType));
    }
    //endregion

    //region v1alphaGenerationImageToImage
    /**
     * image-to-image
     * @param \App\DTO\V1alphaGenerationImageToImageParameterData $parameters
     * @param \App\DTO\ImageToImageRequestBody $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function v1alphaGenerationImageToImageRaw(
        \App\DTO\V1alphaGenerationImageToImageParameterData $parameters,
        \App\DTO\ImageToImageRequestBody $requestContent,
        iterable $security = ['api_key_header_Authorization' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/vnd.goa.error'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/v1alpha/generation/{engine_id}/image-to-image', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * image-to-image
     * @param \App\DTO\V1alphaGenerationImageToImageParameterData $parameters
     * @param \App\DTO\ImageToImageRequestBody $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function v1alphaGenerationImageToImage(
        \App\DTO\V1alphaGenerationImageToImageParameterData $parameters,
        \App\DTO\ImageToImageRequestBody $requestContent,
        iterable $security = ['api_key_header_Authorization' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/vnd.goa.error'
    ): array
    {
        $response = $this->v1alphaGenerationImageToImageRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK response. */
                break;
            case 400:
                /* bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to `application/json` - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_file_size: The file size of one or more of the provided files is invalid - invalid_mime_type: The mime type of one or more of the provided files is invalid - invalid_prompts: One or more of the prompts contains filtered words */
                $responseContent = new \App\DTO\Error();
                break;
            case 401:
                /* unauthorized: API key missing or invalid */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* permission_denied: You lack the necessary permissions to perform this action */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* not_found: The requested resource was not found (e.g. specifing a model that does not exist) */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * image-to-image
     * @param \App\DTO\V1alphaGenerationImageToImageParameterData $parameters
     * @param \App\DTO\ImageToImageRequestBody $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function v1alphaGenerationImageToImageResult(
        \App\DTO\V1alphaGenerationImageToImageParameterData $parameters,
        \App\DTO\ImageToImageRequestBody $requestContent,
        iterable $security = ['api_key_header_Authorization' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/vnd.goa.error'
    )
    {
        return $this->getSuccessfulContent(...$this->v1alphaGenerationImageToImage($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region v1alphaGenerationMasking
    /**
     * image-to-image/masking
     * @param \App\DTO\V1alphaGenerationMaskingParameterData $parameters
     * @param \App\DTO\MaskingRequestBody $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function v1alphaGenerationMaskingRaw(
        \App\DTO\V1alphaGenerationMaskingParameterData $parameters,
        \App\DTO\MaskingRequestBody $requestContent,
        iterable $security = ['api_key_header_Authorization' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/vnd.goa.error'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/v1alpha/generation/{engine_id}/image-to-image/masking', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * image-to-image/masking
     * @param \App\DTO\V1alphaGenerationMaskingParameterData $parameters
     * @param \App\DTO\MaskingRequestBody $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function v1alphaGenerationMasking(
        \App\DTO\V1alphaGenerationMaskingParameterData $parameters,
        \App\DTO\MaskingRequestBody $requestContent,
        iterable $security = ['api_key_header_Authorization' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/vnd.goa.error'
    ): array
    {
        $response = $this->v1alphaGenerationMaskingRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK response. */
                break;
            case 400:
                /* bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to `application/json` - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_file_size: The file size of one or more of the provided files is invalid - invalid_mime_type: The mime type of one or more of the provided files is invalid - invalid_image_dimensions: The dimensions of the provided `init_image` and `mask_image` do not match - invalid_mask_image: The parameter `mask_source` was set to `MASK_IMAGE_WHITE` or `MASK_IMAGE_BLACK` but no `mask_image` was provided - invalid_prompts: One or more of the prompts contains filtered words */
                $responseContent = new \App\DTO\Error();
                break;
            case 401:
                /* unauthorized: API key missing or invalid */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* permission_denied: You lack the necessary permissions to perform this action */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* not_found: The requested resource was not found (e.g. specifing a model that does not exist) */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * image-to-image/masking
     * @param \App\DTO\V1alphaGenerationMaskingParameterData $parameters
     * @param \App\DTO\MaskingRequestBody $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function v1alphaGenerationMaskingResult(
        \App\DTO\V1alphaGenerationMaskingParameterData $parameters,
        \App\DTO\MaskingRequestBody $requestContent,
        iterable $security = ['api_key_header_Authorization' => []],
        string $requestMediaType = 'multipart/form-data',
        string $responseMediaType = 'application/vnd.goa.error'
    )
    {
        return $this->getSuccessfulContent(...$this->v1alphaGenerationMasking($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region v1alphaGenerationTextToImage
    /**
     * text-to-image
     * @param \App\DTO\V1alphaGenerationTextToImageParameterData $parameters
     * @param \App\DTO\TextToImageRequestBody $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function v1alphaGenerationTextToImageRaw(
        \App\DTO\V1alphaGenerationTextToImageParameterData $parameters,
        \App\DTO\TextToImageRequestBody $requestContent,
        iterable $security = ['api_key_header_Authorization' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/vnd.goa.error'
    ): ResponseInterface
    {
        $request = $this->createRequest('POST', '/v1alpha/generation/{engine_id}/text-to-image', $this->getPathParameters($parameters), []);
        $request = $this->addCustomHeaders($request, $parameters);
        $request = $this->addBody($request, $requestMediaType, $requestContent);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * text-to-image
     * @param \App\DTO\V1alphaGenerationTextToImageParameterData $parameters
     * @param \App\DTO\TextToImageRequestBody $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function v1alphaGenerationTextToImage(
        \App\DTO\V1alphaGenerationTextToImageParameterData $parameters,
        \App\DTO\TextToImageRequestBody $requestContent,
        iterable $security = ['api_key_header_Authorization' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/vnd.goa.error'
    ): array
    {
        $response = $this->v1alphaGenerationTextToImageRaw($parameters, $requestContent, $security, $requestMediaType, $responseMediaType);
        $responseContent = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK response. */
                break;
            case 400:
                /* bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to `application/json` - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_prompts: One or more of the prompts contains filtered words */
                $responseContent = new \App\DTO\Error();
                break;
            case 401:
                /* unauthorized: API key missing or invalid */
                $responseContent = new \App\DTO\Error();
                break;
            case 403:
                /* permission_denied: You lack the necessary permissions to perform this action */
                $responseContent = new \App\DTO\Error();
                break;
            case 404:
                /* not_found: The requested resource was not found (e.g. specifing a model that does not exist) */
                $responseContent = new \App\DTO\Error();
                break;
        }
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * text-to-image
     * @param \App\DTO\V1alphaGenerationTextToImageParameterData $parameters
     * @param \App\DTO\TextToImageRequestBody $requestContent
     * @param iterable|string[][] $security
     * @param string $requestMediaType
     * @param string $responseMediaType
     * @return mixed
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function v1alphaGenerationTextToImageResult(
        \App\DTO\V1alphaGenerationTextToImageParameterData $parameters,
        \App\DTO\TextToImageRequestBody $requestContent,
        iterable $security = ['api_key_header_Authorization' => []],
        string $requestMediaType = 'application/json',
        string $responseMediaType = 'application/vnd.goa.error'
    )
    {
        return $this->getSuccessfulContent(...$this->v1alphaGenerationTextToImage($parameters, $requestContent, $security, $requestMediaType, $responseMediaType));
    }
    //endregion

    //region v1alphaUserAccount
    /**
     * account
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function v1alphaUserAccountRaw(
        iterable $security = ['api_key_header_Authorization' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/v1alpha/user/account', [], []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * account
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function v1alphaUserAccount(
        iterable $security = ['api_key_header_Authorization' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->v1alphaUserAccountRaw($security, $responseMediaType);
        $responseContent = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK response. */
                $responseContent = new \App\DTO\AccountResponseBody();
                break;
        }
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * account
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return \App\DTO\AccountResponseBody
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function v1alphaUserAccountResult(
        iterable $security = ['api_key_header_Authorization' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\AccountResponseBody
    {
        return $this->getSuccessfulContent(...$this->v1alphaUserAccount($security, $responseMediaType));
    }
    //endregion

    //region v1alphaUserBalance
    /**
     * balance
     * @param \App\DTO\V1alphaUserBalanceParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function v1alphaUserBalanceRaw(
        \App\DTO\V1alphaUserBalanceParameterData $parameters,
        iterable $security = ['api_key_header_Authorization' => []],
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/v1alpha/user/balance', [], []);
        $request = $this->addCustomHeaders($request, $parameters);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        $request = $this->addSecurity($request, $security);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * balance
     * @param \App\DTO\V1alphaUserBalanceParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function v1alphaUserBalance(
        \App\DTO\V1alphaUserBalanceParameterData $parameters,
        iterable $security = ['api_key_header_Authorization' => []],
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->v1alphaUserBalanceRaw($parameters, $security, $responseMediaType);
        $responseContent = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* OK response. */
                $responseContent = new \App\DTO\BalanceResponseBody();
                break;
        }
        $this->parseBody($response, $responseContent);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * balance
     * @param \App\DTO\V1alphaUserBalanceParameterData $parameters
     * @param iterable|string[][] $security
     * @param string $responseMediaType
     * @return \App\DTO\BalanceResponseBody
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function v1alphaUserBalanceResult(
        \App\DTO\V1alphaUserBalanceParameterData $parameters,
        iterable $security = ['api_key_header_Authorization' => []],
        string $responseMediaType = 'application/json'
    ): \App\DTO\BalanceResponseBody
    {
        return $this->getSuccessfulContent(...$this->v1alphaUserBalance($parameters, $security, $responseMediaType));
    }
    //endregion
}

