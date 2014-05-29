/**
 * Created by simezi on 2014/05/17.
 */
object monster {
  def main(args: Array[String]) {
    println(func(6, 5))
  }

  def func(mons: Int, rabbit: Int): Double = {
    println(mons)
    //モンスターが奇数の場合生存不可
    if (mons % 2 == 1) {
      return 0.0
    }
    if (mons == 0) 1.0
    else ((mons * mons) / Math.pow(1 + mons, 2)) * func(mons - 2, rabbit)
  }
}
