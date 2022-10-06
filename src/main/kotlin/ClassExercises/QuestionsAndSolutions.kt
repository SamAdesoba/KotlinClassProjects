package ClassExercises

import java.lang.Math.pow
import java.util.Scanner


fun main(){

    val reader = Scanner(System.`in`)

//  Question 1. Print an Integer (Entered by the User)
//    println("Question 1. Print an Integer (Entered by the User)")
//    println("Enter an integer: ")
//    var num: Int = reader.nextInt()
//    println("The number you entered is: $num")
//    println()
//    println()

//  Question 2. Add two Integers
    println("Question 2. Add two Integers")
    println("Enter the first integer: ")
    var num1: Int = reader.nextInt()
    print("Enter the second integer: ")
    var num2: Int = reader.nextInt()
    println("The sum of $num1 and $num2 is: ${num1 + num1}")
    println()
    println()


//3. Multiply two floating point numbers
    println("Question 3. Multiply two floating point numbers")
    println("Enter the first float: ")
    var float1: Float = reader.nextFloat()
    print("Enter the second float: ")
    var float2: Float = reader.nextFloat()
    println("The sum of $float1 and $float2 is: ${float1 + float2}")
    println()
//    println()



//4. Find ASCII value of a character
    println("Question 4. Find ASCII value of a character")
    println("Enter a character: ")
    var cha: Char = reader.next().single()
    var ascii: Unit =
//    println()
//    println()


//    Question 5. Compute Quotient and Remainder
    println("Question 5. Compute Quotient and Remainder")
    println("Enter the numerator: ")
    var numerator: Int = reader.nextInt()
    print("Enter the denominator: ")
    var denominator: Int = reader.nextInt()
    var quotient: Int = numerator/denominator
    var remainder: Int = numerator%denominator
    println("The quotient is $quotient and the remainder is $remainder")
//    println()
//    println()


//    Question 6. Swap two numbers
    println("Question 6. Swap two numbers")
    println("Enter a two digits number: ")
    var digit: Int = reader.nextInt()
    var firstDigit: Int = digit/10
    var secondDigit: Int = digit%10
    println("The swap result is ${secondDigit}${firstDigit}")
//    println()
//    println()


//    Question 7. Check whether a number is even or odd
    println("Question 7. Check whether a number is even or odd")
    println("Enter a number: ")
    var value: Int = reader.nextInt()
    if(value % 2 == 0){
        println("The number you entered is an even number")
    }else if (value % 2 == 1){
        println("The number you entered is an odd number")
    }else
        println("Invalid input")
//    println()
//    println()


//8. Find the frequency of a character in a string
//    println("Question 2. Add two Integers")
//    println("Enter the first integer: ")
//    var num1: Int = reader.nextInt()
//    print("Enter the second integer: ")
//    var num2: Int = reader.nextInt()
//    println("The sum of $num1 and $num2 is: ${num1 + num1}")
//    println()
//    println()



//    Question 9. Check whether an alphabet is vowel or consonant
    println("Question 9. Check whether an alphabet is vowel or consonant")
    println("Enter an alphabet: ")
    var ch : Char = reader.next().single()
    when(ch){
        'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'  -> println("$ch is a vowel")
        else -> println("$ch is a consonant")
    }
//    println()
//    println()


//    Question 10. Find the largest among three numbers
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
//    println()
//    println()


//11. Check leap year
    println("Question 11. Check leap year")
    println("Enter a year: ")
    var year : Int = reader.nextInt()
    if (year <= 0) {
        println("Invalid year")
    } else if ((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0)){
        println("Given Year is a leap Year")
    }else println("Given Year is not a leap Year")
//    println()
//    println()



//12. Check whether a character is alphabet or not
//    println("Question 12. Check whether a character is alphabet or not")
//    println("Enter an alphabet: ")
//    var ch : Char = reader.next().single()
//    if( ch in 'a'..'z' || ch in 'B'..'Z'){
//        println("$ch is an alphabet")
//    }else
//        println("$ch is not an alphabet")
////    println()
//    println()



//13. Calculate the sum of natural numbers
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
//    println()
//    println()


//14. Find factorial of a number
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
//    println()
//    println()



//15. Generate Multiplication table
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
//    println()
//    println()



//16. Display Fibonacci series
//    println("Question 2. Add two Integers")
//    println("Enter the first integer: ")
//    var num1: Int = reader.nextInt()
//    print("Enter the second integer: ")
//    var num2: Int = reader.nextInt()
//    println("The sum of $num1 and $num2 is: ${num1 + num1}")
////    println()
//    println()



//17. Find GCD of two numbers
//    println("Question 2. Add two Integers")
//    println("Enter the first integer: ")
//    var num1: Int = reader.nextInt()
//    print("Enter the second integer: ")
//    var num2: Int = reader.nextInt()
//    println("The sum of $num1 and $num2 is: ${num1 + num1}")
//    println()
//    println()



//18. Find LCM of two numbers
//    println("Question 2. Add two Integers")
//    println("Enter the first integer: ")
//    var num1: Int = reader.nextInt()
//    print("Enter the second integer: ")
//    var num2: Int = reader.nextInt()
//    println("The sum of $num1 and $num2 is: ${num1 + num1}")
//    println()
//    println()



//19. Display characters from A-Z using loop
//    println("Question 2. Add two Integers")
//    println("Enter the first integer: ")
//    var num1: Int = reader.nextInt()
//    print("Enter the second integer: ")
//    var num2: Int = reader.nextInt()
//    println("The sum of $num1 and $num2 is: ${num1 + num1}")
//    println()
//    println()


//20. Count number of digits in an integer
//    println("Question 2. Add two Integers")
//    println("Enter the first integer: ")
//    var num1: Int = reader.nextInt()
//    print("Enter the second integer: ")
//    var num2: Int = reader.nextInt()
//    println("The sum of $num1 and $num2 is: ${num1 + num1}")
//    println()
//    println()



//21. Reverse a number
//    println("Question 2. Add two Integers")
//    println("Enter the first integer: ")
//    var num1: Int = reader.nextInt()
//    print("Enter the second integer: ")
//    var num2: Int = reader.nextInt()
//    println("The sum of $num1 and $num2 is: ${num1 + num1}")
//    println()
//    println()



//22. Calculate power of a number
//    println("Question 22. Calculate power of a number")
//    println("Enter the base number: ")
//    var base: Double = reader.nextDouble()
//    print("Enter the power: ")
//    var power: Double = reader.nextDouble()
//    var result: Double = pow(base, power)
//    println("${base.toInt()} to the power of ${power.toInt()} is: ${result.toInt()}")
//    println()
//    println()




}