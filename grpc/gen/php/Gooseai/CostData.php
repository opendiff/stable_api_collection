<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: dashboard.proto

namespace Gooseai;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>gooseai.CostData</code>
 */
class CostData extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>uint32 amount_tokens = 1 [json_name = "amountTokens"];</code>
     */
    protected $amount_tokens = 0;
    /**
     * Generated from protobuf field <code>double amount_credits = 2 [json_name = "amountCredits"];</code>
     */
    protected $amount_credits = 0.0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int $amount_tokens
     *     @type float $amount_credits
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Dashboard::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>uint32 amount_tokens = 1 [json_name = "amountTokens"];</code>
     * @return int
     */
    public function getAmountTokens()
    {
        return $this->amount_tokens;
    }

    /**
     * Generated from protobuf field <code>uint32 amount_tokens = 1 [json_name = "amountTokens"];</code>
     * @param int $var
     * @return $this
     */
    public function setAmountTokens($var)
    {
        GPBUtil::checkUint32($var);
        $this->amount_tokens = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>double amount_credits = 2 [json_name = "amountCredits"];</code>
     * @return float
     */
    public function getAmountCredits()
    {
        return $this->amount_credits;
    }

    /**
     * Generated from protobuf field <code>double amount_credits = 2 [json_name = "amountCredits"];</code>
     * @param float $var
     * @return $this
     */
    public function setAmountCredits($var)
    {
        GPBUtil::checkDouble($var);
        $this->amount_credits = $var;

        return $this;
    }

}

