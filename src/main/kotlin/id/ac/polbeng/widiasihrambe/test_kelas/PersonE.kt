package id.ac.polbeng.widiasihrambe.test_kelas

class PersonE {
    var firstName: String
    var lastName: String
    var age: Int = 21

    constructor(_firstName: String, _lastName: String) {
        firstName = _firstName
        lastName = _lastName
    }

    constructor(_firstName: String, _lastName: String, _age: Int) : this(_firstName, _lastName) {
        age = _age
    }

    fun cetakInfo() {
        println("Name : ${firstName} ${lastName}")
        println("Age : ${age}")
    }
}
fun main() {
    val widiasih = PersonE("Widiasih", "Rambe")
    widiasih.cetakInfo()
    println()
    val riska = PersonE("Riska", "Ardila", 21)
    riska.cetakInfo()
}



