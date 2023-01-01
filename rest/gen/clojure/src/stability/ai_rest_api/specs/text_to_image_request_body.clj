(ns stability/ai-rest-api.specs.text-to-image-request-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [stability/ai-rest-api.specs.text-prompt :refer :all]
            )
  (:import (java.io File)))


(def text-to-image-request-body-data
  {
   (ds/opt :cfg_scale) float?
   (ds/opt :clip_guidance_preset) string?
   (ds/opt :height) int?
   (ds/opt :sampler) string?
   (ds/opt :samples) int?
   (ds/opt :seed) int?
   (ds/opt :steps) int?
   (ds/req :text_prompts) (s/coll-of text-prompt-spec)
   (ds/opt :width) int?
   })

(def text-to-image-request-body-spec
  (ds/spec
    {:name ::text-to-image-request-body
     :spec text-to-image-request-body-data}))
