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

import org.openapitools.client.api.ListEnginesResponseBody

object V1alphaEnginesApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def v1alphaEnginesListEngines(host: String, organization: String): Task[ListEnginesResponseBody] = {
    implicit val returnTypeDecoder: EntityDecoder[ListEnginesResponseBody] = jsonOf[ListEnginesResponseBody]

    val path = "/v1alpha/engines/list"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Organization", organization))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListEnginesResponseBody](req)

    } yield resp
  }

}

class HttpServiceV1alphaEnginesApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def v1alphaEnginesListEngines(organization: String): Task[ListEnginesResponseBody] = {
    implicit val returnTypeDecoder: EntityDecoder[ListEnginesResponseBody] = jsonOf[ListEnginesResponseBody]

    val path = "/v1alpha/engines/list"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      Header("Organization", organization))
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[ListEnginesResponseBody](req)

    } yield resp
  }

}
