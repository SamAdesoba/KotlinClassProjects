package ClassExercises

import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)
    println("Question 11. Check leap year")
    println("Enter a year: ")
    var year : Int = reader.nextInt()
    if (year <= 0) {
        println("Invalid year")
    } else if ((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0)){
        println("Given Year is a leap Year")
    }else println("Given Year is not a leap Year")
}