# coding: utf-8

"""
    Stability.ai REST API

    Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion   # noqa: E501

    The version of the OpenAPI document: 0.1
    Contact: info@stability.ai
    Generated by: https://openapi-generator.tech
"""


try:
    from inspect import getfullargspec
except ImportError:
    from inspect import getargspec as getfullargspec
import pprint
import re  # noqa: F401
import six

from openapi_client.configuration import Configuration


class TextToImageRequestBody(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'cfg_scale': 'float',
        'clip_guidance_preset': 'str',
        'height': 'int',
        'sampler': 'str',
        'samples': 'int',
        'seed': 'int',
        'steps': 'int',
        'text_prompts': 'list[TextPrompt]',
        'width': 'int'
    }

    attribute_map = {
        'cfg_scale': 'cfg_scale',
        'clip_guidance_preset': 'clip_guidance_preset',
        'height': 'height',
        'sampler': 'sampler',
        'samples': 'samples',
        'seed': 'seed',
        'steps': 'steps',
        'text_prompts': 'text_prompts',
        'width': 'width'
    }

    def __init__(self, cfg_scale=7, clip_guidance_preset='NONE', height=512, sampler=None, samples=1, seed=None, steps=50, text_prompts=None, width=512, local_vars_configuration=None):  # noqa: E501
        """TextToImageRequestBody - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration.get_default_copy()
        self.local_vars_configuration = local_vars_configuration

        self._cfg_scale = None
        self._clip_guidance_preset = None
        self._height = None
        self._sampler = None
        self._samples = None
        self._seed = None
        self._steps = None
        self._text_prompts = None
        self._width = None
        self.discriminator = None

        if cfg_scale is not None:
            self.cfg_scale = cfg_scale
        if clip_guidance_preset is not None:
            self.clip_guidance_preset = clip_guidance_preset
        if height is not None:
            self.height = height
        if sampler is not None:
            self.sampler = sampler
        if samples is not None:
            self.samples = samples
        if seed is not None:
            self.seed = seed
        if steps is not None:
            self.steps = steps
        self.text_prompts = text_prompts
        if width is not None:
            self.width = width

    @property
    def cfg_scale(self):
        """Gets the cfg_scale of this TextToImageRequestBody.  # noqa: E501

        How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt)  # noqa: E501

        :return: The cfg_scale of this TextToImageRequestBody.  # noqa: E501
        :rtype: float
        """
        return self._cfg_scale

    @cfg_scale.setter
    def cfg_scale(self, cfg_scale):
        """Sets the cfg_scale of this TextToImageRequestBody.

        How strictly the diffusion process adheres to the prompt text (higher values keep your image closer to your prompt)  # noqa: E501

        :param cfg_scale: The cfg_scale of this TextToImageRequestBody.  # noqa: E501
        :type cfg_scale: float
        """
        if (self.local_vars_configuration.client_side_validation and
                cfg_scale is not None and cfg_scale > 35):  # noqa: E501
            raise ValueError("Invalid value for `cfg_scale`, must be a value less than or equal to `35`")  # noqa: E501
        if (self.local_vars_configuration.client_side_validation and
                cfg_scale is not None and cfg_scale < 0):  # noqa: E501
            raise ValueError("Invalid value for `cfg_scale`, must be a value greater than or equal to `0`")  # noqa: E501

        self._cfg_scale = cfg_scale

    @property
    def clip_guidance_preset(self):
        """Gets the clip_guidance_preset of this TextToImageRequestBody.  # noqa: E501


        :return: The clip_guidance_preset of this TextToImageRequestBody.  # noqa: E501
        :rtype: str
        """
        return self._clip_guidance_preset

    @clip_guidance_preset.setter
    def clip_guidance_preset(self, clip_guidance_preset):
        """Sets the clip_guidance_preset of this TextToImageRequestBody.


        :param clip_guidance_preset: The clip_guidance_preset of this TextToImageRequestBody.  # noqa: E501
        :type clip_guidance_preset: str
        """
        allowed_values = ["FAST_BLUE", "FAST_GREEN", "NONE", "SIMPLE", "SLOW", "SLOWER", "SLOWEST"]  # noqa: E501
        if self.local_vars_configuration.client_side_validation and clip_guidance_preset not in allowed_values:  # noqa: E501
            raise ValueError(
                "Invalid value for `clip_guidance_preset` ({0}), must be one of {1}"  # noqa: E501
                .format(clip_guidance_preset, allowed_values)
            )

        self._clip_guidance_preset = clip_guidance_preset

    @property
    def height(self):
        """Gets the height of this TextToImageRequestBody.  # noqa: E501

        Height of the image (note: `height * width` must be <= 1 Megapixel)  # noqa: E501

        :return: The height of this TextToImageRequestBody.  # noqa: E501
        :rtype: int
        """
        return self._height

    @height.setter
    def height(self, height):
        """Sets the height of this TextToImageRequestBody.

        Height of the image (note: `height * width` must be <= 1 Megapixel)  # noqa: E501

        :param height: The height of this TextToImageRequestBody.  # noqa: E501
        :type height: int
        """
        if (self.local_vars_configuration.client_side_validation and
                height is not None and height > 2048):  # noqa: E501
            raise ValueError("Invalid value for `height`, must be a value less than or equal to `2048`")  # noqa: E501
        if (self.local_vars_configuration.client_side_validation and
                height is not None and height < 512):  # noqa: E501
            raise ValueError("Invalid value for `height`, must be a value greater than or equal to `512`")  # noqa: E501

        self._height = height

    @property
    def sampler(self):
        """Gets the sampler of this TextToImageRequestBody.  # noqa: E501

        Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.  # noqa: E501

        :return: The sampler of this TextToImageRequestBody.  # noqa: E501
        :rtype: str
        """
        return self._sampler

    @sampler.setter
    def sampler(self, sampler):
        """Sets the sampler of this TextToImageRequestBody.

        Which sampler to use for the diffusion process. If this value is omitted we'll automatically select an appropriate sampler for you.  # noqa: E501

        :param sampler: The sampler of this TextToImageRequestBody.  # noqa: E501
        :type sampler: str
        """
        allowed_values = ["DDIM", "DDPM", "K_DPMPP_2M", "K_DPMPP_2S_ANCESTRAL", "K_DPM_2", "K_DPM_2_ANCESTRAL", "K_EULER", "K_EULER_ANCESTRAL", "K_HEUN", "K_LMS"]  # noqa: E501
        if self.local_vars_configuration.client_side_validation and sampler not in allowed_values:  # noqa: E501
            raise ValueError(
                "Invalid value for `sampler` ({0}), must be one of {1}"  # noqa: E501
                .format(sampler, allowed_values)
            )

        self._sampler = sampler

    @property
    def samples(self):
        """Gets the samples of this TextToImageRequestBody.  # noqa: E501

        Number of images to generate  # noqa: E501

        :return: The samples of this TextToImageRequestBody.  # noqa: E501
        :rtype: int
        """
        return self._samples

    @samples.setter
    def samples(self, samples):
        """Sets the samples of this TextToImageRequestBody.

        Number of images to generate  # noqa: E501

        :param samples: The samples of this TextToImageRequestBody.  # noqa: E501
        :type samples: int
        """
        if (self.local_vars_configuration.client_side_validation and
                samples is not None and samples > 10):  # noqa: E501
            raise ValueError("Invalid value for `samples`, must be a value less than or equal to `10`")  # noqa: E501
        if (self.local_vars_configuration.client_side_validation and
                samples is not None and samples < 1):  # noqa: E501
            raise ValueError("Invalid value for `samples`, must be a value greater than or equal to `1`")  # noqa: E501

        self._samples = samples

    @property
    def seed(self):
        """Gets the seed of this TextToImageRequestBody.  # noqa: E501

        Random noise seed (omit this option or use `0` for a random seed)  # noqa: E501

        :return: The seed of this TextToImageRequestBody.  # noqa: E501
        :rtype: int
        """
        return self._seed

    @seed.setter
    def seed(self, seed):
        """Sets the seed of this TextToImageRequestBody.

        Random noise seed (omit this option or use `0` for a random seed)  # noqa: E501

        :param seed: The seed of this TextToImageRequestBody.  # noqa: E501
        :type seed: int
        """
        if (self.local_vars_configuration.client_side_validation and
                seed is not None and seed > 2147483647):  # noqa: E501
            raise ValueError("Invalid value for `seed`, must be a value less than or equal to `2147483647`")  # noqa: E501
        if (self.local_vars_configuration.client_side_validation and
                seed is not None and seed < 0):  # noqa: E501
            raise ValueError("Invalid value for `seed`, must be a value greater than or equal to `0`")  # noqa: E501

        self._seed = seed

    @property
    def steps(self):
        """Gets the steps of this TextToImageRequestBody.  # noqa: E501

        Number of diffusion steps to run  # noqa: E501

        :return: The steps of this TextToImageRequestBody.  # noqa: E501
        :rtype: int
        """
        return self._steps

    @steps.setter
    def steps(self, steps):
        """Sets the steps of this TextToImageRequestBody.

        Number of diffusion steps to run  # noqa: E501

        :param steps: The steps of this TextToImageRequestBody.  # noqa: E501
        :type steps: int
        """
        if (self.local_vars_configuration.client_side_validation and
                steps is not None and steps > 150):  # noqa: E501
            raise ValueError("Invalid value for `steps`, must be a value less than or equal to `150`")  # noqa: E501
        if (self.local_vars_configuration.client_side_validation and
                steps is not None and steps < 10):  # noqa: E501
            raise ValueError("Invalid value for `steps`, must be a value greater than or equal to `10`")  # noqa: E501

        self._steps = steps

    @property
    def text_prompts(self):
        """Gets the text_prompts of this TextToImageRequestBody.  # noqa: E501


        :return: The text_prompts of this TextToImageRequestBody.  # noqa: E501
        :rtype: list[TextPrompt]
        """
        return self._text_prompts

    @text_prompts.setter
    def text_prompts(self, text_prompts):
        """Sets the text_prompts of this TextToImageRequestBody.


        :param text_prompts: The text_prompts of this TextToImageRequestBody.  # noqa: E501
        :type text_prompts: list[TextPrompt]
        """
        if self.local_vars_configuration.client_side_validation and text_prompts is None:  # noqa: E501
            raise ValueError("Invalid value for `text_prompts`, must not be `None`")  # noqa: E501
        if (self.local_vars_configuration.client_side_validation and
                text_prompts is not None and len(text_prompts) < 1):
            raise ValueError("Invalid value for `text_prompts`, number of items must be greater than or equal to `1`")  # noqa: E501

        self._text_prompts = text_prompts

    @property
    def width(self):
        """Gets the width of this TextToImageRequestBody.  # noqa: E501

        Width of the image (note: `height * width` must be <= 1 Megapixel)  # noqa: E501

        :return: The width of this TextToImageRequestBody.  # noqa: E501
        :rtype: int
        """
        return self._width

    @width.setter
    def width(self, width):
        """Sets the width of this TextToImageRequestBody.

        Width of the image (note: `height * width` must be <= 1 Megapixel)  # noqa: E501

        :param width: The width of this TextToImageRequestBody.  # noqa: E501
        :type width: int
        """
        if (self.local_vars_configuration.client_side_validation and
                width is not None and width > 2048):  # noqa: E501
            raise ValueError("Invalid value for `width`, must be a value less than or equal to `2048`")  # noqa: E501
        if (self.local_vars_configuration.client_side_validation and
                width is not None and width < 512):  # noqa: E501
            raise ValueError("Invalid value for `width`, must be a value greater than or equal to `512`")  # noqa: E501

        self._width = width

    def to_dict(self, serialize=False):
        """Returns the model properties as a dict"""
        result = {}

        def convert(x):
            if hasattr(x, "to_dict"):
                args = getfullargspec(x.to_dict).args
                if len(args) == 1:
                    return x.to_dict()
                else:
                    return x.to_dict(serialize)
            else:
                return x

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            attr = self.attribute_map.get(attr, attr) if serialize else attr
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: convert(x),
                    value
                ))
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], convert(item[1])),
                    value.items()
                ))
            else:
                result[attr] = convert(value)

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, TextToImageRequestBody):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, TextToImageRequestBody):
            return True

        return self.to_dict() != other.to_dict()
