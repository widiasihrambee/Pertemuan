package id.ac.polbeng.widiasihrambe.test_kelas

open class Mahasiswa(var nama: String, var nrp: Int){
    open fun info(){
        println (nama +'n' + nrp);

    }
    override fun toString(): String {
        return "Mahasiswa{nama= $nama, nrp= $nrp}"
    }
}


class KetuaHima(nama: String, nrp: Int, val jurusan: String) : Mahasiswa(nama, nrp) {

    @Override
    override fun info(){
        println(nama +'\n'+ nrp +'\n'+ jurusan);
    }
}

fun main(){
    val widia = Mahasiswa("Widiasih Rambe", 1106123)
    val riska= KetuaHima("Riska Ardila", 1106789, "Rekayasa Perangkat Lunak")
    println(riska.toString());
    println()
    riska.info()
    println("Jenis Kelas = " + riska.javaClass.simpleName)
    println()
    widia.info()
    println("Jenis Kelas = " + widia.javaClass.simpleName)

    val dinda= KetuaHima("Dinda", 1105239, "Teknik Elektro")
    println()
    dinda.info()
    println("Jenis Kelas = " + dinda.javaClass.simpleName)
}