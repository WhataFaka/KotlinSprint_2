package lesson2


fun main() {

    val contribution = 70_000.0
    val interestRate = 0.167
    var year = 1
    var amount = contribution


    while (year <= 20) {
        amount = calcAmountAfterYear(contribution, year, interestRate)
        year++
    }
    println(String.format("Размер вклада через 20 лет: %.3f", amount))
}

fun calcAmountAfterYear(contribution: Double, currentYear: Int, interestRate: Double): Double {
    if (currentYear > 20) return contribution

    return contribution * (1.0 + interestRate / 365)
}