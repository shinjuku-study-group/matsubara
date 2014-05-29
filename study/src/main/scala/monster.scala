/**
 * Created by simezi on 2014/05/17.
 */
object monster {
  def main(args: Array[String]) {
    println(func(1000))
  }

  def func(mons: Int): Double = {
    import Math.pow
    /*モンスターが奇数の場合生存不可*/
    if (mons % 2 == 1) 0.0
    /*モンスターがいなくなれば生存*/
    else if (mons == 0) 1.0
    /*モンスターが二匹いなくなるパターンのみを追求*/
    else pow(mons, 2) / pow(mons + 1, 2) * func(mons - 2)
  }
}
