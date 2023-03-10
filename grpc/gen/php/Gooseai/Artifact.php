<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: generation.proto

namespace Gooseai;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * A tangible Artifact, such as an image, video, or text that is used for input
 * or output.
 *
 * Generated from protobuf message <code>gooseai.Artifact</code>
 */
class Artifact extends \Google\Protobuf\Internal\Message
{
    /**
     * Generated from protobuf field <code>uint64 id = 1 [json_name = "id"];</code>
     */
    protected $id = 0;
    /**
     * Generated from protobuf field <code>.gooseai.ArtifactType type = 2 [json_name = "type"];</code>
     */
    protected $type = 0;
    /**
     * MIME type identifier, e.g. "image/png"
     *
     * Generated from protobuf field <code>string mime = 3 [json_name = "mime"];</code>
     */
    protected $mime = '';
    /**
     * Magic number, e.g. "PNG"
     *
     * Generated from protobuf field <code>optional string magic = 4 [json_name = "magic"];</code>
     */
    protected $magic = null;
    /**
     * Index of this artifact in input/output list
     *
     * Generated from protobuf field <code>uint32 index = 8 [json_name = "index"];</code>
     */
    protected $index = 0;
    /**
     * Reason for finishing, if applicable
     *
     * Generated from protobuf field <code>.gooseai.FinishReason finish_reason = 9 [json_name = "finishReason"];</code>
     */
    protected $finish_reason = 0;
    /**
     * Seed used to generate this artifact
     *
     * Generated from protobuf field <code>uint32 seed = 10 [json_name = "seed"];</code>
     */
    protected $seed = 0;
    /**
     * UUIDv4 of the artifact, used for asset lookup
     *
     * Generated from protobuf field <code>string uuid = 12 [json_name = "uuid"];</code>
     */
    protected $uuid = '';
    /**
     * Size of the artifact in bytes
     *
     * Generated from protobuf field <code>uint64 size = 13 [json_name = "size"];</code>
     */
    protected $size = 0;
    protected $data;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type int|string $id
     *     @type int $type
     *     @type string $mime
     *           MIME type identifier, e.g. "image/png"
     *     @type string $magic
     *           Magic number, e.g. "PNG"
     *     @type string $binary
     *           Binary data, e.g. PNG image
     *     @type string $text
     *           Text data, e.g. text prompt
     *     @type \Gooseai\Tokens $tokens
     *           Tokenized text data, e.g. GPT tokens
     *     @type \Gooseai\ClassifierParameters $classifier
     *     @type \Tensors\Tensor $tensor
     *           torch.Tensor:
     *     @type int $index
     *           Index of this artifact in input/output list
     *     @type int $finish_reason
     *           Reason for finishing, if applicable
     *     @type int $seed
     *           Seed used to generate this artifact
     *     @type string $uuid
     *           UUIDv4 of the artifact, used for asset lookup
     *     @type int|string $size
     *           Size of the artifact in bytes
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Generation::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>uint64 id = 1 [json_name = "id"];</code>
     * @return int|string
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * Generated from protobuf field <code>uint64 id = 1 [json_name = "id"];</code>
     * @param int|string $var
     * @return $this
     */
    public function setId($var)
    {
        GPBUtil::checkUint64($var);
        $this->id = $var;

        return $this;
    }

    /**
     * Generated from protobuf field <code>.gooseai.ArtifactType type = 2 [json_name = "type"];</code>
     * @return int
     */
    public function getType()
    {
        return $this->type;
    }

    /**
     * Generated from protobuf field <code>.gooseai.ArtifactType type = 2 [json_name = "type"];</code>
     * @param int $var
     * @return $this
     */
    public function setType($var)
    {
        GPBUtil::checkEnum($var, \Gooseai\ArtifactType::class);
        $this->type = $var;

        return $this;
    }

    /**
     * MIME type identifier, e.g. "image/png"
     *
     * Generated from protobuf field <code>string mime = 3 [json_name = "mime"];</code>
     * @return string
     */
    public function getMime()
    {
        return $this->mime;
    }

    /**
     * MIME type identifier, e.g. "image/png"
     *
     * Generated from protobuf field <code>string mime = 3 [json_name = "mime"];</code>
     * @param string $var
     * @return $this
     */
    public function setMime($var)
    {
        GPBUtil::checkString($var, True);
        $this->mime = $var;

        return $this;
    }

    /**
     * Magic number, e.g. "PNG"
     *
     * Generated from protobuf field <code>optional string magic = 4 [json_name = "magic"];</code>
     * @return string
     */
    public function getMagic()
    {
        return isset($this->magic) ? $this->magic : '';
    }

    public function hasMagic()
    {
        return isset($this->magic);
    }

    public function clearMagic()
    {
        unset($this->magic);
    }

    /**
     * Magic number, e.g. "PNG"
     *
     * Generated from protobuf field <code>optional string magic = 4 [json_name = "magic"];</code>
     * @param string $var
     * @return $this
     */
    public function setMagic($var)
    {
        GPBUtil::checkString($var, True);
        $this->magic = $var;

        return $this;
    }

    /**
     * Binary data, e.g. PNG image
     *
     * Generated from protobuf field <code>bytes binary = 5 [json_name = "binary"];</code>
     * @return string
     */
    public function getBinary()
    {
        return $this->readOneof(5);
    }

    public function hasBinary()
    {
        return $this->hasOneof(5);
    }

    /**
     * Binary data, e.g. PNG image
     *
     * Generated from protobuf field <code>bytes binary = 5 [json_name = "binary"];</code>
     * @param string $var
     * @return $this
     */
    public function setBinary($var)
    {
        GPBUtil::checkString($var, False);
        $this->writeOneof(5, $var);

        return $this;
    }

    /**
     * Text data, e.g. text prompt
     *
     * Generated from protobuf field <code>string text = 6 [json_name = "text"];</code>
     * @return string
     */
    public function getText()
    {
        return $this->readOneof(6);
    }

    public function hasText()
    {
        return $this->hasOneof(6);
    }

    /**
     * Text data, e.g. text prompt
     *
     * Generated from protobuf field <code>string text = 6 [json_name = "text"];</code>
     * @param string $var
     * @return $this
     */
    public function setText($var)
    {
        GPBUtil::checkString($var, True);
        $this->writeOneof(6, $var);

        return $this;
    }

    /**
     * Tokenized text data, e.g. GPT tokens
     *
     * Generated from protobuf field <code>.gooseai.Tokens tokens = 7 [json_name = "tokens"];</code>
     * @return \Gooseai\Tokens|null
     */
    public function getTokens()
    {
        return $this->readOneof(7);
    }

    public function hasTokens()
    {
        return $this->hasOneof(7);
    }

    /**
     * Tokenized text data, e.g. GPT tokens
     *
     * Generated from protobuf field <code>.gooseai.Tokens tokens = 7 [json_name = "tokens"];</code>
     * @param \Gooseai\Tokens $var
     * @return $this
     */
    public function setTokens($var)
    {
        GPBUtil::checkMessage($var, \Gooseai\Tokens::class);
        $this->writeOneof(7, $var);

        return $this;
    }

    /**
     * Generated from protobuf field <code>.gooseai.ClassifierParameters classifier = 11 [json_name = "classifier"];</code>
     * @return \Gooseai\ClassifierParameters|null
     */
    public function getClassifier()
    {
        return $this->readOneof(11);
    }

    public function hasClassifier()
    {
        return $this->hasOneof(11);
    }

    /**
     * Generated from protobuf field <code>.gooseai.ClassifierParameters classifier = 11 [json_name = "classifier"];</code>
     * @param \Gooseai\ClassifierParameters $var
     * @return $this
     */
    public function setClassifier($var)
    {
        GPBUtil::checkMessage($var, \Gooseai\ClassifierParameters::class);
        $this->writeOneof(11, $var);

        return $this;
    }

    /**
     * torch.Tensor:
     *
     * Generated from protobuf field <code>.tensors.Tensor tensor = 14 [json_name = "tensor"];</code>
     * @return \Tensors\Tensor|null
     */
    public function getTensor()
    {
        return $this->readOneof(14);
    }

    public function hasTensor()
    {
        return $this->hasOneof(14);
    }

    /**
     * torch.Tensor:
     *
     * Generated from protobuf field <code>.tensors.Tensor tensor = 14 [json_name = "tensor"];</code>
     * @param \Tensors\Tensor $var
     * @return $this
     */
    public function setTensor($var)
    {
        GPBUtil::checkMessage($var, \Tensors\Tensor::class);
        $this->writeOneof(14, $var);

        return $this;
    }

    /**
     * Index of this artifact in input/output list
     *
     * Generated from protobuf field <code>uint32 index = 8 [json_name = "index"];</code>
     * @return int
     */
    public function getIndex()
    {
        return $this->index;
    }

    /**
     * Index of this artifact in input/output list
     *
     * Generated from protobuf field <code>uint32 index = 8 [json_name = "index"];</code>
     * @param int $var
     * @return $this
     */
    public function setIndex($var)
    {
        GPBUtil::checkUint32($var);
        $this->index = $var;

        return $this;
    }

    /**
     * Reason for finishing, if applicable
     *
     * Generated from protobuf field <code>.gooseai.FinishReason finish_reason = 9 [json_name = "finishReason"];</code>
     * @return int
     */
    public function getFinishReason()
    {
        return $this->finish_reason;
    }

    /**
     * Reason for finishing, if applicable
     *
     * Generated from protobuf field <code>.gooseai.FinishReason finish_reason = 9 [json_name = "finishReason"];</code>
     * @param int $var
     * @return $this
     */
    public function setFinishReason($var)
    {
        GPBUtil::checkEnum($var, \Gooseai\FinishReason::class);
        $this->finish_reason = $var;

        return $this;
    }

    /**
     * Seed used to generate this artifact
     *
     * Generated from protobuf field <code>uint32 seed = 10 [json_name = "seed"];</code>
     * @return int
     */
    public function getSeed()
    {
        return $this->seed;
    }

    /**
     * Seed used to generate this artifact
     *
     * Generated from protobuf field <code>uint32 seed = 10 [json_name = "seed"];</code>
     * @param int $var
     * @return $this
     */
    public function setSeed($var)
    {
        GPBUtil::checkUint32($var);
        $this->seed = $var;

        return $this;
    }

    /**
     * UUIDv4 of the artifact, used for asset lookup
     *
     * Generated from protobuf field <code>string uuid = 12 [json_name = "uuid"];</code>
     * @return string
     */
    public function getUuid()
    {
        return $this->uuid;
    }

    /**
     * UUIDv4 of the artifact, used for asset lookup
     *
     * Generated from protobuf field <code>string uuid = 12 [json_name = "uuid"];</code>
     * @param string $var
     * @return $this
     */
    public function setUuid($var)
    {
        GPBUtil::checkString($var, True);
        $this->uuid = $var;

        return $this;
    }

    /**
     * Size of the artifact in bytes
     *
     * Generated from protobuf field <code>uint64 size = 13 [json_name = "size"];</code>
     * @return int|string
     */
    public function getSize()
    {
        return $this->size;
    }

    /**
     * Size of the artifact in bytes
     *
     * Generated from protobuf field <code>uint64 size = 13 [json_name = "size"];</code>
     * @param int|string $var
     * @return $this
     */
    public function setSize($var)
    {
        GPBUtil::checkUint64($var);
        $this->size = $var;

        return $this;
    }

    /**
     * @return string
     */
    public function getData()
    {
        return $this->whichOneof("data");
    }

}

