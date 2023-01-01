# TextPrompt
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Text** | **String** |  | 
**Weight** | **Double** | Weight of the prompt (use negative numbers for negative prompts) | [optional] 

## Examples

- Prepare the resource
```powershell
$TextPrompt = Initialize-PSOpenAPIToolsTextPrompt  -Text jum `
 -Weight 0.80305135
```

- Convert the resource to JSON
```powershell
$TextPrompt | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

