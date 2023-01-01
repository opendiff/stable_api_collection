<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AccountResponseBody
{
    /**
     * The user&#39;s email
     * @DTA\Data(field="email")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $email;

    /**
     * The user&#39;s ID
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * The user&#39;s organizations
     * @DTA\Data(field="organizations")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection4::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection4::class})
     * @var \App\DTO\Collection4|null
     */
    public $organizations;

    /**
     * The user&#39;s profile picture
     * @DTA\Data(field="profile_picture", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $profile_picture;

}
