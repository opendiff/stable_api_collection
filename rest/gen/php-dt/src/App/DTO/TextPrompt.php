<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Text prompt for image generation
 */
class TextPrompt
{
    /**
     * @DTA\Data(field="text")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":2000})
     * @var string|null
     */
    public $text;

    /**
     * Weight of the prompt (use negative numbers for negative prompts)
     * @DTA\Data(field="weight", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $weight;

}
