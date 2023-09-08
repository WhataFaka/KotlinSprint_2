package lesson2

fun main() {
    val scores = intArrayOf(3, 4, 3, 5)

    val averageScore = scores.average()

    println("Average score: ${String.format("%.2f", averageScore)}")
}