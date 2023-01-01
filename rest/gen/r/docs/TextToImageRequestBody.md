# openapi::TextToImageRequestBody


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cfg_scale** | **numeric** | How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt) | [optional] [default to 7]
**clip_guidance_preset** | **character** |  | [optional] [default to &quot;NONE&quot;]
**height** | **integer** | Height of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) | [optional] [default to 512]
**sampler** | **character** | Which sampler to use for the diffusion process. If this value is omitted we&#39;ll automatically select an appropriate sampler for you. | [optional] 
**samples** | **integer** | Number of images to generate | [optional] [default to 1]
**seed** | **integer** | Random noise seed (omit this option or use &#x60;0&#x60; for a random seed) | [optional] 
**steps** | **integer** | Number of diffusion steps to run | [optional] [default to 50]
**text_prompts** | [**array[TextPrompt]**](TextPrompt.md) |  | 
**width** | **integer** | Width of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel) | [optional] [default to 512]


