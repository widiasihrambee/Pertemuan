package id.ac.polbeng.widiasihrambe.test_kelas

fun main(){
    val widia = Student("Widia", 21)
    val riska = widia.copy("Riska")
    if(widia.equals(riska))
        println("widia is equal to riska.")
    else
        println("widia is not equal to riska.")
    println("Hashcode of widia: ${widia.hashCode()}")
    println("Hashcode of widia: ${riska.hashCode()}")
}
