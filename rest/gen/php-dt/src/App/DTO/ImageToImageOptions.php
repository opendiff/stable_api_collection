<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ImageToImageOptions
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
     * Skips a proportion of the end of the diffusion steps, allowing the init_image to influence the final generated image.  Lower values will result in more influence from the init_image, while higher values will result in more influence from the diffusion steps.
     * @DTA\Data(field="step_schedule_end", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":1, "inclusive":true})
     * @var float|null
     */
    public $step_schedule_end;

    /**
     * Skips a proportion of the start of the diffusion steps, allowing the init_image to influence the final generated image.  Lower values will result in more influence from the init_image, while higher values will result in more influence from the diffusion steps.  (e.g. a value of &#x60;0&#x60; would simply return you the init_image, where a value of &#x60;1&#x60; would return you a completely different image.)
     * @DTA\Data(field="step_schedule_start", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":1, "inclusive":true})
     * @var float|null
     */
    public $step_schedule_start;

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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection1::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection1::class})
     * @var \App\DTO\Collection1|null
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
