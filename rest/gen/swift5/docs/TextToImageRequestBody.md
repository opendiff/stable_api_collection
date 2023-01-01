# TextToImageRequestBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cfgScale** | **Double** | How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt) | [optional] [default to 7]
**clipGuidancePreset** | **String** |  | [optional] [default to ._none]
**height** | **Int** | Height of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) | [optional] [default to 512]
**sampler** | **String** | Which sampler to use for the diffusion process. If this value is omitted we&#39;ll automatically select an appropriate sampler for you. | [optional] 
**samples** | **Int** | Number of images to generate | [optional] [default to 1]
**seed** | **Int** | Random noise seed (omit this option or use &#x60;0&#x60; for a random seed) | [optional] 
**steps** | **Int** | Number of diffusion steps to run | [optional] [default to 50]
**textPrompts** | [TextPrompt] |  | 
**width** | **Int** | Width of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) | [optional] [default to 512]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


