<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: generation.proto

namespace Gooseai;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * A set of parameters for each individual Prompt.
 *
 * Generated from protobuf message <code>gooseai.PromptParameters</code>
 */
class PromptParameters extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>optional bool init = 1 [json_name = "init"];</code>
     */
    protected $init = null;
    /**
     * Generated from protobuf field <code>optional float weight = 2 [json_name = "weight"];</code>
     */
    protected $weight = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type bool $init
     *     @type float $weight
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Generation::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>optional bool init = 1 [json_name = "init"];</code>
     * @return bool
     */
    public function getInit()
    {
        return isset($this->init) ? $this->init : false;
    }

    public function hasInit()
    {
        return isset($this->init);
    }

    public function clearInit()
    {
        unset($this->init);
    }

    /**
     * Generated from protobuf field <code>optional bool init = 1 [json_name = "init"];</code>
     * @param bool $var
     * @return $this
     */
    public function setInit($var)
    {
        GPBUtil::checkBool($var);
        $this->init = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>optional float weight = 2 [json_name = "weight"];</code>
     * @return float
     */
    public function getWeight()
    {
        return isset($this->weight) ? $this->weight : 0.0;
    }

    public function hasWeight()
    {
        return isset($this->weight);
    }

    public function clearWeight()
    {
        unset($this->weight);
    }

    /**
     * Generated from protobuf field <code>optional float weight = 2 [json_name = "weight"];</code>
     * @param float $var
     * @return $this
     */
    public function setWeight($var)
    {
        GPBUtil::checkFloat($var);
        $this->weight = $var;

        return $this;
    }

}

