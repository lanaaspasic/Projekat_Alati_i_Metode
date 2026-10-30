(ns project.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

  (defn create-movie
    [id title director release-year genres]
    {:id id
     :title title
     :director director
     :release-year release-year
     :genres genres})

   (defn create-log
     [log-id movie-id user-id rating review watched-date]
     {:id log-id
      :movie-id movie-id
      :user-id user-id
      :rating rating
      :review review
      :watched-date watched-date})

   (defn average-rating
     [logs]
     (if (empty? logs)
       0.0
       (double (/ (reduce + (map :rating logs))
                  (count logs)))))

(defn highly-rated?
  [{:keys [rating]}]
  (if (>= rating 4.0)
    true
    false))