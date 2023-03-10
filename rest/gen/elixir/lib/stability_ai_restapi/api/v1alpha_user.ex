# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule StabilityAiRESTAPI.Api.V1alphaUser do
  @moduledoc """
  API calls for all endpoints tagged `V1alphaUser`.
  """

  alias StabilityAiRESTAPI.Connection
  import StabilityAiRESTAPI.RequestBuilder


  @doc """
  account
  Get information about the account associated with the provided API key

  ## Parameters

  - connection (StabilityAiRESTAPI.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
  ## Returns

  {:ok, StabilityAiRESTAPI.Model.AccountResponseBody.t} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec v1alpha_user_account(Tesla.Env.client, keyword()) :: {:ok, StabilityAiRESTAPI.Model.AccountResponseBody.t} | {:error, Tesla.Env.t}
  def v1alpha_user_account(connection, _opts \\ []) do
    %{}
    |> method(:get)
    |> url("/v1alpha/user/account")
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, %StabilityAiRESTAPI.Model.AccountResponseBody{}}
    ])
  end

  @doc """
  balance
  Get the credit balance of the account/organization associated with the API key

  ## Parameters

  - connection (StabilityAiRESTAPI.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
    - :organization (String.t): Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
  ## Returns

  {:ok, StabilityAiRESTAPI.Model.BalanceResponseBody.t} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec v1alpha_user_balance(Tesla.Env.client, keyword()) :: {:ok, StabilityAiRESTAPI.Model.BalanceResponseBody.t} | {:error, Tesla.Env.t}
  def v1alpha_user_balance(connection, opts \\ []) do
    optional_params = %{
      :Organization => :headers
    }
    %{}
    |> method(:get)
    |> url("/v1alpha/user/balance")
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, %StabilityAiRESTAPI.Model.BalanceResponseBody{}}
    ])
  end
end
