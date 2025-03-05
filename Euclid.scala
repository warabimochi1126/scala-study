object Euclid extends App {
    def greatestCommonDriver(a:Int, b:Int): Int = {
        if(a == 0) {
            b
        } else if(b == 0) {
            a
        } else {
            greatestCommonDriver(b, a % b)
        }
    }

    println(greatestCommonDriver(24, 36))
}