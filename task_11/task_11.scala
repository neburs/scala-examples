// Implement the function replace(list,value1,value2) that return a list
// replaced on appears of value1 by value2 in list, using acumulative recursivity

def sec = "anybody" :: "knows" :: "who" :: "is" :: "it?" :: Nil

def replaceItems(list: List[String], value1: String, value2: String): List[String] = {
  list match {
    case Nil => Nil
    case h::tail => h.replace(value1, value2) :: replaceItems(tail, value1, value2)
  }
}

println(
  replaceItems(sec, "who", "how")
)


// Other way

def replaceItemsV2(list: List[String], value1: String, value2: String): List[String] = {
  list match {
    case Nil => Nil
    case h::tail =>
      if (h == value1)
        value2 :: replaceItems(tail, value1, value2)
      else
        h :: replaceItems(tail, value1, value2)
  }
}

println(
  replaceItemsV2(sec, "who", "how")
)
