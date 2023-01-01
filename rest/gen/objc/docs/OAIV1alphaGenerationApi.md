# OAIV1alphaGenerationApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaGenerationImageToImage**](OAIV1alphaGenerationApi.md#v1alphagenerationimagetoimage) | **POST** /v1alpha/generation/{engine_id}/image-to-image | image-to-image
[**v1alphaGenerationMasking**](OAIV1alphaGenerationApi.md#v1alphagenerationmasking) | **POST** /v1alpha/generation/{engine_id}/image-to-image/masking | image-to-image/masking
[**v1alphaGenerationTextToImage**](OAIV1alphaGenerationApi.md#v1alphagenerationtexttoimage) | **POST** /v1alpha/generation/{engine_id}/text-to-image | text-to-image


# **v1alphaGenerationImageToImage**
```objc
-(NSURLSessionTask*) v1alphaGenerationImageToImageWithEngineId: (NSString*) engineId
    accept: (NSString*) accept
    initImage: (NSURL*) initImage
    options: (OAIImageToImageOptions*) options
    organization: (NSString*) organization
        completionHandler: (void (^)(NSError* error)) handler;
```

image-to-image

Generate big fancy pictures from small fancy pictures

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: api_key_header_Authorization)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* engineId = stable-diffusion-512-v2-0; //  
NSString* accept = application/json; //  
NSURL* initImage = [NSURL fileURLWithPath:@"/path/to/file"]; // Initial image to use for the image-to-image generation
OAIImageToImageOptions* options = [[OAIImageToImageOptions alloc] init]; // 
NSString* organization = org-123456; // Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)

OAIV1alphaGenerationApi*apiInstance = [[OAIV1alphaGenerationApi alloc] init];

// image-to-image
[apiInstance v1alphaGenerationImageToImageWithEngineId:engineId
              accept:accept
              initImage:initImage
              options:options
              organization:organization
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIV1alphaGenerationApi->v1alphaGenerationImageToImage: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **NSString***|   | 
 **accept** | **NSString***|   | 
 **initImage** | **NSURL*****NSURL***| Initial image to use for the image-to-image generation | 
 **options** | [**OAIImageToImageOptions***](OAIImageToImageOptions.md)|  | 
 **organization** | **NSString***| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

### Return type

void (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1alphaGenerationMasking**
```objc
-(NSURLSessionTask*) v1alphaGenerationMaskingWithEngineId: (NSString*) engineId
    accept: (NSString*) accept
    initImage: (NSURL*) initImage
    options: (OAIMaskingOptions*) options
    organization: (NSString*) organization
    maskImage: (NSURL*) maskImage
        completionHandler: (void (^)(NSError* error)) handler;
```

image-to-image/masking

Paint fancy things into fancy pictures

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: api_key_header_Authorization)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* engineId = stable-diffusion-512-v2-0; //  
NSString* accept = application/json; //  
NSURL* initImage = [NSURL fileURLWithPath:@"/path/to/file"]; // Initial image to use for the image-to-image generation
OAIMaskingOptions* options = [[OAIMaskingOptions alloc] init]; // 
NSString* organization = org-123456; // Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)
NSURL* maskImage = [NSURL fileURLWithPath:@"/path/to/file"]; // Optional mask image to use for masking. Must be the same dimensions as the `init_image`. Use the `mask_source` option to specify whether the white or black pixels should be inpainted. (Note: if you set `mask_source` to `INIT_IMAGE_ALPHA` you can omit the `mask_image` parameter completely.) (optional)

OAIV1alphaGenerationApi*apiInstance = [[OAIV1alphaGenerationApi alloc] init];

// image-to-image/masking
[apiInstance v1alphaGenerationMaskingWithEngineId:engineId
              accept:accept
              initImage:initImage
              options:options
              organization:organization
              maskImage:maskImage
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIV1alphaGenerationApi->v1alphaGenerationMasking: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **NSString***|   | 
 **accept** | **NSString***|   | 
 **initImage** | **NSURL*****NSURL***| Initial image to use for the image-to-image generation | 
 **options** | [**OAIMaskingOptions***](OAIMaskingOptions.md)|  | 
 **organization** | **NSString***| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 
 **maskImage** | **NSURL*****NSURL***| Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.) | [optional] 

### Return type

void (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1alphaGenerationTextToImage**
```objc
-(NSURLSessionTask*) v1alphaGenerationTextToImageWithEngineId: (NSString*) engineId
    accept: (NSString*) accept
    textToImageRequestBody: (OAITextToImageRequestBody*) textToImageRequestBody
    organization: (NSString*) organization
        completionHandler: (void (^)(NSError* error)) handler;
```

text-to-image

Generate an image from text

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: api_key_header_Authorization)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* engineId = stable-diffusion-512-v2-0; //  
NSString* accept = application/json; //  
OAITextToImageRequestBody* textToImageRequestBody = {"cfg_scale":7,"clip_guidance_preset":"FAST_BLUE","height":512,"sampler":"K_DPM_2_ANCESTRAL","samples":1,"seed":0,"steps":75,"text_prompts":[{"text":"A lighthouse on a cliff","weight":1}],"width":512}; // 
NSString* organization = org-123456; // Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)

OAIV1alphaGenerationApi*apiInstance = [[OAIV1alphaGenerationApi alloc] init];

// text-to-image
[apiInstance v1alphaGenerationTextToImageWithEngineId:engineId
              accept:accept
              textToImageRequestBody:textToImageRequestBody
              organization:organization
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIV1alphaGenerationApi->v1alphaGenerationTextToImage: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **NSString***|   | 
 **accept** | **NSString***|   | 
 **textToImageRequestBody** | [**OAITextToImageRequestBody***](OAITextToImageRequestBody.md)|  | 
 **organization** | **NSString***| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

### Return type

void (empty response body)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/vnd.goa.error

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

