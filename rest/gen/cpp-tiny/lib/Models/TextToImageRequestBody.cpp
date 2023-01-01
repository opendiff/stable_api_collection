

#include "TextToImageRequestBody.h"

using namespace Tiny;

TextToImageRequestBody::TextToImageRequestBody()
{
	cfg_scale = float(0);
	clip_guidance_preset = std::string();
	height = int(0);
	sampler = std::string();
	samples = int(0);
	seed = int(0);
	steps = int(0);
	text_prompts = std::list<TextPrompt>();
	width = int(0);
}

TextToImageRequestBody::TextToImageRequestBody(std::string jsonString)
{
	this->fromJson(jsonString);
}

TextToImageRequestBody::~TextToImageRequestBody()
{

}

void
TextToImageRequestBody::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cfg_scaleKey = "cfg_scale";

    if(object.has_key(cfg_scaleKey))
    {
        bourne::json value = object[cfg_scaleKey];



        jsonToValue(&cfg_scale, value, "long");


    }

    const char *clip_guidance_presetKey = "clip_guidance_preset";

    if(object.has_key(clip_guidance_presetKey))
    {
        bourne::json value = object[clip_guidance_presetKey];



        jsonToValue(&clip_guidance_preset, value, "std::string");


    }

    const char *heightKey = "height";

    if(object.has_key(heightKey))
    {
        bourne::json value = object[heightKey];



        jsonToValue(&height, value, "int");


    }

    const char *samplerKey = "sampler";

    if(object.has_key(samplerKey))
    {
        bourne::json value = object[samplerKey];



        jsonToValue(&sampler, value, "std::string");


    }

    const char *samplesKey = "samples";

    if(object.has_key(samplesKey))
    {
        bourne::json value = object[samplesKey];



        jsonToValue(&samples, value, "int");


    }

    const char *seedKey = "seed";

    if(object.has_key(seedKey))
    {
        bourne::json value = object[seedKey];



        jsonToValue(&seed, value, "int");


    }

    const char *stepsKey = "steps";

    if(object.has_key(stepsKey))
    {
        bourne::json value = object[stepsKey];



        jsonToValue(&steps, value, "int");


    }

    const char *text_promptsKey = "text_prompts";

    if(object.has_key(text_promptsKey))
    {
        bourne::json value = object[text_promptsKey];


        std::list<TextPrompt> text_prompts_list;
        TextPrompt element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            text_prompts_list.push_back(element);
        }
        text_prompts = text_prompts_list;


    }

    const char *widthKey = "width";

    if(object.has_key(widthKey))
    {
        bourne::json value = object[widthKey];



        jsonToValue(&width, value, "int");


    }


}

bourne::json
TextToImageRequestBody::toJson()
{
    bourne::json object = bourne::json::object();





    object["cfg_scale"] = getCfgScale();






    object["clip_guidance_preset"] = getClipGuidancePreset();






    object["height"] = getHeight();






    object["sampler"] = getSampler();






    object["samples"] = getSamples();






    object["seed"] = getSeed();






    object["steps"] = getSteps();





    std::list<TextPrompt> text_prompts_list = getTextPrompts();
    bourne::json text_prompts_arr = bourne::json::array();

    for(auto& var : text_prompts_list)
    {
        TextPrompt obj = var;
        text_prompts_arr.append(obj.toJson());
    }
    object["text_prompts"] = text_prompts_arr;







    object["width"] = getWidth();



    return object;

}

long
TextToImageRequestBody::getCfgScale()
{
	return cfg_scale;
}

void
TextToImageRequestBody::setCfgScale(long  cfg_scale)
{
	this->cfg_scale = cfg_scale;
}

std::string
TextToImageRequestBody::getClipGuidancePreset()
{
	return clip_guidance_preset;
}

void
TextToImageRequestBody::setClipGuidancePreset(std::string  clip_guidance_preset)
{
	this->clip_guidance_preset = clip_guidance_preset;
}

int
TextToImageRequestBody::getHeight()
{
	return height;
}

void
TextToImageRequestBody::setHeight(int  height)
{
	this->height = height;
}

std::string
TextToImageRequestBody::getSampler()
{
	return sampler;
}

void
TextToImageRequestBody::setSampler(std::string  sampler)
{
	this->sampler = sampler;
}

int
TextToImageRequestBody::getSamples()
{
	return samples;
}

void
TextToImageRequestBody::setSamples(int  samples)
{
	this->samples = samples;
}

int
TextToImageRequestBody::getSeed()
{
	return seed;
}

void
TextToImageRequestBody::setSeed(int  seed)
{
	this->seed = seed;
}

int
TextToImageRequestBody::getSteps()
{
	return steps;
}

void
TextToImageRequestBody::setSteps(int  steps)
{
	this->steps = steps;
}

std::list<TextPrompt>
TextToImageRequestBody::getTextPrompts()
{
	return text_prompts;
}

void
TextToImageRequestBody::setTextPrompts(std::list <TextPrompt> text_prompts)
{
	this->text_prompts = text_prompts;
}

int
TextToImageRequestBody::getWidth()
{
	return width;
}

void
TextToImageRequestBody::setWidth(int  width)
{
	this->width = width;
}



