// Count the number of elements of a sequence that have duplicate elements
// and show a map of values (element, # of duplicate elements)
//
// e.g. (1,2,3,2,2,1) -> (1->2,2->3)


val sec = 1 :: 2 :: 3 :: 2 :: 2 :: 1 :: Nil

println (
  sec.groupBy(identity)
    .mapValues(_.size)
    .filter{ case (k,v) => v > 1 }
)


// Other way

println (
  sec.groupBy(identity)
    .map {
      case (k, v) => (k, v.size)
    }.
    filter(_._2 > 1)
)
