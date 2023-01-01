
# TextToImageRequestBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**textPrompts** | [**kotlin.collections.List&lt;TextPrompt&gt;**](TextPrompt.md) |  | 
**cfgScale** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt) |  [optional]
**clipGuidancePreset** | [**inline**](#ClipGuidancePreset) |  |  [optional]
**height** | **kotlin.Int** | Height of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) |  [optional]
**sampler** | [**inline**](#Sampler) | Which sampler to use for the diffusion process. If this value is omitted we&#39;ll automatically select an appropriate sampler for you. |  [optional]
**samples** | **kotlin.Int** | Number of images to generate |  [optional]
**seed** | **kotlin.Int** | Random noise seed (omit this option or use &#x60;0&#x60; for a random seed) |  [optional]
**steps** | **kotlin.Int** | Number of diffusion steps to run |  [optional]
**width** | **kotlin.Int** | Width of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) |  [optional]


<a name="ClipGuidancePreset"></a>
## Enum: clip_guidance_preset
Name | Value
---- | -----
clipGuidancePreset | FAST_BLUE, FAST_GREEN, NONE, SIMPLE, SLOW, SLOWER, SLOWEST


<a name="Sampler"></a>
## Enum: sampler
Name | Value
---- | -----
sampler | DDIM, DDPM, K_DPMPP_2M, K_DPMPP_2S_ANCESTRAL, K_DPM_2, K_DPM_2_ANCESTRAL, K_EULER, K_EULER_ANCESTRAL, K_HEUN, K_LMS



