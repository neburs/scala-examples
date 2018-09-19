// Create a script that receive two sequences of words and return other
// sequence with the common elements in both sequences.
//
// e.g. ("hi", "bye"),("hi", "two", "bye") => ("hi", "bye")

val mySeq1 = Seq("hi", "bye", "hi")
val mySeq2 = Seq("hi", "two", "bye", "four")

println (
  mySeq1.intersect(mySeq2)
    .distinct // remove duplicates
)
