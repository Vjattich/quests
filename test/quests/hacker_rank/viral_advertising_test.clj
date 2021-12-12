(ns quests.hacker-rank.viral-advertising-test
  (:require [clojure.test :refer :all]
            [quests.hacker-rank.viral-advertising :refer :all]))

(deftest a-test
  (testing
    (is (= 2 (viralAdvertising 1)))
    (is (= 5 (viralAdvertising 2)))
    (is (= 9 (viralAdvertising 3)))
    (is (= 24 (viralAdvertising 5)))))