<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: dashboard.proto

namespace Gooseai;

use UnexpectedValueException;

/**
 * Protobuf type <code>gooseai.OrganizationRole</code>
 */
class OrganizationRole
{
    /**
     * Generated from protobuf enum <code>MEMBER = 0;</code>
     */
    const MEMBER = 0;
    /**
     * Generated from protobuf enum <code>ACCOUNTANT = 1;</code>
     */
    const ACCOUNTANT = 1;
    /**
     * Generated from protobuf enum <code>OWNER = 2;</code>
     */
    const OWNER = 2;

    private static $valueToName = [
        self::MEMBER => 'MEMBER',
        self::ACCOUNTANT => 'ACCOUNTANT',
        self::OWNER => 'OWNER',
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

