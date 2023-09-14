package lesson5

fun main() {

    println("Введите имя пользователя:")
    val userName = readln()
    println("Введите пароль:")
    val password = readln()

    if ((USER_NAME_DB == userName) && (USER_PASSWORD_DB == password)) {
        println(
            "Ваши данные проверены, и о, чудо, они верны... " +
                    "\nПользователь Zaphod, вам разрешено входить на борт корабля 'Heart of Gold'. " +
                    "\nХотя мне всё равно... Ну вперед, войдите... " +
                    "\nЕсли вам так уж надо, в конце концов... " +
                    "\nНадеюсь, вам понравится пребывание здесь больше, чем мне."
        )
    } else
        println("Ваш профиль не найден, зарегистрируйтесь в системе")
}

const val USER_NAME_DB = "Zaphod"
const val USER_PASSWORD_DB = "PanGalactic"