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
  class V1alphaUserApi
    property api_client : ApiClient

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # account
    # Get information about the account associated with the provided API key
    # @return [AccountResponseBody]
    def v1alpha_user_account()
      data, _status_code, _headers = v1alpha_user_account_with_http_info()
      data
    end

    # account
    # Get information about the account associated with the provided API key
    # @return [Array<(AccountResponseBody, Integer, Hash)>] AccountResponseBody data, response status code and response headers
    def v1alpha_user_account_with_http_info()
      if @api_client.config.debugging
        Log.debug {"Calling API: V1alphaUserApi.v1alpha_user_account ..."}
      end
      # resource path
      local_var_path = "/v1alpha/user/account"

      # query parameters
      query_params = Hash(String, String).new

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/json"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = nil

      # return_type
      return_type = "AccountResponseBody"

      # auth_names
      auth_names = ["api_key_header_Authorization"]

      data, status_code, headers = @api_client.call_api(:GET,
                                                        local_var_path,
                                                        :"V1alphaUserApi.v1alpha_user_account",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: V1alphaUserApi#v1alpha_user_account\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return AccountResponseBody.from_json(data), status_code, headers
    end

    # balance
    # Get the credit balance of the account/organization associated with the API key
    # @return [BalanceResponseBody]
    def v1alpha_user_balance(organization : String?)
      data, _status_code, _headers = v1alpha_user_balance_with_http_info(organization)
      data
    end

    # balance
    # Get the credit balance of the account/organization associated with the API key
    # @return [Array<(BalanceResponseBody, Integer, Hash)>] BalanceResponseBody data, response status code and response headers
    def v1alpha_user_balance_with_http_info(organization : String?)
      if @api_client.config.debugging
        Log.debug {"Calling API: V1alphaUserApi.v1alpha_user_balance ..."}
      end
      # resource path
      local_var_path = "/v1alpha/user/balance"

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
      return_type = "BalanceResponseBody"

      # auth_names
      auth_names = ["api_key_header_Authorization"]

      data, status_code, headers = @api_client.call_api(:GET,
                                                        local_var_path,
                                                        :"V1alphaUserApi.v1alpha_user_balance",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: V1alphaUserApi#v1alpha_user_balance\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return BalanceResponseBody.from_json(data), status_code, headers
    end
  end
end