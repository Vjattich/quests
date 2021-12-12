(ns quests.hacker-rank.save-the-prisoner)

(defn saveThePrisoner [n m s]
  (let [x (rem (dec (+ s m)) n)]
    (if (< 0 x)
      x
      n)))