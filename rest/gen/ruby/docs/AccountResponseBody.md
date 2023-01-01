# OpenapiClient::AccountResponseBody

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **email** | **String** | The user&#39;s email |  |
| **id** | **String** | The user&#39;s ID |  |
| **organizations** | [**Array&lt;OrganizationMembership&gt;**](OrganizationMembership.md) | The user&#39;s organizations |  |
| **profile_picture** | **String** | The user&#39;s profile picture | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::AccountResponseBody.new(
  email: example@stability.ai,
  id: user-1234,
  organizations: [{&quot;id&quot;:&quot;org-123456&quot;,&quot;is_default&quot;:false,&quot;name&quot;:&quot;My Organization&quot;,&quot;role&quot;:&quot;MEMBER&quot;},{&quot;id&quot;:&quot;org-123456&quot;,&quot;is_default&quot;:false,&quot;name&quot;:&quot;My Organization&quot;,&quot;role&quot;:&quot;MEMBER&quot;},{&quot;id&quot;:&quot;org-123456&quot;,&quot;is_default&quot;:false,&quot;name&quot;:&quot;My Organization&quot;,&quot;role&quot;:&quot;MEMBER&quot;}],
  profile_picture: https://api.stability.ai/example.png
)
```

