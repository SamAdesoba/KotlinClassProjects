fun main(){

    arrayExample2()

}

private fun arrayExample(){
    val numbers = intArrayOf(1,4,42,-3)
    if (4 in numbers){
        println("numbers in array contains 4")
    }
}

private fun arrayExample2(){
    val numbers = intArrayOf(1,2,3,4)
    if (5 !in numbers){
        println("numbers in array does not contains 5")
    }else {
        println("numbers in array contains 5")
    }
}