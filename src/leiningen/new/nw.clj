(ns leiningen.new.nw
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "nw"))

(defn nw
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' nw project.")
    (->files data
      ["package.json" (render "package.json" data)]
      ["project.clj" (render "project.clj" data)]
      ["src/{{sanitized}}/core.cljs" (render "core.cljs" data)]
      ["dev/user.clj" (render "user.clj" data)]
      ["resources/public/index.html" (render "index.html" data)])))
