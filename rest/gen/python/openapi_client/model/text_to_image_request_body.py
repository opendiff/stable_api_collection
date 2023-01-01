"""
    Stability.ai REST API

    Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion   # noqa: E501

    The version of the OpenAPI document: 0.1
    Contact: info@stability.ai
    Generated by: https://openapi-generator.tech
"""


import re  # noqa: F401
import sys  # noqa: F401

from openapi_client.model_utils import (  # noqa: F401
    ApiTypeError,
    ModelComposed,
    ModelNormal,
    ModelSimple,
    cached_property,
    change_keys_js_to_python,
    convert_js_args_to_python_args,
    date,
    datetime,
    file_type,
    none_type,
    validate_get_composed_info,
    OpenApiModel
)
from openapi_client.exceptions import ApiAttributeError


def lazy_import():
    from openapi_client.model.text_prompt import TextPrompt
    globals()['TextPrompt'] = TextPrompt


class TextToImageRequestBody(ModelNormal):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.

    Attributes:
      allowed_values (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          with a capitalized key describing the allowed value and an allowed
          value. These dicts store the allowed enum values.
      attribute_map (dict): The key is attribute name
          and the value is json key in definition.
      discriminator_value_class_map (dict): A dict to go from the discriminator
          variable value to the discriminator class name.
      validations (dict): The key is the tuple path to the attribute
          and the for var_name this is (var_name,). The value is a dict
          that stores validations for max_length, min_length, max_items,
          min_items, exclusive_maximum, inclusive_maximum, exclusive_minimum,
          inclusive_minimum, and regex.
      additional_properties_type (tuple): A tuple of classes accepted
          as additional properties values.
    """

    allowed_values = {
        ('clip_guidance_preset',): {
            'FAST_BLUE': "FAST_BLUE",
            'FAST_GREEN': "FAST_GREEN",
            'NONE': "NONE",
            'SIMPLE': "SIMPLE",
            'SLOW': "SLOW",
            'SLOWER': "SLOWER",
            'SLOWEST': "SLOWEST",
        },
        ('sampler',): {
            'DDIM': "DDIM",
            'DDPM': "DDPM",
            'K_DPMPP_2M': "K_DPMPP_2M",
            'K_DPMPP_2S_ANCESTRAL': "K_DPMPP_2S_ANCESTRAL",
            'K_DPM_2': "K_DPM_2",
            'K_DPM_2_ANCESTRAL': "K_DPM_2_ANCESTRAL",
            'K_EULER': "K_EULER",
            'K_EULER_ANCESTRAL': "K_EULER_ANCESTRAL",
            'K_HEUN': "K_HEUN",
            'K_LMS': "K_LMS",
        },
    }

    validations = {
        ('text_prompts',): {
            'min_items': 1,
        },
        ('cfg_scale',): {
            'inclusive_maximum': 35,
            'inclusive_minimum': 0,
        },
        ('height',): {
            'inclusive_maximum': 2048,
            'inclusive_minimum': 512,
        },
        ('samples',): {
            'inclusive_maximum': 10,
            'inclusive_minimum': 1,
        },
        ('seed',): {
            'inclusive_maximum': 2147483647,
            'inclusive_minimum': 0,
        },
        ('steps',): {
            'inclusive_maximum': 150,
            'inclusive_minimum': 10,
        },
        ('width',): {
            'inclusive_maximum': 2048,
            'inclusive_minimum': 512,
        },
    }

    @cached_property
    def additional_properties_type():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded
        """
        lazy_import()
        return (bool, date, datetime, dict, float, int, list, str, none_type,)  # noqa: E501

    _nullable = False

    @cached_property
    def openapi_types():
        """
        This must be a method because a model may have properties that are
        of type self, this must run after the class is loaded

        Returns
            openapi_types (dict): The key is attribute name
                and the value is attribute type.
        """
        lazy_import()
        return {
            'text_prompts': ([TextPrompt],),  # noqa: E501
            'cfg_scale': (float,),  # noqa: E501
            'clip_guidance_preset': (str,),  # noqa: E501
            'height': (int,),  # noqa: E501
            'sampler': (str,),  # noqa: E501
            'samples': (int,),  # noqa: E501
            'seed': (int,),  # noqa: E501
            'steps': (int,),  # noqa: E501
            'width': (int,),  # noqa: E501
        }

    @cached_property
    def discriminator():
        return None


    attribute_map = {
        'text_prompts': 'text_prompts',  # noqa: E501
        'cfg_scale': 'cfg_scale',  # noqa: E501
        'clip_guidance_preset': 'clip_guidance_preset',  # noqa: E501
        'height': 'height',  # noqa: E501
        'sampler': 'sampler',  # noqa: E501
        'samples': 'samples',  # noqa: E501
        'seed': 'seed',  # noqa: E501
        'steps': 'steps',  # noqa: E501
        'width': 'width',  # noqa: E501
    }

    read_only_vars = {
    }

    _composed_schemas = {}

    @classmethod
    @convert_js_args_to_python_args
    def _from_openapi_data(cls, text_prompts, *args, **kwargs):  # noqa: E501
        """TextToImageRequestBody - a model defined in OpenAPI

        Args:
            text_prompts ([TextPrompt]):

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
            cfg_scale (float): How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt). [optional] if omitted the server will use the default value of 7  # noqa: E501
            clip_guidance_preset (str): [optional] if omitted the server will use the default value of "NONE"  # noqa: E501
            height (int): Height of the image (note: `height * width` must be <= 1 Megapixel). [optional] if omitted the server will use the default value of 512  # noqa: E501
            sampler (str): Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.. [optional]  # noqa: E501
            samples (int): Number of images to generate. [optional] if omitted the server will use the default value of 1  # noqa: E501
            seed (int): Random noise seed (omit this option or use `0` for a random seed). [optional]  # noqa: E501
            steps (int): Number of diffusion steps to run. [optional] if omitted the server will use the default value of 50  # noqa: E501
            width (int): Width of the image (note: `height * width` must be <= 1 Megapixel). [optional] if omitted the server will use the default value of 512  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', True)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        self = super(OpenApiModel, cls).__new__(cls)

        if args:
            for arg in args:
                if isinstance(arg, dict):
                    kwargs.update(arg)
                else:
                    raise ApiTypeError(
                        "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                            args,
                            self.__class__.__name__,
                        ),
                        path_to_item=_path_to_item,
                        valid_classes=(self.__class__,),
                    )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)

        self.text_prompts = text_prompts
        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
        return self

    required_properties = set([
        '_data_store',
        '_check_type',
        '_spec_property_naming',
        '_path_to_item',
        '_configuration',
        '_visited_composed_classes',
    ])

    @convert_js_args_to_python_args
    def __init__(self, text_prompts, *args, **kwargs):  # noqa: E501
        """TextToImageRequestBody - a model defined in OpenAPI

        Args:
            text_prompts ([TextPrompt]):

        Keyword Args:
            _check_type (bool): if True, values for parameters in openapi_types
                                will be type checked and a TypeError will be
                                raised if the wrong type is input.
                                Defaults to True
            _path_to_item (tuple/list): This is a list of keys or values to
                                drill down to the model in received_data
                                when deserializing a response
            _spec_property_naming (bool): True if the variable names in the input data
                                are serialized names, as specified in the OpenAPI document.
                                False if the variable names in the input data
                                are pythonic names, e.g. snake case (default)
            _configuration (Configuration): the instance to use when
                                deserializing a file_type parameter.
                                If passed, type conversion is attempted
                                If omitted no type conversion is done.
            _visited_composed_classes (tuple): This stores a tuple of
                                classes that we have traveled through so that
                                if we see that class again we will not use its
                                discriminator again.
                                When traveling through a discriminator, the
                                composed schema that is
                                is traveled through is added to this set.
                                For example if Animal has a discriminator
                                petType and we pass in "Dog", and the class Dog
                                allOf includes Animal, we move through Animal
                                once using the discriminator, and pick Dog.
                                Then in Dog, we will make an instance of the
                                Animal class but this time we won't travel
                                through its discriminator because we passed in
                                _visited_composed_classes = (Animal,)
            cfg_scale (float): How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt). [optional] if omitted the server will use the default value of 7  # noqa: E501
            clip_guidance_preset (str): [optional] if omitted the server will use the default value of "NONE"  # noqa: E501
            height (int): Height of the image (note: `height * width` must be <= 1 Megapixel). [optional] if omitted the server will use the default value of 512  # noqa: E501
            sampler (str): Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.. [optional]  # noqa: E501
            samples (int): Number of images to generate. [optional] if omitted the server will use the default value of 1  # noqa: E501
            seed (int): Random noise seed (omit this option or use `0` for a random seed). [optional]  # noqa: E501
            steps (int): Number of diffusion steps to run. [optional] if omitted the server will use the default value of 50  # noqa: E501
            width (int): Width of the image (note: `height * width` must be <= 1 Megapixel). [optional] if omitted the server will use the default value of 512  # noqa: E501
        """

        _check_type = kwargs.pop('_check_type', True)
        _spec_property_naming = kwargs.pop('_spec_property_naming', False)
        _path_to_item = kwargs.pop('_path_to_item', ())
        _configuration = kwargs.pop('_configuration', None)
        _visited_composed_classes = kwargs.pop('_visited_composed_classes', ())

        if args:
            for arg in args:
                if isinstance(arg, dict):
                    kwargs.update(arg)
                else:
                    raise ApiTypeError(
                        "Invalid positional arguments=%s passed to %s. Remove those invalid positional arguments." % (
                            args,
                            self.__class__.__name__,
                        ),
                        path_to_item=_path_to_item,
                        valid_classes=(self.__class__,),
                    )

        self._data_store = {}
        self._check_type = _check_type
        self._spec_property_naming = _spec_property_naming
        self._path_to_item = _path_to_item
        self._configuration = _configuration
        self._visited_composed_classes = _visited_composed_classes + (self.__class__,)

        self.text_prompts = text_prompts
        for var_name, var_value in kwargs.items():
            if var_name not in self.attribute_map and \
                        self._configuration is not None and \
                        self._configuration.discard_unknown_keys and \
                        self.additional_properties_type is None:
                # discard variable.
                continue
            setattr(self, var_name, var_value)
            if var_name in self.read_only_vars:
                raise ApiAttributeError(f"`{var_name}` is a read-only attribute. Use `from_openapi_data` to instantiate "
                                     f"class with read only attributes.")
