(ns quests.clojure.hacker-rank.angry-professor-test
  (:require [clojure.test :refer :all]
            [quests.clojure.hacker-rank.angry-professor :refer :all]))

(deftest a-test
  (testing
    (is (= "YES" (angryProfessor 3 [-1 -3 4 2])))
    (is (= "NO" (angryProfessor 2 [0 -1 2 1])))
    ))