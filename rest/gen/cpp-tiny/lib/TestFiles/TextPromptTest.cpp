
#include "TextPrompt.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_TextPrompt_text_is_assigned_from_json()
{


    bourne::json input =
    {
        "text", "hello"
    };

    TextPrompt obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getText().c_str());






}


void test_TextPrompt_weight_is_assigned_from_json()
{








    bourne::json input =
    {
        "weight", 1.0
    };

    TextPrompt obj(input.dump());

    TEST_ASSERT_EQUAL_FLOAT(1.0, obj.getWeight());
}



void test_TextPrompt_text_is_converted_to_json()
{

    bourne::json input =
    {
        "text", "hello"
    };

    TextPrompt obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["text"] == output["text"]);



}


void test_TextPrompt_weight_is_converted_to_json()
{




    bourne::json input =
    {
        "weight", 1.0
    };

    TextPrompt obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["weight"] == output["weight"]);
}


