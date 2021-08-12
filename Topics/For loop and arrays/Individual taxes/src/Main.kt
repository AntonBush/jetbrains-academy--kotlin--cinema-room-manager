fun main() {
    val n = readLine()!!.toInt()
    val incomes = IntArray(n)
    for (i in incomes.indices) {
        incomes[i] = readLine()!!.toInt()
    }
    val taxes = IntArray(n)
    for (i in incomes.indices) {
        taxes[i] = readLine()!!.toInt()
    }
    var maxTax = incomes[0] * taxes[0] / 100.0
    var maxTaxCompany = 1
    for (i in 1 until n) {
        val tax = incomes[i] * taxes[i] / 100.0
        if (maxTax < tax) {
            maxTax = tax
            maxTaxCompany = i + 1
        }
    }
    println(maxTaxCompany)
}
