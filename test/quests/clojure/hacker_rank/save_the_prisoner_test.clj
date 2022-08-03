(ns quests.clojure.hacker-rank.save-the-prisoner-test
  (:require [clojure.test :refer :all]
            [quests.clojure.hacker-rank.save-the-prisoner :refer :all]))

(deftest a-test
  (testing
    (is (= 2 (saveThePrisoner 5 2 1)))
    (is (= 3 (saveThePrisoner 5 2 2)))
    (is (= 6 (saveThePrisoner 7 19 2)))
    (is (= 3 (saveThePrisoner 3 7 3)))
    (is (= 20809 (saveThePrisoner 46934 543563655 46743)))
    ))