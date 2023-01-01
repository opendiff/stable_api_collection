// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { ImageToImageOptions } from '../models/ImageToImageOptions';
import { MaskingOptions } from '../models/MaskingOptions';
import { TextToImageRequestBody } from '../models/TextToImageRequestBody';

/**
 * no description
 */
export class V1alphaGenerationApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Generate big fancy pictures from small fancy pictures
     * image-to-image
     * @param engineId  
     * @param accept  
     * @param initImage Initial image to use for the image-to-image generation
     * @param options 
     * @param organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used.
     */
    public async v1alphaGenerationImageToImage(engineId: string, accept: 'image/png' | 'application/json', initImage: HttpFile, options: ImageToImageOptions, organization?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'engineId' is not null or undefined
        if (engineId === null || engineId === undefined) {
            throw new RequiredError("V1alphaGenerationApi", "v1alphaGenerationImageToImage", "engineId");
        }


        // verify required parameter 'accept' is not null or undefined
        if (accept === null || accept === undefined) {
            throw new RequiredError("V1alphaGenerationApi", "v1alphaGenerationImageToImage", "accept");
        }


        // verify required parameter 'initImage' is not null or undefined
        if (initImage === null || initImage === undefined) {
            throw new RequiredError("V1alphaGenerationApi", "v1alphaGenerationImageToImage", "initImage");
        }


        // verify required parameter 'options' is not null or undefined
        if (options === null || options === undefined) {
            throw new RequiredError("V1alphaGenerationApi", "v1alphaGenerationImageToImage", "options");
        }



        // Path Params
        const localVarPath = '/v1alpha/generation/{engine_id}/image-to-image'
            .replace('{' + 'engine_id' + '}', encodeURIComponent(String(engineId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Header Params
        requestContext.setHeaderParam("Accept", ObjectSerializer.serialize(accept, "'image/png' | 'application/json'", ""));

        // Header Params
        requestContext.setHeaderParam("Organization", ObjectSerializer.serialize(organization, "string", ""));

        // Form Params
        const useForm = canConsumeForm([
            'multipart/form-data',
        ]);

        let localVarFormParams
        if (useForm) {
            localVarFormParams = new FormData();
        } else {
            localVarFormParams = new URLSearchParams();
        }

        if (initImage !== undefined) {
             // TODO: replace .append with .set
             if (localVarFormParams instanceof FormData) {
                 localVarFormParams.append('init_image', initImage, initImage.name);
             }
        }
        if (options !== undefined) {
             // TODO: replace .append with .set
             localVarFormParams.append('options', options as any);
        }

        requestContext.setBody(localVarFormParams);

        if(!useForm) {
            const contentType = ObjectSerializer.getPreferredMediaType([
                "multipart/form-data"
            ]);
            requestContext.setHeaderParam("Content-Type", contentType);
        }

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["api_key_header_Authorization"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Paint fancy things into fancy pictures
     * image-to-image/masking
     * @param engineId  
     * @param accept  
     * @param initImage Initial image to use for the image-to-image generation
     * @param options 
     * @param organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used.
     * @param maskImage Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.)
     */
    public async v1alphaGenerationMasking(engineId: string, accept: 'image/png' | 'application/json', initImage: HttpFile, options: MaskingOptions, organization?: string, maskImage?: HttpFile, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'engineId' is not null or undefined
        if (engineId === null || engineId === undefined) {
            throw new RequiredError("V1alphaGenerationApi", "v1alphaGenerationMasking", "engineId");
        }


        // verify required parameter 'accept' is not null or undefined
        if (accept === null || accept === undefined) {
            throw new RequiredError("V1alphaGenerationApi", "v1alphaGenerationMasking", "accept");
        }


        // verify required parameter 'initImage' is not null or undefined
        if (initImage === null || initImage === undefined) {
            throw new RequiredError("V1alphaGenerationApi", "v1alphaGenerationMasking", "initImage");
        }


        // verify required parameter 'options' is not null or undefined
        if (options === null || options === undefined) {
            throw new RequiredError("V1alphaGenerationApi", "v1alphaGenerationMasking", "options");
        }




        // Path Params
        const localVarPath = '/v1alpha/generation/{engine_id}/image-to-image/masking'
            .replace('{' + 'engine_id' + '}', encodeURIComponent(String(engineId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Header Params
        requestContext.setHeaderParam("Accept", ObjectSerializer.serialize(accept, "'image/png' | 'application/json'", ""));

        // Header Params
        requestContext.setHeaderParam("Organization", ObjectSerializer.serialize(organization, "string", ""));

        // Form Params
        const useForm = canConsumeForm([
            'multipart/form-data',
        ]);

        let localVarFormParams
        if (useForm) {
            localVarFormParams = new FormData();
        } else {
            localVarFormParams = new URLSearchParams();
        }

        if (initImage !== undefined) {
             // TODO: replace .append with .set
             if (localVarFormParams instanceof FormData) {
                 localVarFormParams.append('init_image', initImage, initImage.name);
             }
        }
        if (maskImage !== undefined) {
             // TODO: replace .append with .set
             if (localVarFormParams instanceof FormData) {
                 localVarFormParams.append('mask_image', maskImage, maskImage.name);
             }
        }
        if (options !== undefined) {
             // TODO: replace .append with .set
             localVarFormParams.append('options', options as any);
        }

        requestContext.setBody(localVarFormParams);

        if(!useForm) {
            const contentType = ObjectSerializer.getPreferredMediaType([
                "multipart/form-data"
            ]);
            requestContext.setHeaderParam("Content-Type", contentType);
        }

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["api_key_header_Authorization"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Generate an image from text
     * text-to-image
     * @param engineId  
     * @param accept  
     * @param textToImageRequestBody 
     * @param organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used.
     */
    public async v1alphaGenerationTextToImage(engineId: string, accept: 'image/png' | 'application/json', textToImageRequestBody: TextToImageRequestBody, organization?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'engineId' is not null or undefined
        if (engineId === null || engineId === undefined) {
            throw new RequiredError("V1alphaGenerationApi", "v1alphaGenerationTextToImage", "engineId");
        }


        // verify required parameter 'accept' is not null or undefined
        if (accept === null || accept === undefined) {
            throw new RequiredError("V1alphaGenerationApi", "v1alphaGenerationTextToImage", "accept");
        }


        // verify required parameter 'textToImageRequestBody' is not null or undefined
        if (textToImageRequestBody === null || textToImageRequestBody === undefined) {
            throw new RequiredError("V1alphaGenerationApi", "v1alphaGenerationTextToImage", "textToImageRequestBody");
        }



        // Path Params
        const localVarPath = '/v1alpha/generation/{engine_id}/text-to-image'
            .replace('{' + 'engine_id' + '}', encodeURIComponent(String(engineId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Header Params
        requestContext.setHeaderParam("Accept", ObjectSerializer.serialize(accept, "'image/png' | 'application/json'", ""));

        // Header Params
        requestContext.setHeaderParam("Organization", ObjectSerializer.serialize(organization, "string", ""));


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(textToImageRequestBody, "TextToImageRequestBody", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["api_key_header_Authorization"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class V1alphaGenerationApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to v1alphaGenerationImageToImage
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async v1alphaGenerationImageToImage(response: ResponseContext): Promise<void > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            return;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to &#x60;application/json&#x60; - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_file_size: The file size of one or more of the provided files is invalid - invalid_mime_type: The mime type of one or more of the provided files is invalid - invalid_prompts: One or more of the prompts contains filtered words ", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "unauthorized: API key missing or invalid", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "permission_denied: You lack the necessary permissions to perform this action", body, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "not_found: The requested resource was not found (e.g. specifing a model that does not exist)", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: void = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "void", ""
            ) as void;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to v1alphaGenerationMasking
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async v1alphaGenerationMasking(response: ResponseContext): Promise<void > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            return;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to &#x60;application/json&#x60; - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_file_size: The file size of one or more of the provided files is invalid - invalid_mime_type: The mime type of one or more of the provided files is invalid - invalid_image_dimensions: The dimensions of the provided &#x60;init_image&#x60; and &#x60;mask_image&#x60; do not match - invalid_mask_image: The parameter &#x60;mask_source&#x60; was set to &#x60;MASK_IMAGE_WHITE&#x60; or &#x60;MASK_IMAGE_BLACK&#x60; but no &#x60;mask_image&#x60; was provided - invalid_prompts: One or more of the prompts contains filtered words ", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "unauthorized: API key missing or invalid", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "permission_denied: You lack the necessary permissions to perform this action", body, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "not_found: The requested resource was not found (e.g. specifing a model that does not exist)", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: void = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "void", ""
            ) as void;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to v1alphaGenerationTextToImage
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async v1alphaGenerationTextToImage(response: ResponseContext): Promise<void > {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            return;
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "bad_request:  - invalid_samples: Sample count may only be greater than 1 when accept header is set to &#x60;application/json&#x60; - invalid_height_or_width: Height and width must specified in increments of 64 - invalid_prompts: One or more of the prompts contains filtered words ", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "unauthorized: API key missing or invalid", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "permission_denied: You lack the necessary permissions to perform this action", body, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "not_found: The requested resource was not found (e.g. specifing a model that does not exist)", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: void = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "void", ""
            ) as void;
            return body;
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
