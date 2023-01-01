# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: dashboard.proto for package 'gooseai'

require 'grpc'
require 'dashboard_pb'

module Gooseai
  module DashboardService
    class Service

      include ::GRPC::GenericService

      self.marshal_class_method = :encode
      self.unmarshal_class_method = :decode
      self.service_name = 'gooseai.DashboardService'

      # Get info
      rpc :GetMe, ::Gooseai::EmptyRequest, ::Gooseai::User
      rpc :GetOrganization, ::Gooseai::GetOrganizationRequest, ::Gooseai::Organization
      rpc :GetMetrics, ::Gooseai::GetMetricsRequest, ::Gooseai::Metrics
      # API key management
      rpc :CreateAPIKey, ::Gooseai::APIKeyRequest, ::Gooseai::APIKey
      rpc :DeleteAPIKey, ::Gooseai::APIKeyFindRequest, ::Gooseai::APIKey
      # User settings
      rpc :UpdateDefaultOrganization, ::Gooseai::UpdateDefaultOrganizationRequest, ::Gooseai::User
      rpc :GetClientSettings, ::Gooseai::EmptyRequest, ::Gooseai::ClientSettings
      rpc :SetClientSettings, ::Gooseai::ClientSettings, ::Gooseai::ClientSettings
      rpc :UpdateUserInfo, ::Gooseai::UpdateUserInfoRequest, ::Gooseai::User
      rpc :CreatePasswordChangeTicket, ::Gooseai::EmptyRequest, ::Gooseai::UserPasswordChangeTicket
      rpc :DeleteAccount, ::Gooseai::EmptyRequest, ::Gooseai::User
      # Payment functions
      rpc :CreateCharge, ::Gooseai::CreateChargeRequest, ::Gooseai::Charge
      rpc :GetCharges, ::Gooseai::GetChargesRequest, ::Gooseai::Charges
      rpc :CreateAutoChargeIntent, ::Gooseai::CreateAutoChargeIntentRequest, ::Gooseai::AutoChargeIntent
      rpc :UpdateAutoChargeIntent, ::Gooseai::CreateAutoChargeIntentRequest, ::Gooseai::AutoChargeIntent
      rpc :GetAutoChargeIntent, ::Gooseai::GetAutoChargeRequest, ::Gooseai::AutoChargeIntent
    end

    Stub = Service.rpc_stub_class
  end
end
