# V1alphaUserAPI

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1alphaUserAccount**](V1alphaUserAPI.md#v1alphauseraccount) | **GET** /v1alpha/user/account | account
[**v1alphaUserBalance**](V1alphaUserAPI.md#v1alphauserbalance) | **GET** /v1alpha/user/balance | balance


# **v1alphaUserAccount**
```swift
    open class func v1alphaUserAccount(completion: @escaping (_ data: AccountResponseBody?, _ error: Error?) -> Void)
```

account

Get information about the account associated with the provided API key

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient


// account
V1alphaUserAPI.v1alphaUserAccount() { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
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

# **v1alphaUserBalance**
```swift
    open class func v1alphaUserBalance(organization: String? = nil, completion: @escaping (_ data: BalanceResponseBody?, _ error: Error?) -> Void)
```

balance

Get the credit balance of the account/organization associated with the API key

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let organization = "organization_example" // String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)

// balance
V1alphaUserAPI.v1alphaUserBalance(organization: organization) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organization** | **String** | Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

### Return type

[**BalanceResponseBody**](BalanceResponseBody.md)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

