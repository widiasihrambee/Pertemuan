package id.ac.polbeng.widiasihrambe.test_kelas

data class Student(val name: String, val age: Int)

fun main() {
    val widia = Student("Widia", 21)
    val riska = Student("Riska", 20)
    println("Student Name is: ${widia.name}")
    println("Student Age is: ${widia.age}")
    println("Student Name is: ${riska.name}")
    println("Student Age is: ${riska.age}")
}