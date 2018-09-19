// Make a script that receive a sequence of words and return the number of
// characters that have the words in map format => (character, # of times that appear)
//
// e.g. ("hi", "good", "bye") => (e -> 1, y -> 1, i -> 1, b -> 1, g -> 1, h -> 1, o -> 2, d -> 1)

val mySeq = Seq("hi", "good", "bye")

println(
  mySeq.flatten
    .groupBy(identity)
    .mapValues(_.size)
)

// Order by value asc
println(
  mySeq.flatten
    .groupBy(identity)
    .mapValues(_.size)
    .toSeq
    .sortBy(_._2)
)

// Order by value desc
println(
  mySeq.flatten
    .groupBy(identity)
    .mapValues(_.size)
    .toSeq
    .sortWith(_._2 > _._2)
)
