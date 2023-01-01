# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: dashboard.proto

require 'google/protobuf'

Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("dashboard.proto", :syntax => :proto3) do
    add_message "gooseai.OrganizationMember" do
      optional :organization, :message, 1, "gooseai.Organization", json_name: "organization"
      proto3_optional :user, :message, 2, "gooseai.User", json_name: "user"
      optional :role, :enum, 3, "gooseai.OrganizationRole", json_name: "role"
      optional :is_default, :bool, 4, json_name: "isDefault"
    end
    add_message "gooseai.OrganizationGrant" do
      optional :amount_granted, :double, 1, json_name: "amountGranted"
      optional :amount_used, :double, 2, json_name: "amountUsed"
      optional :expires_at, :uint64, 3, json_name: "expiresAt"
      optional :granted_at, :uint64, 4, json_name: "grantedAt"
    end
    add_message "gooseai.OrganizationPaymentInfo" do
      optional :balance, :double, 1, json_name: "balance"
      repeated :grants, :message, 2, "gooseai.OrganizationGrant", json_name: "grants"
    end
    add_message "gooseai.OrganizationAutoCharge" do
      optional :enabled, :bool, 1, json_name: "enabled"
      optional :id, :string, 2, json_name: "id"
      optional :created_at, :uint64, 3, json_name: "createdAt"
    end
    add_message "gooseai.Organization" do
      optional :id, :string, 1, json_name: "id"
      optional :name, :string, 2, json_name: "name"
      optional :description, :string, 3, json_name: "description"
      repeated :members, :message, 4, "gooseai.OrganizationMember", json_name: "members"
      proto3_optional :payment_info, :message, 5, "gooseai.OrganizationPaymentInfo", json_name: "paymentInfo"
      proto3_optional :stripe_customer_id, :string, 6, json_name: "stripeCustomerId"
      proto3_optional :auto_charge, :message, 7, "gooseai.OrganizationAutoCharge", json_name: "autoCharge"
    end
    add_message "gooseai.APIKey" do
      optional :key, :string, 1, json_name: "key"
      optional :is_secret, :bool, 2, json_name: "isSecret"
      optional :created_at, :uint64, 3, json_name: "createdAt"
    end
    add_message "gooseai.User" do
      optional :id, :string, 1, json_name: "id"
      proto3_optional :auth_id, :string, 2, json_name: "authId"
      optional :profile_picture, :string, 3, json_name: "profilePicture"
      optional :email, :string, 4, json_name: "email"
      repeated :organizations, :message, 5, "gooseai.OrganizationMember", json_name: "organizations"
      repeated :api_keys, :message, 7, "gooseai.APIKey", json_name: "apiKeys"
      optional :created_at, :uint64, 8, json_name: "createdAt"
      proto3_optional :email_verified, :bool, 9, json_name: "emailVerified"
    end
    add_message "gooseai.CostData" do
      optional :amount_tokens, :uint32, 1, json_name: "amountTokens"
      optional :amount_credits, :double, 2, json_name: "amountCredits"
    end
    add_message "gooseai.UsageMetric" do
      optional :operation, :string, 1, json_name: "operation"
      optional :engine, :string, 2, json_name: "engine"
      optional :input_cost, :message, 3, "gooseai.CostData", json_name: "inputCost"
      optional :output_cost, :message, 4, "gooseai.CostData", json_name: "outputCost"
      proto3_optional :user, :string, 5, json_name: "user"
      optional :aggregation_timestamp, :uint64, 6, json_name: "aggregationTimestamp"
    end
    add_message "gooseai.CostTotal" do
      optional :amount_tokens, :uint32, 1, json_name: "amountTokens"
      optional :amount_credits, :double, 2, json_name: "amountCredits"
    end
    add_message "gooseai.TotalMetricsData" do
      optional :input_total, :message, 1, "gooseai.CostTotal", json_name: "inputTotal"
      optional :output_total, :message, 2, "gooseai.CostTotal", json_name: "outputTotal"
    end
    add_message "gooseai.Metrics" do
      repeated :metrics, :message, 1, "gooseai.UsageMetric", json_name: "metrics"
      optional :total, :message, 2, "gooseai.TotalMetricsData", json_name: "total"
    end
    add_message "gooseai.EmptyRequest" do
    end
    add_message "gooseai.GetOrganizationRequest" do
      optional :id, :string, 1, json_name: "id"
    end
    add_message "gooseai.GetMetricsRequest" do
      optional :organization_id, :string, 1, json_name: "organizationId"
      proto3_optional :user_id, :string, 2, json_name: "userId"
      optional :range_from, :uint64, 3, json_name: "rangeFrom"
      optional :range_to, :uint64, 4, json_name: "rangeTo"
      optional :include_per_request_metrics, :bool, 5, json_name: "includePerRequestMetrics"
    end
    add_message "gooseai.APIKeyRequest" do
      optional :is_secret, :bool, 1, json_name: "isSecret"
    end
    add_message "gooseai.APIKeyFindRequest" do
      optional :id, :string, 1, json_name: "id"
    end
    add_message "gooseai.UpdateDefaultOrganizationRequest" do
      optional :organization_id, :string, 1, json_name: "organizationId"
    end
    add_message "gooseai.ClientSettings" do
      optional :settings, :bytes, 1, json_name: "settings"
    end
    add_message "gooseai.CreateAutoChargeIntentRequest" do
      optional :organization_id, :string, 1, json_name: "organizationId"
      optional :monthly_maximum, :uint64, 2, json_name: "monthlyMaximum"
      optional :minimum_value, :uint64, 3, json_name: "minimumValue"
      optional :amount_credits, :uint64, 4, json_name: "amountCredits"
    end
    add_message "gooseai.CreateChargeRequest" do
      optional :amount, :uint64, 1, json_name: "amount"
      optional :organization_id, :string, 2, json_name: "organizationId"
    end
    add_message "gooseai.GetChargesRequest" do
      optional :organization_id, :string, 1, json_name: "organizationId"
      optional :range_from, :uint64, 2, json_name: "rangeFrom"
      optional :range_to, :uint64, 3, json_name: "rangeTo"
    end
    add_message "gooseai.Charge" do
      optional :id, :string, 1, json_name: "id"
      optional :paid, :bool, 2, json_name: "paid"
      optional :receipt_link, :string, 3, json_name: "receiptLink"
      optional :payment_link, :string, 4, json_name: "paymentLink"
      optional :created_at, :uint64, 5, json_name: "createdAt"
      optional :amount_credits, :uint64, 6, json_name: "amountCredits"
    end
    add_message "gooseai.Charges" do
      repeated :charges, :message, 1, "gooseai.Charge", json_name: "charges"
    end
    add_message "gooseai.GetAutoChargeRequest" do
      optional :organization_id, :string, 1, json_name: "organizationId"
    end
    add_message "gooseai.AutoChargeIntent" do
      optional :id, :string, 1, json_name: "id"
      optional :payment_link, :string, 2, json_name: "paymentLink"
      optional :created_at, :uint64, 3, json_name: "createdAt"
      optional :monthly_maximum, :uint64, 4, json_name: "monthlyMaximum"
      optional :minimum_value, :uint64, 5, json_name: "minimumValue"
      optional :amount_credits, :uint64, 6, json_name: "amountCredits"
    end
    add_message "gooseai.UpdateUserInfoRequest" do
      proto3_optional :email, :string, 1, json_name: "email"
    end
    add_message "gooseai.UserPasswordChangeTicket" do
      optional :ticket, :string, 1, json_name: "ticket"
    end
    add_enum "gooseai.OrganizationRole" do
      value :MEMBER, 0
      value :ACCOUNTANT, 1
      value :OWNER, 2
    end
  end
end

module Gooseai
  OrganizationMember = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.OrganizationMember").msgclass
  OrganizationGrant = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.OrganizationGrant").msgclass
  OrganizationPaymentInfo = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.OrganizationPaymentInfo").msgclass
  OrganizationAutoCharge = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.OrganizationAutoCharge").msgclass
  Organization = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.Organization").msgclass
  APIKey = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.APIKey").msgclass
  User = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.User").msgclass
  CostData = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.CostData").msgclass
  UsageMetric = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.UsageMetric").msgclass
  CostTotal = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.CostTotal").msgclass
  TotalMetricsData = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.TotalMetricsData").msgclass
  Metrics = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.Metrics").msgclass
  EmptyRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.EmptyRequest").msgclass
  GetOrganizationRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.GetOrganizationRequest").msgclass
  GetMetricsRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.GetMetricsRequest").msgclass
  APIKeyRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.APIKeyRequest").msgclass
  APIKeyFindRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.APIKeyFindRequest").msgclass
  UpdateDefaultOrganizationRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.UpdateDefaultOrganizationRequest").msgclass
  ClientSettings = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.ClientSettings").msgclass
  CreateAutoChargeIntentRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.CreateAutoChargeIntentRequest").msgclass
  CreateChargeRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.CreateChargeRequest").msgclass
  GetChargesRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.GetChargesRequest").msgclass
  Charge = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.Charge").msgclass
  Charges = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.Charges").msgclass
  GetAutoChargeRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.GetAutoChargeRequest").msgclass
  AutoChargeIntent = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.AutoChargeIntent").msgclass
  UpdateUserInfoRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.UpdateUserInfoRequest").msgclass
  UserPasswordChangeTicket = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.UserPasswordChangeTicket").msgclass
  OrganizationRole = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.OrganizationRole").enummodule
end