package lesson1

fun main() {
    val timeInSpace: Short = 6480

    val hours = timeInSpace / 3600
    val minutes = timeInSpace / 60 % 60
    val seconds = timeInSpace / 3600 / 60

    val result = String.format("0%d:%d:0%d", hours, minutes, seconds)
    println(result)
}

