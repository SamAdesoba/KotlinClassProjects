import java.util.Scanner
fun main(){

scannerUse()


}
private fun scannerUse(){
    val reader = Scanner(System.`in`)
    print("Enter a number: ")
    var number: Int = reader.nextInt()
    println("You entered: $number")
}


private fun userInput(){
    print("Enter text: ")
    val stringInput = readLine()!!
    println("You entered: $stringInput")

    print("Enter number: ")
    val intInput: Int = readLine()!!.toInt()
    println("You entered: $intInput")
}