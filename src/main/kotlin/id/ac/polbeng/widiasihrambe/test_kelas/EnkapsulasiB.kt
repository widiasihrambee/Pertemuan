package id.ac.polbeng.widiasihrambe.test_kelas

class EmployeeA (_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    get()= field

    var name: String =_name
    get(){
        return field.toUpperCase()
        }
    set(value) {
        field= value
    }
    var age: Int =_age
    get() = field
    set(value){
        field = if(value > 0) value else throw IllegalAccessException("Age must be greater than zero")

    }
}

fun main() {
    val emp = EmployeeA(1101, "Widia", 21)
    println("id ; ${emp.id}, Nama: ${emp.name}, umur :${emp.age}")
    emp.age = -1
}