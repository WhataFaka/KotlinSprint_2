package lesson4

fun main() {
    val bookingToday = 13
    val bookingTomorrow = 9

    val informationAboutBookingToday = NUMBER_OF_TABLES != bookingToday
    val informationAboutBookingTomorrow = NUMBER_OF_TABLES != bookingTomorrow

    println("Доступность столиков на сегодня: $informationAboutBookingToday \nДоступность столиков на завтра: $informationAboutBookingTomorrow")
}

const val NUMBER_OF_TABLES = 13