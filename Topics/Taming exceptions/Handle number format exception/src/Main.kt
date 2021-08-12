import java.lang.Exception

fun parseCardNumber(cardNumber: String): Long {
    if (!isCardNumber(cardNumber)) {
        throw Exception()
    }

    return cardNumber.split(' ').joinToString("").toLong()
}

fun isCardNumber(cardNumber: String): Boolean {
    if (cardNumber.length != 19) {
        return false
    }
    var isCardNumberFlag = true
    for (i in 0 until 19) {
        when {
            (i + 1) % 5 == 0 ->
                if (!cardNumber[i].isWhitespace())
                    isCardNumberFlag = false
            else ->
                if (!cardNumber[i].isDigit())
                    isCardNumberFlag = false
        }
    }
    return isCardNumberFlag
}