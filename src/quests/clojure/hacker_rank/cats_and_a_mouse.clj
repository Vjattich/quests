(ns quests.clojure.hacker-rank.cats-and-a-mouse)

(defn catAndMouse [cat-a cat-b mouse-c]
  (let [a (- mouse-c cat-a)
        b (- mouse-c cat-b)
        a-abs (max a (- a))
        b-abs (max b (- b))]
    (if (= a-abs b-abs)
      "Mouse C"
      (get {a-abs "Cat A"
            b-abs "Cat B"} (min a-abs b-abs)))))