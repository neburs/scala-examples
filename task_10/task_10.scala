// Make a script that receives a sequence of characters and intersperses the
// same letter afterwards (uppercase if it was lowercase or otherwise)
//
// e.g. ('a','b','c','D') => ("aA","bB","cC","Dd")

def sec = 'a' :: 'b' :: 'c' :: 'D' :: Nil

def swapChars(c:Char): String = {
  val newChar = if(c.isUpper) c.toLower else c.toUpper
  s"$c$newChar"
}

println (
  sec.map(swapChars(_))
)
