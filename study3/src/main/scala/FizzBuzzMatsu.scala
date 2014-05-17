/**
 * Created by simezi on 2014/05/10.
 */
object FizzBuzzMatsu {
  def main(args: Array[String]) {
    def checker(divider: Int)(value: Int) = value % divider == 0
    val checker3 = checker(3) _
    val checker5 = checker(5) _
    val checker15 = checker(15) _

    val str = for (i <- 1 to 50) yield {
      if (checker15(i)) " fizzBuzz "
      else if (checker3(i)) " fizz "
      else if (checker5(i)) " buzz "
      else i
    }

    println(str.mkString)
  }
}
