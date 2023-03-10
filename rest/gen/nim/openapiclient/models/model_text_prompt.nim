#
# Stability.ai REST API
# 
# Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
# The version of the OpenAPI document: 0.1
# Contact: info@stability.ai
# Generated by: https://openapi-generator.tech
#

import json
import tables


type TextPrompt* = object
  ## Text prompt for image generation
  text*: string
  weight*: float ## Weight of the prompt (use negative numbers for negative prompts)
