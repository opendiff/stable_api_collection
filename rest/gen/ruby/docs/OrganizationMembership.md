# OpenapiClient::OrganizationMembership

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** |  |  |
| **is_default** | **Boolean** |  |  |
| **name** | **String** |  |  |
| **role** | **String** |  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrganizationMembership.new(
  id: org-123456,
  is_default: false,
  name: My Organization,
  role: MEMBER
)
```

