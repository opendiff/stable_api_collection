
#include "AccountResponseBodyTest.cpp"

#include "BalanceResponseBodyTest.cpp"

#include "EngineTest.cpp"

#include "ErrorTest.cpp"

#include "ListEnginesResponseBodyTest.cpp"

#include "OrganizationMembershipTest.cpp"

#include "TextPromptTest.cpp"

#include "TextToImageRequestBodyTest.cpp"



void setUp(){}

void tearDown(){}

void runTests(){
    
    
    RUN_TEST(test_AccountResponseBody_email_is_assigned_from_json);
    
    
    RUN_TEST(test_AccountResponseBody_id_is_assigned_from_json);
    
    
    
    RUN_TEST(test_AccountResponseBody_profile_picture_is_assigned_from_json);
    
    
    
    RUN_TEST(test_BalanceResponseBody_credits_is_assigned_from_json);
    
    
    
    RUN_TEST(test_Engine_description_is_assigned_from_json);
    
    
    RUN_TEST(test_Engine_id_is_assigned_from_json);
    
    
    RUN_TEST(test_Engine_name_is_assigned_from_json);
    
    
    RUN_TEST(test_Engine_type_is_assigned_from_json);
    
    
    
    RUN_TEST(test_Error_fault_is_assigned_from_json);
    
    
    RUN_TEST(test_Error_id_is_assigned_from_json);
    
    
    RUN_TEST(test_Error_message_is_assigned_from_json);
    
    
    RUN_TEST(test_Error_name_is_assigned_from_json);
    
    
    RUN_TEST(test_Error_temporary_is_assigned_from_json);
    
    
    RUN_TEST(test_Error_timeout_is_assigned_from_json);
    
    
    
    
    
    RUN_TEST(test_OrganizationMembership_id_is_assigned_from_json);
    
    
    RUN_TEST(test_OrganizationMembership_is_default_is_assigned_from_json);
    
    
    RUN_TEST(test_OrganizationMembership_name_is_assigned_from_json);
    
    
    RUN_TEST(test_OrganizationMembership_role_is_assigned_from_json);
    
    
    
    RUN_TEST(test_TextPrompt_text_is_assigned_from_json);
    
    
    RUN_TEST(test_TextPrompt_weight_is_assigned_from_json);
    
    
    
    RUN_TEST(test_TextToImageRequestBody_cfg_scale_is_assigned_from_json);
    
    
    RUN_TEST(test_TextToImageRequestBody_clip_guidance_preset_is_assigned_from_json);
    
    
    RUN_TEST(test_TextToImageRequestBody_height_is_assigned_from_json);
    
    
    RUN_TEST(test_TextToImageRequestBody_sampler_is_assigned_from_json);
    
    
    RUN_TEST(test_TextToImageRequestBody_samples_is_assigned_from_json);
    
    
    RUN_TEST(test_TextToImageRequestBody_seed_is_assigned_from_json);
    
    
    RUN_TEST(test_TextToImageRequestBody_steps_is_assigned_from_json);
    
    
    
    RUN_TEST(test_TextToImageRequestBody_width_is_assigned_from_json);
    
    

    
    
    RUN_TEST(test_AccountResponseBody_email_is_converted_to_json);
    
    
    RUN_TEST(test_AccountResponseBody_id_is_converted_to_json);
    
    
    
    RUN_TEST(test_AccountResponseBody_profile_picture_is_converted_to_json);
    
    
    
    RUN_TEST(test_BalanceResponseBody_credits_is_converted_to_json);
    
    
    
    RUN_TEST(test_Engine_description_is_converted_to_json);
    
    
    RUN_TEST(test_Engine_id_is_converted_to_json);
    
    
    RUN_TEST(test_Engine_name_is_converted_to_json);
    
    
    RUN_TEST(test_Engine_type_is_converted_to_json);
    
    
    
    RUN_TEST(test_Error_fault_is_converted_to_json);
    
    
    RUN_TEST(test_Error_id_is_converted_to_json);
    
    
    RUN_TEST(test_Error_message_is_converted_to_json);
    
    
    RUN_TEST(test_Error_name_is_converted_to_json);
    
    
    RUN_TEST(test_Error_temporary_is_converted_to_json);
    
    
    RUN_TEST(test_Error_timeout_is_converted_to_json);
    
    
    
    
    
    RUN_TEST(test_OrganizationMembership_id_is_converted_to_json);
    
    
    RUN_TEST(test_OrganizationMembership_is_default_is_converted_to_json);
    
    
    RUN_TEST(test_OrganizationMembership_name_is_converted_to_json);
    
    
    RUN_TEST(test_OrganizationMembership_role_is_converted_to_json);
    
    
    
    RUN_TEST(test_TextPrompt_text_is_converted_to_json);
    
    
    RUN_TEST(test_TextPrompt_weight_is_converted_to_json);
    
    
    
    RUN_TEST(test_TextToImageRequestBody_cfg_scale_is_converted_to_json);
    
    
    RUN_TEST(test_TextToImageRequestBody_clip_guidance_preset_is_converted_to_json);
    
    
    RUN_TEST(test_TextToImageRequestBody_height_is_converted_to_json);
    
    
    RUN_TEST(test_TextToImageRequestBody_sampler_is_converted_to_json);
    
    
    RUN_TEST(test_TextToImageRequestBody_samples_is_converted_to_json);
    
    
    RUN_TEST(test_TextToImageRequestBody_seed_is_converted_to_json);
    
    
    RUN_TEST(test_TextToImageRequestBody_steps_is_converted_to_json);
    
    
    
    RUN_TEST(test_TextToImageRequestBody_width_is_converted_to_json);
    
    


}

int main(void) {
    UNITY_BEGIN();
    runTests();
    return UNITY_END();
}

void setup() {
    UNITY_BEGIN();
    runTests();
    UNITY_END();
}

void loop() {

}
