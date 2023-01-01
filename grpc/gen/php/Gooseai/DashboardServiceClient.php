<?php
// GENERATED CODE -- DO NOT EDIT!

namespace Gooseai;

/**
 */
class DashboardServiceClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * Get info
     * @param \Gooseai\EmptyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetMe(\Gooseai\EmptyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/gooseai.DashboardService/GetMe',
        $argument,
        ['\Gooseai\User', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Gooseai\GetOrganizationRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetOrganization(\Gooseai\GetOrganizationRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/gooseai.DashboardService/GetOrganization',
        $argument,
        ['\Gooseai\Organization', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Gooseai\GetMetricsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetMetrics(\Gooseai\GetMetricsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/gooseai.DashboardService/GetMetrics',
        $argument,
        ['\Gooseai\Metrics', 'decode'],
        $metadata, $options);
    }

    /**
     * API key management
     * @param \Gooseai\APIKeyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function CreateAPIKey(\Gooseai\APIKeyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/gooseai.DashboardService/CreateAPIKey',
        $argument,
        ['\Gooseai\APIKey', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Gooseai\APIKeyFindRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function DeleteAPIKey(\Gooseai\APIKeyFindRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/gooseai.DashboardService/DeleteAPIKey',
        $argument,
        ['\Gooseai\APIKey', 'decode'],
        $metadata, $options);
    }

    /**
     * User settings
     * @param \Gooseai\UpdateDefaultOrganizationRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function UpdateDefaultOrganization(\Gooseai\UpdateDefaultOrganizationRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/gooseai.DashboardService/UpdateDefaultOrganization',
        $argument,
        ['\Gooseai\User', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Gooseai\EmptyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetClientSettings(\Gooseai\EmptyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/gooseai.DashboardService/GetClientSettings',
        $argument,
        ['\Gooseai\ClientSettings', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Gooseai\ClientSettings $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function SetClientSettings(\Gooseai\ClientSettings $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/gooseai.DashboardService/SetClientSettings',
        $argument,
        ['\Gooseai\ClientSettings', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Gooseai\UpdateUserInfoRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function UpdateUserInfo(\Gooseai\UpdateUserInfoRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/gooseai.DashboardService/UpdateUserInfo',
        $argument,
        ['\Gooseai\User', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Gooseai\EmptyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function CreatePasswordChangeTicket(\Gooseai\EmptyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/gooseai.DashboardService/CreatePasswordChangeTicket',
        $argument,
        ['\Gooseai\UserPasswordChangeTicket', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Gooseai\EmptyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function DeleteAccount(\Gooseai\EmptyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/gooseai.DashboardService/DeleteAccount',
        $argument,
        ['\Gooseai\User', 'decode'],
        $metadata, $options);
    }

    /**
     * Payment functions
     * @param \Gooseai\CreateChargeRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function CreateCharge(\Gooseai\CreateChargeRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/gooseai.DashboardService/CreateCharge',
        $argument,
        ['\Gooseai\Charge', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Gooseai\GetChargesRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetCharges(\Gooseai\GetChargesRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/gooseai.DashboardService/GetCharges',
        $argument,
        ['\Gooseai\Charges', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Gooseai\CreateAutoChargeIntentRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function CreateAutoChargeIntent(\Gooseai\CreateAutoChargeIntentRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/gooseai.DashboardService/CreateAutoChargeIntent',
        $argument,
        ['\Gooseai\AutoChargeIntent', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Gooseai\CreateAutoChargeIntentRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function UpdateAutoChargeIntent(\Gooseai\CreateAutoChargeIntentRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/gooseai.DashboardService/UpdateAutoChargeIntent',
        $argument,
        ['\Gooseai\AutoChargeIntent', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Gooseai\GetAutoChargeRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function GetAutoChargeIntent(\Gooseai\GetAutoChargeRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/gooseai.DashboardService/GetAutoChargeIntent',
        $argument,
        ['\Gooseai\AutoChargeIntent', 'decode'],
        $metadata, $options);
    }

}
