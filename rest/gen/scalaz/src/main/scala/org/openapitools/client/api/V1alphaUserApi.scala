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

import org.openapitools.client.api.AccountResponseBody
import org.openapitools.client.api.BalanceResponseBody

object V1alphaUserApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def v1alphaUserAccount(host: String): Task[AccountResponseBody] = {
    implicit val returnTypeDecoder: EntityDecoder[AccountResponseBody] = jsonOf[AccountResponseBody]

    val path = "/v1alpha/user/account"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AccountResponseBody](req)

    } yield resp
  }

  def v1alphaUserBalance(host: String, organization: String): Task[BalanceResponseBody] = {
    implicit val returnTypeDecoder: EntityDecoder[BalanceResponseBody] = jsonOf[BalanceResponseBody]

    val path = "/v1alpha/user/balance"

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
      resp          <- client.expect[BalanceResponseBody](req)

    } yield resp
  }

}

class HttpServiceV1alphaUserApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def v1alphaUserAccount(): Task[AccountResponseBody] = {
    implicit val returnTypeDecoder: EntityDecoder[AccountResponseBody] = jsonOf[AccountResponseBody]

    val path = "/v1alpha/user/account"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[AccountResponseBody](req)

    } yield resp
  }

  def v1alphaUserBalance(organization: String): Task[BalanceResponseBody] = {
    implicit val returnTypeDecoder: EntityDecoder[BalanceResponseBody] = jsonOf[BalanceResponseBody]

    val path = "/v1alpha/user/balance"

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
      resp          <- client.expect[BalanceResponseBody](req)

    } yield resp
  }

}
