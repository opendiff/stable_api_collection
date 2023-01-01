import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import * as models from '../models/all';
import { Configuration} from '../configuration'
import { Observable, of, from } from '../rxjsStub';
import {mergeMap, map} from  '../rxjsStub';
import { AccountResponseBody } from '../models/AccountResponseBody';
import { BalanceResponseBody } from '../models/BalanceResponseBody';
import { Engine } from '../models/Engine';
import { ListEnginesResponseBody } from '../models/ListEnginesResponseBody';
import { ModelError } from '../models/ModelError';
import { OrganizationMembership } from '../models/OrganizationMembership';
import { TextPrompt } from '../models/TextPrompt';
import { TextToImageRequestBody } from '../models/TextToImageRequestBody';

import { V1alphaEnginesApiRequestFactory, V1alphaEnginesApiResponseProcessor} from "../apis/V1alphaEnginesApi";
export class ObservableV1alphaEnginesApi {
    private requestFactory: V1alphaEnginesApiRequestFactory;
    private responseProcessor: V1alphaEnginesApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: V1alphaEnginesApiRequestFactory,
        responseProcessor?: V1alphaEnginesApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new V1alphaEnginesApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new V1alphaEnginesApiResponseProcessor();
    }

    /**
     * List all engines available to your organization/user
     * list
     * @param organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used.
     */
    public v1alphaEnginesListEngines(organization?: string, _options?: Configuration): Observable<ListEnginesResponseBody> {
        const requestContextPromise = this.requestFactory.v1alphaEnginesListEngines(organization, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1alphaEnginesListEngines(rsp)));
            }));
    }

}

import { V1alphaGenerationApiRequestFactory, V1alphaGenerationApiResponseProcessor} from "../apis/V1alphaGenerationApi";
export class ObservableV1alphaGenerationApi {
    private requestFactory: V1alphaGenerationApiRequestFactory;
    private responseProcessor: V1alphaGenerationApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: V1alphaGenerationApiRequestFactory,
        responseProcessor?: V1alphaGenerationApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new V1alphaGenerationApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new V1alphaGenerationApiResponseProcessor();
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
    public v1alphaGenerationImageToImage(engineId: string, accept: 'image/png' | 'application/json', initImage: HttpFile, options: ImageToImageOptions, organization?: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.v1alphaGenerationImageToImage(engineId, accept, initImage, options, organization, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1alphaGenerationImageToImage(rsp)));
            }));
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
    public v1alphaGenerationMasking(engineId: string, accept: 'image/png' | 'application/json', initImage: HttpFile, options: MaskingOptions, organization?: string, maskImage?: HttpFile, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.v1alphaGenerationMasking(engineId, accept, initImage, options, organization, maskImage, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1alphaGenerationMasking(rsp)));
            }));
    }

    /**
     * Generate an image from text
     * text-to-image
     * @param engineId  
     * @param accept  
     * @param textToImageRequestBody 
     * @param organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used.
     */
    public v1alphaGenerationTextToImage(engineId: string, accept: 'image/png' | 'application/json', textToImageRequestBody: TextToImageRequestBody, organization?: string, _options?: Configuration): Observable<void> {
        const requestContextPromise = this.requestFactory.v1alphaGenerationTextToImage(engineId, accept, textToImageRequestBody, organization, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1alphaGenerationTextToImage(rsp)));
            }));
    }

}

import { V1alphaUserApiRequestFactory, V1alphaUserApiResponseProcessor} from "../apis/V1alphaUserApi";
export class ObservableV1alphaUserApi {
    private requestFactory: V1alphaUserApiRequestFactory;
    private responseProcessor: V1alphaUserApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: V1alphaUserApiRequestFactory,
        responseProcessor?: V1alphaUserApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new V1alphaUserApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new V1alphaUserApiResponseProcessor();
    }

    /**
     * Get information about the account associated with the provided API key
     * account
     */
    public v1alphaUserAccount(_options?: Configuration): Observable<AccountResponseBody> {
        const requestContextPromise = this.requestFactory.v1alphaUserAccount(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1alphaUserAccount(rsp)));
            }));
    }

    /**
     * Get the credit balance of the account/organization associated with the API key
     * balance
     * @param organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used.
     */
    public v1alphaUserBalance(organization?: string, _options?: Configuration): Observable<BalanceResponseBody> {
        const requestContextPromise = this.requestFactory.v1alphaUserBalance(organization, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.v1alphaUserBalance(rsp)));
            }));
    }

}
