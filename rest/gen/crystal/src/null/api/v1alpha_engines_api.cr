# #Stability.ai REST API
#
##Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
#
#The version of the OpenAPI document: 0.1
#Contact: info@stability.ai
#Generated by: https://openapi-generator.tech
#OpenAPI Generator version: 7.0.0-SNAPSHOT
#

require "uri"

module 
  class V1alphaEnginesApi
    property api_client : ApiClient

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # list
    # List all engines available to your organization/user
    # @return [ListEnginesResponseBody]
    def v1alpha_engines_list_engines(organization : String?)
      data, _status_code, _headers = v1alpha_engines_list_engines_with_http_info(organization)
      data
    end

    # list
    # List all engines available to your organization/user
    # @return [Array<(ListEnginesResponseBody, Integer, Hash)>] ListEnginesResponseBody data, response status code and response headers
    def v1alpha_engines_list_engines_with_http_info(organization : String?)
      if @api_client.config.debugging
        Log.debug {"Calling API: V1alphaEnginesApi.v1alpha_engines_list_engines ..."}
      end
      # resource path
      local_var_path = "/v1alpha/engines/list"

      # query parameters
      query_params = Hash(String, String).new

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/json"])
      header_params["Organization"] = organization

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = nil

      # return_type
      return_type = "ListEnginesResponseBody"

      # auth_names
      auth_names = ["api_key_header_Authorization"]

      data, status_code, headers = @api_client.call_api(:GET,
                                                        local_var_path,
                                                        :"V1alphaEnginesApi.v1alpha_engines_list_engines",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: V1alphaEnginesApi#v1alpha_engines_list_engines\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return ListEnginesResponseBody.from_json(data), status_code, headers
    end
  end
end
