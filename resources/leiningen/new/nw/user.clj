(ns user
  (:require [figwheel-sidecar.repl-api]))

(defn dev [] (figwheel-sidecar.repl-api/cljs-repl))
