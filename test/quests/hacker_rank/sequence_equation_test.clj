(ns quests.hacker-rank.sequence-equation-test
  (:require [clojure.test :refer :all]
            [quests.hacker-rank.sequence-equation :refer :all]))

(deftest a-test
  (testing
    (is (= [2 3 1] (permutationEquation [2 3 1])))
    (is (= [1 3 5 4 2] (permutationEquation [4 3 5 1 2])))
    ))