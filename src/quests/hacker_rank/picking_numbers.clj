(ns quests.hacker-rank.picking-numbers)

(defn pickingNumbers [a]
  (apply max (let [z (sort a)]
               (reduce (fn [coll x]
                         (conj coll (count (filter (fn [c] (or
                                                             (= -1 (- x c))
                                                             (= 0 (- x c)))) z)))) [] z))))