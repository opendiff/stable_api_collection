# BalanceResponseBody
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Credits** | **Double** | The balance of the account/organization associated with the API key | 

## Examples

- Prepare the resource
```powershell
$BalanceResponseBody = Initialize-PSOpenAPIToolsBalanceResponseBody  -Credits 0.11570747925644202
```

- Convert the resource to JSON
```powershell
$BalanceResponseBody | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

