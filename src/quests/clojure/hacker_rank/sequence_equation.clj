(ns quests.clojure.hacker-rank.sequence-equation)

(defn permutationEquation [p]
  (let [coll (reduce-kv (fn [coll k v]
                          (assoc coll v (inc k))) {} p)]
    (map (fn [x] (get coll (get coll x))) (range 1 (inc (count p))))))