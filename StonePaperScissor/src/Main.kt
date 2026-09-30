import kotlin.random.Random

fun main(){
    var userpoint =0
    var compPoints=0
    val comp =Random.nextInt(0,3)
    println("howmany time to play")
    var time=readLine()!!.toInt()

    while(time>0){
    var input = readLine()!!.toInt()
    if ((comp == 0 && input ==1 )|| (comp ==1 && input ==1) || (comp ==2 && input ==0)) {
        userpoint++
    }
    else if ((comp == 1 && input == 0)|| (comp ==2 && input ==1) || (comp ==0 && input ==2)) {
        compPoints++
    }
    else {
        print("Draw")
    }
}}