# OAIV1alphaEnginesApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaEnginesListEngines**](OAIV1alphaEnginesApi.md#v1alphaengineslistengines) | **GET** /v1alpha/engines/list | list


# **v1alphaEnginesListEngines**
```objc
-(NSURLSessionTask*) v1alphaEnginesListEnginesWithOrganization: (NSString*) organization
        completionHandler: (void (^)(OAIListEnginesResponseBody* output, NSError* error)) handler;
```

list

List all engines available to your organization/user

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: api_key_header_Authorization)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* organization = org-123456; // Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)

OAIV1alphaEnginesApi*apiInstance = [[OAIV1alphaEnginesApi alloc] init];

// list
[apiInstance v1alphaEnginesListEnginesWithOrganization:organization
          completionHandler: ^(OAIListEnginesResponseBody* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIV1alphaEnginesApi->v1alphaEnginesListEngines: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **NSString***| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

### Return type

[**OAIListEnginesResponseBody***](OAIListEnginesResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

