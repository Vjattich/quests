(ns quests.hacker_rank.migratory_birds_test
  (:require [clojure.test :refer :all]
            [quests.hacker_rank.migratory_birds :refer :all]))

(deftest a-test
  (testing
    (is (= 1 (migratoryBirds [1 1 2 2 3])))
    (is (= 4 (migratoryBirds [1 4 4 4 5 3])))
    (is (= 3 (migratoryBirds [1 2 3 4 5 4 3 2 1 3 4])))
    ))