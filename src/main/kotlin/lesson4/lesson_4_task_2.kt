package lesson4

fun main() {
    val weight1 = 20
    val volume1 = 80
    println(
        "Груз с весом $weight1 кг и объемом $volume1 л соответствует категории ‘Average’: ${
            (weight1 > AVERAGE_WEIGHT_MIN) && (weight1 <= AVERAGE_WEIGHT_MAX) && (volume1 < AVERAGE_VOLUME)
        }"
    )

    val weight2 = 50
    val volume2 = 100
    println(
        "Груз с весом $weight2 кг и объемом $volume2 л соответствует категории ‘Average’: ${
            (weight2 > AVERAGE_WEIGHT_MIN) && (weight2 <= AVERAGE_WEIGHT_MAX) && (volume2 < AVERAGE_VOLUME)
        }"
    )
}

const val AVERAGE_VOLUME = 100
const val AVERAGE_WEIGHT_MIN = 35
const val AVERAGE_WEIGHT_MAX = 100