<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: dashboard.proto

namespace Gooseai;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>gooseai.GetChargesRequest</code>
 */
class GetChargesRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string organization_id = 1 [json_name = "organizationId"];</code>
     */
    protected $organization_id = '';
    /**
     * Generated from protobuf field <code>uint64 range_from = 2 [json_name = "rangeFrom"];</code>
     */
    protected $range_from = 0;
    /**
     * Generated from protobuf field <code>uint64 range_to = 3 [json_name = "rangeTo"];</code>
     */
    protected $range_to = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $organization_id
     *     @type int|string $range_from
     *     @type int|string $range_to
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

    /**
     * Generated from protobuf field <code>uint64 range_from = 2 [json_name = "rangeFrom"];</code>
     * @return int|string
     */
    public function getRangeFrom()
    {
        return $this->range_from;
    }

    /**
     * Generated from protobuf field <code>uint64 range_from = 2 [json_name = "rangeFrom"];</code>
     * @param int|string $var
     * @return $this
     */
    public function setRangeFrom($var)
    {
        GPBUtil::checkUint64($var);
        $this->range_from = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint64 range_to = 3 [json_name = "rangeTo"];</code>
     * @return int|string
     */
    public function getRangeTo()
    {
        return $this->range_to;
    }

    /**
     * Generated from protobuf field <code>uint64 range_to = 3 [json_name = "rangeTo"];</code>
     * @param int|string $var
     * @return $this
     */
    public function setRangeTo($var)
    {
        GPBUtil::checkUint64($var);
        $this->range_to = $var;

        return $this;
    }

}

