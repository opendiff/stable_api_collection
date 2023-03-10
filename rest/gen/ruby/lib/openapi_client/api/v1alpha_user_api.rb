=begin
#Stability.ai REST API

#Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 

The version of the OpenAPI document: 0.1
Contact: info@stability.ai
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 7.0.0-SNAPSHOT

=end

require 'cgi'

module OpenapiClient
  class V1alphaUserApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # account
    # Get information about the account associated with the provided API key
    # @param [Hash] opts the optional parameters
    # @return [AccountResponseBody]
    def v1alpha_user_account(opts = {})
      data, _status_code, _headers = v1alpha_user_account_with_http_info(opts)
      data
    end

    # account
    # Get information about the account associated with the provided API key
    # @param [Hash] opts the optional parameters
    # @return [Array<(AccountResponseBody, Integer, Hash)>] AccountResponseBody data, response status code and response headers
    def v1alpha_user_account_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: V1alphaUserApi.v1alpha_user_account ...'
      end
      # resource path
      local_var_path = '/v1alpha/user/account'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'AccountResponseBody'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['api_key_header_Authorization']

      new_options = opts.merge(
        :operation => :"V1alphaUserApi.v1alpha_user_account",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: V1alphaUserApi#v1alpha_user_account\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # balance
    # Get the credit balance of the account/organization associated with the API key
    # @param [Hash] opts the optional parameters
    # @option opts [String] :organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used.
    # @return [BalanceResponseBody]
    def v1alpha_user_balance(opts = {})
      data, _status_code, _headers = v1alpha_user_balance_with_http_info(opts)
      data
    end

    # balance
    # Get the credit balance of the account/organization associated with the API key
    # @param [Hash] opts the optional parameters
    # @option opts [String] :organization Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used.
    # @return [Array<(BalanceResponseBody, Integer, Hash)>] BalanceResponseBody data, response status code and response headers
    def v1alpha_user_balance_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: V1alphaUserApi.v1alpha_user_balance ...'
      end
      # resource path
      local_var_path = '/v1alpha/user/balance'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      header_params[:'Organization'] = opts[:'organization'] if !opts[:'organization'].nil?

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'BalanceResponseBody'

      # auth_names
      auth_names = opts[:debug_auth_names] || ['api_key_header_Authorization']

      new_options = opts.merge(
        :operation => :"V1alphaUserApi.v1alpha_user_balance",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: V1alphaUserApi#v1alpha_user_balance\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
