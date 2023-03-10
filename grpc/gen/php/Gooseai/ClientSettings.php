<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: dashboard.proto

namespace Gooseai;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>gooseai.ClientSettings</code>
 */
class ClientSettings extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>bytes settings = 1 [json_name = "settings"];</code>
     */
    protected $settings = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $settings
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Dashboard::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>bytes settings = 1 [json_name = "settings"];</code>
     * @return string
     */
    public function getSettings()
    {
        return $this->settings;
    }

    /**
     * Generated from protobuf field <code>bytes settings = 1 [json_name = "settings"];</code>
     * @param string $var
     * @return $this
     */
    public function setSettings($var)
    {
        GPBUtil::checkString($var, False);
        $this->settings = $var;

        return $this;
    }

}

