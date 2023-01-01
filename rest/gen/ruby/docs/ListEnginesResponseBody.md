# OpenapiClient::ListEnginesResponseBody

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **engines** | [**Array&lt;Engine&gt;**](Engine.md) | The engines available to your user/organization |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::ListEnginesResponseBody.new(
  engines: [{&quot;description&quot;:&quot;Stability-AI Stable Diffusion v1.5&quot;,&quot;id&quot;:&quot;stable-diffusion-v1-5&quot;,&quot;name&quot;:&quot;Stable Diffusion v1.5&quot;,&quot;type&quot;:&quot;PICTURE&quot;},{&quot;description&quot;:&quot;Stability-AI Stable Diffusion v2.1&quot;,&quot;id&quot;:&quot;stable-diffusion-512-v2-1&quot;,&quot;name&quot;:&quot;Stable Diffusion v2.1&quot;,&quot;type&quot;:&quot;PICTURE&quot;},{&quot;description&quot;:&quot;Stability-AI Stable Diffusion 768 v2.1&quot;,&quot;id&quot;:&quot;stable-diffusion-768-v2-1&quot;,&quot;name&quot;:&quot;Stable Diffusion v2.1-768&quot;,&quot;type&quot;:&quot;PICTURE&quot;}]
)
```

