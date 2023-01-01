#ifndef text_to_image_request_body_TEST
#define text_to_image_request_body_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define text_to_image_request_body_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/text_to_image_request_body.h"
text_to_image_request_body_t* instantiate_text_to_image_request_body(int include_optional);



text_to_image_request_body_t* instantiate_text_to_image_request_body(int include_optional) {
  text_to_image_request_body_t* text_to_image_request_body = NULL;
  if (include_optional) {
    text_to_image_request_body = text_to_image_request_body_create(
      7,
      stability_ai_rest_api_text_to_image_request_body_CLIPGUIDANCEPRESET_"NONE",
      512,
      stability_ai_rest_api_text_to_image_request_body_SAMPLER_"K_DPM_2_ANCESTRAL",
      1,
      0,
      75,
      [{"text":"A lighthouse on a cliff","weight":1}],
      512
    );
  } else {
    text_to_image_request_body = text_to_image_request_body_create(
      7,
      stability_ai_rest_api_text_to_image_request_body_CLIPGUIDANCEPRESET_"NONE",
      512,
      stability_ai_rest_api_text_to_image_request_body_SAMPLER_"K_DPM_2_ANCESTRAL",
      1,
      0,
      75,
      [{"text":"A lighthouse on a cliff","weight":1}],
      512
    );
  }

  return text_to_image_request_body;
}


#ifdef text_to_image_request_body_MAIN

void test_text_to_image_request_body(int include_optional) {
    text_to_image_request_body_t* text_to_image_request_body_1 = instantiate_text_to_image_request_body(include_optional);

	cJSON* jsontext_to_image_request_body_1 = text_to_image_request_body_convertToJSON(text_to_image_request_body_1);
	printf("text_to_image_request_body :\n%s\n", cJSON_Print(jsontext_to_image_request_body_1));
	text_to_image_request_body_t* text_to_image_request_body_2 = text_to_image_request_body_parseFromJSON(jsontext_to_image_request_body_1);
	cJSON* jsontext_to_image_request_body_2 = text_to_image_request_body_convertToJSON(text_to_image_request_body_2);
	printf("repeating text_to_image_request_body:\n%s\n", cJSON_Print(jsontext_to_image_request_body_2));
}

int main() {
  test_text_to_image_request_body(1);
  test_text_to_image_request_body(0);

  printf("Hello world \n");
  return 0;
}

#endif // text_to_image_request_body_MAIN
#endif // text_to_image_request_body_TEST
