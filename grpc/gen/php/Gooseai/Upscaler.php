<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: generation.proto

namespace Gooseai;

use UnexpectedValueException;

/**
 * Future, unimplemented.
 *
 * Protobuf type <code>gooseai.Upscaler</code>
 */
class Upscaler
{
    /**
     * Generated from protobuf enum <code>UPSCALER_RGB = 0;</code>
     */
    const UPSCALER_RGB = 0;
    /**
     * Generated from protobuf enum <code>UPSCALER_GFPGAN = 1;</code>
     */
    const UPSCALER_GFPGAN = 1;
    /**
     * Generated from protobuf enum <code>UPSCALER_ESRGAN = 2;</code>
     */
    const UPSCALER_ESRGAN = 2;

    private static $valueToName = [
        self::UPSCALER_RGB => 'UPSCALER_RGB',
        self::UPSCALER_GFPGAN => 'UPSCALER_GFPGAN',
        self::UPSCALER_ESRGAN => 'UPSCALER_ESRGAN',
    ];

    public static function name($value)
    {
        if (!isset(self::$valueToName[$value])) {
            throw new UnexpectedValueException(sprintf(
                    'Enum %s has no name defined for value %s', __CLASS__, $value));
        }
        return self::$valueToName[$value];
    }


    public static function value($name)
    {
        $const = __CLASS__ . '::' . strtoupper($name);
        if (!defined($const)) {
            throw new UnexpectedValueException(sprintf(
                    'Enum %s has no value defined for name %s', __CLASS__, $name));
        }
        return constant($const);
    }
}
