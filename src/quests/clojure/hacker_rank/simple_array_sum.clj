(ns quests.clojure.hacker-rank.simple-array-sum)

(defn simpleArraySum [ar]
  (reduce + ar))

(defn -main []
  (println (simpleArraySum [1 2 3])))