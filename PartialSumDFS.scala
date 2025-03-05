object PartialSumDFS extends App {
  val a = Seq(3, 6, -5, 7)
  val n = a.length
  val k = 8

  // 深さ優先探索
  // index.数列を走査する添え字.partial.足すことが決定した数値たちのシーケンス
  // 戻り値:マッチしたかのboolとマッチ時のシーケンス
  def isMatchAndResult(index: Int, partial: Seq[Int]): (Boolean, Seq[Int]) = {
    // 終了時の判定
    if(index == n) {
      return if (partial.sum == k) (true, partial) else (false, Seq())
    }

    val (isMatchNotAdd, resultNotAdd) = isMatchAndResult(index + 1, partial)
    if (isMatchNotAdd) return (isMatchNotAdd, resultNotAdd)
  }

  // 分割代入
  val (isMatch, result) = isMatchAndResult(0, Seq())
  if (isMatch) println(s"Yes ${result}") else println("No")
}