(ns quests.clojure.hacker-rank.angry-professor)

(defn angryProfessor [k a]
  (if (<= k (count (filter (partial >= 0) a)))
    "NO"
    "YES"))