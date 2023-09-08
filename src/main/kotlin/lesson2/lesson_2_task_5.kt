package lesson2

import kotlin.math.pow

fun main() {

    val contribution = 70_000.0
    val interestRate = 16.7
    val year = 20

    val amount = contribution * (1 + interestRate / 100).pow(year)

    println(String.format("Размер вклада через 20 лет: %.3f", amount))
}
