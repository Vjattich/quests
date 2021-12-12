(ns quests.hacker-rank.utopian-tree)

(defn utopianTree [n]
  (last (take (inc n) (iterate (fn [x] (if (odd? x) (* 2 x) (inc x))) 1))))

