(ns quests.clojure.hacker-rank.counting-valleys-test
  (:require [clojure.test :refer :all]
            [quests.clojure.hacker-rank.counting-valleys :refer :all]))

(deftest a-test
  (testing
    (is (= 1 (countingValleys 8 "UDDDUDUU")))
    (is (= 2 (countingValleys 12 "DDUUDDUDUUUD")))
    (is (= 0 (countingValleys 10 "UDUUUDUDDD")))
    ))