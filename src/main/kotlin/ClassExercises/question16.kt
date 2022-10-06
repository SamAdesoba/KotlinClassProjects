package ClassExercises

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)
    println("Question 16. Display Fibonacci series")
    println("Enter a number : ")
    var n: Int = reader.nextInt()
    var firstNumber = 0
    var secondNumber = 1
    print("$firstNumber  $secondNumber  ")
    var i = 0
    while (i < n){
    var sum = firstNumber + secondNumber
    print("$sum  ")
    firstNumber = secondNumber
    secondNumber = sum
    i += 1
    }

}