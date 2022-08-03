(ns quests.clojure.hacker-rank.time_conversion)

(defn timeConversion [s]
  (as-> s date
        (java.time.LocalTime/parse date (java.time.format.DateTimeFormatter/ofPattern "hh:mm:ssa"))
        (.format date (java.time.format.DateTimeFormatter/ofPattern "HH:mm:ss"))))

