package lesson1

fun main() {

    val timeInSpace: Short = 6480

    val hours = timeInSpace / 3600
    val minutes = timeInSpace / 60 % 60
    val seconds = timeInSpace / 3600 / 60

    val result = "0$hours:$minutes:0$seconds;"
    println(result)

}