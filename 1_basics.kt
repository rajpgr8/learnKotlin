fun main (args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")

    val age =  100
    //age = 190  //Error: Kotlin: Val cannot be reassigned
    println(age)

    //String
    val name = "Rajesh"
    println("(Example of String): My name is $name")
    println(name[0])
    println("Length of name:" + name.length)
    println(name.substring(2,4))

    //Nullable value
    //val remark: String? = null   //Nullable value
    val remark: String? = "Abc"   //Nullable value
    println(remark?.uppercase()) // OR can use if to check non-null value
    if(remark != null) {
        println(remark.uppercase())
    }

    //Special char
    val newLineTab = "\n\t"
    println("Is whitespace blank? ${newLineTab.isBlank()}")
    println("Is whitespace empty? ${newLineTab.isEmpty()}")
    
    //Compare string
    println("ABC" == "abc")    //return false
    println("ABC".equals("abc", ignoreCase = true))   //return true
    
    //Collection (mutable vs non-mutable)
    val allNames = listOf("John", "Mahesh", "Smith")    //Non-mutable list (like Python tuple)
    println("(Example of collections): $allNames")
    println(allNames[2])

    val allNames2 = mutableListOf("John", "Mahesh", "Smith") //Mutable list (like Python list)
    allNames2.add("Ganesh");
    //allNames2.add(89); //Error: Kotlin: The integer literal does not conform to the expected type String
    println(allNames2)

    //for loops
    for(name in allNames2) {
        println(name)
    }

    for(i in 1..4) {  //OR for (i in 1..4) {} OR for (i in until 4) {}
        println(i)
    }
}
