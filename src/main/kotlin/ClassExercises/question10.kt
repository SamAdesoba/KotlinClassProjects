package ClassExercises

import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)
    println("Question 10. Find the largest among three numbers")
    println("Enter the first number: ")
    var number1: Int = reader.nextInt()
    print("Enter the second number: ")
    var number2: Int = reader.nextInt()
    print("Enter the third number: ")
    var number3: Int = reader.nextInt()
    if (number1 > number2  && number1 > number3){
        println("$number1 is the largest number")
    }else if (number2 > number3 && number2 > number1){
        println("$number2 is the largest number")
    }else if (number3 > number1 && number3 > number2){
        println("$number3 is the largest number")
    }else
        println("All the numbers are equal")
}