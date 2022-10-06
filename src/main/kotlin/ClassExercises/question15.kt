package ClassExercises

import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)
    println("Question 15. Generate Multiplication table")
    print("Enter a number: ")
    val number: Int = reader.nextInt()
    for (multiplier in 1..12) {
        val result = number * multiplier
        println("$number * $multiplier = $result")
    }
    println()
    println()
    println("The multiplication table of 1 to 12")
    for (i in 2..12) {
        for (j in 1..12) {
            println("$i X $j = ${i * j}")
        }
        println()
    }
}