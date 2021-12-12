(ns quests.hacker-rank.number-line-jumps)

(defn kangaroo [x1 v1 x2 v2]
  (if (and
        (> v1 v2)
        (= (rem (- x1 x2) (- v2 v1)) 0))
    "YES"
    "NO"))