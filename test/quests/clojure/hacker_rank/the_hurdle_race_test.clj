(ns quests.clojure.hacker-rank.the-hurdle-race-test
  (:require [clojure.test :refer :all]
            [quests.clojure.hacker-rank.the-hurdle-race :refer :all]))

(deftest a-test
  (testing
    (is (= 0 (hurdleRace 7 [2 5 4 5 2])))
    (is (= 2 (hurdleRace 4 [1 6 3 5 2])))))