(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [overtone "0.10.1"]]
  :main ^:skip-aot {{namespace}}
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
