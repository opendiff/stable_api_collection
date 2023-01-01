<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: generation.proto

namespace Gooseai;

use UnexpectedValueException;

/**
 * Protobuf type <code>gooseai.Action</code>
 */
class Action
{
    /**
     * Generated from protobuf enum <code>ACTION_PASSTHROUGH = 0;</code>
     */
    const ACTION_PASSTHROUGH = 0;
    /**
     * Generated from protobuf enum <code>ACTION_REGENERATE_DUPLICATE = 1;</code>
     */
    const ACTION_REGENERATE_DUPLICATE = 1;
    /**
     * Generated from protobuf enum <code>ACTION_REGENERATE = 2;</code>
     */
    const ACTION_REGENERATE = 2;
    /**
     * Generated from protobuf enum <code>ACTION_OBFUSCATE_DUPLICATE = 3;</code>
     */
    const ACTION_OBFUSCATE_DUPLICATE = 3;
    /**
     * Generated from protobuf enum <code>ACTION_OBFUSCATE = 4;</code>
     */
    const ACTION_OBFUSCATE = 4;
    /**
     * Generated from protobuf enum <code>ACTION_DISCARD = 5;</code>
     */
    const ACTION_DISCARD = 5;

    private static $valueToName = [
        self::ACTION_PASSTHROUGH => 'ACTION_PASSTHROUGH',
        self::ACTION_REGENERATE_DUPLICATE => 'ACTION_REGENERATE_DUPLICATE',
        self::ACTION_REGENERATE => 'ACTION_REGENERATE',
        self::ACTION_OBFUSCATE_DUPLICATE => 'ACTION_OBFUSCATE_DUPLICATE',
        self::ACTION_OBFUSCATE => 'ACTION_OBFUSCATE',
        self::ACTION_DISCARD => 'ACTION_DISCARD',
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

