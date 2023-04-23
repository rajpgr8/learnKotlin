fun main() {
   
    val lin = Person("lin", 67, true)   //Constructor  //No 'new' keyword
    println(lin.desc())

}

class Person(private val name: String, private var age: Int, hasBike: Boolean) {  //name cannot chnaged but age can (val vs var)

    private val nickname: String
    init {
        val bike = if(hasBike) "has bike :)" else " dose not has Bike (:"
        nickname = "$name $bike"
    }

    fun desc(): String {
        return "Name: $nickname, Age: $age"
    }
}

// Note: 
// 'val' and 'cost val' both are read-only
// 'val' is known at runtime but 'const val' is known at compile time  (similar to 'const' vs 'constepr' in c++)
