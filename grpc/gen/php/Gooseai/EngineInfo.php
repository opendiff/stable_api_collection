<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: engines.proto

namespace Gooseai;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Engine info struct
 *
 * Generated from protobuf message <code>gooseai.EngineInfo</code>
 */
class EngineInfo extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string id = 1 [json_name = "id"];</code>
     */
    protected $id = '';
    /**
     * Generated from protobuf field <code>string owner = 2 [json_name = "owner"];</code>
     */
    protected $owner = '';
    /**
     * Generated from protobuf field <code>bool ready = 3 [json_name = "ready"];</code>
     */
    protected $ready = false;
    /**
     * Generated from protobuf field <code>.gooseai.EngineType type = 4 [json_name = "type"];</code>
     */
    protected $type = 0;
    /**
     * Generated from protobuf field <code>.gooseai.EngineTokenizer tokenizer = 5 [json_name = "tokenizer"];</code>
     */
    protected $tokenizer = 0;
    /**
     * Generated from protobuf field <code>string name = 6 [json_name = "name"];</code>
     */
    protected $name = '';
    /**
     * Generated from protobuf field <code>string description = 7 [json_name = "description"];</code>
     */
    protected $description = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $id
     *     @type string $owner
     *     @type bool $ready
     *     @type int $type
     *     @type int $tokenizer
     *     @type string $name
     *     @type string $description
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Engines::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string id = 1 [json_name = "id"];</code>
     * @return string
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * Generated from protobuf field <code>string id = 1 [json_name = "id"];</code>
     * @param string $var
     * @return $this
     */
    public function setId($var)
    {
        GPBUtil::checkString($var, True);
        $this->id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string owner = 2 [json_name = "owner"];</code>
     * @return string
     */
    public function getOwner()
    {
        return $this->owner;
    }

    /**
     * Generated from protobuf field <code>string owner = 2 [json_name = "owner"];</code>
     * @param string $var
     * @return $this
     */
    public function setOwner($var)
    {
        GPBUtil::checkString($var, True);
        $this->owner = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>bool ready = 3 [json_name = "ready"];</code>
     * @return bool
     */
    public function getReady()
    {
        return $this->ready;
    }

    /**
     * Generated from protobuf field <code>bool ready = 3 [json_name = "ready"];</code>
     * @param bool $var
     * @return $this
     */
    public function setReady($var)
    {
        GPBUtil::checkBool($var);
        $this->ready = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.gooseai.EngineType type = 4 [json_name = "type"];</code>
     * @return int
     */
    public function getType()
    {
        return $this->type;
    }

    /**
     * Generated from protobuf field <code>.gooseai.EngineType type = 4 [json_name = "type"];</code>
     * @param int $var
     * @return $this
     */
    public function setType($var)
    {
        GPBUtil::checkEnum($var, \Gooseai\EngineType::class);
        $this->type = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.gooseai.EngineTokenizer tokenizer = 5 [json_name = "tokenizer"];</code>
     * @return int
     */
    public function getTokenizer()
    {
        return $this->tokenizer;
    }

    /**
     * Generated from protobuf field <code>.gooseai.EngineTokenizer tokenizer = 5 [json_name = "tokenizer"];</code>
     * @param int $var
     * @return $this
     */
    public function setTokenizer($var)
    {
        GPBUtil::checkEnum($var, \Gooseai\EngineTokenizer::class);
        $this->tokenizer = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string name = 6 [json_name = "name"];</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Generated from protobuf field <code>string name = 6 [json_name = "name"];</code>
     * @param string $var
     * @return $this
     */
    public function setName($var)
    {
        GPBUtil::checkString($var, True);
        $this->name = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string description = 7 [json_name = "description"];</code>
     * @return string
     */
    public function getDescription()
    {
        return $this->description;
    }

    /**
     * Generated from protobuf field <code>string description = 7 [json_name = "description"];</code>
     * @param string $var
     * @return $this
     */
    public function setDescription($var)
    {
        GPBUtil::checkString($var, True);
        $this->description = $var;

        return $this;
    }

}
