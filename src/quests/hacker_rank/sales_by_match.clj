(ns quests.hacker-rank.sales-by-match)

(defn sockMerchant [n ar]
  (reduce-kv (fn [count k v]
               (if (odd? v)
                 (+ count (/ (dec v) 2))
                 (+ count (/ v 2)))) 0 (frequencies ar)))
