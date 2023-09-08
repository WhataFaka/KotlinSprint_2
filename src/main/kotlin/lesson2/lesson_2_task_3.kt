package lesson2


fun main() {
    val departureTimeInHours = 9
    val departureTimeInMinutes = 39
    val travelTime = 457

    val arrivalTime = calculateArrivalTime(departureTimeInHours, travelTime, departureTimeInMinutes)

    println(arrivalTime)

}

fun calculateArrivalTime(departureTimeInHours: Int, travelTime: Int, departureTimeInMinutes: Int): String {
    val arrivalHour = (departureTimeInHours + (departureTimeInMinutes + travelTime) / 60) % 24
    val arrivalMinute = (departureTimeInMinutes % 100 + travelTime % 60) % 60
    return String.format("Arrival time: %02d:%02d", arrivalHour, arrivalMinute)
}