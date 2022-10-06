package ClassExercises

import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)
    println("Question 8. Find the frequency of a character in a string")
    println("Enter a word: ")
    var word: String = reader.nextLine()
    var i = 0
    var counter =0
    while(i < word.length){
        if(word[i] == word[i+1]){
            counter++
        }
        println("$counter")
    }


}