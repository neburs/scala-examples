// Create a script that show by console the numbers from X (10 for example)
// to 1 (using recursivity)

def showNumber(x: Int): Unit = {
  if (1 >= x) println(x)
  else {
    println(x)
    showNumber(x-1)
  }
}

showNumber(10)
