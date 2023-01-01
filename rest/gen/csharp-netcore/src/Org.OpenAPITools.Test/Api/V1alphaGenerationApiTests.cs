/*
 * Stability.ai REST API
 *
 * Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
 *
 * The version of the OpenAPI document: 0.1
 * Contact: info@stability.ai
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.Api;
// uncomment below to import models
//using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Test.Api
{
    /// <summary>
    ///  Class for testing V1alphaGenerationApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class V1alphaGenerationApiTests : IDisposable
    {
        private V1alphaGenerationApi instance;

        public V1alphaGenerationApiTests()
        {
            instance = new V1alphaGenerationApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of V1alphaGenerationApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' V1alphaGenerationApi
            //Assert.IsType<V1alphaGenerationApi>(instance);
        }

        /// <summary>
        /// Test V1alphaGenerationImageToImage
        /// </summary>
        [Fact]
        public void V1alphaGenerationImageToImageTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string engineId = null;
            //string accept = null;
            //System.IO.Stream initImage = null;
            //ImageToImageOptions options = null;
            //string organization = null;
            //instance.V1alphaGenerationImageToImage(engineId, accept, initImage, options, organization);
        }

        /// <summary>
        /// Test V1alphaGenerationMasking
        /// </summary>
        [Fact]
        public void V1alphaGenerationMaskingTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string engineId = null;
            //string accept = null;
            //System.IO.Stream initImage = null;
            //MaskingOptions options = null;
            //string organization = null;
            //System.IO.Stream maskImage = null;
            //instance.V1alphaGenerationMasking(engineId, accept, initImage, options, organization, maskImage);
        }

        /// <summary>
        /// Test V1alphaGenerationTextToImage
        /// </summary>
        [Fact]
        public void V1alphaGenerationTextToImageTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string engineId = null;
            //string accept = null;
            //TextToImageRequestBody textToImageRequestBody = null;
            //string organization = null;
            //instance.V1alphaGenerationTextToImage(engineId, accept, textToImageRequestBody, organization);
        }
    }
}
