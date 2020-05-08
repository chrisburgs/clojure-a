(ns _core)
(defn reload
	"Attempt to reload code"
	[]
	(use '_core :reload))

(defn main []
	(println "Main...")
)



(defn thing [x y]
	(def board (repeat x (repeat y (concat [0]))))
	(println board)
)
