fun main(){

arrayExample2()

}
private fun arrayExample1(){
    for (i in 1..3) {
        println(i)
    }
    for (i in 6 downTo 0 step 2) {
        println(i)
    }
}


private fun arrayExample2(){
    for (i in 1..5){
        print("*")
        for (j in 5 downTo 0 step 1){
            print("*")
        }
        println()
    }

}

