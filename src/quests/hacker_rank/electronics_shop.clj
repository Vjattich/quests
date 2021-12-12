(ns quests.hacker-rank.electronics-shop)


(defn getMoneySpent [keyboards drives b]
  (as-> (for [x (filter (partial > b) keyboards)
              y (filter (partial > b) drives)
              :when (<= (+ x y) b)]
          (+ x y)) data
        (conj data -1)
        (apply max data)))