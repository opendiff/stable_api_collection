# OAIV1alphaUserApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaUserAccount**](OAIV1alphaUserApi.md#v1alphauseraccount) | **GET** /v1alpha/user/account | account
[**v1alphaUserBalance**](OAIV1alphaUserApi.md#v1alphauserbalance) | **GET** /v1alpha/user/balance | balance


# **v1alphaUserAccount**
```objc
-(NSURLSessionTask*) v1alphaUserAccountWithCompletionHandler: 
        (void (^)(OAIAccountResponseBody* output, NSError* error)) handler;
```

account

Get information about the account associated with the provided API key

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: api_key_header_Authorization)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];



OAIV1alphaUserApi*apiInstance = [[OAIV1alphaUserApi alloc] init];

// account
[apiInstance v1alphaUserAccountWithCompletionHandler: 
          ^(OAIAccountResponseBody* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIV1alphaUserApi->v1alphaUserAccount: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIAccountResponseBody***](OAIAccountResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1alphaUserBalance**
```objc
-(NSURLSessionTask*) v1alphaUserBalanceWithOrganization: (NSString*) organization
        completionHandler: (void (^)(OAIBalanceResponseBody* output, NSError* error)) handler;
```

balance

Get the credit balance of the account/organization associated with the API key

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure API key authorization: (authentication scheme: api_key_header_Authorization)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"Authorization"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"Authorization"];


NSString* organization = org-123456; // Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)

OAIV1alphaUserApi*apiInstance = [[OAIV1alphaUserApi alloc] init];

// balance
[apiInstance v1alphaUserBalanceWithOrganization:organization
          completionHandler: ^(OAIBalanceResponseBody* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIV1alphaUserApi->v1alphaUserBalance: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **NSString***| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

### Return type

[**OAIBalanceResponseBody***](OAIBalanceResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

