<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: dashboard.proto

namespace Gooseai;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>gooseai.GetAutoChargeRequest</code>
 */
class GetAutoChargeRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string organization_id = 1 [json_name = "organizationId"];</code>
     */
    protected $organization_id = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $organization_id
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Dashboard::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string organization_id = 1 [json_name = "organizationId"];</code>
     * @return string
     */
    public function getOrganizationId()
    {
        return $this->organization_id;
    }

    /**
     * Generated from protobuf field <code>string organization_id = 1 [json_name = "organizationId"];</code>
     * @param string $var
     * @return $this
     */
    public function setOrganizationId($var)
    {
        GPBUtil::checkString($var, True);
        $this->organization_id = $var;

        return $this;
    }

}

