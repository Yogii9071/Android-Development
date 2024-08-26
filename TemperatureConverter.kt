fun FahConv(c:Int){
    val fah = (9*c/5)+32
    println("Fahrenheit is $fah")
}
fun CelConv(f:Int){
    val cel = (f-32)*5/9
    println("Celsius is $cel")
}

fun main(){



    do{
        println("Enter 1 to to convert from celsius to fah")
        println("Enter 2 to to convert from fah to celsius")
        println("Enter 3 to exit")

        print("Enter value to perform operation: ")
        val n = readLine()?.toIntOrNull()

        if (n == 1) {
            print("Enter Celsius value to convert into Fahrenheit : ")
            val v = readLine()?.toInt()
            if (v != null) {
                FahConv(v)
            } else {
                println("Input was null or not a valid number")
            }
        }
        else if (n == 2) {
            print("Enter Fahrenheit value to convert into Celsius : ")
            val t = readLine()?.toInt()
            if (t != null) {
                CelConv(t)
            } else {
                println("Input was null or not a valid number")
            }
        }else{
            println("Exiting Program...")
        }



    }while(n!=3)



}