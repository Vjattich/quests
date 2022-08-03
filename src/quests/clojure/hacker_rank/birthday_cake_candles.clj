(ns quests.clojure.hacker-rank.birthday-cake-candles)

(defn birthdayCakeCandles [candles]
  (count (filter (partial = (apply max candles)) candles)))
