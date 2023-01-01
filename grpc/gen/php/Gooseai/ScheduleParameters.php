<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: generation.proto

namespace Gooseai;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * When does this schedule definition apply?
 *
 * Generated from protobuf message <code>gooseai.ScheduleParameters</code>
 */
class ScheduleParameters extends \Google\Protobuf\Internal\Message
{
    /**
     * 0.0 to 1.0
     *
     * Generated from protobuf field <code>optional float start = 1 [json_name = "start"];</code>
     */
    protected $start = null;
    /**
     * 0.0 to 1.0
     *
     * Generated from protobuf field <code>optional float end = 2 [json_name = "end"];</code>
     */
    protected $end = null;
    /**
     * float value to apply on this schedule
     *
     * Generated from protobuf field <code>optional float value = 3 [json_name = "value"];</code>
     */
    protected $value = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type float $start
     *           0.0 to 1.0
     *     @type float $end
     *           0.0 to 1.0
     *     @type float $value
     *           float value to apply on this schedule
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Generation::initOnce();
        parent::__construct($data);
    }

    /**
     * 0.0 to 1.0
     *
     * Generated from protobuf field <code>optional float start = 1 [json_name = "start"];</code>
     * @return float
     */
    public function getStart()
    {
        return isset($this->start) ? $this->start : 0.0;
    }

    public function hasStart()
    {
        return isset($this->start);
    }

    public function clearStart()
    {
        unset($this->start);
    }

    /**
     * 0.0 to 1.0
     *
     * Generated from protobuf field <code>optional float start = 1 [json_name = "start"];</code>
     * @param float $var
     * @return $this
     */
    public function setStart($var)
    {
        GPBUtil::checkFloat($var);
        $this->start = $var;

        return $this;
    }

    /**
     * 0.0 to 1.0
     *
     * Generated from protobuf field <code>optional float end = 2 [json_name = "end"];</code>
     * @return float
     */
    public function getEnd()
    {
        return isset($this->end) ? $this->end : 0.0;
    }

    public function hasEnd()
    {
        return isset($this->end);
    }

    public function clearEnd()
    {
        unset($this->end);
    }

    /**
     * 0.0 to 1.0
     *
     * Generated from protobuf field <code>optional float end = 2 [json_name = "end"];</code>
     * @param float $var
     * @return $this
     */
    public function setEnd($var)
    {
        GPBUtil::checkFloat($var);
        $this->end = $var;

        return $this;
    }

    /**
     * float value to apply on this schedule
     *
     * Generated from protobuf field <code>optional float value = 3 [json_name = "value"];</code>
     * @return float
     */
    public function getValue()
    {
        return isset($this->value) ? $this->value : 0.0;
    }

    public function hasValue()
    {
        return isset($this->value);
    }

    public function clearValue()
    {
        unset($this->value);
    }

    /**
     * float value to apply on this schedule
     *
     * Generated from protobuf field <code>optional float value = 3 [json_name = "value"];</code>
     * @param float $var
     * @return $this
     */
    public function setValue($var)
    {
        GPBUtil::checkFloat($var);
        $this->value = $var;

        return $this;
    }

}

