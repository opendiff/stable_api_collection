# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: generation.proto

require 'google/protobuf'

require 'tensors_pb'

Google::Protobuf::DescriptorPool.generated_pool.build do
  add_file("generation.proto", :syntax => :proto3) do
    add_message "gooseai.Token" do
      proto3_optional :text, :string, 1, json_name: "text"
      optional :id, :uint32, 2, json_name: "id"
    end
    add_message "gooseai.Tokens" do
      repeated :tokens, :message, 1, "gooseai.Token", json_name: "tokens"
      proto3_optional :tokenizer_id, :string, 2, json_name: "tokenizerId"
    end
    add_message "gooseai.Artifact" do
      optional :id, :uint64, 1, json_name: "id"
      optional :type, :enum, 2, "gooseai.ArtifactType", json_name: "type"
      optional :mime, :string, 3, json_name: "mime"
      proto3_optional :magic, :string, 4, json_name: "magic"
      optional :index, :uint32, 8, json_name: "index"
      optional :finish_reason, :enum, 9, "gooseai.FinishReason", json_name: "finishReason"
      optional :seed, :uint32, 10, json_name: "seed"
      optional :uuid, :string, 12, json_name: "uuid"
      optional :size, :uint64, 13, json_name: "size"
      oneof :data do
        optional :binary, :bytes, 5, json_name: "binary"
        optional :text, :string, 6, json_name: "text"
        optional :tokens, :message, 7, "gooseai.Tokens", json_name: "tokens"
        optional :classifier, :message, 11, "gooseai.ClassifierParameters", json_name: "classifier"
        optional :tensor, :message, 14, "tensors.Tensor", json_name: "tensor"
      end
    end
    add_message "gooseai.PromptParameters" do
      proto3_optional :init, :bool, 1, json_name: "init"
      proto3_optional :weight, :float, 2, json_name: "weight"
    end
    add_message "gooseai.Prompt" do
      proto3_optional :parameters, :message, 1, "gooseai.PromptParameters", json_name: "parameters"
      oneof :prompt do
        optional :text, :string, 2, json_name: "text"
        optional :tokens, :message, 3, "gooseai.Tokens", json_name: "tokens"
        optional :artifact, :message, 4, "gooseai.Artifact", json_name: "artifact"
      end
    end
    add_message "gooseai.SamplerParameters" do
      proto3_optional :eta, :float, 1, json_name: "eta"
      proto3_optional :sampling_steps, :uint64, 2, json_name: "samplingSteps"
      proto3_optional :latent_channels, :uint64, 3, json_name: "latentChannels"
      proto3_optional :downsampling_factor, :uint64, 4, json_name: "downsamplingFactor"
      proto3_optional :cfg_scale, :float, 5, json_name: "cfgScale"
      proto3_optional :init_noise_scale, :float, 6, json_name: "initNoiseScale"
      proto3_optional :step_noise_scale, :float, 7, json_name: "stepNoiseScale"
    end
    add_message "gooseai.ConditionerParameters" do
      proto3_optional :vector_adjust_prior, :string, 1, json_name: "vectorAdjustPrior"
      proto3_optional :conditioner, :message, 2, "gooseai.Model", json_name: "conditioner"
    end
    add_message "gooseai.ScheduleParameters" do
      proto3_optional :start, :float, 1, json_name: "start"
      proto3_optional :end, :float, 2, json_name: "end"
      proto3_optional :value, :float, 3, json_name: "value"
    end
    add_message "gooseai.StepParameter" do
      optional :scaled_step, :float, 1, json_name: "scaledStep"
      proto3_optional :sampler, :message, 2, "gooseai.SamplerParameters", json_name: "sampler"
      proto3_optional :schedule, :message, 3, "gooseai.ScheduleParameters", json_name: "schedule"
      proto3_optional :guidance, :message, 4, "gooseai.GuidanceParameters", json_name: "guidance"
    end
    add_message "gooseai.Model" do
      optional :architecture, :enum, 1, "gooseai.ModelArchitecture", json_name: "architecture"
      optional :publisher, :string, 2, json_name: "publisher"
      optional :dataset, :string, 3, json_name: "dataset"
      optional :version, :float, 4, json_name: "version"
      optional :semantic_version, :string, 5, json_name: "semanticVersion"
      optional :alias, :string, 6, json_name: "alias"
    end
    add_message "gooseai.CutoutParameters" do
      repeated :cutouts, :message, 1, "gooseai.CutoutParameters", json_name: "cutouts"
      proto3_optional :count, :uint32, 2, json_name: "count"
      proto3_optional :gray, :float, 3, json_name: "gray"
      proto3_optional :blur, :float, 4, json_name: "blur"
      proto3_optional :size_power, :float, 5, json_name: "sizePower"
    end
    add_message "gooseai.GuidanceScheduleParameters" do
      optional :duration, :float, 1, json_name: "duration"
      optional :value, :float, 2, json_name: "value"
    end
    add_message "gooseai.GuidanceInstanceParameters" do
      repeated :models, :message, 2, "gooseai.Model", json_name: "models"
      proto3_optional :guidance_strength, :float, 3, json_name: "guidanceStrength"
      repeated :schedule, :message, 4, "gooseai.GuidanceScheduleParameters", json_name: "schedule"
      proto3_optional :cutouts, :message, 5, "gooseai.CutoutParameters", json_name: "cutouts"
      proto3_optional :prompt, :message, 6, "gooseai.Prompt", json_name: "prompt"
    end
    add_message "gooseai.GuidanceParameters" do
      optional :guidance_preset, :enum, 1, "gooseai.GuidancePreset", json_name: "guidancePreset"
      repeated :instances, :message, 2, "gooseai.GuidanceInstanceParameters", json_name: "instances"
    end
    add_message "gooseai.TransformType" do
      oneof :type do
        optional :diffusion, :enum, 1, "gooseai.DiffusionSampler", json_name: "diffusion"
        optional :upscaler, :enum, 2, "gooseai.Upscaler", json_name: "upscaler"
      end
    end
    add_message "gooseai.ImageParameters" do
      proto3_optional :height, :uint64, 1, json_name: "height"
      proto3_optional :width, :uint64, 2, json_name: "width"
      repeated :seed, :uint32, 3, json_name: "seed"
      proto3_optional :samples, :uint64, 4, json_name: "samples"
      proto3_optional :steps, :uint64, 5, json_name: "steps"
      proto3_optional :transform, :message, 6, "gooseai.TransformType", json_name: "transform"
      repeated :parameters, :message, 7, "gooseai.StepParameter", json_name: "parameters"
      proto3_optional :masked_area_init, :enum, 8, "gooseai.MaskedAreaInit", json_name: "maskedAreaInit"
      proto3_optional :weight_method, :enum, 9, "gooseai.WeightMethod", json_name: "weightMethod"
      proto3_optional :quantize, :bool, 10, json_name: "quantize"
    end
    add_message "gooseai.ClassifierConcept" do
      optional :concept, :string, 1, json_name: "concept"
      proto3_optional :threshold, :float, 2, json_name: "threshold"
    end
    add_message "gooseai.ClassifierCategory" do
      optional :name, :string, 1, json_name: "name"
      repeated :concepts, :message, 2, "gooseai.ClassifierConcept", json_name: "concepts"
      proto3_optional :adjustment, :float, 3, json_name: "adjustment"
      proto3_optional :action, :enum, 4, "gooseai.Action", json_name: "action"
      proto3_optional :classifier_mode, :enum, 5, "gooseai.ClassifierMode", json_name: "classifierMode"
    end
    add_message "gooseai.ClassifierParameters" do
      repeated :categories, :message, 1, "gooseai.ClassifierCategory", json_name: "categories"
      repeated :exceeds, :message, 2, "gooseai.ClassifierCategory", json_name: "exceeds"
      proto3_optional :realized_action, :enum, 3, "gooseai.Action", json_name: "realizedAction"
    end
    add_message "gooseai.AssetParameters" do
      optional :action, :enum, 1, "gooseai.AssetAction", json_name: "action"
      optional :project_id, :string, 2, json_name: "projectId"
      optional :use, :enum, 3, "gooseai.AssetUse", json_name: "use"
    end
    add_message "gooseai.AnswerMeta" do
      proto3_optional :gpu_id, :string, 1, json_name: "gpuId"
      proto3_optional :cpu_id, :string, 2, json_name: "cpuId"
      proto3_optional :node_id, :string, 3, json_name: "nodeId"
      proto3_optional :engine_id, :string, 4, json_name: "engineId"
    end
    add_message "gooseai.Answer" do
      optional :answer_id, :string, 1, json_name: "answerId"
      optional :request_id, :string, 2, json_name: "requestId"
      optional :received, :uint64, 3, json_name: "received"
      optional :created, :uint64, 4, json_name: "created"
      proto3_optional :meta, :message, 6, "gooseai.AnswerMeta", json_name: "meta"
      repeated :artifacts, :message, 7, "gooseai.Artifact", json_name: "artifacts"
    end
    add_message "gooseai.Request" do
      optional :engine_id, :string, 1, json_name: "engineId"
      optional :request_id, :string, 2, json_name: "requestId"
      optional :requested_type, :enum, 3, "gooseai.ArtifactType", json_name: "requestedType"
      repeated :prompt, :message, 4, "gooseai.Prompt", json_name: "prompt"
      proto3_optional :conditioner, :message, 6, "gooseai.ConditionerParameters", json_name: "conditioner"
      oneof :params do
        optional :image, :message, 5, "gooseai.ImageParameters", json_name: "image"
        optional :classifier, :message, 7, "gooseai.ClassifierParameters", json_name: "classifier"
        optional :asset, :message, 8, "gooseai.AssetParameters", json_name: "asset"
      end
    end
    add_message "gooseai.OnStatus" do
      repeated :reason, :enum, 1, "gooseai.FinishReason", json_name: "reason"
      proto3_optional :target, :string, 2, json_name: "target"
      repeated :action, :enum, 3, "gooseai.StageAction", json_name: "action"
    end
    add_message "gooseai.Stage" do
      optional :id, :string, 1, json_name: "id"
      optional :request, :message, 2, "gooseai.Request", json_name: "request"
      repeated :on_status, :message, 3, "gooseai.OnStatus", json_name: "onStatus"
    end
    add_message "gooseai.ChainRequest" do
      optional :request_id, :string, 1, json_name: "requestId"
      repeated :stage, :message, 2, "gooseai.Stage", json_name: "stage"
    end
    add_enum "gooseai.FinishReason" do
      value :NULL, 0
      value :LENGTH, 1
      value :STOP, 2
      value :ERROR, 3
      value :FILTER, 4
    end
    add_enum "gooseai.ArtifactType" do
      value :ARTIFACT_NONE, 0
      value :ARTIFACT_IMAGE, 1
      value :ARTIFACT_VIDEO, 2
      value :ARTIFACT_TEXT, 3
      value :ARTIFACT_TOKENS, 4
      value :ARTIFACT_EMBEDDING, 5
      value :ARTIFACT_CLASSIFICATIONS, 6
      value :ARTIFACT_MASK, 7
      value :ARTIFACT_LATENT, 8
      value :ARTIFACT_TENSOR, 9
    end
    add_enum "gooseai.MaskedAreaInit" do
      value :MASKED_AREA_INIT_ZERO, 0
      value :MASKED_AREA_INIT_RANDOM, 1
      value :MASKED_AREA_INIT_ORIGINAL, 2
    end
    add_enum "gooseai.WeightMethod" do
      value :TEXT_ENCODER, 0
      value :CROSS_ATTENTION, 1
    end
    add_enum "gooseai.DiffusionSampler" do
      value :SAMPLER_DDIM, 0
      value :SAMPLER_DDPM, 1
      value :SAMPLER_K_EULER, 2
      value :SAMPLER_K_EULER_ANCESTRAL, 3
      value :SAMPLER_K_HEUN, 4
      value :SAMPLER_K_DPM_2, 5
      value :SAMPLER_K_DPM_2_ANCESTRAL, 6
      value :SAMPLER_K_LMS, 7
      value :SAMPLER_K_DPMPP_2S_ANCESTRAL, 8
      value :SAMPLER_K_DPMPP_2M, 9
      value :SAMPLER_K_DPMPP_SDE, 10
    end
    add_enum "gooseai.Upscaler" do
      value :UPSCALER_RGB, 0
      value :UPSCALER_GFPGAN, 1
      value :UPSCALER_ESRGAN, 2
    end
    add_enum "gooseai.GuidancePreset" do
      value :GUIDANCE_PRESET_NONE, 0
      value :GUIDANCE_PRESET_SIMPLE, 1
      value :GUIDANCE_PRESET_FAST_BLUE, 2
      value :GUIDANCE_PRESET_FAST_GREEN, 3
      value :GUIDANCE_PRESET_SLOW, 4
      value :GUIDANCE_PRESET_SLOWER, 5
      value :GUIDANCE_PRESET_SLOWEST, 6
    end
    add_enum "gooseai.ModelArchitecture" do
      value :MODEL_ARCHITECTURE_NONE, 0
      value :MODEL_ARCHITECTURE_CLIP_VIT, 1
      value :MODEL_ARCHITECTURE_CLIP_RESNET, 2
      value :MODEL_ARCHITECTURE_LDM, 3
    end
    add_enum "gooseai.Action" do
      value :ACTION_PASSTHROUGH, 0
      value :ACTION_REGENERATE_DUPLICATE, 1
      value :ACTION_REGENERATE, 2
      value :ACTION_OBFUSCATE_DUPLICATE, 3
      value :ACTION_OBFUSCATE, 4
      value :ACTION_DISCARD, 5
    end
    add_enum "gooseai.ClassifierMode" do
      value :CLSFR_MODE_ZEROSHOT, 0
      value :CLSFR_MODE_MULTICLASS, 1
    end
    add_enum "gooseai.AssetAction" do
      value :ASSET_PUT, 0
      value :ASSET_GET, 1
      value :ASSET_DELETE, 2
    end
    add_enum "gooseai.AssetUse" do
      value :ASSET_USE_UNDEFINED, 0
      value :ASSET_USE_INPUT, 1
      value :ASSET_USE_OUTPUT, 2
      value :ASSET_USE_INTERMEDIATE, 3
      value :ASSET_USE_PROJECT, 4
    end
    add_enum "gooseai.StageAction" do
      value :STAGE_ACTION_PASS, 0
      value :STAGE_ACTION_DISCARD, 1
      value :STAGE_ACTION_RETURN, 2
    end
  end
end

module Gooseai
  Token = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.Token").msgclass
  Tokens = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.Tokens").msgclass
  Artifact = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.Artifact").msgclass
  PromptParameters = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.PromptParameters").msgclass
  Prompt = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.Prompt").msgclass
  SamplerParameters = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.SamplerParameters").msgclass
  ConditionerParameters = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.ConditionerParameters").msgclass
  ScheduleParameters = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.ScheduleParameters").msgclass
  StepParameter = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.StepParameter").msgclass
  Model = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.Model").msgclass
  CutoutParameters = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.CutoutParameters").msgclass
  GuidanceScheduleParameters = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.GuidanceScheduleParameters").msgclass
  GuidanceInstanceParameters = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.GuidanceInstanceParameters").msgclass
  GuidanceParameters = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.GuidanceParameters").msgclass
  TransformType = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.TransformType").msgclass
  ImageParameters = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.ImageParameters").msgclass
  ClassifierConcept = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.ClassifierConcept").msgclass
  ClassifierCategory = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.ClassifierCategory").msgclass
  ClassifierParameters = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.ClassifierParameters").msgclass
  AssetParameters = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.AssetParameters").msgclass
  AnswerMeta = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.AnswerMeta").msgclass
  Answer = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.Answer").msgclass
  Request = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.Request").msgclass
  OnStatus = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.OnStatus").msgclass
  Stage = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.Stage").msgclass
  ChainRequest = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.ChainRequest").msgclass
  FinishReason = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.FinishReason").enummodule
  ArtifactType = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.ArtifactType").enummodule
  MaskedAreaInit = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.MaskedAreaInit").enummodule
  WeightMethod = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.WeightMethod").enummodule
  DiffusionSampler = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.DiffusionSampler").enummodule
  Upscaler = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.Upscaler").enummodule
  GuidancePreset = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.GuidancePreset").enummodule
  ModelArchitecture = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.ModelArchitecture").enummodule
  Action = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.Action").enummodule
  ClassifierMode = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.ClassifierMode").enummodule
  AssetAction = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.AssetAction").enummodule
  AssetUse = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.AssetUse").enummodule
  StageAction = ::Google::Protobuf::DescriptorPool.generated_pool.lookup("gooseai.StageAction").enummodule
end
