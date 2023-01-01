
#include "Engine.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Engine_description_is_assigned_from_json()
{


    bourne::json input =
    {
        "description", "hello"
    };

    Engine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getDescription().c_str());






}


void test_Engine_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    Engine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_Engine_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    Engine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_Engine_type_is_assigned_from_json()
{


    bourne::json input =
    {
        "type", "hello"
    };

    Engine obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getType().c_str());






}



void test_Engine_description_is_converted_to_json()
{

    bourne::json input =
    {
        "description", "hello"
    };

    Engine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["description"] == output["description"]);



}


void test_Engine_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    Engine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_Engine_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    Engine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_Engine_type_is_converted_to_json()
{

    bourne::json input =
    {
        "type", "hello"
    };

    Engine obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["type"] == output["type"]);



}


