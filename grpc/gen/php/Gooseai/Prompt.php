<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: generation.proto

namespace Gooseai;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * A Prompt is a special type of Artifact that is used to generate an output.
 * There can be multiple Prompts that affect the same output. Currently, the
 * only Prompts supported are:
 *   - Text (singular)
 *   - Init Image (singular, optional, type ARTIFACT_IMAGE, with init=true)
 *   - Mask (singular, optional, Artifact type ARTIFACT_MASK)
 *
 * Generated from protobuf message <code>gooseai.Prompt</code>
 */
class Prompt extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>optional .gooseai.PromptParameters parameters = 1 [json_name = "parameters"];</code>
     */
    protected $parameters = null;
    protected $prompt;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Gooseai\PromptParameters $parameters
     *     @type string $text
     *     @type \Gooseai\Tokens $tokens
     *     @type \Gooseai\Artifact $artifact
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Generation::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>optional .gooseai.PromptParameters parameters = 1 [json_name = "parameters"];</code>
     * @return \Gooseai\PromptParameters|null
     */
    public function getParameters()
    {
        return $this->parameters;
    }

    public function hasParameters()
    {
        return isset($this->parameters);
    }

    public function clearParameters()
    {
        unset($this->parameters);
    }

    /**
     * Generated from protobuf field <code>optional .gooseai.PromptParameters parameters = 1 [json_name = "parameters"];</code>
     * @param \Gooseai\PromptParameters $var
     * @return $this
     */
    public function setParameters($var)
    {
        GPBUtil::checkMessage($var, \Gooseai\PromptParameters::class);
        $this->parameters = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>string text = 2 [json_name = "text"];</code>
     * @return string
     */
    public function getText()
    {
        return $this->readOneof(2);
    }

    public function hasText()
    {
        return $this->hasOneof(2);
    }

    /**
     * Generated from protobuf field <code>string text = 2 [json_name = "text"];</code>
     * @param string $var
     * @return $this
     */
    public function setText($var)
    {
        GPBUtil::checkString($var, True);
        $this->writeOneof(2, $var);

        return $this;
    }

    /**
     * Generated from protobuf field <code>.gooseai.Tokens tokens = 3 [json_name = "tokens"];</code>
     * @return \Gooseai\Tokens|null
     */
    public function getTokens()
    {
        return $this->readOneof(3);
    }

    public function hasTokens()
    {
        return $this->hasOneof(3);
    }

    /**
     * Generated from protobuf field <code>.gooseai.Tokens tokens = 3 [json_name = "tokens"];</code>
     * @param \Gooseai\Tokens $var
     * @return $this
     */
    public function setTokens($var)
    {
        GPBUtil::checkMessage($var, \Gooseai\Tokens::class);
        $this->writeOneof(3, $var);

        return $this;
    }

    /**
     * Generated from protobuf field <code>.gooseai.Artifact artifact = 4 [json_name = "artifact"];</code>
     * @return \Gooseai\Artifact|null
     */
    public function getArtifact()
    {
        return $this->readOneof(4);
    }

    public function hasArtifact()
    {
        return $this->hasOneof(4);
    }

    /**
     * Generated from protobuf field <code>.gooseai.Artifact artifact = 4 [json_name = "artifact"];</code>
     * @param \Gooseai\Artifact $var
     * @return $this
     */
    public function setArtifact($var)
    {
        GPBUtil::checkMessage($var, \Gooseai\Artifact::class);
        $this->writeOneof(4, $var);

        return $this;
    }

    /**
     * @return string
     */
    public function getPrompt()
    {
        return $this->whichOneof("prompt");
    }

}
