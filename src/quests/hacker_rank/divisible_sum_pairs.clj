(ns quests.hacker-rank.divisible-sum-pairs)

(defn divisibleSumPairs [coll-length match coll]
  (count
    (filter (fn [x] (zero? (mod x match))) (for [x (range coll-length)
                                                 y (range coll-length)
                                                 :while (< y x)]
                                             (+ (coll x) (coll y))))))
