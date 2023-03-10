<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: generation.proto

namespace Gooseai;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>gooseai.ClassifierParameters</code>
 */
class ClassifierParameters extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>repeated .gooseai.ClassifierCategory categories = 1 [json_name = "categories"];</code>
     */
    private $categories;
    /**
     * Generated from protobuf field <code>repeated .gooseai.ClassifierCategory exceeds = 2 [json_name = "exceeds"];</code>
     */
    private $exceeds;
    /**
     * Generated from protobuf field <code>optional .gooseai.Action realized_action = 3 [json_name = "realizedAction"];</code>
     */
    protected $realized_action = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type array<\Gooseai\ClassifierCategory>|\Google\Protobuf\Internal\RepeatedField $categories
     *     @type array<\Gooseai\ClassifierCategory>|\Google\Protobuf\Internal\RepeatedField $exceeds
     *     @type int $realized_action
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Generation::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>repeated .gooseai.ClassifierCategory categories = 1 [json_name = "categories"];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getCategories()
    {
        return $this->categories;
    }

    /**
     * Generated from protobuf field <code>repeated .gooseai.ClassifierCategory categories = 1 [json_name = "categories"];</code>
     * @param array<\Gooseai\ClassifierCategory>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setCategories($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Gooseai\ClassifierCategory::class);
        $this->categories = $arr;

        return $this;
    }

    /**
     * Generated from protobuf field <code>repeated .gooseai.ClassifierCategory exceeds = 2 [json_name = "exceeds"];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getExceeds()
    {
        return $this->exceeds;
    }

    /**
     * Generated from protobuf field <code>repeated .gooseai.ClassifierCategory exceeds = 2 [json_name = "exceeds"];</code>
     * @param array<\Gooseai\ClassifierCategory>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setExceeds($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Gooseai\ClassifierCategory::class);
        $this->exceeds = $arr;

        return $this;
    }

    /**
     * Generated from protobuf field <code>optional .gooseai.Action realized_action = 3 [json_name = "realizedAction"];</code>
     * @return int
     */
    public function getRealizedAction()
    {
        return isset($this->realized_action) ? $this->realized_action : 0;
    }

    public function hasRealizedAction()
    {
        return isset($this->realized_action);
    }

    public function clearRealizedAction()
    {
        unset($this->realized_action);
    }

    /**
     * Generated from protobuf field <code>optional .gooseai.Action realized_action = 3 [json_name = "realizedAction"];</code>
     * @param int $var
     * @return $this
     */
    public function setRealizedAction($var)
    {
        GPBUtil::checkEnum($var, \Gooseai\Action::class);
        $this->realized_action = $var;

        return $this;
    }

}

