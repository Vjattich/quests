(ns quests.clojure.hacker-rank.between-two-sets)

(defn getTotalX [a b]
  (count
    (filter
      (fn [range-num]
        (and
          (every? (fn [a-num] (= (rem range-num a-num) 0)) a)
          (every? (fn [b-num] (= (rem b-num range-num) 0)) b)))
      (range (apply max a) (inc (apply min b))))))
