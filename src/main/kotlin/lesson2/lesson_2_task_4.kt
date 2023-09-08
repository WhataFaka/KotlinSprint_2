package lesson2

fun main() {

    val crystalOre = 7
    val jellyOre = 11
    val buff = 20

    val crystalOreBuff = (crystalOre * buff) / 100
    val jellyOreBuff = (jellyOre * buff) / 100


    println(String.format("Дополнительно получено кристаллической руды с баффом: %d", crystalOreBuff))
    println(String.format("Дополнительно получено железной руды с баффом: %d", jellyOreBuff))

}