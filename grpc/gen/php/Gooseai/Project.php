<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: project.proto

namespace Gooseai;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Generated from protobuf message <code>gooseai.Project</code>
 */
class Project extends \Google\Protobuf\Internal\Message
{
    /**
     * ID of the project, UUIDv4
     *
     * Generated from protobuf field <code>string id = 1 [json_name = "id"];</code>
     */
    protected $id = '';
    /**
     * Title of the project
     *
     * Generated from protobuf field <code>string title = 2 [json_name = "title"];</code>
     */
    protected $title = '';
    /**
     * The ID of the organization owning the project
     *
     * Generated from protobuf field <code>string owner_id = 3 [json_name = "ownerId"];</code>
     */
    protected $owner_id = '';
    /**
     * The access of the project (such as public vs private)
     *
     * Generated from protobuf field <code>.gooseai.ProjectAccess access = 4 [json_name = "access"];</code>
     */
    protected $access = 0;
    /**
     * The status of the project (such as active vs inactive)
     *
     * Generated from protobuf field <code>.gooseai.ProjectStatus status = 5 [json_name = "status"];</code>
     */
    protected $status = 0;
    /**
     * The size of the project in bytes
     *
     * Generated from protobuf field <code>uint64 size = 6 [json_name = "size"];</code>
     */
    protected $size = 0;
    /**
     * Project file for the project
     *
     * Generated from protobuf field <code>.gooseai.ProjectAsset file = 7 [json_name = "file"];</code>
     */
    protected $file = null;
    /**
     * Time of project creation (UTC seconds epoch)
     *
     * Generated from protobuf field <code>uint64 created_at = 8 [json_name = "createdAt"];</code>
     */
    protected $created_at = 0;
    /**
     * Time of last project update (UTC seconds epoch)
     *
     * Generated from protobuf field <code>uint64 updated_at = 9 [json_name = "updatedAt"];</code>
     */
    protected $updated_at = 0;
    /**
     * The listing of all assets associated with the project
     *
     * Generated from protobuf field <code>repeated .gooseai.ProjectAsset assets = 10 [json_name = "assets"];</code>
     */
    private $assets;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $id
     *           ID of the project, UUIDv4
     *     @type string $title
     *           Title of the project
     *     @type string $owner_id
     *           The ID of the organization owning the project
     *     @type int $access
     *           The access of the project (such as public vs private)
     *     @type int $status
     *           The status of the project (such as active vs inactive)
     *     @type int|string $size
     *           The size of the project in bytes
     *     @type \Gooseai\ProjectAsset $file
     *           Project file for the project
     *     @type int|string $created_at
     *           Time of project creation (UTC seconds epoch)
     *     @type int|string $updated_at
     *           Time of last project update (UTC seconds epoch)
     *     @type array<\Gooseai\ProjectAsset>|\Google\Protobuf\Internal\RepeatedField $assets
     *           The listing of all assets associated with the project
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Project::initOnce();
        parent::__construct($data);
    }

    /**
     * ID of the project, UUIDv4
     *
     * Generated from protobuf field <code>string id = 1 [json_name = "id"];</code>
     * @return string
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * ID of the project, UUIDv4
     *
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
     * Title of the project
     *
     * Generated from protobuf field <code>string title = 2 [json_name = "title"];</code>
     * @return string
     */
    public function getTitle()
    {
        return $this->title;
    }

    /**
     * Title of the project
     *
     * Generated from protobuf field <code>string title = 2 [json_name = "title"];</code>
     * @param string $var
     * @return $this
     */
    public function setTitle($var)
    {
        GPBUtil::checkString($var, True);
        $this->title = $var;

        return $this;
    }

    /**
     * The ID of the organization owning the project
     *
     * Generated from protobuf field <code>string owner_id = 3 [json_name = "ownerId"];</code>
     * @return string
     */
    public function getOwnerId()
    {
        return $this->owner_id;
    }

    /**
     * The ID of the organization owning the project
     *
     * Generated from protobuf field <code>string owner_id = 3 [json_name = "ownerId"];</code>
     * @param string $var
     * @return $this
     */
    public function setOwnerId($var)
    {
        GPBUtil::checkString($var, True);
        $this->owner_id = $var;

        return $this;
    }

    /**
     * The access of the project (such as public vs private)
     *
     * Generated from protobuf field <code>.gooseai.ProjectAccess access = 4 [json_name = "access"];</code>
     * @return int
     */
    public function getAccess()
    {
        return $this->access;
    }

    /**
     * The access of the project (such as public vs private)
     *
     * Generated from protobuf field <code>.gooseai.ProjectAccess access = 4 [json_name = "access"];</code>
     * @param int $var
     * @return $this
     */
    public function setAccess($var)
    {
        GPBUtil::checkEnum($var, \Gooseai\ProjectAccess::class);
        $this->access = $var;

        return $this;
    }

    /**
     * The status of the project (such as active vs inactive)
     *
     * Generated from protobuf field <code>.gooseai.ProjectStatus status = 5 [json_name = "status"];</code>
     * @return int
     */
    public function getStatus()
    {
        return $this->status;
    }

    /**
     * The status of the project (such as active vs inactive)
     *
     * Generated from protobuf field <code>.gooseai.ProjectStatus status = 5 [json_name = "status"];</code>
     * @param int $var
     * @return $this
     */
    public function setStatus($var)
    {
        GPBUtil::checkEnum($var, \Gooseai\ProjectStatus::class);
        $this->status = $var;

        return $this;
    }

    /**
     * The size of the project in bytes
     *
     * Generated from protobuf field <code>uint64 size = 6 [json_name = "size"];</code>
     * @return int|string
     */
    public function getSize()
    {
        return $this->size;
    }

    /**
     * The size of the project in bytes
     *
     * Generated from protobuf field <code>uint64 size = 6 [json_name = "size"];</code>
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
     * Project file for the project
     *
     * Generated from protobuf field <code>.gooseai.ProjectAsset file = 7 [json_name = "file"];</code>
     * @return \Gooseai\ProjectAsset|null
     */
    public function getFile()
    {
        return $this->file;
    }

    public function hasFile()
    {
        return isset($this->file);
    }

    public function clearFile()
    {
        unset($this->file);
    }

    /**
     * Project file for the project
     *
     * Generated from protobuf field <code>.gooseai.ProjectAsset file = 7 [json_name = "file"];</code>
     * @param \Gooseai\ProjectAsset $var
     * @return $this
     */
    public function setFile($var)
    {
        GPBUtil::checkMessage($var, \Gooseai\ProjectAsset::class);
        $this->file = $var;

        return $this;
    }

    /**
     * Time of project creation (UTC seconds epoch)
     *
     * Generated from protobuf field <code>uint64 created_at = 8 [json_name = "createdAt"];</code>
     * @return int|string
     */
    public function getCreatedAt()
    {
        return $this->created_at;
    }

    /**
     * Time of project creation (UTC seconds epoch)
     *
     * Generated from protobuf field <code>uint64 created_at = 8 [json_name = "createdAt"];</code>
     * @param int|string $var
     * @return $this
     */
    public function setCreatedAt($var)
    {
        GPBUtil::checkUint64($var);
        $this->created_at = $var;

        return $this;
    }

    /**
     * Time of last project update (UTC seconds epoch)
     *
     * Generated from protobuf field <code>uint64 updated_at = 9 [json_name = "updatedAt"];</code>
     * @return int|string
     */
    public function getUpdatedAt()
    {
        return $this->updated_at;
    }

    /**
     * Time of last project update (UTC seconds epoch)
     *
     * Generated from protobuf field <code>uint64 updated_at = 9 [json_name = "updatedAt"];</code>
     * @param int|string $var
     * @return $this
     */
    public function setUpdatedAt($var)
    {
        GPBUtil::checkUint64($var);
        $this->updated_at = $var;

        return $this;
    }

    /**
     * The listing of all assets associated with the project
     *
     * Generated from protobuf field <code>repeated .gooseai.ProjectAsset assets = 10 [json_name = "assets"];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getAssets()
    {
        return $this->assets;
    }

    /**
     * The listing of all assets associated with the project
     *
     * Generated from protobuf field <code>repeated .gooseai.ProjectAsset assets = 10 [json_name = "assets"];</code>
     * @param array<\Gooseai\ProjectAsset>|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setAssets($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Gooseai\ProjectAsset::class);
        $this->assets = $arr;

        return $this;
    }

}

