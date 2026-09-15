fun main()
{
    var a: Array<Int> = arrayOf(1,4,4,344,5,36)
 println(largest(a))
    println(smallest(a))
}
fun largest(a: Array<Int>):Int {
    var max =0
    var temp=0
    for (i in a){
        temp=i
        max = maxOf(max,temp)
    }
    println("largest number is:")
    return max
}
fun smallest(a: Array<Int>):Int {
    var min =0
    var temp=0
    for (i in a){
        temp=i
        min = minOf(min,temp)
    }
    println("smallest number is:")
    return min
}
