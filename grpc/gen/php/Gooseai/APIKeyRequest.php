<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: dashboard.proto

namespace Gooseai;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>gooseai.APIKeyRequest</code>
 */
class APIKeyRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>bool is_secret = 1 [json_name = "isSecret"];</code>
     */
    protected $is_secret = false;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type bool $is_secret
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Dashboard::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>bool is_secret = 1 [json_name = "isSecret"];</code>
     * @return bool
     */
    public function getIsSecret()
    {
        return $this->is_secret;
    }

    /**
     * Generated from protobuf field <code>bool is_secret = 1 [json_name = "isSecret"];</code>
     * @param bool $var
     * @return $this
     */
    public function setIsSecret($var)
    {
        GPBUtil::checkBool($var);
        $this->is_secret = $var;

        return $this;
    }

}

