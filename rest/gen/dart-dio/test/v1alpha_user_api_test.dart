import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for V1alphaUserApi
void main() {
  final instance = Openapi().getV1alphaUserApi();

  group(V1alphaUserApi, () {
    // account
    //
    // Get information about the account associated with the provided API key
    //
    //Future<AccountResponseBody> v1alphaUserAccount() async
    test('test v1alphaUserAccount', () async {
      // TODO
    });

    // balance
    //
    // Get the credit balance of the account/organization associated with the API key
    //
    //Future<BalanceResponseBody> v1alphaUserBalance({ String organization }) async
    test('test v1alphaUserBalance', () async {
      // TODO
    });

  });
}
