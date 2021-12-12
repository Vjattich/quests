(ns quests.hacker-rank.the-hurdle-race)

(defn hurdleRace [k height]
  (- (min (- k (apply max height)) 0)))