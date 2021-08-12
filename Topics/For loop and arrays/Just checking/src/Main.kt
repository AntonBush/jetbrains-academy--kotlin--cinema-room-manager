fun main() {
    val n = readLine()!!.toInt()
    val arr = IntArray(n)
    for (i in arr.indices) {
        arr[i] = readLine()!!.toInt()
    }
    val (p, m) = readLine()!!.split(' ').map { i -> i.toInt() }
    println(if (arr.contains(p) && arr.contains(m)) "YES" else "NO")
}
