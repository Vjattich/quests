(ns quests.clojure.hacker-rank.grading-students)

(defn professor-sam-round [num]
  (let [reminder (rem num 5)]
    (if-not (< (+ reminder num) 40)
      (let [rounded (+ num (- 5 reminder))]
        (if (> 3 (- rounded num)) rounded num))
      num)))

(defn gradingStudents [grades]
  (mapv professor-sam-round grades))
