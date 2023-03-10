<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: dashboard.proto

namespace Gooseai;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>gooseai.CreateAutoChargeIntentRequest</code>
 */
class CreateAutoChargeIntentRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string organization_id = 1 [json_name = "organizationId"];</code>
     */
    protected $organization_id = '';
    /**
     * Generated from protobuf field <code>uint64 monthly_maximum = 2 [json_name = "monthlyMaximum"];</code>
     */
    protected $monthly_maximum = 0;
    /**
     * Generated from protobuf field <code>uint64 minimum_value = 3 [json_name = "minimumValue"];</code>
     */
    protected $minimum_value = 0;
    /**
     * Generated from protobuf field <code>uint64 amount_credits = 4 [json_name = "amountCredits"];</code>
     */
    protected $amount_credits = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $organization_id
     *     @type int|string $monthly_maximum
     *     @type int|string $minimum_value
     *     @type int|string $amount_credits
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
     * Generated from protobuf field <code>uint64 monthly_maximum = 2 [json_name = "monthlyMaximum"];</code>
     * @return int|string
     */
    public function getMonthlyMaximum()
    {
        return $this->monthly_maximum;
    }

    /**
     * Generated from protobuf field <code>uint64 monthly_maximum = 2 [json_name = "monthlyMaximum"];</code>
     * @param int|string $var
     * @return $this
     */
    public function setMonthlyMaximum($var)
    {
        GPBUtil::checkUint64($var);
        $this->monthly_maximum = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint64 minimum_value = 3 [json_name = "minimumValue"];</code>
     * @return int|string
     */
    public function getMinimumValue()
    {
        return $this->minimum_value;
    }

    /**
     * Generated from protobuf field <code>uint64 minimum_value = 3 [json_name = "minimumValue"];</code>
     * @param int|string $var
     * @return $this
     */
    public function setMinimumValue($var)
    {
        GPBUtil::checkUint64($var);
        $this->minimum_value = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint64 amount_credits = 4 [json_name = "amountCredits"];</code>
     * @return int|string
     */
    public function getAmountCredits()
    {
        return $this->amount_credits;
    }

    /**
     * Generated from protobuf field <code>uint64 amount_credits = 4 [json_name = "amountCredits"];</code>
     * @param int|string $var
     * @return $this
     */
    public function setAmountCredits($var)
    {
        GPBUtil::checkUint64($var);
        $this->amount_credits = $var;

        return $this;
    }

}

