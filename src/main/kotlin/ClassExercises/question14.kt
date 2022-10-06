package ClassExercises

import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)
    println("Question 14. Find factorial of a number")
    println("Enter a number: ")
    var nu: Int = reader.nextInt()
    var factorial = 1
    while (nu > 1){
        if(nu > 1){
            factorial *= nu
            nu--
        }else {
            println("The factorial is 1")
        }
    }
    println("The factorial is $factorial")
}