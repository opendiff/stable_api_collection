<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for v1alpha/generation#textToImage
 */
class V1alphaGenerationTextToImageParameterData
{
    /**
     * Optional: Allows for requests to be scoped to an organization other than the user&#39;s default.  If not provided, the user&#39;s default organization will be used.
     * @DTA\Data(subset="header", field="Organization", nullable=true)
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $organization;

    /**
     *  
     * @DTA\Data(subset="header", field="Accept")
     * @DTA\Strategy(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="header", name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $accept;

    /**
     *  
     * @DTA\Data(subset="path", field="engine_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $engine_id;

}
