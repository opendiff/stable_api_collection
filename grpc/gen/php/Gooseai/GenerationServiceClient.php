<?php
// GENERATED CODE -- DO NOT EDIT!

namespace Gooseai;

/**
 *
 * gRPC services
 *
 */
class GenerationServiceClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * @param \Gooseai\Request $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\ServerStreamingCall
     */
    public function Generate(\Gooseai\Request $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/gooseai.GenerationService/Generate',
        $argument,
        ['\Gooseai\Answer', 'decode'],
        $metadata, $options);
    }

    /**
     * @param \Gooseai\ChainRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\ServerStreamingCall
     */
    public function ChainGenerate(\Gooseai\ChainRequest $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/gooseai.GenerationService/ChainGenerate',
        $argument,
        ['\Gooseai\Answer', 'decode'],
        $metadata, $options);
    }

}
