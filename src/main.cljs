(ns main
  (:require ["fs" :as fs]
            ["yang-js" :as yang]))

(println (fs/readFileSync "README.md" "utf8"))

(defn main []
  (println "hello world"))
