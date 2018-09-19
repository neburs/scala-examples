// Implement a script that show by console the numbers from x^2 (10 for example)
// to 1^2 (recursively)

def task_3(x: Int): Unit = {
  if (1 >= x) println(x*x)
  else {
    println(x*x)
    task_3(x-1)
  }
}

task_3(10)
