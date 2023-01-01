# Engine
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | **String** |  | 
**Id** | **String** | Unique identifier for the engine | 
**Name** | **String** | Name of the engine | 
**Type** | **String** | The type of content this engine produces | 

## Examples

- Prepare the resource
```powershell
$Engine = Initialize-PSOpenAPIToolsEngine  -Description Saepe nam magni deserunt eligendi ducimus. `
 -Id Sunt ut recusandae perspiciatis. `
 -Name Eos repellendus est. `
 -Type PICTURE
```

- Convert the resource to JSON
```powershell
$Engine | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

