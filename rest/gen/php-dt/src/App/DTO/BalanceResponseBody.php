<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class BalanceResponseBody
{
    /**
     * The balance of the account/organization associated with the API key
     * @DTA\Data(field="credits")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $credits;

}
