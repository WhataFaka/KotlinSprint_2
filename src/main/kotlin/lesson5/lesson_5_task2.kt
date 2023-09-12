package lesson5

fun main() {
    val currentYear = 2023

    println("Введите свой год рождения:")
    val dayOfBirth = readln().toInt()

    val result = currentYear - dayOfBirth

    if (result >= AGE_OF_MAJORITY) println("Показать скрытый контент")
    else println("Вернуться на главный экран")
}

const val AGE_OF_MAJORITY = 18