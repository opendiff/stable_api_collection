<?php
// GENERATED CODE -- DO NOT EDIT!

namespace Gooseai;

/**
 */
class EnginesServiceClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * @param \Gooseai\ListEnginesRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function ListEngines(\Gooseai\ListEnginesRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/gooseai.EnginesService/ListEngines',
        $argument,
        ['\Gooseai\Engines', 'decode'],
        $metadata, $options);
    }

}
