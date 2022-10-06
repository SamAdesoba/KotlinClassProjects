package ClassExercises

import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)
    println("Question 12. Check whether a character is alphabet or not")
    println("Enter an alphabet: ")
    var ch : Char = reader.next().single()
    if( ch in 'a'..'z' || ch in 'B'..'Z'){
        println("$ch is an alphabet")
    }else
        println("$ch is not an alphabet")
}