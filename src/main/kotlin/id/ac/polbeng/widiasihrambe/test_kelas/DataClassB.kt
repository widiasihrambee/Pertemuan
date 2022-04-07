package id.ac.polbeng.widiasihrambe.test_kelas

fun main() {
    val widia = Student("widia", 21)
    val newWidia= Student("Widia", 21)
    val riska= Student("Riska", 20)
    if (widia.equals(newWidia))
        println("widia is equal to newWidia.")
    else
        println("widia is not equal to newWidia.")
    if (widia.equals(riska))
        println("widia is equal to widia.")
    else
        println("widia is not equal to riska.")
    println("Hashcode of widia: ${widia.hashCode()}")
    println("Hashcode of newWidia: ${newWidia.hashCode()}")
    println("Hashcode of riska: ${riska.hashCode()}")
}