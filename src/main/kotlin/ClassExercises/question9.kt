package ClassExercises

import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)
    println("Question 9. Check whether an alphabet is vowel or consonant")
    println("Enter an alphabet: ")
    var ch : Char = reader.next().single()
    when(ch){
        'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'  -> println("$ch is a vowel")
        else -> println("$ch is a consonant")
    }
}