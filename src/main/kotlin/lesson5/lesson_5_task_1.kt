package lesson5

fun main() {

    println("Для успешной авторизации напишите правльный ответ, сколько будет 2+6=?")
    val correctAnswer = readln().toInt()

    if (correctAnswer == 8) println("Добро пожаловать!")
    else println("Доступ запрещен!")
}