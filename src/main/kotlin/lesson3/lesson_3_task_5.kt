package lesson3

fun main() {
    val inputLink = "D2-D4;0"

    val parts = inputLink.split("-", ";")

    val from = parts[0]
    val to = parts[1]
    val numberOfStep = parts[2].toInt()

    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $numberOfStep")
}