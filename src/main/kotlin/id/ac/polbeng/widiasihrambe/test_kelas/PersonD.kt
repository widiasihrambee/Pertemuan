package id.ac.polbeng.widiasihrambe.test_kelas

class PersonD {
    var firstName:String
    var lastName:String
    var age:Int
    constructor(_firstName: String, _lastName: String, _age: Int){
        firstName= _firstName
        lastName=_lastName
        age=_age
    }
}

fun main() {
    val widiasih = PersonD("Widiasih", "Rambe", 21)
    println("Name : ${widiasih.firstName} ${widiasih.lastName}")
    println("Age : ${widiasih.age}")
}