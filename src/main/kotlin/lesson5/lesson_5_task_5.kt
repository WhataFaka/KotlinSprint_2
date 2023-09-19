package lesson5

import kotlin.random.Random

fun main() {
    val correctNumb1 = Random.nextInt(101)
    val correctNumb2 = Random.nextInt(101)

    println("Для выигрыша главного приза Вам нужно отгадать два числа (от 0 до 100),  введите первое число:")
    val firstNumb = readln().toInt()
    println("Введите второе число:")
    val secondNumb = readln().toInt()

    if ((firstNumb == correctNumb1 || firstNumb == correctNumb2) && (secondNumb == correctNumb2 || secondNumb == correctNumb1)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((firstNumb == correctNumb1 || firstNumb == correctNumb2) || (secondNumb == correctNumb2 || secondNumb == correctNumb1))
        println("Вы выиграли утешительный приз!\nВыигрышные числа: $correctNumb1 и $correctNumb2")
    else println(
        "Неудача! Крутите барабан!\n" +
                "\nВыигрышные числа: $correctNumb1 и $correctNumb2"
    )
}