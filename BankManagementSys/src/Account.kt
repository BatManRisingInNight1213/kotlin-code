class Account (
    val accountNumber: Int,
    val accountName:String,
    var balance:Int
){
    fun deposite(accountNumber: Int){
        println("Enter Amount to deposit:")
        var depositAmount = readLine()!!.toInt()
        println("Do u want to deposit Rs.$depositAmount ,y for yes / n for no")
        var confirm= readLine()!!.toString()
        if (confirm == "y"){balance =depositAmount +balance}
        println("Your current balance =$balance")
    }

    fun withdraw(accountNumber: Int){
        println("Enter Amount to withdraw:")
        var withdrawAmount = readLine()!!.toInt()
        println("Do u want to withdraw Rs.$withdrawAmount ")
        var confirm= readLine()!!.toString()
        if (confirm == "y"){balance =balance- withdrawAmount}
        println("Your current balance =$balance")
    }

}