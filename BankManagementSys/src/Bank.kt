class Bank(
    var account=mutableListOf<Account>()
){


    fun addAccount(account: Account){
        accounts.add(account)
    }
    fun findAccount(accountNumber: Int): Account?{

    }
}