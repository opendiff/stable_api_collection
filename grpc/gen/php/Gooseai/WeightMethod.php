<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: generation.proto

namespace Gooseai;

use UnexpectedValueException;

/**
 * Protobuf type <code>gooseai.WeightMethod</code>
 */
class WeightMethod
{
    /**
     * Generated from protobuf enum <code>TEXT_ENCODER = 0;</code>
     */
    const TEXT_ENCODER = 0;
    /**
     * Generated from protobuf enum <code>CROSS_ATTENTION = 1;</code>
     */
    const CROSS_ATTENTION = 1;

    private static $valueToName = [
        self::TEXT_ENCODER => 'TEXT_ENCODER',
        self::CROSS_ATTENTION => 'CROSS_ATTENTION',
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

