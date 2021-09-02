// Aplikasi Hello World ifState with Modulus

fun main() {
    print("Masukkan bilangan: ")

    // Null Safety
    var inputInt = readLine()?.toInt()

    if (inputInt!! % 3 == 0 && inputInt % 5 == 0)
    {
        println("Hello World")
    } else if (inputInt % 3 == 0)
    {
        println("Hello")
    } else if (inputInt % 5 == 0)
    {
        println("World")
    } else {
        println("Tidak Termasuk ketiganya")
    }
}