import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import * as models from '../models/all';
import { Configuration} from '../configuration'

import { AccountResponseBody } from '../models/AccountResponseBody';
import { BalanceResponseBody } from '../models/BalanceResponseBody';
import { Engine } from '../models/Engine';
import { ListEnginesResponseBody } from '../models/ListEnginesResponseBody';
import { ModelError } from '../models/ModelError';
import { OrganizationMembership } from '../models/OrganizationMembership';
import { TextPrompt } from '../models/TextPrompt';
import { TextToImageRequestBody } from '../models/TextToImageRequestBody';
import { ObservableV1alphaEnginesApi } from './ObservableAPI';

import { V1alphaEnginesApiRequestFactory, V1alphaEnginesApiResponseProcessor} from "../apis/V1alphaEnginesApi";
export class PromiseV1alphaEnginesApi {
    private api: ObservableV1alphaEnginesApi

    public constructor(
        configuration: Configuration,
        requestFactory?: V1alphaEnginesApiRequestFactory,
        responseProcessor?: V1alphaEnginesApiResponseProcessor
    ) {
        this.api = new ObservableV1alphaEnginesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * List all engines available to your organization/user
     * list
     * @param organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used.
     */
    public v1alphaEnginesListEngines(organization?: string, _options?: Configuration): Promise<ListEnginesResponseBody> {
        const result = this.api.v1alphaEnginesListEngines(organization, _options);
        return result.toPromise();
    }


}



import { ObservableV1alphaGenerationApi } from './ObservableAPI';

import { V1alphaGenerationApiRequestFactory, V1alphaGenerationApiResponseProcessor} from "../apis/V1alphaGenerationApi";
export class PromiseV1alphaGenerationApi {
    private api: ObservableV1alphaGenerationApi

    public constructor(
        configuration: Configuration,
        requestFactory?: V1alphaGenerationApiRequestFactory,
        responseProcessor?: V1alphaGenerationApiResponseProcessor
    ) {
        this.api = new ObservableV1alphaGenerationApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Generate big fancy pictures from small fancy pictures
     * image-to-image
     * @param engineId  
     * @param accept  
     * @param initImage Initial image to use for the image-to-image generation
     * @param options 
     * @param organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used.
     */
    public v1alphaGenerationImageToImage(engineId: string, accept: 'image/png' | 'application/json', initImage: HttpFile, options: ImageToImageOptions, organization?: string, _options?: Configuration): Promise<void> {
        const result = this.api.v1alphaGenerationImageToImage(engineId, accept, initImage, options, organization, _options);
        return result.toPromise();
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
    public v1alphaGenerationMasking(engineId: string, accept: 'image/png' | 'application/json', initImage: HttpFile, options: MaskingOptions, organization?: string, maskImage?: HttpFile, _options?: Configuration): Promise<void> {
        const result = this.api.v1alphaGenerationMasking(engineId, accept, initImage, options, organization, maskImage, _options);
        return result.toPromise();
    }

    /**
     * Generate an image from text
     * text-to-image
     * @param engineId  
     * @param accept  
     * @param textToImageRequestBody 
     * @param organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used.
     */
    public v1alphaGenerationTextToImage(engineId: string, accept: 'image/png' | 'application/json', textToImageRequestBody: TextToImageRequestBody, organization?: string, _options?: Configuration): Promise<void> {
        const result = this.api.v1alphaGenerationTextToImage(engineId, accept, textToImageRequestBody, organization, _options);
        return result.toPromise();
    }


}



import { ObservableV1alphaUserApi } from './ObservableAPI';

import { V1alphaUserApiRequestFactory, V1alphaUserApiResponseProcessor} from "../apis/V1alphaUserApi";
export class PromiseV1alphaUserApi {
    private api: ObservableV1alphaUserApi

    public constructor(
        configuration: Configuration,
        requestFactory?: V1alphaUserApiRequestFactory,
        responseProcessor?: V1alphaUserApiResponseProcessor
    ) {
        this.api = new ObservableV1alphaUserApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get information about the account associated with the provided API key
     * account
     */
    public v1alphaUserAccount(_options?: Configuration): Promise<AccountResponseBody> {
        const result = this.api.v1alphaUserAccount(_options);
        return result.toPromise();
    }

    /**
     * Get the credit balance of the account/organization associated with the API key
     * balance
     * @param organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used.
     */
    public v1alphaUserBalance(organization?: string, _options?: Configuration): Promise<BalanceResponseBody> {
        const result = this.api.v1alphaUserBalance(organization, _options);
        return result.toPromise();
    }


}



