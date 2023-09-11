package lesson4

fun main() {

    val isDamage = readln().toBoolean()
    val crewCount = readln().toInt()
    val foodBoxesCount = readln().toInt()
    val isWeatherCondition = readln().toBoolean()

    if ((!isDamage) && (crewCount in 55..70) && (foodBoxesCount > 50) && isWeatherCondition) {
        println("Корабль может приступить к долгосрочному плаванию")
    } else {
        if (((isDamage && crewCount == 70) && foodBoxesCount > 50) && isWeatherCondition) {
            println("Корабль может отплыть, несмотря на повреждения")
        } else {
            println("Корабль не может отплыть")
        }
    }
}