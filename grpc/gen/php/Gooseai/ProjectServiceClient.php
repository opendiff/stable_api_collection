<?php
// GENERATED CODE -- DO NOT EDIT!

namespace Gooseai;

/**
 *
 * gRPC services
 *
 */
class ProjectServiceClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * Create a new project if it does not exist
     * @param \Gooseai\CreateProjectRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function Create(\Gooseai\CreateProjectRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/gooseai.ProjectService/Create',
        $argument,
        ['\Gooseai\Project', 'decode'],
        $metadata, $options);
    }

    /**
     * Update an existing project
     * @param \Gooseai\UpdateProjectRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function Update(\Gooseai\UpdateProjectRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/gooseai.ProjectService/Update',
        $argument,
        ['\Gooseai\Project', 'decode'],
        $metadata, $options);
    }

    /**
     * List all the projects for an organization
     * @param \Gooseai\ListProjectRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\ServerStreamingCall
     */
    public function List(\Gooseai\ListProjectRequest $argument,
      $metadata = [], $options = []) {
        return $this->_serverStreamRequest('/gooseai.ProjectService/List',
        $argument,
        ['\Gooseai\Project', 'decode'],
        $metadata, $options);
    }

    /**
     * Get a project
     * @param \Gooseai\GetProjectRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function Get(\Gooseai\GetProjectRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/gooseai.ProjectService/Get',
        $argument,
        ['\Gooseai\Project', 'decode'],
        $metadata, $options);
    }

    /**
     * Delete a project
     * @param \Gooseai\DeleteProjectRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function Delete(\Gooseai\DeleteProjectRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/gooseai.ProjectService/Delete',
        $argument,
        ['\Gooseai\Project', 'decode'],
        $metadata, $options);
    }

    /**
     * Query the assets of a project, with additional filtering
     * @param \Gooseai\QueryAssetsRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     * @return \Grpc\UnaryCall
     */
    public function QueryAssets(\Gooseai\QueryAssetsRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/gooseai.ProjectService/QueryAssets',
        $argument,
        ['\Gooseai\QueryAssetsResponse', 'decode'],
        $metadata, $options);
    }

}
