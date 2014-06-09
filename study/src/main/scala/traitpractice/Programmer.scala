package traitpractice

/**
 * Created by simezi on 2014/06/09.
 */
trait Programmer extends Engineer {
  println("trait Programmer constructor")

  abstract override def work(time: Int) {
    println("Programmer#work Start")
    super.work(time - 15)
    println("Programmer#work end")
  }
}
