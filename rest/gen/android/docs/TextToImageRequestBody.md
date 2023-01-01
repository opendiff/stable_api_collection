

# TextToImageRequestBody

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cfgScale** | [**BigDecimal**](BigDecimal.md) | How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt) |  [optional]
**clipGuidancePreset** | [**ClipGuidancePresetEnum**](#ClipGuidancePresetEnum) |  |  [optional]
**height** | **Integer** | Height of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) |  [optional]
**sampler** | [**SamplerEnum**](#SamplerEnum) | Which sampler to use for the diffusion process. If this value is omitted we&#39;ll automatically select an appropriate sampler for you. |  [optional]
**samples** | **Integer** | Number of images to generate |  [optional]
**seed** | **Integer** | Random noise seed (omit this option or use &#x60;0&#x60; for a random seed) |  [optional]
**steps** | **Integer** | Number of diffusion steps to run |  [optional]
**textPrompts** | [**List&lt;TextPrompt&gt;**](TextPrompt.md) |  | 
**width** | **Integer** | Width of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) |  [optional]


## Enum: ClipGuidancePresetEnum

Name | Value
---- | -----


## Enum: SamplerEnum

Name | Value
---- | -----




