# WWW::OpenAPIClient::V1alphaUserApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::V1alphaUserApi;
```

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alpha_user_account**](V1alphaUserApi.md#v1alpha_user_account) | **GET** /v1alpha/user/account | account
[**v1alpha_user_balance**](V1alphaUserApi.md#v1alpha_user_balance) | **GET** /v1alpha/user/balance | balance


# **v1alpha_user_account**
> AccountResponseBody v1alpha_user_account()

account

Get information about the account associated with the provided API key

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::V1alphaUserApi;
my $api_instance = WWW::OpenAPIClient::V1alphaUserApi->new(

    # Configure API key authorization: api_key_header_Authorization
    api_key => {'Authorization' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'Authorization' => 'Bearer'},
);


eval {
    my $result = $api_instance->v1alpha_user_account();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling V1alphaUserApi->v1alpha_user_account: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountResponseBody**](AccountResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1alpha_user_balance**
> BalanceResponseBody v1alpha_user_balance(organization => $organization)

balance

Get the credit balance of the account/organization associated with the API key

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::V1alphaUserApi;
my $api_instance = WWW::OpenAPIClient::V1alphaUserApi->new(

    # Configure API key authorization: api_key_header_Authorization
    api_key => {'Authorization' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'Authorization' => 'Bearer'},
);

my $organization = org-123456; # string | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.

eval {
    my $result = $api_instance->v1alpha_user_balance(organization => $organization);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling V1alphaUserApi->v1alpha_user_balance: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **string**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

### Return type

[**BalanceResponseBody**](BalanceResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

