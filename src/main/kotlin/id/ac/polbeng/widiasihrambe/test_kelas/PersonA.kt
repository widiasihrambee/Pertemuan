package id.ac.polbeng.widiasihrambe.test_kelas

class PersonA (_firstName: String, _lastName: String, _age: Int) {
    var firstName: String
    var lastName: String
    var age: Int
    init {
      firstName= _firstName
      lastName= _lastName
      age= _age
    }
}

/*
parameter dari konstruktur utama dapat digunakan dalam blok inisialisasi. dapat juga digunakan untuk menginisialisasi property
yang dideklarasikan property yang dideklarasikan dalam tubuh kelas

 */

fun main(){

    val budi = PersonA("Widiasih", "Rambe", 21)
    println("name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}