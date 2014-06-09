package traitpractice

/**
 * Created by simezi on 2014/06/09.
 */
class Person(val name: String) extends Engineer {
  override def work(time: Int) {
    println("Person#work start")
    println("一つのタスクを" + time + "分で行います")
    println("Person#work end")
  }
}
