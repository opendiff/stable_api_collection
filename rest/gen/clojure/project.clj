(defproject stability/ai-rest-api "0.1"
  :description "Welcome to the Stability.ai REST API developer preview!

Please note, this is an alpha version of our new REST API, and is subject to change according to
your feedback.

Feedback during this test is crucial for us to understand what the pain points are and how we can
improve it going forward.

Changes will be communicated here, as well as on our online REST API documentation, which can be
found at: https://api.stability.ai/docs

Your DreamStudio API key will be required for authentication. You can learn more about API keys
here: https://platform.stability.ai/docs/getting-started/authentication

If you encounter any issues, please let us know in the #API discord channel:
https://discord.gg/stablediffusion"
  :url "https://stability.ai/"
  :license {:name "closed source"
            :url "https://stability.ai/terms-of-use"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [metosin/spec-tools "0.7.0"]
                 [clj-http "3.8.0"]
                 [orchestra "2017.11.12-1"]
                 [cheshire "5.8.0"]])