(ns quests.clojure.hacker_rank.day_of_the_programmer)

(defn is-leap-in-russia? [y]
  (cond
    (<= 1700 y 1918) (zero? (rem y 4))
    (<= 1919 2700) (or (zero? (rem y 400)) (and (zero? (rem y 4)) (not (zero? (rem y 100)))))))

(defn dayOfProgrammer [year]
  (cond
    (= year 1918) "26.09.1918"
    (is-leap-in-russia? year) (str "12.09." year)
    :else (str "13.09." year)))