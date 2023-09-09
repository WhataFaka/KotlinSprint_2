package lesson4

fun main() {
    val weatherTodayIsSunny = true
    val awningIsOpen = true
    val airHumidity = 20
    val season = "Зима"

    val favorableTerms =
        (weatherTodayIsSunny == SUNNY_WEATHER) && (awningIsOpen == AWING_OPEN) && (airHumidity == AIR_HUMIDITY) && (season !== BAD_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? - $favorableTerms")
}

const val SUNNY_WEATHER = true
const val AWING_OPEN = true
const val AIR_HUMIDITY = 20
const val BAD_SEASON = "Зима"