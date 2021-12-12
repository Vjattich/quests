(ns quests.hacker-rank.drawing-book-test
  (:require [clojure.test :refer :all]
            [quests.hacker-rank.drawing-book :refer :all]))

(deftest a-test
  (testing
    #_(is (= 1 (pageCount 6 2)))
    #_(is (= 1 (pageCount 6 4)))
    #_(is (= 1 (pageCount 6 5)))
    (is (= 1 (pageCount 6 3)))
    #_(is (= 0 (pageCount 2 1)))
    #_(is (= 0 (pageCount 5 4)))
    ))