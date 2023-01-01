
#include "Error.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Error_fault_is_assigned_from_json()
{




    bourne::json input =
    {
        "fault", true
    };

    Error obj(input.dump());

    TEST_ASSERT(true == obj.isFault());




}


void test_Error_id_is_assigned_from_json()
{


    bourne::json input =
    {
        "id", "hello"
    };

    Error obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getId().c_str());






}


void test_Error_message_is_assigned_from_json()
{


    bourne::json input =
    {
        "message", "hello"
    };

    Error obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getMessage().c_str());






}


void test_Error_name_is_assigned_from_json()
{


    bourne::json input =
    {
        "name", "hello"
    };

    Error obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getName().c_str());






}


void test_Error_temporary_is_assigned_from_json()
{




    bourne::json input =
    {
        "temporary", true
    };

    Error obj(input.dump());

    TEST_ASSERT(true == obj.isTemporary());




}


void test_Error_timeout_is_assigned_from_json()
{




    bourne::json input =
    {
        "timeout", true
    };

    Error obj(input.dump());

    TEST_ASSERT(true == obj.isTimeout());




}



void test_Error_fault_is_converted_to_json()
{


    bourne::json input =
    {
        "fault", true
    };

    Error obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["fault"] == output["fault"]);


}


void test_Error_id_is_converted_to_json()
{

    bourne::json input =
    {
        "id", "hello"
    };

    Error obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["id"] == output["id"]);



}


void test_Error_message_is_converted_to_json()
{

    bourne::json input =
    {
        "message", "hello"
    };

    Error obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["message"] == output["message"]);



}


void test_Error_name_is_converted_to_json()
{

    bourne::json input =
    {
        "name", "hello"
    };

    Error obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["name"] == output["name"]);



}


void test_Error_temporary_is_converted_to_json()
{


    bourne::json input =
    {
        "temporary", true
    };

    Error obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["temporary"] == output["temporary"]);


}


void test_Error_timeout_is_converted_to_json()
{


    bourne::json input =
    {
        "timeout", true
    };

    Error obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["timeout"] == output["timeout"]);


}


