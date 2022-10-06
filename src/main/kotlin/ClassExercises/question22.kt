package ClassExercises

import java.lang.Math.pow
import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)
    println("Question 22. Calculate power of a number")
    println("Enter the base number: ")
    var base: Double = reader.nextDouble()
    print("Enter the power: ")
    var power: Double = reader.nextDouble()
    var result: Double = pow(base, power)
    println("${base.toInt()} to the power of ${power.toInt()} is: ${result.toInt()}")

}