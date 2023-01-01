# TEXT_TO_IMAGE_REQUEST_BODY

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cfg_scale** | **REAL_32** | How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt) | [optional] [default to 7]
**clip_guidance_preset** | [**STRING_32**](STRING_32.md) |  | [optional] [default to NONE]
**height** | **INTEGER_32** | Height of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) | [optional] [default to 512]
**sampler** | [**STRING_32**](STRING_32.md) | Which sampler to use for the diffusion process. If this value is omitted we&#39;ll automatically select an appropriate sampler for you. | [optional] [default to null]
**samples** | **INTEGER_32** | Number of images to generate | [optional] [default to 1]
**seed** | **INTEGER_32** | Random noise seed (omit this option or use &#x60;0&#x60; for a random seed) | [optional] [default to null]
**steps** | **INTEGER_32** | Number of diffusion steps to run | [optional] [default to 50]
**text_prompts** | [**LIST [TEXT_PROMPT]**](TextPrompt.md) |  | [default to null]
**width** | **INTEGER_32** | Width of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) | [optional] [default to 512]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


