fun main() {
    var sum = 0
    var value = readLine()!!.toInt()
    while (value != 0) {
        sum += value
        value = readLine()!!.toInt()
    }
    println(sum)
}
