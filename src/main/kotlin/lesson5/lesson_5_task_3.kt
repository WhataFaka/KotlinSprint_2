package lesson5

fun main() {

    println("Для выигрыша главного приза Вам нужно отгадать два числа (от 0 до 100),  введите первое число:")
    val firstNumb = readln().toInt()
    println("Введите второе число:")
    val secondNumb = readln().toInt()

    if ((firstNumb == FIRST_CORRECT_NUMB || firstNumb == SECOND_CORRECT_NUMB) && (secondNumb == SECOND_CORRECT_NUMB || secondNumb == FIRST_CORRECT_NUMB)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((firstNumb == FIRST_CORRECT_NUMB || firstNumb == SECOND_CORRECT_NUMB) || (secondNumb == SECOND_CORRECT_NUMB || secondNumb == FIRST_CORRECT_NUMB))
        println("Вы выиграли утешительный приз!\nВыигрышные числа: 17 и 9")
    else println(
        "Неудача! Крутите барабан!\n" +
                "Выигрышные числа: 17 и 9"
    )

}

const val FIRST_CORRECT_NUMB = 17
const val SECOND_CORRECT_NUMB = 9