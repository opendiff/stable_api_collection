

# TextToImageRequestBody


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cfgScale** | **BigDecimal** | How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt) |  [optional]
**clipGuidancePreset** | [**ClipGuidancePreset**](#ClipGuidancePreset) |  |  [optional]
**height** | **Int** | Height of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) |  [optional]
**sampler** | [**Sampler**](#Sampler) | Which sampler to use for the diffusion process. If this value is omitted we&#39;ll automatically select an appropriate sampler for you. |  [optional]
**samples** | **Int** | Number of images to generate |  [optional]
**seed** | **Int** | Random noise seed (omit this option or use &#x60;0&#x60; for a random seed) |  [optional]
**steps** | **Int** | Number of diffusion steps to run |  [optional]
**textPrompts** | [**Seq&lt;TextPrompt&gt;**](TextPrompt.md) |  | 
**width** | **Int** | Width of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) |  [optional]


## Enum: ClipGuidancePreset
Allowed values: [FAST_BLUE, FAST_GREEN, NONE, SIMPLE, SLOW, SLOWER, SLOWEST]



## Enum: Sampler
Allowed values: [DDIM, DDPM, K_DPMPP_2M, K_DPMPP_2S_ANCESTRAL, K_DPM_2, K_DPM_2_ANCESTRAL, K_EULER, K_EULER_ANCESTRAL, K_HEUN, K_LMS]




