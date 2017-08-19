(ns leiningen.new.overtone
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "overtone"))

(defn overtone
  "Generate a new Leiningen project with Overtone as a dependency."
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)
              :namespace (str name ".core")
              :year "2016"}]
    (main/info "Generating fresh 'lein new' Overtone project.")
    (->files data
             ["src/{{sanitized}}/core.clj" (render "core.clj" data)]
             ["project.clj" (render "project.clj" data)]
             [".gitignore" (render ".gitignore" data)]
             ["README.md" (render "README.md" data)])))
