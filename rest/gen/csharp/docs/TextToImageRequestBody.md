
# Org.OpenAPITools.Model.TextToImageRequestBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CfgScale** | **decimal** | How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt) | [optional] [default to 7M]
**ClipGuidancePreset** | **string** |  | [optional] [default to ClipGuidancePresetEnum.NONE]
**Height** | **int** | Height of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) | [optional] [default to 512]
**Sampler** | **string** | Which sampler to use for the diffusion process. If this value is omitted we&#39;ll automatically select an appropriate sampler for you. | [optional] 
**Samples** | **int** | Number of images to generate | [optional] [default to 1]
**Seed** | **int** | Random noise seed (omit this option or use &#x60;0&#x60; for a random seed) | [optional] 
**Steps** | **int** | Number of diffusion steps to run | [optional] [default to 50]
**TextPrompts** | [**List&lt;TextPrompt&gt;**](TextPrompt.md) |  | 
**Width** | **int** | Width of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) | [optional] [default to 512]

[[Back to Model list]](../README.md#documentation-for-models)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to README]](../README.md)

