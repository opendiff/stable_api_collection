
#include "TextToImageRequestBody.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TextToImageRequestBody_cfg_scale_is_assigned_from_json()
{








}


void test_TextToImageRequestBody_clip_guidance_preset_is_assigned_from_json()
{


    bourne::json input =
    {
        "clip_guidance_preset", "hello"
    };

    TextToImageRequestBody obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getClipGuidancePreset().c_str());






}


void test_TextToImageRequestBody_height_is_assigned_from_json()
{
    bourne::json input =
    {
        "height", 1
    };

    TextToImageRequestBody obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getHeight());








}


void test_TextToImageRequestBody_sampler_is_assigned_from_json()
{


    bourne::json input =
    {
        "sampler", "hello"
    };

    TextToImageRequestBody obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSampler().c_str());






}


void test_TextToImageRequestBody_samples_is_assigned_from_json()
{
    bourne::json input =
    {
        "samples", 1
    };

    TextToImageRequestBody obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSamples());








}


void test_TextToImageRequestBody_seed_is_assigned_from_json()
{
    bourne::json input =
    {
        "seed", 1
    };

    TextToImageRequestBody obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSeed());








}


void test_TextToImageRequestBody_steps_is_assigned_from_json()
{
    bourne::json input =
    {
        "steps", 1
    };

    TextToImageRequestBody obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getSteps());








}



void test_TextToImageRequestBody_width_is_assigned_from_json()
{
    bourne::json input =
    {
        "width", 1
    };

    TextToImageRequestBody obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getWidth());








}



void test_TextToImageRequestBody_cfg_scale_is_converted_to_json()
{




}


void test_TextToImageRequestBody_clip_guidance_preset_is_converted_to_json()
{

    bourne::json input =
    {
        "clip_guidance_preset", "hello"
    };

    TextToImageRequestBody obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["clip_guidance_preset"] == output["clip_guidance_preset"]);



}


void test_TextToImageRequestBody_height_is_converted_to_json()
{
    bourne::json input =
    {
        "height", 1
    };

    TextToImageRequestBody obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["height"] == output["height"]);




}


void test_TextToImageRequestBody_sampler_is_converted_to_json()
{

    bourne::json input =
    {
        "sampler", "hello"
    };

    TextToImageRequestBody obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["sampler"] == output["sampler"]);



}


void test_TextToImageRequestBody_samples_is_converted_to_json()
{
    bourne::json input =
    {
        "samples", 1
    };

    TextToImageRequestBody obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["samples"] == output["samples"]);




}


void test_TextToImageRequestBody_seed_is_converted_to_json()
{
    bourne::json input =
    {
        "seed", 1
    };

    TextToImageRequestBody obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["seed"] == output["seed"]);




}


void test_TextToImageRequestBody_steps_is_converted_to_json()
{
    bourne::json input =
    {
        "steps", 1
    };

    TextToImageRequestBody obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["steps"] == output["steps"]);




}



void test_TextToImageRequestBody_width_is_converted_to_json()
{
    bourne::json input =
    {
        "width", 1
    };

    TextToImageRequestBody obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["width"] == output["width"]);




}


