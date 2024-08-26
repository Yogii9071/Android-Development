fun main(){
    println("Namaste Yogii")

    val a = 10 // assigning of variable by type inference
    println(a)
    val b: Int = 20 // assigning of variable by declaring is type explicitly
    println(b)
    val c = 60 // we cannot re-assign val as it is a constant, and we call it final in java
    println(c)

    val x:Int =100
    val y:Long = x.toLong()
// typecast
    val z: String = "12";

    val f:String? = z as? String
    //val f:Int? = z as? Int
    println(f)
    println(y)

    if(f!=null){
        println("typecast sucessful")
    }else{
        println("unsuccessful")
    }

// single line comment

    /* multi
    line
    comment
    okay
     */
    

}