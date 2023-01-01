# coding: utf-8

"""
    Stability.ai REST API

    Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion   # noqa: E501

    The version of the OpenAPI document: 0.1
    Contact: info@stability.ai
    Generated by: https://openapi-generator.tech
"""

import re  # noqa: F401
import sys  # noqa: F401
import typing  # noqa: F401
import functools  # noqa: F401

from frozendict import frozendict  # noqa: F401

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


class Engine(
    DictSchema
):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """
    _required_property_names = set((
        'description',
        'id',
        'name',
        'type',
    ))
    description = StrSchema
    id = StrSchema
    name = StrSchema
    
    
    class type(
        _SchemaEnumMaker(
            enum_value_to_name={
                "AUDIO": "AUDIO",
                "CLASSIFICATION": "CLASSIFICATION",
                "PICTURE": "PICTURE",
                "STORAGE": "STORAGE",
                "TEXT": "TEXT",
                "VIDEO": "VIDEO",
            }
        ),
        StrSchema
    ):
        
        @classmethod
        @property
        def AUDIO(cls):
            return cls("AUDIO")
        
        @classmethod
        @property
        def CLASSIFICATION(cls):
            return cls("CLASSIFICATION")
        
        @classmethod
        @property
        def PICTURE(cls):
            return cls("PICTURE")
        
        @classmethod
        @property
        def STORAGE(cls):
            return cls("STORAGE")
        
        @classmethod
        @property
        def TEXT(cls):
            return cls("TEXT")
        
        @classmethod
        @property
        def VIDEO(cls):
            return cls("VIDEO")


    def __new__(
        cls,
        *args: typing.Union[dict, frozendict, ],
        description: description,
        id: id,
        name: name,
        type: type,
        _configuration: typing.Optional[Configuration] = None,
        **kwargs: typing.Type[Schema],
    ) -> 'Engine':
        return super().__new__(
            cls,
            *args,
            description=description,
            id=id,
            name=name,
            type=type,
            _configuration=_configuration,
            **kwargs,
        )
