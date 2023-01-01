<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: generation.proto

namespace Gooseai;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * A Request is a set of Artifacts, which can be of any type with model or
 * transform parameters. It is sent to the server, which will respond with an
 * Answer.
 *
 * Generated from protobuf message <code>gooseai.Request</code>
 */
class Request extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string engine_id = 1 [json_name = "engineId"];</code>
     */
    protected $engine_id = '';
    /**
     * Generated from protobuf field <code>string request_id = 2 [json_name = "requestId"];</code>
     */
    protected $request_id = '';
    /**
     * Generated from protobuf field <code>.gooseai.ArtifactType requested_type = 3 [json_name = "requestedType"];</code>
     */
    protected $requested_type = 0;
    /**
     * Generated from protobuf field <code>repeated .gooseai.Prompt prompt = 4 [json_name = "prompt"];</code>
     */
    private $prompt;
    /**
     * Generated from protobuf field <code>optional .gooseai.ConditionerParameters conditioner = 6 [json_name = "conditioner"];</code>
     */
    protected $conditioner = null;
    protected $params;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $engine_id
     *     @type string $request_id
     *     @type int $requested_type
     *     @type array<\Gooseai\Prompt>|\Google\Protobuf\Internal\RepeatedField $prompt
     *     @type \Gooseai\ImageParameters $image
     *     @type \Gooseai\ClassifierParameters $classifier
     *     @type \Gooseai\AssetParameters $asset
     *     @type \Gooseai\ConditionerParameters $conditioner
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Generation::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string engine_id = 1 [json_name = "engineId"];</code>
     * @return string
     */
    public function getEngineId()
    {
        return $this->engine_id;
    }

    /**
     * Generated from protobuf field <code>string engine_id = 1 [json_name = "engineId"];</code>
     * @param string $var
     * @return $this
     */
    public function setEngineId($var)
    {
        GPBUtil::checkString($var, True);
        $this->engine_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string request_id = 2 [json_name = "requestId"];</code>
     * @return string
     */
    public function getRequestId()
    {
        return $this->request_id;
    }

    /**
     * Generated from protobuf field <code>string request_id = 2 [json_name = "requestId"];</code>
     * @param string $var
     * @return $this
     */
    public function setRequestId($var)
    {
        GPBUtil::checkString($var, True);
        $this->request_id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.gooseai.ArtifactType requested_type = 3 [json_name = "requestedType"];</code>
     * @return int
     */
    public function getRequestedType()
    {
        return $this->requested_type;
    }

    /**
     * Generated from protobuf field <code>.gooseai.ArtifactType requested_type = 3 [json_name = "requestedType"];</code>
     * @param int $var
     * @return $this
     */
    public function setRequestedType($var)
    {
        GPBUtil::checkEnum($var, \Gooseai\ArtifactType::class);
        $this->requested_type = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>repeated .gooseai.Prompt prompt = 4 [json_name = "prompt"];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getPrompt()
    {
        return $this->prompt;
    }

    /**
     * Generated from protobuf field <code>repeated .gooseai.Prompt prompt = 4 [json_name = "prompt"];</code>
     * @param array<\Gooseai\Prompt>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setPrompt($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Gooseai\Prompt::class);
        $this->prompt = $arr;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.gooseai.ImageParameters image = 5 [json_name = "image"];</code>
     * @return \Gooseai\ImageParameters|null
     */
    public function getImage()
    {
        return $this->readOneof(5);
    }

    public function hasImage()
    {
        return $this->hasOneof(5);
    }

    /**
     * Generated from protobuf field <code>.gooseai.ImageParameters image = 5 [json_name = "image"];</code>
     * @param \Gooseai\ImageParameters $var
     * @return $this
     */
    public function setImage($var)
    {
        GPBUtil::checkMessage($var, \Gooseai\ImageParameters::class);
        $this->writeOneof(5, $var);

        return $this;
    }

    /**
     * Generated from protobuf field <code>.gooseai.ClassifierParameters classifier = 7 [json_name = "classifier"];</code>
     * @return \Gooseai\ClassifierParameters|null
     */
    public function getClassifier()
    {
        return $this->readOneof(7);
    }

    public function hasClassifier()
    {
        return $this->hasOneof(7);
    }

    /**
     * Generated from protobuf field <code>.gooseai.ClassifierParameters classifier = 7 [json_name = "classifier"];</code>
     * @param \Gooseai\ClassifierParameters $var
     * @return $this
     */
    public function setClassifier($var)
    {
        GPBUtil::checkMessage($var, \Gooseai\ClassifierParameters::class);
        $this->writeOneof(7, $var);

        return $this;
    }

    /**
     * Generated from protobuf field <code>.gooseai.AssetParameters asset = 8 [json_name = "asset"];</code>
     * @return \Gooseai\AssetParameters|null
     */
    public function getAsset()
    {
        return $this->readOneof(8);
    }

    public function hasAsset()
    {
        return $this->hasOneof(8);
    }

    /**
     * Generated from protobuf field <code>.gooseai.AssetParameters asset = 8 [json_name = "asset"];</code>
     * @param \Gooseai\AssetParameters $var
     * @return $this
     */
    public function setAsset($var)
    {
        GPBUtil::checkMessage($var, \Gooseai\AssetParameters::class);
        $this->writeOneof(8, $var);

        return $this;
    }

    /**
     * Generated from protobuf field <code>optional .gooseai.ConditionerParameters conditioner = 6 [json_name = "conditioner"];</code>
     * @return \Gooseai\ConditionerParameters|null
     */
    public function getConditioner()
    {
        return $this->conditioner;
    }

    public function hasConditioner()
    {
        return isset($this->conditioner);
    }

    public function clearConditioner()
    {
        unset($this->conditioner);
    }

    /**
     * Generated from protobuf field <code>optional .gooseai.ConditionerParameters conditioner = 6 [json_name = "conditioner"];</code>
     * @param \Gooseai\ConditionerParameters $var
     * @return $this
     */
    public function setConditioner($var)
    {
        GPBUtil::checkMessage($var, \Gooseai\ConditionerParameters::class);
        $this->conditioner = $var;

        return $this;
    }

    /**
     * @return string
     */
    public function getParams()
    {
        return $this->whichOneof("params");
    }

}

