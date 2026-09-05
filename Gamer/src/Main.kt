import kotlin.random.Random

fun main() {
    var playerHealth = 100
    var enemyHealth = 100

    val sword = listOf(35, 25, 20)
    val axe = listOf(37, 27, 22)
    val bow = listOf(20, 15, 17)

    var weponList = mutableListOf<String>("Sword", "Axe", "Bow")//damage =18,24,12
    //range cm ,c ,ll
    //attack for sword head ,body ,foot -->35 ,25, 20
    //defense low ,back ,jump
    //

    println("Choose a weapon 1 for sword ,2 for axe ,3 for bow")
    val weapon = readLine()!!.toInt()
    var playerWeapon = mutableListOf<String>()
    println("write a to attack on head ,b to attack on body ,c for foot")

    var attack = readLine()!!.toString()
    println("write a to protect head ,b to protect body ,c for foot")
    var protect = readLine()!!.toString()
    var damage = 0
    val enemyWeapon = sword
    if (weapon == 1) {
        playerWeapon = sword
    } else if (weapon == 2) playerWeapon = axe
    else if (weapon == 3) playerWeapon = bow
    while (playerHealth > 0 || enemyHealth > 0) {
        if (attack == "a") {
            damage = playerWeapon.elementAt(0)
        } else if (attack == "b") damage = axe.elementAt(0)
        else if (attack == "c") damage = bow.elementAt(0)
    }
}