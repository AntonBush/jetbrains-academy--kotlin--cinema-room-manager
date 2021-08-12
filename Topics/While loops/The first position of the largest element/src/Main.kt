fun main() {
    var max = readLine()!!.toInt()
    var pos = 1
    var v = readLine()?.toInt()
    var vPos = 2
    while (v != null) {
        if (max < v) {
            max = v
            pos = vPos
        }
        v = readLine()?.toInt()
        ++vPos
    }
    println("$max $pos")
}
