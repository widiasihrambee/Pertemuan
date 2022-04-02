package id.ac.polbeng.widiasihrambe.test_kelas


class PersonF(val firstName:String , val lastName: String) {
    init {
        println("Sedang inisialisasi wak!")
    }

    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName) {
        println("Name : $_firstName $_lastName")
        println("Age ; $_age")
        println()
    }

    constructor(_firstName: String, _lastName:String, _country:String): this(_firstName, _lastName) {
        println("Name : $_firstName $_lastName")
        println("Country : $_country")
        println()
    }
        constructor(_firstName: String, _lastName:String, _age:Int, _country:String):this(_firstName,
        _lastName, _age) {
            println("Name : $_firstName $_lastName")
            println("Age : $_age")
            println("Country : $_country")
        }
        }
        fun main() {
            val widiasih= PersonF("Widiasih", "Rambe")
            val riska = PersonF("Riska", "Ardila", 21)
            val ra = PersonF("Rambe", "Widiasih", "Indonesia")
            val ar = PersonF("Ardila", "Riska", 21, "Indonesia")
        }


