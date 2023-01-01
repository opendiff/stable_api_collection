import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for Error
void main() {
  final instance = ErrorBuilder();
  // TODO add properties to the builder and call build()

  group(Error, () {
    // Is the error a server-side fault?
    // bool fault
    test('to test the property `fault`', () async {
      // TODO
    });

    // ID is a unique identifier for this particular occurrence of the problem.
    // String id
    test('to test the property `id`', () async {
      // TODO
    });

    // Message is a human-readable explanation specific to this occurrence of the problem.
    // String message
    test('to test the property `message`', () async {
      // TODO
    });

    // Name is the name of this class of errors.
    // String name
    test('to test the property `name`', () async {
      // TODO
    });

    // Is the error temporary?
    // bool temporary
    test('to test the property `temporary`', () async {
      // TODO
    });

    // Is the error a timeout?
    // bool timeout
    test('to test the property `timeout`', () async {
      // TODO
    });

  });
}
