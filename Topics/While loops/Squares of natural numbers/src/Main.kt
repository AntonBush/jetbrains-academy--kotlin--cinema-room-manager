fun main() {
    val n = readLine()!!.toInt()
    var sq = 1
    while (sq * sq <= n) {
        println("${sq * sq}")
        ++sq
    }
}
