// Define a sequence of 5 numbers random between -10 and 10 and show first the
// positive numbers and then, the negative numbers

// Function to generate a random number between -10 and 10
def generateRandom(): Int = {
  val start = -10
  val end = 10
  val rnd = new scala.util.Random

  (start + rnd.nextInt((end - start) + 1))
}

println (
  Seq.fill(5){generateRandom}
    .sortWith(_ > _)
)
