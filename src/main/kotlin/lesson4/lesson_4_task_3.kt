package lesson4

fun main() {
    val isSunny = true
    val isAwningOpen = true
    val airHumidity = 20
    val season = "Зима"

    val favorableTerms =
        (isSunny == IS_SUNNY_WEATHER) && (isAwningOpen == IS_AWING_OPEN) && (airHumidity == AIR_HUMIDITY) && (season !== BAD_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? - $favorableTerms")
}

const val IS_SUNNY_WEATHER = true
const val IS_AWING_OPEN = true
const val AIR_HUMIDITY = 20
const val BAD_SEASON = "Зима"