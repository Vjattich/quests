(ns quests.clojure.hacker-rank.compare-the-triplets-test
  (:require [clojure.test :refer :all]
            [quests.clojure.hacker-rank.compare-the-triplets :refer :all]))

(deftest a-test
  (testing
    (is (= [2 1] (compareTriplets [17 28 30] [99 16 8])))
    (is (= [0 0] (compareTriplets [1 2 3] [1 2 3])))
    (is (= [0 3] (compareTriplets [6 8 12] [7 9 15])))))


(deftest a-test-1
  (testing
    (is (= [2 1] (compareTriplets-1 [17 28 30] [99 16 8])))
    (is (= [0 0] (compareTriplets-1 [1 2 3] [1 2 3])))
    (is (= [0 3] (compareTriplets-1 [6 8 12] [7 9 15])))))
