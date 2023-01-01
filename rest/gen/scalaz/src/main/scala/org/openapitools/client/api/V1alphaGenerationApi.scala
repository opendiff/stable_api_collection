package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import java.io.File
import java.net.URLEncoder
import java.util.UUID

import org.http4s._
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.http4s.client._
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.headers._

import org.joda.time.DateTime

import scalaz.concurrent.Task

import HelperCodecs._

import org.openapitools.client.api.Error
import java.io.File
import org.openapitools.client.api.ImageToImageOptions
import org.openapitools.client.api.MaskingOptions
import org.openapitools.client.api.TextToImageRequestBody

object V1alphaGenerationApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def v1alphaGenerationImageToImage(host: String, engineId: String, accept: String, initImage: File, options: ImageToImageOptions, organization: String): Task[Unit] = {
    val path = "/v1alpha/generation/{engine_id}/image-to-image".replaceAll("\\{" + "engine_id" + "\\}",escape(engineId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Organization", organization))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def v1alphaGenerationMasking(host: String, engineId: String, accept: String, initImage: File, options: MaskingOptions, organization: String, maskImage: File): Task[Unit] = {
    val path = "/v1alpha/generation/{engine_id}/image-to-image/masking".replaceAll("\\{" + "engine_id" + "\\}",escape(engineId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Organization", organization))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def v1alphaGenerationTextToImage(host: String, engineId: String, accept: String, textToImageRequestBody: TextToImageRequestBody, organization: String): Task[Unit] = {
    val path = "/v1alpha/generation/{engine_id}/text-to-image".replaceAll("\\{" + "engine_id" + "\\}",escape(engineId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Organization", organization))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(textToImageRequestBody)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

}

class HttpServiceV1alphaGenerationApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def v1alphaGenerationImageToImage(engineId: String, accept: String, initImage: File, options: ImageToImageOptions, organization: String): Task[Unit] = {
    val path = "/v1alpha/generation/{engine_id}/image-to-image".replaceAll("\\{" + "engine_id" + "\\}",escape(engineId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Organization", organization))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def v1alphaGenerationMasking(engineId: String, accept: String, initImage: File, options: MaskingOptions, organization: String, maskImage: File): Task[Unit] = {
    val path = "/v1alpha/generation/{engine_id}/image-to-image/masking".replaceAll("\\{" + "engine_id" + "\\}",escape(engineId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Organization", organization))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

  def v1alphaGenerationTextToImage(engineId: String, accept: String, textToImageRequestBody: TextToImageRequestBody, organization: String): Task[Unit] = {
    val path = "/v1alpha/generation/{engine_id}/text-to-image".replaceAll("\\{" + "engine_id" + "\\}",escape(engineId.toString))

    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Accept", accept), Header("Organization", organization))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(textToImageRequestBody)
      resp          <- client.fetch[Unit](req)(_ => Task.now(()))

    } yield resp
  }

}
