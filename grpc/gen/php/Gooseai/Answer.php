<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: generation.proto

namespace Gooseai;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * An Answer is a response to a Request. It is a set of Artifacts, which can be
 * of any type and forwarded to the client or the next stage.
 *
 * Generated from protobuf message <code>gooseai.Answer</code>
 */
class Answer extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>string answer_id = 1 [json_name = "answerId"];</code>
     */
    protected $answer_id = '';
    /**
     * Generated from protobuf field <code>string request_id = 2 [json_name = "requestId"];</code>
     */
    protected $request_id = '';
    /**
     * Generated from protobuf field <code>uint64 received = 3 [json_name = "received"];</code>
     */
    protected $received = 0;
    /**
     * Generated from protobuf field <code>uint64 created = 4 [json_name = "created"];</code>
     */
    protected $created = 0;
    /**
     * Generated from protobuf field <code>optional .gooseai.AnswerMeta meta = 6 [json_name = "meta"];</code>
     */
    protected $meta = null;
    /**
     * Generated from protobuf field <code>repeated .gooseai.Artifact artifacts = 7 [json_name = "artifacts"];</code>
     */
    private $artifacts;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $answer_id
     *     @type string $request_id
     *     @type int|string $received
     *     @type int|string $created
     *     @type \Gooseai\AnswerMeta $meta
     *     @type array<\Gooseai\Artifact>|\Google\Protobuf\Internal\RepeatedField $artifacts
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Generation::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>string answer_id = 1 [json_name = "answerId"];</code>
     * @return string
     */
    public function getAnswerId()
    {
        return $this->answer_id;
    }

    /**
     * Generated from protobuf field <code>string answer_id = 1 [json_name = "answerId"];</code>
     * @param string $var
     * @return $this
     */
    public function setAnswerId($var)
    {
        GPBUtil::checkString($var, True);
        $this->answer_id = $var;

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
     * Generated from protobuf field <code>uint64 received = 3 [json_name = "received"];</code>
     * @return int|string
     */
    public function getReceived()
    {
        return $this->received;
    }

    /**
     * Generated from protobuf field <code>uint64 received = 3 [json_name = "received"];</code>
     * @param int|string $var
     * @return $this
     */
    public function setReceived($var)
    {
        GPBUtil::checkUint64($var);
        $this->received = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>uint64 created = 4 [json_name = "created"];</code>
     * @return int|string
     */
    public function getCreated()
    {
        return $this->created;
    }

    /**
     * Generated from protobuf field <code>uint64 created = 4 [json_name = "created"];</code>
     * @param int|string $var
     * @return $this
     */
    public function setCreated($var)
    {
        GPBUtil::checkUint64($var);
        $this->created = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>optional .gooseai.AnswerMeta meta = 6 [json_name = "meta"];</code>
     * @return \Gooseai\AnswerMeta|null
     */
    public function getMeta()
    {
        return $this->meta;
    }

    public function hasMeta()
    {
        return isset($this->meta);
    }

    public function clearMeta()
    {
        unset($this->meta);
    }

    /**
     * Generated from protobuf field <code>optional .gooseai.AnswerMeta meta = 6 [json_name = "meta"];</code>
     * @param \Gooseai\AnswerMeta $var
     * @return $this
     */
    public function setMeta($var)
    {
        GPBUtil::checkMessage($var, \Gooseai\AnswerMeta::class);
        $this->meta = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>repeated .gooseai.Artifact artifacts = 7 [json_name = "artifacts"];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getArtifacts()
    {
        return $this->artifacts;
    }

    /**
     * Generated from protobuf field <code>repeated .gooseai.Artifact artifacts = 7 [json_name = "artifacts"];</code>
     * @param array<\Gooseai\Artifact>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setArtifacts($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Gooseai\Artifact::class);
        $this->artifacts = $arr;

        return $this;
    }

}

