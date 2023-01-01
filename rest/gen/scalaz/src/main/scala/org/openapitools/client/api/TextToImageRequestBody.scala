package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TextToImageRequestBody._

case class TextToImageRequestBody (
  /* How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt) */
  cfgScale: Option[BigDecimal],
clipGuidancePreset: Option[ClipGuidancePreset],
/* Height of the image (note: `height * width` must be <= 1 Megapixel) */
  height: Option[Integer],
/* Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you. */
  sampler: Option[Sampler],
/* Number of images to generate */
  samples: Option[Integer],
/* Random noise seed (omit this option or use `0` for a random seed) */
  seed: Option[Integer],
/* Number of diffusion steps to run */
  steps: Option[Integer],
textPrompts: List[TextPrompt],
/* Width of the image (note: `height * width` must be <= 1 Megapixel) */
  width: Option[Integer])

object TextToImageRequestBody {
  import DateTimeCodecs._
  sealed trait ClipGuidancePreset
  case object FASTBLUE extends ClipGuidancePreset
  case object FASTGREEN extends ClipGuidancePreset
  case object NONE extends ClipGuidancePreset
  case object SIMPLE extends ClipGuidancePreset
  case object SLOW extends ClipGuidancePreset
  case object SLOWER extends ClipGuidancePreset
  case object SLOWEST extends ClipGuidancePreset

  object ClipGuidancePreset {
    def toClipGuidancePreset(s: String): Option[ClipGuidancePreset] = s match {
      case "FASTBLUE" => Some(FASTBLUE)
      case "FASTGREEN" => Some(FASTGREEN)
      case "NONE" => Some(NONE)
      case "SIMPLE" => Some(SIMPLE)
      case "SLOW" => Some(SLOW)
      case "SLOWER" => Some(SLOWER)
      case "SLOWEST" => Some(SLOWEST)
      case _ => None
    }

    def fromClipGuidancePreset(x: ClipGuidancePreset): String = x match {
      case FASTBLUE => "FASTBLUE"
      case FASTGREEN => "FASTGREEN"
      case NONE => "NONE"
      case SIMPLE => "SIMPLE"
      case SLOW => "SLOW"
      case SLOWER => "SLOWER"
      case SLOWEST => "SLOWEST"
    }
  }

  implicit val ClipGuidancePresetEnumEncoder: EncodeJson[ClipGuidancePreset] =
    EncodeJson[ClipGuidancePreset](is => StringEncodeJson(ClipGuidancePreset.fromClipGuidancePreset(is)))

  implicit val ClipGuidancePresetEnumDecoder: DecodeJson[ClipGuidancePreset] =
    DecodeJson.optionDecoder[ClipGuidancePreset](n => n.string.flatMap(jStr => ClipGuidancePreset.toClipGuidancePreset(jStr)), "ClipGuidancePreset failed to de-serialize")
  sealed trait Sampler
  case object DDIM extends Sampler
  case object DDPM extends Sampler
  case object KDPMPP2M extends Sampler
  case object KDPMPP2SANCESTRAL extends Sampler
  case object KDPM2 extends Sampler
  case object KDPM2ANCESTRAL extends Sampler
  case object KEULER extends Sampler
  case object KEULERANCESTRAL extends Sampler
  case object KHEUN extends Sampler
  case object KLMS extends Sampler

  object Sampler {
    def toSampler(s: String): Option[Sampler] = s match {
      case "DDIM" => Some(DDIM)
      case "DDPM" => Some(DDPM)
      case "KDPMPP2M" => Some(KDPMPP2M)
      case "KDPMPP2SANCESTRAL" => Some(KDPMPP2SANCESTRAL)
      case "KDPM2" => Some(KDPM2)
      case "KDPM2ANCESTRAL" => Some(KDPM2ANCESTRAL)
      case "KEULER" => Some(KEULER)
      case "KEULERANCESTRAL" => Some(KEULERANCESTRAL)
      case "KHEUN" => Some(KHEUN)
      case "KLMS" => Some(KLMS)
      case _ => None
    }

    def fromSampler(x: Sampler): String = x match {
      case DDIM => "DDIM"
      case DDPM => "DDPM"
      case KDPMPP2M => "KDPMPP2M"
      case KDPMPP2SANCESTRAL => "KDPMPP2SANCESTRAL"
      case KDPM2 => "KDPM2"
      case KDPM2ANCESTRAL => "KDPM2ANCESTRAL"
      case KEULER => "KEULER"
      case KEULERANCESTRAL => "KEULERANCESTRAL"
      case KHEUN => "KHEUN"
      case KLMS => "KLMS"
    }
  }

  implicit val SamplerEnumEncoder: EncodeJson[Sampler] =
    EncodeJson[Sampler](is => StringEncodeJson(Sampler.fromSampler(is)))

  implicit val SamplerEnumDecoder: DecodeJson[Sampler] =
    DecodeJson.optionDecoder[Sampler](n => n.string.flatMap(jStr => Sampler.toSampler(jStr)), "Sampler failed to de-serialize")

  implicit val TextToImageRequestBodyCodecJson: CodecJson[TextToImageRequestBody] = CodecJson.derive[TextToImageRequestBody]
  implicit val TextToImageRequestBodyDecoder: EntityDecoder[TextToImageRequestBody] = jsonOf[TextToImageRequestBody]
  implicit val TextToImageRequestBodyEncoder: EntityEncoder[TextToImageRequestBody] = jsonEncoderOf[TextToImageRequestBody]
}
