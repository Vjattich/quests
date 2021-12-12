(ns quests.hacker-rank.plus-minus-test
  (:require [clojure.test :refer :all]
            [quests.hacker-rank.plus-minus :refer :all]))

(deftest a-test
  (testing
    (is (= '("0.500000" "0.333333" "0.166667") (calculate [-4 3 -9 0 4 1])))
    (is (= '("0.400000" "0.200000" "0.400000") (calculate [0 0 -1 1 1])))
    (is (= '("0.428571" "0.571429" "0.000000") (calculate [1 -2 -7 9 1 -8 -5])))))