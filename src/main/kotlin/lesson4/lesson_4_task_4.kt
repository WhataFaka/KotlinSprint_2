package lesson4

fun main() {

    val day = 5
    val isEven = day % 2 != 0

    val arms = true
    val press = true
    val legs = true
    val back = true

    println(
        "Упражнения для рук: \t${arms && isEven} " +
                "\nУпражнения для ног: \t${legs && !isEven} " +
                "\nУпражнения для спины: \t${back && !isEven} " +
                "\nУпражнения для пресса: \t${press && isEven}"
    )
}

