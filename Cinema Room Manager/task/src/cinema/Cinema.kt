package cinema

fun printCinema(seats: Array<CharArray>) {
    val rows = seats.size
    val seatsEachRow = seats[0].size
    println("Cinema:")
    for (i in 0..rows) {
        for (j in 0..seatsEachRow) {
            if (i == 0) {
                when (j) {
                    0 -> print(" ")
                    else -> print("$j")
                }
            } else {
                when (j) {
                    0 -> print("$i")
                    else -> print("${seats[i - 1][j - 1]}")
                }
            }
            when {
                j < seatsEachRow -> print(" ")
                else -> println()
            }
        }
    }
}

fun calculatePrice(seats: Array<CharArray>, row: Int): Int {
    val rows = seats.size
    val seatsEachRow = seats[0].size
    val totalSeats = rows * seatsEachRow
    return when {
        totalSeats <= 60 -> 10
        row <= rows / 2 -> 10
        else -> 8
    }
}

fun buySeat(seats: Array<CharArray>, row: Int, seat: Int) {
    if (row < 1 || seats.size < row
        || seat < 1 || seats[0].size < seat) {
        throw Exception("Wrong input!")
    }
    if (seats[row - 1][seat - 1] == 'B') {
        throw Exception("That ticket has already been purchased!")
    }
    seats[row - 1][seat - 1] = 'B'
}

fun buyTicket(seats: Array<CharArray>) {
    var isTicketBought = false
    do {
        try {
            println("Enter a row number:")
            val row = readLine()!!.toInt()
            println("Enter a seat number in that row:")
            val seat = readLine()!!.toInt()
            buySeat(seats, row, seat)
            isTicketBought = true
            println("Ticket price: $${calculatePrice(seats, row)}")
        } catch (e: Exception) {
            println(e.message)
        }
    } while (!isTicketBought)
}

fun printMenu() {
    println("1. Show the seats")
    println("2. Buy a ticket")
    println("3. Statistics")
    println("0. Exit")
}

fun printStatistics(seats: Array<CharArray>) {
    var purchasedTickets = 0
    var currentIncome = 0
    var totalIncome = 0
    for (i in seats.indices) {
        for (j in seats[0].indices) {
            if (seats[i][j] == 'B') {
                ++purchasedTickets
                currentIncome += calculatePrice(seats, i + 1)
            }
            totalIncome += calculatePrice(seats, i + 1)
        }
    }
    val percentage = purchasedTickets.toDouble() / (seats.size * seats[0].size) * 100.0
    println("Number of purchased tickets: $purchasedTickets")
    println("Percentage: ${"%.2f".format(percentage)}%")
    println("Current income: $$currentIncome")
    println("Total income: $$totalIncome")
}

fun main() {
    println("Enter the number of rows:")
    val rows = readLine()!!.toInt()
    println("Enter the number of seats in each row:")
    val seatsEachRow = readLine()!!.toInt()
    val seats = Array(rows) {
        CharArray(seatsEachRow) { 'S' }
    }

    printMenu()
    var userChoice = readLine()!!.toInt()
    while (userChoice != 0) {
        when(userChoice) {
            1 -> printCinema(seats)
            2 -> buyTicket(seats)
            3 -> printStatistics(seats)
        }
        printMenu()
        userChoice = readLine()!!.toInt()
    }
}