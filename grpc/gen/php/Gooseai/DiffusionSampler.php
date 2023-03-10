<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: generation.proto

namespace Gooseai;

use UnexpectedValueException;

/**
 * DiffusionSampler identifies which sampler to use for Diffusion, and represents
 * the internal set of supported samplers.
 *
 * Protobuf type <code>gooseai.DiffusionSampler</code>
 */
class DiffusionSampler
{
    /**
     * Generated from protobuf enum <code>SAMPLER_DDIM = 0;</code>
     */
    const SAMPLER_DDIM = 0;
    /**
     * Generated from protobuf enum <code>SAMPLER_DDPM = 1;</code>
     */
    const SAMPLER_DDPM = 1;
    /**
     * Generated from protobuf enum <code>SAMPLER_K_EULER = 2;</code>
     */
    const SAMPLER_K_EULER = 2;
    /**
     * Generated from protobuf enum <code>SAMPLER_K_EULER_ANCESTRAL = 3;</code>
     */
    const SAMPLER_K_EULER_ANCESTRAL = 3;
    /**
     * Generated from protobuf enum <code>SAMPLER_K_HEUN = 4;</code>
     */
    const SAMPLER_K_HEUN = 4;
    /**
     * Generated from protobuf enum <code>SAMPLER_K_DPM_2 = 5;</code>
     */
    const SAMPLER_K_DPM_2 = 5;
    /**
     * Generated from protobuf enum <code>SAMPLER_K_DPM_2_ANCESTRAL = 6;</code>
     */
    const SAMPLER_K_DPM_2_ANCESTRAL = 6;
    /**
     * Generated from protobuf enum <code>SAMPLER_K_LMS = 7;</code>
     */
    const SAMPLER_K_LMS = 7;
    /**
     * Generated from protobuf enum <code>SAMPLER_K_DPMPP_2S_ANCESTRAL = 8;</code>
     */
    const SAMPLER_K_DPMPP_2S_ANCESTRAL = 8;
    /**
     * Generated from protobuf enum <code>SAMPLER_K_DPMPP_2M = 9;</code>
     */
    const SAMPLER_K_DPMPP_2M = 9;
    /**
     * Generated from protobuf enum <code>SAMPLER_K_DPMPP_SDE = 10;</code>
     */
    const SAMPLER_K_DPMPP_SDE = 10;

    private static $valueToName = [
        self::SAMPLER_DDIM => 'SAMPLER_DDIM',
        self::SAMPLER_DDPM => 'SAMPLER_DDPM',
        self::SAMPLER_K_EULER => 'SAMPLER_K_EULER',
        self::SAMPLER_K_EULER_ANCESTRAL => 'SAMPLER_K_EULER_ANCESTRAL',
        self::SAMPLER_K_HEUN => 'SAMPLER_K_HEUN',
        self::SAMPLER_K_DPM_2 => 'SAMPLER_K_DPM_2',
        self::SAMPLER_K_DPM_2_ANCESTRAL => 'SAMPLER_K_DPM_2_ANCESTRAL',
        self::SAMPLER_K_LMS => 'SAMPLER_K_LMS',
        self::SAMPLER_K_DPMPP_2S_ANCESTRAL => 'SAMPLER_K_DPMPP_2S_ANCESTRAL',
        self::SAMPLER_K_DPMPP_2M => 'SAMPLER_K_DPMPP_2M',
        self::SAMPLER_K_DPMPP_SDE => 'SAMPLER_K_DPMPP_SDE',
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

