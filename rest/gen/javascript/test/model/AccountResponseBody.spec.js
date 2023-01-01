/**
 * Stability.ai REST API
 * Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
 *
 * The version of the OpenAPI document: 0.1
 * Contact: info@stability.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.StabilityAiRestApi);
  }
}(this, function(expect, StabilityAiRestApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new StabilityAiRestApi.AccountResponseBody();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('AccountResponseBody', function() {
    it('should create an instance of AccountResponseBody', function() {
      // uncomment below and update the code to test AccountResponseBody
      //var instance = new StabilityAiRestApi.AccountResponseBody();
      //expect(instance).to.be.a(StabilityAiRestApi.AccountResponseBody);
    });

    it('should have the property email (base name: "email")', function() {
      // uncomment below and update the code to test the property email
      //var instance = new StabilityAiRestApi.AccountResponseBody();
      //expect(instance).to.be();
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new StabilityAiRestApi.AccountResponseBody();
      //expect(instance).to.be();
    });

    it('should have the property organizations (base name: "organizations")', function() {
      // uncomment below and update the code to test the property organizations
      //var instance = new StabilityAiRestApi.AccountResponseBody();
      //expect(instance).to.be();
    });

    it('should have the property profilePicture (base name: "profile_picture")', function() {
      // uncomment below and update the code to test the property profilePicture
      //var instance = new StabilityAiRestApi.AccountResponseBody();
      //expect(instance).to.be();
    });

  });

}));
