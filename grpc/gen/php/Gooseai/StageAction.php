<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: generation.proto

namespace Gooseai;

use UnexpectedValueException;

/**
 * Protobuf type <code>gooseai.StageAction</code>
 */
class StageAction
{
    /**
     * Generated from protobuf enum <code>STAGE_ACTION_PASS = 0;</code>
     */
    const STAGE_ACTION_PASS = 0;
    /**
     * Generated from protobuf enum <code>STAGE_ACTION_DISCARD = 1;</code>
     */
    const STAGE_ACTION_DISCARD = 1;
    /**
     * Generated from protobuf enum <code>STAGE_ACTION_RETURN = 2;</code>
     */
    const STAGE_ACTION_RETURN = 2;

    private static $valueToName = [
        self::STAGE_ACTION_PASS => 'STAGE_ACTION_PASS',
        self::STAGE_ACTION_DISCARD => 'STAGE_ACTION_DISCARD',
        self::STAGE_ACTION_RETURN => 'STAGE_ACTION_RETURN',
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

