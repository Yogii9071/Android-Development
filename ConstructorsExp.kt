//constructors are special function which is used for instantiation
class ConstructorsExp(var name:String,var age:Int)//primary constructor
/* constructor which are declared in the class header
after class name it called primary constructor */
{
    var nam=""
    var ag =0

    constructor(name :String):this(name,0) /*secondary constructor are
    declared inside the class body
    purpose : used for creation of object*/
    {
        this.name =nam
        this.age = ag
    }

}
fun main(){
   val a = ConstructorsExp("Yogesh",20)
   println("Name is :${a.name} and Age is : ${a.age}")
}