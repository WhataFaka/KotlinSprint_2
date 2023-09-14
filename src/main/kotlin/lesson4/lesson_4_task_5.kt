package lesson4

fun main() {

    val isDamage = readln().toBoolean()
    val crewCount = readln().toInt()
    val foodBoxesCount = readln().toInt()
    val isWeatherCondition = readln().toBoolean()

    if ((isDamage != IS_DAMAGE) && (crewCount in CREW_COUNT_MIN..CREW_COUNT_MAX) && (foodBoxesCount > FOOD_BOXES_COUNT) && (isWeatherCondition ==
                IS_WEATHER_CONDITION)
    ) {
        println("Корабль может приступить к долгосрочному плаванию")
    } else {
        if ((((isDamage == IS_DAMAGE) && (crewCount == CREW_COUNT_MAX)) && (foodBoxesCount > FOOD_BOXES_COUNT)) && (isWeatherCondition == IS_WEATHER_CONDITION)) {
            println("Корабль может отплыть, несмотря на повреждения")
        } else {
            println("Корабль не может отплыть")
        }
    }
}

const val IS_DAMAGE = false
const val IS_WEATHER_CONDITION = true
const val CREW_COUNT_MIN = 55
const val CREW_COUNT_MAX = 70
const val FOOD_BOXES_COUNT = 50