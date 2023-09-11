package lesson4

fun main() {

    val day = 5

    val armsAndPress = "Руки-Пресс"
    val legsAndBack = "Ноги-Спина"

    println(
        "Упражнения для рук: \t${(armsAndPress === ARMS_AND_PRESS) && (day % 2 != 0)} \nУпражнения для ног: \t${(legsAndBack === LEGS_AND_BACK) && (day % 2 == 0)} \nУпражнения для спины: \t${(legsAndBack === LEGS_AND_BACK) && (day % 2 == 0)} \nУпражнения для пресса: \t${(armsAndPress === ARMS_AND_PRESS) && (day % 2 != 0)}"
    )
}

const val ARMS_AND_PRESS = "Руки-Пресс"
const val LEGS_AND_BACK = "Ноги-Спина"