(ns quests.clojure.hacker-rank.organizing-containers)

(defn sum-rows [matrix]
  (mapv #(reduce + 0 %1) matrix))

(defn container-swap [container]
  (let [matrix container
        row-sums (sum-rows matrix)
        reverse-matrix (apply (partial mapv (fn [& args] (vec args))) container)
        col-sums (sum-rows reverse-matrix)]
    #_(println (newline))
    #_(println container)
    #_(println row-sums col-sums)
    #_(println (frequencies row-sums) (frequencies col-sums))
    (= (frequencies row-sums) (frequencies col-sums))))

(defn organizingContainers [container]
  (if (container-swap container)
    "Possible"
    "Impossible"))
