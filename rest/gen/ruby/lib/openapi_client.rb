=begin
#Stability.ai REST API

#Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 

The version of the OpenAPI document: 0.1
Contact: info@stability.ai
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 7.0.0-SNAPSHOT

=end

# Common files
require 'openapi_client/api_client'
require 'openapi_client/api_error'
require 'openapi_client/version'
require 'openapi_client/configuration'

# Models
require 'openapi_client/models/account_response_body'
require 'openapi_client/models/balance_response_body'
require 'openapi_client/models/engine'
require 'openapi_client/models/error'
require 'openapi_client/models/list_engines_response_body'
require 'openapi_client/models/organization_membership'
require 'openapi_client/models/text_prompt'
require 'openapi_client/models/text_to_image_request_body'

# APIs
require 'openapi_client/api/v1alpha_engines_api'
require 'openapi_client/api/v1alpha_generation_api'
require 'openapi_client/api/v1alpha_user_api'

module OpenapiClient
  class << self
    # Customize default settings for the SDK using block.
    #   OpenapiClient.configure do |config|
    #     config.username = "xxx"
    #     config.password = "xxx"
    #   end
    # If no block given, return the default Configuration object.
    def configure
      if block_given?
        yield(Configuration.default)
      else
        Configuration.default
      end
    end
  end
end
