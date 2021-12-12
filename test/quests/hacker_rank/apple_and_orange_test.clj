(ns quests.hacker-rank.apple_and_orange_test
  (:require [clojure.test :refer :all]
            [quests.hacker-rank.apple-and-orange :refer :all]))

(deftest a-test
  (testing
    (is (= [1 1] (find-fruits 7 11 5 15 [-2 2 1] [5 -6])))))