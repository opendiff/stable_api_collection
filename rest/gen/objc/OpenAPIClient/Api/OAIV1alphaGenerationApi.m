#import "OAIV1alphaGenerationApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIError.h"
#import "OAIImageToImageOptions.h"
#import "OAIMaskingOptions.h"
#import "OAITextToImageRequestBody.h"


@interface OAIV1alphaGenerationApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIV1alphaGenerationApi

NSString* kOAIV1alphaGenerationApiErrorDomain = @"OAIV1alphaGenerationApiErrorDomain";
NSInteger kOAIV1alphaGenerationApiMissingParamErrorCode = 234513;

@synthesize apiClient = _apiClient;

#pragma mark - Initialize methods

- (instancetype) init {
    return [self initWithApiClient:[OAIApiClient sharedClient]];
}


-(instancetype) initWithApiClient:(OAIApiClient *)apiClient {
    self = [super init];
    if (self) {
        _apiClient = apiClient;
        _mutableDefaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

-(NSString*) defaultHeaderForKey:(NSString*)key {
    return self.mutableDefaultHeaders[key];
}

-(void) setDefaultHeaderValue:(NSString*) value forKey:(NSString*)key {
    [self.mutableDefaultHeaders setValue:value forKey:key];
}

-(NSDictionary *)defaultHeaders {
    return self.mutableDefaultHeaders;
}

#pragma mark - Api Methods

///
/// image-to-image
/// Generate big fancy pictures from small fancy pictures
///  @param engineId   
///
///  @param accept   
///
///  @param initImage Initial image to use for the image-to-image generation 
///
///  @param options  
///
///  @param organization Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)
///
///  @returns void
///
-(NSURLSessionTask*) v1alphaGenerationImageToImageWithEngineId: (NSString*) engineId
    accept: (NSString*) accept
    initImage: (NSURL*) initImage
    options: (OAIImageToImageOptions*) options
    organization: (NSString*) organization
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'engineId' is set
    if (engineId == nil) {
        NSParameterAssert(engineId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"engineId"] };
            NSError* error = [NSError errorWithDomain:kOAIV1alphaGenerationApiErrorDomain code:kOAIV1alphaGenerationApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'accept' is set
    if (accept == nil) {
        NSParameterAssert(accept);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accept"] };
            NSError* error = [NSError errorWithDomain:kOAIV1alphaGenerationApiErrorDomain code:kOAIV1alphaGenerationApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'initImage' is set
    if (initImage == nil) {
        NSParameterAssert(initImage);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"initImage"] };
            NSError* error = [NSError errorWithDomain:kOAIV1alphaGenerationApiErrorDomain code:kOAIV1alphaGenerationApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'options' is set
    if (options == nil) {
        NSParameterAssert(options);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"options"] };
            NSError* error = [NSError errorWithDomain:kOAIV1alphaGenerationApiErrorDomain code:kOAIV1alphaGenerationApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1alpha/generation/{engine_id}/image-to-image"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (engineId != nil) {
        pathParams[@"engine_id"] = engineId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (accept != nil) {
        headerParams[@"Accept"] = accept;
    }
    if (organization != nil) {
        headerParams[@"Organization"] = organization;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/vnd.goa.error"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"multipart/form-data"]];

    // Authentication setting
    NSArray *authSettings = @[@"api_key_header_Authorization"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    localVarFiles[@"initImage"] = initImage;
    if (options) {
        formParams[@"options"] = options;
    }

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// image-to-image/masking
/// Paint fancy things into fancy pictures
///  @param engineId   
///
///  @param accept   
///
///  @param initImage Initial image to use for the image-to-image generation 
///
///  @param options  
///
///  @param organization Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)
///
///  @param maskImage Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.) (optional)
///
///  @returns void
///
-(NSURLSessionTask*) v1alphaGenerationMaskingWithEngineId: (NSString*) engineId
    accept: (NSString*) accept
    initImage: (NSURL*) initImage
    options: (OAIMaskingOptions*) options
    organization: (NSString*) organization
    maskImage: (NSURL*) maskImage
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'engineId' is set
    if (engineId == nil) {
        NSParameterAssert(engineId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"engineId"] };
            NSError* error = [NSError errorWithDomain:kOAIV1alphaGenerationApiErrorDomain code:kOAIV1alphaGenerationApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'accept' is set
    if (accept == nil) {
        NSParameterAssert(accept);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accept"] };
            NSError* error = [NSError errorWithDomain:kOAIV1alphaGenerationApiErrorDomain code:kOAIV1alphaGenerationApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'initImage' is set
    if (initImage == nil) {
        NSParameterAssert(initImage);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"initImage"] };
            NSError* error = [NSError errorWithDomain:kOAIV1alphaGenerationApiErrorDomain code:kOAIV1alphaGenerationApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'options' is set
    if (options == nil) {
        NSParameterAssert(options);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"options"] };
            NSError* error = [NSError errorWithDomain:kOAIV1alphaGenerationApiErrorDomain code:kOAIV1alphaGenerationApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1alpha/generation/{engine_id}/image-to-image/masking"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (engineId != nil) {
        pathParams[@"engine_id"] = engineId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (accept != nil) {
        headerParams[@"Accept"] = accept;
    }
    if (organization != nil) {
        headerParams[@"Organization"] = organization;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/vnd.goa.error"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"multipart/form-data"]];

    // Authentication setting
    NSArray *authSettings = @[@"api_key_header_Authorization"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    localVarFiles[@"initImage"] = initImage;
    localVarFiles[@"maskImage"] = maskImage;
    if (options) {
        formParams[@"options"] = options;
    }

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// text-to-image
/// Generate an image from text
///  @param engineId   
///
///  @param accept   
///
///  @param textToImageRequestBody  
///
///  @param organization Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)
///
///  @returns void
///
-(NSURLSessionTask*) v1alphaGenerationTextToImageWithEngineId: (NSString*) engineId
    accept: (NSString*) accept
    textToImageRequestBody: (OAITextToImageRequestBody*) textToImageRequestBody
    organization: (NSString*) organization
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'engineId' is set
    if (engineId == nil) {
        NSParameterAssert(engineId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"engineId"] };
            NSError* error = [NSError errorWithDomain:kOAIV1alphaGenerationApiErrorDomain code:kOAIV1alphaGenerationApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'accept' is set
    if (accept == nil) {
        NSParameterAssert(accept);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accept"] };
            NSError* error = [NSError errorWithDomain:kOAIV1alphaGenerationApiErrorDomain code:kOAIV1alphaGenerationApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'textToImageRequestBody' is set
    if (textToImageRequestBody == nil) {
        NSParameterAssert(textToImageRequestBody);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"textToImageRequestBody"] };
            NSError* error = [NSError errorWithDomain:kOAIV1alphaGenerationApiErrorDomain code:kOAIV1alphaGenerationApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/v1alpha/generation/{engine_id}/text-to-image"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (engineId != nil) {
        pathParams[@"engine_id"] = engineId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    if (accept != nil) {
        headerParams[@"Accept"] = accept;
    }
    if (organization != nil) {
        headerParams[@"Organization"] = organization;
    }
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/vnd.goa.error"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[@"api_key_header_Authorization"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = textToImageRequestBody;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}



@end
