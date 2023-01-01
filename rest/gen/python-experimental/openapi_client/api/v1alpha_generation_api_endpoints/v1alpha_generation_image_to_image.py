# coding: utf-8

"""


    Generated by: https://openapi-generator.tech
"""

from dataclasses import dataclass
import re  # noqa: F401
import sys  # noqa: F401
import typing
import urllib3
import functools  # noqa: F401
from urllib3._collections import HTTPHeaderDict

from openapi_client import api_client, exceptions
import decimal  # noqa: F401
from datetime import date, datetime  # noqa: F401
from frozendict import frozendict  # noqa: F401

from openapi_client.schemas import (  # noqa: F401
    AnyTypeSchema,
    ComposedSchema,
    DictSchema,
    ListSchema,
    StrSchema,
    IntSchema,
    Int32Schema,
    Int64Schema,
    Float32Schema,
    Float64Schema,
    NumberSchema,
    UUIDSchema,
    DateSchema,
    DateTimeSchema,
    DecimalSchema,
    BoolSchema,
    BinarySchema,
    NoneSchema,
    none_type,
    Configuration,
    Unset,
    unset,
    ComposedBase,
    ListBase,
    DictBase,
    NoneBase,
    StrBase,
    IntBase,
    Int32Base,
    Int64Base,
    Float32Base,
    Float64Base,
    NumberBase,
    UUIDBase,
    DateBase,
    DateTimeBase,
    BoolBase,
    BinaryBase,
    Schema,
    NoneClass,
    BoolClass,
    _SchemaValidator,
    _SchemaTypeChecker,
    _SchemaEnumMaker
)

from openapi_client.model.error import Error
from openapi_client.model.image_to_image_request_body import ImageToImageRequestBody

# header params


class AcceptSchema(
    _SchemaEnumMaker(
        enum_value_to_name={
            "image/png": "IMAGEPNG",
            "application/json": "APPLICATIONJSON",
        }
    ),
    StrSchema
):
    
    @classmethod
    @property
    def IMAGEPNG(cls):
        return cls("image/png")
    
    @classmethod
    @property
    def APPLICATIONJSON(cls):
        return cls("application/json")
OrganizationSchema = StrSchema
RequestRequiredHeaderParams = typing.TypedDict(
    'RequestRequiredHeaderParams',
    {
        'Accept': AcceptSchema,
    }
)
RequestOptionalHeaderParams = typing.TypedDict(
    'RequestOptionalHeaderParams',
    {
        'Organization': OrganizationSchema,
    },
    total=False
)


class RequestHeaderParams(RequestRequiredHeaderParams, RequestOptionalHeaderParams):
    pass


request_header_accept = api_client.HeaderParameter(
    name="Accept",
    style=api_client.ParameterStyle.SIMPLE,
    schema=AcceptSchema,
    required=True,
)
request_header_organization = api_client.HeaderParameter(
    name="Organization",
    style=api_client.ParameterStyle.SIMPLE,
    schema=OrganizationSchema,
)
# path params
EngineIdSchema = StrSchema
RequestRequiredPathParams = typing.TypedDict(
    'RequestRequiredPathParams',
    {
        'engine_id': EngineIdSchema,
    }
)
RequestOptionalPathParams = typing.TypedDict(
    'RequestOptionalPathParams',
    {
    },
    total=False
)


class RequestPathParams(RequestRequiredPathParams, RequestOptionalPathParams):
    pass


request_path_engine_id = api_client.PathParameter(
    name="engine_id",
    style=api_client.ParameterStyle.SIMPLE,
    schema=EngineIdSchema,
    required=True,
)
# body param
SchemaForRequestBodyMultipartFormData = ImageToImageRequestBody


request_body_body = api_client.RequestBody(
    content={
        'multipart/form-data': api_client.MediaType(
            schema=SchemaForRequestBodyMultipartFormData),
    },
)
_path = '/v1alpha/generation/{engine_id}/image-to-image'
_method = 'POST'
_auth = [
    'api_key_header_Authorization',
]
ContentLengthSchema = IntSchema
content_length_parameter = api_client.HeaderParameter(
    name="Content-Length",
    style=api_client.ParameterStyle.SIMPLE,
    schema=ContentLengthSchema,
    required=True,
)


class ContentTypeSchema(
    _SchemaEnumMaker(
        enum_value_to_name={
            "image/png": "IMAGEPNG",
            "application/json": "APPLICATIONJSON",
        }
    ),
    StrSchema
):
    
    @classmethod
    @property
    def IMAGEPNG(cls):
        return cls("image/png")
    
    @classmethod
    @property
    def APPLICATIONJSON(cls):
        return cls("application/json")
content_type_parameter = api_client.HeaderParameter(
    name="Content-Type",
    style=api_client.ParameterStyle.SIMPLE,
    schema=ContentTypeSchema,
)


class FinishReasonSchema(
    _SchemaEnumMaker(
        enum_value_to_name={
            "SUCCESS": "SUCCESS",
            "ERROR": "ERROR",
            "CONTENT_FILTERED": "CONTENT_FILTERED",
        }
    ),
    StrSchema
):
    
    @classmethod
    @property
    def SUCCESS(cls):
        return cls("SUCCESS")
    
    @classmethod
    @property
    def ERROR(cls):
        return cls("ERROR")
    
    @classmethod
    @property
    def CONTENT_FILTERED(cls):
        return cls("CONTENT_FILTERED")
finish_reason_parameter = api_client.HeaderParameter(
    name="Finish-Reason",
    style=api_client.ParameterStyle.SIMPLE,
    schema=FinishReasonSchema,
)


class SeedSchema(
    _SchemaValidator(
        inclusive_maximum=2147483647,
        inclusive_minimum=0,
    ),
    IntSchema
):
    pass
seed_parameter = api_client.HeaderParameter(
    name="Seed",
    style=api_client.ParameterStyle.SIMPLE,
    schema=SeedSchema,
)
ResponseHeadersFor200 = typing.TypedDict(
    'ResponseHeadersFor200',
    {
        'Content-Length': ContentLengthSchema,
        'Content-Type': ContentTypeSchema,
        'Finish-Reason': FinishReasonSchema,
        'Seed': SeedSchema,
    }
)


@dataclass
class ApiResponseFor200(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    headers: ResponseHeadersFor200
    body: Unset = unset


_response_for_200 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor200,
    headers=[
        content_length_parameter,
        content_type_parameter,
        finish_reason_parameter,
        seed_parameter,
    ]
)
SchemaFor400ResponseBodyApplicationVndGoaError = Error


@dataclass
class ApiResponseFor400(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        SchemaFor400ResponseBodyApplicationVndGoaError,
    ]
    headers: Unset = unset


_response_for_400 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor400,
    content={
        'application/vnd.goa.error': api_client.MediaType(
            schema=SchemaFor400ResponseBodyApplicationVndGoaError),
    },
)
SchemaFor401ResponseBodyApplicationVndGoaError = Error


@dataclass
class ApiResponseFor401(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        SchemaFor401ResponseBodyApplicationVndGoaError,
    ]
    headers: Unset = unset


_response_for_401 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor401,
    content={
        'application/vnd.goa.error': api_client.MediaType(
            schema=SchemaFor401ResponseBodyApplicationVndGoaError),
    },
)
SchemaFor403ResponseBodyApplicationVndGoaError = Error


@dataclass
class ApiResponseFor403(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        SchemaFor403ResponseBodyApplicationVndGoaError,
    ]
    headers: Unset = unset


_response_for_403 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor403,
    content={
        'application/vnd.goa.error': api_client.MediaType(
            schema=SchemaFor403ResponseBodyApplicationVndGoaError),
    },
)
SchemaFor404ResponseBodyApplicationVndGoaError = Error


@dataclass
class ApiResponseFor404(api_client.ApiResponse):
    response: urllib3.HTTPResponse
    body: typing.Union[
        SchemaFor404ResponseBodyApplicationVndGoaError,
    ]
    headers: Unset = unset


_response_for_404 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor404,
    content={
        'application/vnd.goa.error': api_client.MediaType(
            schema=SchemaFor404ResponseBodyApplicationVndGoaError),
    },
)
_status_code_to_response = {
    '200': _response_for_200,
    '400': _response_for_400,
    '401': _response_for_401,
    '403': _response_for_403,
    '404': _response_for_404,
}
_all_accept_content_types = (
    'application/vnd.goa.error',
)


class V1alphaGenerationImageToImage(api_client.Api):

    def v1alpha_generation_image_to_image(
        self: api_client.Api,
        body: typing.Union[SchemaForRequestBodyMultipartFormData, Unset] = unset,
        header_params: RequestHeaderParams = frozendict(),
        path_params: RequestPathParams = frozendict(),
        content_type: str = 'multipart/form-data',
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        stream: bool = False,
        timeout: typing.Optional[typing.Union[int, typing.Tuple]] = None,
        skip_deserialization: bool = False,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization
    ]:
        """
        image-to-image
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        self._verify_typed_dict_inputs(RequestHeaderParams, header_params)
        self._verify_typed_dict_inputs(RequestPathParams, path_params)
        used_path = _path

        _path_params = {}
        for parameter in (
            request_path_engine_id,
        ):
            parameter_data = path_params.get(parameter.name, unset)
            if parameter_data is unset:
                continue
            serialized_data = parameter.serialize(parameter_data)
            _path_params.update(serialized_data)

        for k, v in _path_params.items():
            used_path = used_path.replace('{%s}' % k, v)

        _headers = HTTPHeaderDict()
        for parameter in (
            request_header_accept,
            request_header_organization,
        ):
            parameter_data = header_params.get(parameter.name, unset)
            if parameter_data is unset:
                continue
            serialized_data = parameter.serialize(parameter_data)
            _headers.extend(serialized_data)
        # TODO add cookie handling
        if accept_content_types:
            for accept_content_type in accept_content_types:
                _headers.add('Accept', accept_content_type)

        _fields = None
        _body = None
        if body is not unset:
            serialized_data = request_body_body.serialize(body, content_type)
            _headers.add('Content-Type', content_type)
            if 'fields' in serialized_data:
                _fields = serialized_data['fields']
            elif 'body' in serialized_data:
                _body = serialized_data['body']
        response = self.api_client.call_api(
            resource_path=used_path,
            method=_method,
            headers=_headers,
            fields=_fields,
            body=_body,
            auth_settings=_auth,
            stream=stream,
            timeout=timeout,
        )

        if skip_deserialization:
            api_response = api_client.ApiResponseWithoutDeserialization(response=response)
        else:
            response_for_status = _status_code_to_response.get(str(response.status))
            if response_for_status:
                api_response = response_for_status.deserialize(response, self.api_client.configuration)
            else:
                api_response = api_client.ApiResponseWithoutDeserialization(response=response)

        if not 200 <= response.status <= 299:
            raise exceptions.ApiException(api_response=api_response)

        return api_response
