(ns quests.clojure.hacker-rank.mini-max-sum)

(defn calculateMiniMaxSum [arr]
  (if (apply = arr)
    (repeat 2 (reduce + (rest arr)))
    (map (fn [func]
           (reduce + (remove (partial = (apply func arr)) arr))) [max min])))

(defn miniMaxSum [arr]
  (apply println (calculateMiniMaxSum arr)))
