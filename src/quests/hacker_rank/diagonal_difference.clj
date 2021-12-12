(ns quests.hacker-rank.diagonal-difference)

(defn diagonalDifference [arr]
  (as-> (conj [] arr (mapv reverse arr)) data
        (map (fn [matrix]
               (apply +
                      (for [x (range (count arr))
                            y (range (count arr))
                            :when (= x y)]
                        (nth (nth matrix y) x)))) data)
        (sort > data)
        (apply - data)))
