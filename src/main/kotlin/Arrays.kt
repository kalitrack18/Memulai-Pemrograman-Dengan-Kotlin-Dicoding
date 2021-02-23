fun main(){
    //Arrays
    /*
    * Selanjutnya adalah Array, yakni tipe data yang memungkinkan kita untuk menyimpan
    * beberapa objek di dalam sebuah variabel. Array di Kotlin dipresentasikan oleh kelas
    * Array yang memiliki fungsi get dan set serta properti size. Untuk membuat sebuah
    * Array kita bisa memanfaatkan sebuah library function arrayOf() seperti berikut :
    *
    * 1. val array = arrayOf(1,3,5,7)
    *
    * Kita juga dapat memasukkan nilai dengan berbagai jenis tipe data ke dalam arrayOf() misalnya :
    * 1. val mixArray = arrayOf(1,3,5,7, "Dicoding", true)
    *
    * Kotlin juga memungkinkan kita untuk membuat Array dengan tipe data primitif dengan memanfaatkan
    * beberapa fungsi spesifik berikut :
    *
    * > intArrayOf() : IntArray
    * > booleanArrayOf() : BooleanArray
    * > charArrayOf() : LongArray
    * > shortArrayOf() : ShortArray
    * > byteArrayOf() : ByteArray
    *
    * Jika kita ingin membuat Array yang hanya bisa dimasukkan nilai dengan tipe data
    * Int, gunakan intArrayOf(), misalnya
    * 1. val intArray = intArrayOf(1,3,5,7)
    *
    * Kita juga bisa mendapatkan nilai tunggal dari sekumpulan nilai yang berada di dalam
    * sebuah Array dengan memanfaatkan indexing seperti berikut :
    *
     */

    // contoh indexing array
    val intArray = intArrayOf(1,3,5,7)
    println(intArray[2])

    intArray[2] = 11
    println(intArray[2])
    print(intArray[3])
}