# WWW::OpenAPIClient::V1alphaEnginesApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::V1alphaEnginesApi;
```

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alpha_engines_list_engines**](V1alphaEnginesApi.md#v1alpha_engines_list_engines) | **GET** /v1alpha/engines/list | list


# **v1alpha_engines_list_engines**
> ListEnginesResponseBody v1alpha_engines_list_engines(organization => $organization)

list

List all engines available to your organization/user

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::V1alphaEnginesApi;
my $api_instance = WWW::OpenAPIClient::V1alphaEnginesApi->new(

    # Configure API key authorization: api_key_header_Authorization
    api_key => {'Authorization' => 'YOUR_API_KEY'},
    # uncomment below to setup prefix (e.g. Bearer) for API key, if needed
    #api_key_prefix => {'Authorization' => 'Bearer'},
);

my $organization = org-123456; # string | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.

eval {
    my $result = $api_instance->v1alpha_engines_list_engines(organization => $organization);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling V1alphaEnginesApi->v1alpha_engines_list_engines: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **string**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

### Return type

[**ListEnginesResponseBody**](ListEnginesResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

