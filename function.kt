fun main(){
    //syntax for 'for loop'

    //includes the upperlimit
    for(i in 1 .. 5){
        print(i)
    }

    println()

    //until excludes upperlimit
for(i in 1 until 5){
    print(i)
}
    //reverse an array
    println()
    for(i in 5 downTo  1){
        print(i)
    }
    println()

    //downTo step will print alternate digit backwards
    for(i in 10 downTo  2 step 2){
        println(i)
    }

    val a = arrayOf("A",1,"C","D","E")
    for(i in a){
        print(i)
    }

    val b = intArrayOf(2,1,3,4,5)
    for(i in b){
        print(i)
    }

    val c = listOf("A",1,"C","D","E")
    for(i in b){
        print(i)
    }
    println()
    val arr = arrayOf("A",1,"Hello")
    for(i in arr.indices){

        println("Element at index $i is ${arr[i]}")
    }

}