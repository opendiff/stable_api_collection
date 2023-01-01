#ifndef engine_TEST
#define engine_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define engine_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/engine.h"
engine_t* instantiate_engine(int include_optional);



engine_t* instantiate_engine(int include_optional) {
  engine_t* engine = NULL;
  if (include_optional) {
    engine = engine_create(
      "Saepe nam magni deserunt eligendi ducimus.",
      "Sunt ut recusandae perspiciatis.",
      "Eos repellendus est.",
      stability_ai_rest_api_engine_TYPE_"PICTURE"
    );
  } else {
    engine = engine_create(
      "Saepe nam magni deserunt eligendi ducimus.",
      "Sunt ut recusandae perspiciatis.",
      "Eos repellendus est.",
      stability_ai_rest_api_engine_TYPE_"PICTURE"
    );
  }

  return engine;
}


#ifdef engine_MAIN

void test_engine(int include_optional) {
    engine_t* engine_1 = instantiate_engine(include_optional);

	cJSON* jsonengine_1 = engine_convertToJSON(engine_1);
	printf("engine :\n%s\n", cJSON_Print(jsonengine_1));
	engine_t* engine_2 = engine_parseFromJSON(jsonengine_1);
	cJSON* jsonengine_2 = engine_convertToJSON(engine_2);
	printf("repeating engine:\n%s\n", cJSON_Print(jsonengine_2));
}

int main() {
  test_engine(1);
  test_engine(0);

  printf("Hello world \n");
  return 0;
}

#endif // engine_MAIN
#endif // engine_TEST
