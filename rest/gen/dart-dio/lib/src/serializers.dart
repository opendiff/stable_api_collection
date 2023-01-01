//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_import

import 'package:built_collection/built_collection.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/serializer.dart';
import 'package:built_value/standard_json_plugin.dart';
import 'package:built_value/iso_8601_date_time_serializer.dart';
import 'package:openapi/src/date_serializer.dart';
import 'package:openapi/src/model/date.dart';

import 'package:openapi/src/model/account_response_body.dart';
import 'package:openapi/src/model/balance_response_body.dart';
import 'package:openapi/src/model/engine.dart';
import 'package:openapi/src/model/error.dart';
import 'package:openapi/src/model/list_engines_response_body.dart';
import 'package:openapi/src/model/organization_membership.dart';
import 'package:openapi/src/model/text_prompt.dart';
import 'package:openapi/src/model/text_to_image_request_body.dart';

part 'serializers.g.dart';

@SerializersFor([
  AccountResponseBody,
  BalanceResponseBody,
  Engine,
  Error,
  ListEnginesResponseBody,
  OrganizationMembership,
  TextPrompt,
  TextToImageRequestBody,
])
Serializers serializers = (_$serializers.toBuilder()
      ..add(const DateSerializer())
      ..add(Iso8601DateTimeSerializer()))
    .build();

Serializers standardSerializers =
    (serializers.toBuilder()..addPlugin(StandardJsonPlugin())).build();
