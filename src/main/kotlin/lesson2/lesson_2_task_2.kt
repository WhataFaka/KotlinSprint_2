package lesson2

fun main() {
    val employees = 50
    val salaryOfEmployees = 30_000

    val interns = 30
    val salaryOfInterns = 20_000

    val expensesOfPermanentEmployees = employees * salaryOfEmployees
    val generalExpenses = (interns * salaryOfInterns) + expensesOfPermanentEmployees
    val averageSalaryOfEmployee = generalExpenses / (employees + interns)

    println("Расходы на зп постоянных сотрудников: $expensesOfPermanentEmployees рублей")
    println("Общие расходы по ЗП после прихода стажеров: $generalExpenses рублей")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalaryOfEmployee рублей")
}

