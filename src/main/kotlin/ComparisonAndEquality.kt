import java.util.Scanner

fun main(){

myMethod()


}

private val reader = Scanner(System.`in`)
private fun myMethod(){
    println("Enter the first number: ")
    val first: Int = reader.nextInt()
    println("Enter the second number: ")
    val second: Int = reader.nextInt()

    if(first > second){
        val max = first
        println("first number is larger than the second \n max = $max")
    }else if (second > first){
        val max = second
        println("Second number is larger than the first \n max = $max")
    }else
        println("They are both equal")
}

private fun intToLong(){
    val number_1: Int = 20
    val number_2: Long = number_1.toLong()
    println(number_2)
}

