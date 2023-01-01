<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: generation.proto

namespace Gooseai;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>gooseai.ChainRequest</code>
 */
class ChainRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string request_id = 1 [json_name = "requestId"];</code>
     */
    protected $request_id = '';
    /**
     * Generated from protobuf field <code>repeated .gooseai.Stage stage = 2 [json_name = "stage"];</code>
     */
    private $stage;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $request_id
     *     @type array<\Gooseai\Stage>|\Google\Protobuf\Internal\RepeatedField $stage
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Generation::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string request_id = 1 [json_name = "requestId"];</code>
     * @return string
     */
    public function getRequestId()
    {
        return $this->request_id;
    }

    /**
     * Generated from protobuf field <code>string request_id = 1 [json_name = "requestId"];</code>
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
     * Generated from protobuf field <code>repeated .gooseai.Stage stage = 2 [json_name = "stage"];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getStage()
    {
        return $this->stage;
    }

    /**
     * Generated from protobuf field <code>repeated .gooseai.Stage stage = 2 [json_name = "stage"];</code>
     * @param array<\Gooseai\Stage>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setStage($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Gooseai\Stage::class);
        $this->stage = $arr;

        return $this;
    }

}

