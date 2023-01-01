<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class TextToImageRequestBody
{
    /**
     * How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt)
     * @DTA\Data(field="cfg_scale", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":35, "inclusive":true})
     * @var float|null
     */
    public $cfg_scale;

    /**
     * @DTA\Data(field="clip_guidance_preset", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $clip_guidance_preset;

    /**
     * Height of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel)
     * @DTA\Data(field="height", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":512, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2048, "inclusive":true})
     * @var int|null
     */
    public $height;

    /**
     * Which sampler to use for the diffusion process. If this value is omitted we&#39;ll automatically select an appropriate sampler for you.
     * @DTA\Data(field="sampler", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $sampler;

    /**
     * Number of images to generate
     * @DTA\Data(field="samples", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":1, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":10, "inclusive":true})
     * @var int|null
     */
    public $samples;

    /**
     * Random noise seed (omit this option or use &#x60;0&#x60; for a random seed)
     * @DTA\Data(field="seed", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $seed;

    /**
     * Number of diffusion steps to run
     * @DTA\Data(field="steps", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":10, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":150, "inclusive":true})
     * @var int|null
     */
    public $steps;

    /**
     * @DTA\Data(field="text_prompts")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection3::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection3::class})
     * @var \App\DTO\Collection3|null
     */
    public $text_prompts;

    /**
     * Width of the image (note: &#x60;height * width&#x60; must be &lt;&#x3D; 1 Megapixel)
     * @DTA\Data(field="width", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":512, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2048, "inclusive":true})
     * @var int|null
     */
    public $width;

}
