(ns quests.hacker-rank.jumping-on-clouds-test
  (:require [clojure.test :refer :all]
            [quests.hacker-rank.jumping-on-clouds :refer :all]))

(deftest a-test
  (testing
    (is (= 92 (jumpingOnClouds [0 0 1 0 0 1 1 0] 2)))
    (is (= 80 (jumpingOnClouds [1 1 1 0 1 1 0 0 0 0] 3)))
    (is (= 96 (jumpingOnClouds [0 0 1 0] 2)))
    ))