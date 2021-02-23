fun main() {

    val textString = "Kotlin"
    val firstchar = textString[0]

    println("First Character of $textString is $firstchar")

    // lesson


    val text = "Kotlin"

    for (char in text){
        print ("$char ")
    }

    // ESCAPED STRING
    /*
    * Kotlin memiliki dua jenis tipe Literal String, yang pertama
    * adalah "Escaped String" yang memungkinkan kita untuk mengurangi
    * ambiguitas nilai yang berada di dalam sebuah String. Misalnya ketika
    * kita mendefinisikan sebuah String berikut :
    *
    * Contoh :
    *   1. val statement = "Kotlin is Awesome!"
    * Jika kita ingin menambahkan tanda petik maka printahnya spt berikut :
    *   Yang Benar :
    *   1. val statement = " Kotlin is \"Awesome!\""
    *   Yang Salah :
    *   2. val statement = "Kotlin is "Awesome!""
     */

    // RAW STRING
    /*
    * Kedua. adalah RAW STRING yang memungkinkan kita menuliskan multiline dan
    * arbitary text. ketika ingin membuat beberapa baris String biasanya kita melakukan escaped terhadap String dengan
    * memanfaatkan karakter escape \n seperti berikut
     */
}