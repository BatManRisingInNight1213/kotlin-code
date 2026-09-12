import sun.jvm.hotspot.interpreter.Bytecodes.name

fun main(){
    var accountno =26000
    val account1=Account(26000,"Ujjwal",5000 )
    println("what do u want to do")
    print("enter 1 for adding account ,2 to check balance ,3 to add money ,4 to withdraw")
    var entered=readLine()!!.toInt()
    if (entered==1){
        accountno ++
        print("Enter ur name")
        var name=readLine()!!
        println("how much money to deposit")
        var balance=readLine()!!.toInt()
        var account =Account(accountno,name , balance )
    }
    else if(entered==2){
        println("enter ur acc no")
        var accountNo=readLine()!!.toInt()
        println("ur balance is:")
        var account =Account(accountno )
        println(account.seeBalance(accountNo))
    } else if (entered==3){
        var account = Account(accountno)
        println("enter account no")
        var accountNo=readLine()!!.toInt()

    }

    println(account1.balance)
    account1.deposit(26001)
    account1.withdraw(26001)
}