// Create a script that remove from a sequence the elements multiples of 3

val sec = 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: 7 :: 8 :: 9 :: 10 :: Nil

println (
  sec.filter(_ % 3 != 0)
)
