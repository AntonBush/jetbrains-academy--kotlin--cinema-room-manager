fun main() {
    val n = readLine()!!.toInt()
    val arr = IntArray(n)
    for (i in arr.indices) {
        arr[i] = readLine()!!.toInt()
    }
    val newArr = IntArray(n)
    for (i in 0 until n) {
        val ii = (i + 1) % n
        newArr[ii] = arr[i]
    }
    println(newArr.joinToString(" "))
}
