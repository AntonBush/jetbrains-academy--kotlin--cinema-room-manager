fun main() {
    val n = readLine()!!.toInt()
    val arr = IntArray(n)
    for (i in arr.indices) {
        arr[i] = readLine()!!.toInt()
    }
    var triples = 0
    for (i in 0 until n - 2) {
        if (arr[i] + 1 == arr[i + 1]
            && arr[i + 1] + 1 == arr[i + 2]) {
            ++triples
        }
    }
    println(triples)
}
