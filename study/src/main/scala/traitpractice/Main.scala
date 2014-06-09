package traitpractice

/**
 * Created by simezi on 2014/06/09.
 */
object Main {
  def main(args: Array[String]) {
    val person = new Person("simezi") with Programmer
    person.work(100)

    val agiler = new Person("simezi2") with Programmer with Agiler
    agiler.work(100)

    val agiler2 = new Person("simezi3") with Agiler with Programmer
    agiler2.work(100)
  }
}
