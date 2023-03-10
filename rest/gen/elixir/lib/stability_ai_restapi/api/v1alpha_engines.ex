# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule StabilityAiRESTAPI.Api.V1alphaEngines do
  @moduledoc """
  API calls for all endpoints tagged `V1alphaEngines`.
  """

  alias StabilityAiRESTAPI.Connection
  import StabilityAiRESTAPI.RequestBuilder


  @doc """
  list
  List all engines available to your organization/user

  ## Parameters

  - connection (StabilityAiRESTAPI.Connection): Connection to server
  - opts (KeywordList): [optional] Optional parameters
    - :organization (String.t): Optional: Allows for requests to be scoped to an organization other than the user's default.  If not provided, the user's default organization will be used.
  ## Returns

  {:ok, StabilityAiRESTAPI.Model.ListEnginesResponseBody.t} on success
  {:error, Tesla.Env.t} on failure
  """
  @spec v1alpha_engines_list_engines(Tesla.Env.client, keyword()) :: {:ok, StabilityAiRESTAPI.Model.ListEnginesResponseBody.t} | {:error, Tesla.Env.t}
  def v1alpha_engines_list_engines(connection, opts \\ []) do
    optional_params = %{
      :Organization => :headers
    }
    %{}
    |> method(:get)
    |> url("/v1alpha/engines/list")
    |> add_optional_params(optional_params, opts)
    |> Enum.into([])
    |> (&Connection.request(connection, &1)).()
    |> evaluate_response([
      { 200, %StabilityAiRESTAPI.Model.ListEnginesResponseBody{}}
    ])
  end
end
