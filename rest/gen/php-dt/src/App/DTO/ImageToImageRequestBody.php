<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ImageToImageRequestBody
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
     * @DTA\Data(field="options")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ImageToImageOptions::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ImageToImageOptions::class})
     * @var \App\DTO\ImageToImageOptions|null
     */
    public $options;

}
