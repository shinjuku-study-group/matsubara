package traitpractice

/**
 * Created by simezi on 2014/06/09.
 */
trait Agiler extends Engineer {
  println("trait Agiler constructor")

  abstract override def work(time: Int) {
    println("Agiler#work start")
    super.work(time / 2)
    println("Agiler#work end")
  }
}
