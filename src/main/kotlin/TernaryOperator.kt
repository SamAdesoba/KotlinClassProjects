import java.sql.Date
import java.util.*

fun main(){
    outerBreak()


}


private fun ternary(){
    val number = 5
    val result = if (number > 5) "Positive Number" else "Negative Number"
    println(result)
}

private fun ifCondition(){
    val a = -9
    val b = -11
    val max = if (a>b){
        println("$a is larger than $b")
        println("max variable holds value of a")
        a
    }else {
        println("$b is larger than $a")
        println("max variable holds value of b")
        b
    }
    println("max = $max")
}

private fun nextedIf(){
    val reader = Scanner(System.`in`)
    print("Enter the first number: ")
    var n1: Int = reader.nextInt()
    print("Enter the second number: ")
    var n2: Int = reader.nextInt()
    print("Enter the third number: ")
    var n3: Int = reader.nextInt()
    val max = if (n1 > n2){
        if (n1 > n3) n1 else n3
    }else {
        if (n2 > n3) n2 else n3
    }
    println("max = $max")
}

private fun whenCondition(){
    val reader = Scanner(System.`in`)
    print("Enter the first number: ")
    var ch : Char = reader.next().single()
    when(ch){
        'A' -> println("A is a vowel")
        'E' -> println("E is a vowel")
        'I' -> println("I is a vowel")
        'O' -> println("O is a vowel")
        'U' -> println("U is a vowel")
        else -> println("$ch is a constant")
    }
}

private fun oneLineWhenCondition(){
    val reader = Scanner(System.`in`)
    print("Enter a vowel: ")
    var ch : Char = reader.next().single()
    when(ch){
        'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'  -> println("$ch is a vowel")
        else -> println("$ch is a consonant")
    }
    print("Enter a number between 1 and 5: ")
    var num : Int = reader.nextInt()
    when(num){
        1,2,3,4,5  -> println("You entered $num")
        else -> println("$num is not a number between 1 - 5")
    }
}

private fun oneLineWhenCondition2(){
    val reader = Scanner(System.`in`)
    print("Enter a number between -1 and 3: ")
    var num : Int = reader.nextInt()
    when(num){
        1,2,3  -> println("$num is a positive integer less than 4")
        0  -> println("$num is a zero")
        -1,-2  -> println("$num is a negative number greater than -3")
    }
}

private fun timeConverter(){
    val reader = Scanner(System.`in`)
    print("Enter a 24 hours time: ")
    var num : Int = reader.nextInt()
    if (num % 12 > 0 && num != 12){
        var time : Int = num-12
        println("the time is ${time}:00pm")
    }else if (num == 12){
        println("the time is ${num}:00noon")
    }else if(num == 24 || num == 0){
        println("the time is 00:00am")
    }else if(num <= 0 || num > 24){
        println("invalid Input")
    }else {
        println("the time is ${num}:00am")
    }
}

private fun whenInUsage(){
    val reader = Scanner(System.`in`)
    print("Enter a vowel: ")
    var ch : Char = reader.next().single()
    print("Enter a number between 1 and 5: ")
    var num : Int = reader.nextInt()
    when(num){
        in 1..10  -> println("A positive number less than 11.")
        in 10..100  -> println("A positive number less than 11.")
    }
}

private fun checkLeap() {
    val reader = Scanner(System.`in`)
    print("Enter a year: ")
    var year : Int = reader.nextInt()
    if (year <= 0) {
        println("Invalid year")
    } else if ((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0)){
        println("Given Year is a leap Year")
    }else println("Given Year is not a leap Year")
}

private fun whileLoop() {
    var num = 10
    while (num >= 5){
        println("Loop $num")
        num--
    }
}

private fun sumLoop() {
    var num = 100
    var sum = 0
    while (num >= 0){
        sum += num
        num--
    }
    println("Sum of natural number from 1 to 100 is $sum")
}

private fun breakExample() {
    var num: Int
    var sum = 0
    while (true){
        println("Enter a number: ")
        num = readLine()!!.toInt()
        if(num == 0)
            break
        sum += num
        println("Sum = $sum")
    }
}

private fun labelBreak() {
    first@ for (i in 1..4){
        second@ for (j in 1..2){
            println("i = $i ; j = $j")
            if (i == 3)
                break@first
        }
    }
}

private fun outerBreak(){
    var num1 = 4
    outer@while (num1 >0){
        var num2 = 4
        inner@ while (num2 > 0){
            if(num1 ==2)
                break@outer
            println("num1 = $num1, num2 = $num2")
            num2--
        }
        num1--
    }
}