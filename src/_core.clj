(ns _core)
(defn reload
	"Attempt to reload code"
	[]
	(use '_core :reload))

(defn main []
	(println "Main..."))

(defn thing []
	(def a (repeat 3 (into [] [0 0 0])))
	(println a)
)