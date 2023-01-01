# PSOpenAPITools.PSOpenAPITools/Api.V1alphaUserApi

All URIs are relative to *https://api.stability.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-V1alphaUserAccount**](V1alphaUserApi.md#Invoke-V1alphaUserAccount) | **GET** /v1alpha/user/account | account
[**Invoke-V1alphaUserBalance**](V1alphaUserApi.md#Invoke-V1alphaUserBalance) | **GET** /v1alpha/user/balance | balance


<a name="Invoke-V1alphaUserAccount"></a>
# **Invoke-V1alphaUserAccount**
> AccountResponseBody Invoke-V1alphaUserAccount<br>

account

Get information about the account associated with the provided API key

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure API key authorization: api_key_header_Authorization
$Configuration.ApiKey.Authorization = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.Authorization = "Bearer"


# account
try {
    $Result = Invoke-V1alphaUserAccount
} catch {
    Write-Host ("Exception occurred when calling Invoke-V1alphaUserAccount: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountResponseBody**](AccountResponseBody.md) (PSCustomObject)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Invoke-V1alphaUserBalance"></a>
# **Invoke-V1alphaUserBalance**
> BalanceResponseBody Invoke-V1alphaUserBalance<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Organization] <String><br>

balance

Get the credit balance of the account/organization associated with the API key

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure API key authorization: api_key_header_Authorization
$Configuration.ApiKey.Authorization = "YOUR_API_KEY"
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
#$Configuration.ApiKeyPrefix.Authorization = "Bearer"

$Organization = "org-123456" # String | Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used. (optional)

# balance
try {
    $Result = Invoke-V1alphaUserBalance -Organization $Organization
} catch {
    Write-Host ("Exception occurred when calling Invoke-V1alphaUserBalance: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Organization** | **String**| Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used. | [optional] 

### Return type

[**BalanceResponseBody**](BalanceResponseBody.md) (PSCustomObject)

### Authorization

[api_key_header_Authorization](../README.md#api_key_header_Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

