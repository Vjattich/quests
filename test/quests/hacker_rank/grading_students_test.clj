(ns quests.hacker-rank.grading_students_test
  (:require [clojure.test :refer :all]
            [quests.hacker-rank.grading-students :refer :all]))

(deftest a-test
  (testing
    (is (= [75 67 40 33] (gradingStudents [73 67 38 33])))))