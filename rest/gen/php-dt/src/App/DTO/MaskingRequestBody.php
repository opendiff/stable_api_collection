<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MaskingRequestBody
{
    /**
     * Initial image to use for the image-to-image generation
     * @DTA\Data(field="init_image")
     * @DTA\Strategy(name="Object", options={"type":\SplFileObject::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\SplFileObject::class})
     * @var \SplFileObject|null
     */
    public $init_image;

    /**
     * Optional mask image to use for masking. Must be the same dimensions as the &#x60;init_image&#x60;. Use the &#x60;mask_source&#x60; option to specify whether the white or black pixels should be inpainted. (Note: if you set &#x60;mask_source&#x60; to &#x60;INIT_IMAGE_ALPHA&#x60; you can omit the &#x60;mask_image&#x60; parameter completely.)
     * @DTA\Data(field="mask_image", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\SplFileObject::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\SplFileObject::class})
     * @var \SplFileObject|null
     */
    public $mask_image;

    /**
     * @DTA\Data(field="options")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MaskingOptions::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MaskingOptions::class})
     * @var \App\DTO\MaskingOptions|null
     */
    public $options;

}
