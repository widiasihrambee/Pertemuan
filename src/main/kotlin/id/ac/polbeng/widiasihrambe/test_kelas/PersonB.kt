package id.ac.polbeng.widiasihrambe.test_kelas

class PersonB (_firstName: String, _lastName: String, _age: Int){

    var firstName:String = _firstName
    var lastName:String = _lastName
    var age: Int = _age
}

/*
 meringkas kode program kelas personA kita dapat menggabungkan proses deklarasi dan
 menginisialisasi sebuah variabel pada blok inisialisasi kedalam statement
 */

fun main() {
    val widiasih = PersonB("Widiasih", "Rambe", 21)
    println("Name : ${widiasih.firstName} ${widiasih.lastName}")
    println("Age :${widiasih.age}")
}