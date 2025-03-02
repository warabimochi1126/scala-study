import scala.math.BigInt

object Factorial extends App {
    def factorial(i: BigInt): BigInt = if (i == 0) 1 else i * factorial(i - 1)

    println(factorial(30000))
}

// 再起関数とは
// factorial(5)
// 5 * factorial(4)
// 5 * 4 * factorial(3)
// 5 * 4 * 3 * factorial(2)
// 5 * 4 * 3 * 2 * factorial(1)
// 5 * 4 * 3 * 2 * 1 * 1
// 120
// つまり、再起関数が関数以外の物を返すまでメモリ上に値を持っておかなければならない

// 末尾再帰最適化を行う
object FactorialTailRec extends App {
  def factorial(i: BigInt, acc: BigInt): BigInt = if (i == 0) acc else factorial(i - 1, i * acc) 
  println(factorial(30000, 1))
}

// 末尾再起最適化とは
// factorial(5, 1)
// factorial(4, 5)
// factorial(3, 20)
// factorial(2, 60)
// factorial(1, 120)
//つまり計算結果を次の関数呼び出しに渡しているためメモリ上に不要な値を保持しておく必要がない
