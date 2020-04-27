(ns _core)

(defn main []
  (println "Main..."))

(defn reload
  "Attempt to reload code"
  []
  (use '_core :reload))