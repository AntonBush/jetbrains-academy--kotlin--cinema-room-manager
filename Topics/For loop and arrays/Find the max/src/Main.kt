fun main() {
    val n = readLine()!!.toInt()
    var max = readLine()!!.toInt()
    var mInd = 0
    var ind = 0
    repeat(n - 1) {
        val t = readLine()!!.toInt()
        ++ind
        if (max < t) {
            max = t
            mInd = ind
        }
    }
    println(mInd)
}
