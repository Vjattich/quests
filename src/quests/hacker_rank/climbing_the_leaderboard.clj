(ns quests.hacker-rank.climbing-the-leaderboard)

#_(Collections/binarySearch coll element comp)
(defn clojure-binary-search [coll element comp]
  (loop [low 0
         high (dec (count coll))]
    (if-not (> low high)
      (let [mid (unsigned-bit-shift-right (+ low high) 1)
            midVal (coll mid)
            i (comp midVal element)]
        (cond
          (> 0 i) (recur (inc mid) high)
          (< 0 i) (recur low (dec mid))
          (zero? i) mid))
      (- (inc low)))))


(defn climbingLeaderboard [scores alice]
  (let [reverse-compare #(* -1 (compare %1 %2))
        uniq (vec (sort reverse-compare (into #{} scores)))]
    (map (fn [a]
           (let [i (clojure-binary-search uniq a reverse-compare)]
             (if (neg? i) (* -1 i) (inc i)))) alice)))