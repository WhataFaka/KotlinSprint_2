package lesson2


fun main() {
    val departureTime = 9 * 60 + 39
    val travelTime = 457
    val travelTimeInHours = travelTime / 60

    val arrivalTime = calculateArrivalTime(departureTime, travelTime)


    println(arrivalTime)
    println(travelTimeInHours)
}

fun calculateArrivalTime(departureTime: Int, travelTimeInHours: Int): String {
    val arrivalHour = (departureTime / 100 + travelTimeInHours / 60) % 24
    val arrivalMinute = (departureTime % 100 * 60 + travelTimeInHours % 60) % 60
    return String.format("Arrival time: %02d:%02d", arrivalHour, arrivalMinute)
}