(ns project.core-test
  (:require [midje.sweet :refer :all]
            [project.core :refer :all]))

    (fact
      (create-movie 1 "Inception" "Christopher Nolan" 2010 ["Sci-Fi" "Thriller"])
      => {:id 1
          :title "Inception"
          :director "Christopher Nolan"
          :release-year 2010
          :genres ["Sci-Fi" "Thriller"]})

    (fact
      (create-movie 2 "Titanic" "James Cameron" 1997 [])
      => {:id 2
          :title "Titanic"
          :director "James Cameron"
          :release-year 1997
          :genres []})


    (fact
      (create-log 1 10 5 5 "Odlican film!" "2026-10-01")
      => {:id 1
          :movie-id 10
          :user-id 5
          :rating 5
          :review "Odlican film!"
          :watched-date "2026-10-01"})

    (fact
      (create-log 2 11 6 4 nil "2026-10-02")
      => {:id 2
          :movie-id 11
          :user-id 6
          :rating 4
          :review nil
          :watched-date "2026-10-02"})


    (fact
      (average-rating [{:rating 4} {:rating 5} {:rating 3}])
      => 4.0)

    (fact
      (average-rating [{:rating 5} {:rating 5} {:rating 5}])
      => 5.0)

    (fact
      (average-rating [{:rating 4}])
      => 4.0)

    (fact
      (average-rating [])
      => 0.0)


    (fact
      (highly-rated? {:rating 4.5})
      => true)

    (fact
      (highly-rated? {:rating 4.0})
      => true)

    (fact
      (highly-rated? {:rating 3.5})
      => false)

    (fact
      (highly-rated? {:rating 2.0})
      => false)
