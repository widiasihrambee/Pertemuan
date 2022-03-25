package id.ac.polbeng.widiasihrambe.test_kelas
    fun main() {
        val greeter = Greeter()
        greeter.greet()
        greeter.text = "Hi"
        greeter.greet("widia")
        greeter.greet("Dila")
        greeter.text = "Hello programmer"
        println(greeter.with_ret_val("Dono"))

    }


