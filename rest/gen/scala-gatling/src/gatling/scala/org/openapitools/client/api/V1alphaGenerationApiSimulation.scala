package org.openapitools.client.api

import org.openapitools.client.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class V1alphaGenerationApiSimulation extends Simulation {

    def getCurrentDirectory = new File("").getAbsolutePath
    def userDataDirectory = getCurrentDirectory + "/src/gatling/resources/data"

    // basic test setup
    val configName = System.getProperty("testConfig", "baseline")
    val config = ConfigFactory.load(configName).withFallback(ConfigFactory.load("default"))
    val durationSeconds = config.getInt("performance.durationSeconds")
    val rampUpSeconds = config.getInt("performance.rampUpSeconds")
    val rampDownSeconds = config.getInt("performance.rampDownSeconds")
    val authentication = config.getString("performance.authorizationHeader")
    val acceptHeader = config.getString("performance.acceptType")
    val contentTypeHeader = config.getString("performance.contentType")
    val rateMultiplier = config.getDouble("performance.rateMultiplier")
    val instanceMultiplier = config.getDouble("performance.instanceMultiplier")

    // global assertion data
    val globalResponseTimeMinLTE = config.getInt("performance.global.assertions.responseTime.min.lte")
    val globalResponseTimeMinGTE = config.getInt("performance.global.assertions.responseTime.min.gte")
    val globalResponseTimeMaxLTE = config.getInt("performance.global.assertions.responseTime.max.lte")
    val globalResponseTimeMaxGTE = config.getInt("performance.global.assertions.responseTime.max.gte")
    val globalResponseTimeMeanLTE = config.getInt("performance.global.assertions.responseTime.mean.lte")
    val globalResponseTimeMeanGTE = config.getInt("performance.global.assertions.responseTime.mean.gte")
    val globalResponseTimeFailedRequestsPercentLTE = config.getDouble("performance.global.assertions.failedRequests.percent.lte")
    val globalResponseTimeFailedRequestsPercentGTE = config.getDouble("performance.global.assertions.failedRequests.percent.gte")
    val globalResponseTimeSuccessfulRequestsPercentLTE = config.getDouble("performance.global.assertions.successfulRequests.percent.lte")
    val globalResponseTimeSuccessfulRequestsPercentGTE = config.getDouble("performance.global.assertions.successfulRequests.percent.gte")

// Setup http protocol configuration
    val httpConf = http
        .baseURL("https://api.stability.ai")
        .doNotTrackHeader("1")
        .acceptLanguageHeader("en-US,en;q=0.5")
        .acceptEncodingHeader("gzip, deflate")
        .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0")
        .acceptHeader(acceptHeader)
        .contentTypeHeader(contentTypeHeader)

    // set authorization header if it has been modified from config
    if(!authentication.equals("~MANUAL_ENTRY")){
        httpConf.authorizationHeader(authentication)
    }

    // Setup all the operations per second for the test to ultimately be generated from configs
    val v1alphaGenerationImageToImagePerSecond = config.getDouble("performance.operationsPerSecond.v1alphaGenerationImageToImage") * rateMultiplier * instanceMultiplier
    val v1alphaGenerationMaskingPerSecond = config.getDouble("performance.operationsPerSecond.v1alphaGenerationMasking") * rateMultiplier * instanceMultiplier
    val v1alphaGenerationTextToImagePerSecond = config.getDouble("performance.operationsPerSecond.v1alphaGenerationTextToImage") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders
    val v1alpha/generation#imageToImageHEADERFeeder = csv(userDataDirectory + File.separator + "v1alphaGenerationImageToImage-headerParams.csv").random
    val v1alpha/generation#imageToImagePATHFeeder = csv(userDataDirectory + File.separator + "v1alphaGenerationImageToImage-pathParams.csv").random
    val v1alpha/generation#maskingHEADERFeeder = csv(userDataDirectory + File.separator + "v1alphaGenerationMasking-headerParams.csv").random
    val v1alpha/generation#maskingPATHFeeder = csv(userDataDirectory + File.separator + "v1alphaGenerationMasking-pathParams.csv").random
    val v1alpha/generation#textToImageHEADERFeeder = csv(userDataDirectory + File.separator + "v1alphaGenerationTextToImage-headerParams.csv").random
    val v1alpha/generation#textToImagePATHFeeder = csv(userDataDirectory + File.separator + "v1alphaGenerationTextToImage-pathParams.csv").random

    // Setup all scenarios

    
    val scnv1alphaGenerationImageToImage = scenario("v1alphaGenerationImageToImageSimulation")
        .feed(v1alpha/generation#imageToImageHEADERFeeder)
        .feed(v1alpha/generation#imageToImagePATHFeeder)
        .exec(http("v1alphaGenerationImageToImage")
        .httpRequest("POST","/v1alpha/generation/${engine_id}/image-to-image")
        .header("Accept","${Accept}")
        .header("Organization","${Organization}")
)

    // Run scnv1alphaGenerationImageToImage with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnv1alphaGenerationImageToImage.inject(
        rampUsersPerSec(1) to(v1alphaGenerationImageToImagePerSecond) during(rampUpSeconds),
        constantUsersPerSec(v1alphaGenerationImageToImagePerSecond) during(durationSeconds),
        rampUsersPerSec(v1alphaGenerationImageToImagePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnv1alphaGenerationMasking = scenario("v1alphaGenerationMaskingSimulation")
        .feed(v1alpha/generation#maskingHEADERFeeder)
        .feed(v1alpha/generation#maskingPATHFeeder)
        .exec(http("v1alphaGenerationMasking")
        .httpRequest("POST","/v1alpha/generation/${engine_id}/image-to-image/masking")
        .header("Accept","${Accept}")
        .header("Organization","${Organization}")
)

    // Run scnv1alphaGenerationMasking with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnv1alphaGenerationMasking.inject(
        rampUsersPerSec(1) to(v1alphaGenerationMaskingPerSecond) during(rampUpSeconds),
        constantUsersPerSec(v1alphaGenerationMaskingPerSecond) during(durationSeconds),
        rampUsersPerSec(v1alphaGenerationMaskingPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnv1alphaGenerationTextToImage = scenario("v1alphaGenerationTextToImageSimulation")
        .feed(v1alpha/generation#textToImageHEADERFeeder)
        .feed(v1alpha/generation#textToImagePATHFeeder)
        .exec(http("v1alphaGenerationTextToImage")
        .httpRequest("POST","/v1alpha/generation/${engine_id}/text-to-image")
        .header("Accept","${Accept}")
        .header("Organization","${Organization}")
)

    // Run scnv1alphaGenerationTextToImage with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnv1alphaGenerationTextToImage.inject(
        rampUsersPerSec(1) to(v1alphaGenerationTextToImagePerSecond) during(rampUpSeconds),
        constantUsersPerSec(v1alphaGenerationTextToImagePerSecond) during(durationSeconds),
        rampUsersPerSec(v1alphaGenerationTextToImagePerSecond) to(1) during(rampDownSeconds)
    )

    setUp(
        scenarioBuilders.toList
    ).protocols(httpConf).assertions(
        global.responseTime.min.lte(globalResponseTimeMinLTE),
        global.responseTime.min.gte(globalResponseTimeMinGTE),
        global.responseTime.max.lte(globalResponseTimeMaxLTE),
        global.responseTime.max.gte(globalResponseTimeMaxGTE),
        global.responseTime.mean.lte(globalResponseTimeMeanLTE),
        global.responseTime.mean.gte(globalResponseTimeMeanGTE),
        global.failedRequests.percent.lte(globalResponseTimeFailedRequestsPercentLTE),
        global.failedRequests.percent.gte(globalResponseTimeFailedRequestsPercentGTE),
        global.successfulRequests.percent.lte(globalResponseTimeSuccessfulRequestsPercentLTE),
        global.successfulRequests.percent.gte(globalResponseTimeSuccessfulRequestsPercentGTE)
    )
}
