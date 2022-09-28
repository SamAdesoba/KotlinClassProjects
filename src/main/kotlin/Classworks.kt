import java.util.Scanner

fun main() {
    sum()
    subtract()
    division()
    multiplication()


}

private val name2 = "Samson"
private val reader = Scanner(System.`in`)

private fun practice(){
    val name = "Course"
    println("Hello $name and $name2")
}

private fun sampleNaming(){
    val name = "Smile"
    println("My friend's name is $name")
}

fun sum(){
    println("Sum of two numbers")
    println("Enter the first number: ")
    val a: Int = reader.nextInt()
    println("Enter the second number: ")
    val b: Int = reader.nextInt()
    var sum = a + b
    println("The sum of $a and $b is $sum")
    println()
}

private fun subtract(){
    println("Subtraction of two numbers")
    println("Enter the first number: ")
    val a: Int = reader.nextInt()
    println("Enter the second number: ")
    val b: Int = reader.nextInt()
    if (a>b){
    var sum = a - b
        println("The difference of $a and $b is $sum")
    }else{
       var sum = b - a
        println("The difference of $b and $a is $sum")
    }
    println()

}

private fun division(){
    println("Division of two numbers")
    println("Enter the first number: ")
    val a: Int = reader.nextInt()
    println("Enter the second number: ")
    val b: Int = reader.nextInt()

    if (b != 0){
        var sum = a / b
        println("The division of $a and $b is $sum")
    }else{
        println("It is undefined")
    }
    println()
}

private fun multiplication(){
    println("Multiplication of two numbers")
    println("Enter the first number: ")
    val a: Int = reader.nextInt()
    println("Enter the second number: ")
    val b: Int = reader.nextInt()

    var sum = a * b
    println("The multiplication of $a and $b is $sum")
    println()
}

