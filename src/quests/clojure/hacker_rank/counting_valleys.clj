(ns quests.clojure.hacker-rank.counting-valleys)

(defn countingValleys [steps path]
  (:valley
    (reduce (fn [map y]
              (let [lvl (:lvl map)
                    next (+ lvl y)]
                (if (and (> 0 lvl) (= next 0))
                  (assoc map :lvl next
                             :valley (inc (:valley map)))
                  (assoc map :lvl next))))
            {:lvl 0 :valley 0}
            (map (fn [x] (if (= x \U) 1 -1)) path))))
