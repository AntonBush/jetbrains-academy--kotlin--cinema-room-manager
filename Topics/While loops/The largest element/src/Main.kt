fun main() {
    var max = readLine()!!.toInt()
    var value = readLine()!!.toInt()
    while (value != 0) {
        if (max < value) {
            max = value
        }
        value = readLine()!!.toInt()
    }
    println(max)
}
