fun main(){
    val a = 10
    val b = 9
    val c = -1
    val result: Boolean
    val result1: Boolean
    val result2: Boolean
    val result3: Boolean

    result = (a>b) && (a>c)
    result1 = (a>b) and (a>c)
    result2 = (a>b) || (a>c)
    result3 = (a>b) or (a>c)
    println(result)
    println(result1)
    println(result2)
    println(result3)
}