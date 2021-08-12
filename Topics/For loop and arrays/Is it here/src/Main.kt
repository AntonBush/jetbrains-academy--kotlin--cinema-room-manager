fun main() {
    val n = readLine()!!.toInt()
    val arr = IntArray(n)
    for (i in arr.indices) {
        arr[i] = readLine()!!.toInt()
    }
    val m = readLine()!!.toInt()
    println(if (arr.contains(m)) "YES" else "NO")
}
