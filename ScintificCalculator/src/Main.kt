fun main() {
    println("Enter value of 1st int")
    var input1 = readLine()!!.toInt()
    println("Enter value of 2nd int")
    var input2 = readLine()!!.toInt()
    println("type 1 for adding ,2 for sub ,3 for multi ,4 for division ,5 for power")
    var operator = readLine()!!.toInt()
    var res = 1
    when (operator){
         1-> println(input1+input2)
         2-> println(input1-input2)
         3-> println(input1*input2)
         4-> println(input1/input2)
         5-> for (i in 0..input2-1){
             res = input1*res}
        else-> println("Invalid operator")
    }
    println(res)
}