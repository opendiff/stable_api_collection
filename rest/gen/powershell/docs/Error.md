# ModelError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Fault** | **Boolean** | Is the error a server-side fault? | 
**Id** | **String** | ID is a unique identifier for this particular occurrence of the problem. | 
**Message** | **String** | Message is a human-readable explanation specific to this occurrence of the problem. | 
**Name** | **String** | Name is the name of this class of errors. | 
**Temporary** | **Boolean** | Is the error temporary? | 
**Timeout** | **Boolean** | Is the error a timeout? | 

## Examples

- Prepare the resource
```powershell
$ModelError = Initialize-PSOpenAPIToolsModelError  -Fault true `
 -Id 123abc `
 -Message parameter &#39;p&#39; must be an integer `
 -Name bad_request `
 -Temporary true `
 -Timeout false
```

- Convert the resource to JSON
```powershell
$ModelError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

