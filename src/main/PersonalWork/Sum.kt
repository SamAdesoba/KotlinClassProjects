import java.util.Scanner

class Sum {
    private val reader = Scanner(System.`in`)

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
}