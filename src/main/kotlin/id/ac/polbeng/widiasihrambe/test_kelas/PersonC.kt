package id.ac.polbeng.widiasihrambe.test_kelas

class PersonC(var firstName:String, var lastName: String, var age: Int ) {}

/*
untuk lebih ringkas deklarasi inisialisasi property
dapat dilakukan hanya didalam parameter konstruktor utama

 */
fun main() {
    val widiasih = PersonC("Widiasih", "Rambe", 21)
    println("Name : ${widiasih.firstName} ${widiasih.lastName}")
    println("Age : ${widiasih.age}")
}