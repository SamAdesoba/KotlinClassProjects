package ClassExercises

import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)
    println("Question 13. Calculate the sum of natural numbers")
    println("Enter the number of natural numbers you want to sum: ")
    var n: Int = reader.nextInt()
    var sum: Int = 0
    while(0 < n){
        println("Enter a natural number")
        var naturalNumber = reader.nextInt()
        if (naturalNumber > 0){
            sum += naturalNumber
            n--
        }else
            println("Number entered is not a natural number")
    }
    println("The sum of all the natural numbers entered is: $sum")
}