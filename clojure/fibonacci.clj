(defn fibonacci [n]
  (println "Computing fibonacci(" n ")")
  (if (< n 2)
    n
    (+ (fibonacci (- n 1)) (fibonacci (- n 2)))))

(println (fibonacci 5))
