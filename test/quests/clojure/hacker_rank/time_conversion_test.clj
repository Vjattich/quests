(ns quests.clojure.hacker-rank.time_conversion_test
  (:require [clojure.test :refer :all]
            [quests.clojure.hacker-rank.time_conversion :refer :all]))

(deftest a-test
  (testing
    (is (= "19:05:45" (timeConversion "07:05:45PM")))
    (is (= "00:00:00" (timeConversion "12:00:00AM")))))