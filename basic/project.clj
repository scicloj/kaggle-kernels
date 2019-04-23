(defproject basic "0.1"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [techascent/tech.ml "0.27"]]
  :repl-options {:init-ns basic.core}
  :plugins [[lein-jupyter "0.1.16"]])
