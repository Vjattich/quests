(ns quests.hacker_rank.day_of_the_programmer_test
  (:require [clojure.test :refer :all]
            [quests.hacker_rank.day_of_the_programmer :refer :all]))

(deftest a-test
  (testing
    (is (= "26.09.1918" (dayOfProgrammer 1918)))
    (is (= "13.09.2017" (dayOfProgrammer 2017)))
    (is (= "13.09.1737" (dayOfProgrammer 1737)))
    (is (= "13.09.1758" (dayOfProgrammer 1758)))
    (is (= "12.09.1800" (dayOfProgrammer 1800)))
    (is (= "12.09.2016" (dayOfProgrammer 2016)))
    (is (= "12.09.1916" (dayOfProgrammer 1916)))
    (is (= "12.09.1836" (dayOfProgrammer 1836)))
    (is (= "12.09.1872" (dayOfProgrammer 1872)))
    ))