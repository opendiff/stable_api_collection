<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: generation.proto

namespace Gooseai;

use UnexpectedValueException;

/**
 * Protobuf type <code>gooseai.ClassifierMode</code>
 */
class ClassifierMode
{
    /**
     * Generated from protobuf enum <code>CLSFR_MODE_ZEROSHOT = 0;</code>
     */
    const CLSFR_MODE_ZEROSHOT = 0;
    /**
     *CLSFR_MODE_ODDSRATIO = 2;
     *
     * Generated from protobuf enum <code>CLSFR_MODE_MULTICLASS = 1;</code>
     */
    const CLSFR_MODE_MULTICLASS = 1;

    private static $valueToName = [
        self::CLSFR_MODE_ZEROSHOT => 'CLSFR_MODE_ZEROSHOT',
        self::CLSFR_MODE_MULTICLASS => 'CLSFR_MODE_MULTICLASS',
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
