(ns quests.clojure.hacker-rank.jumping-on-the-clouds-test
  (:require [clojure.test :refer :all]
            [quests.clojure.hacker-rank.jumping-on-the-clouds :refer :all]))

(deftest a-test
  (testing
    (is (= 3 (jumpingOnClouds [0 0 0 0 1 0])))
    (is (= 4 (jumpingOnClouds [0 0 1 0 0 1 0])))))