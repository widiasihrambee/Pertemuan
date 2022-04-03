package id.ac.polbeng.widiasihrambe.test_kelas

open class Teacher {

    //Must Use "open" modefier to allow child classes to override it

    open fun teach(){
        println("Teaching...")
    }

    fun info (){
        println("I'am Teacher. ")
    }
}

class MathsTeacher : Teacher(){
    //Must use "override" Modifier  to override a base class function

    override fun teach() {
        println("Teaching Maths...")
    }
}

fun main(){
    val teacher = Teacher()
    val mathsTeacher= MathsTeacher()
    mathsTeacher.info()
    teacher.teach()
    mathsTeacher.teach()
}