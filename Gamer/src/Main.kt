import kotlin.random.Random

fun main() {
    var playerHealth = 100
    var enemyHealth = 100
    var comp = 0
    var inHand = listOf(0)
    val sword = listOf(35, 25, 20)
    val axe = listOf(37, 27, 22)
    val bow = listOf(20, 15, 17)
    Ground()
    println("Choose a weapon 1 for sword ,2 for axe ,3 for bow")
    var playerWeapon = readLine()!!.toInt()
    if (playerWeapon == 1) inHand = sword
    else if (playerWeapon == 2) inHand = axe
    else if (playerWeapon == 3) inHand = bow

    while (playerHealth > 10 && enemyHealth > 10) {
        var enemy = Enemy(bow)
        val damage = enemy.first
        var diffance = enemy.second

        println("Enter 1 to attack head ,2 to body ,3 to foot")
        var playerAttack = readLine()!!.toInt()
        println("Enter 1 to protect head ,2 to body ,3 to foot")
        var playerProtect = readLine()!!.toInt()

        comp = bow[playerProtect - 1]
        if (comp == damage) {
            println("safe")
        } else playerHealth = playerHealth - damage
        if (playerAttack == diffance) {
            println("enemy dodge")
        } else enemyHealth = enemyHealth - inHand[playerAttack]
        println("Enemy Health $enemyHealth")
        println("Player Health $playerHealth")

    }
}

fun Enemy(Weapon: List<Int>): Pair<Int, Int> {
    var attack = Random.nextInt(0, 3)

    var damage = 0
    if (attack == 0) {
        damage = Weapon[0]
    }//on head
    else if (attack == 1) {
        damage = Weapon[1]
    }//on body
    else if (attack == 2) {
        damage = Weapon[2]
    }//on foot
    else println("enter a valid number")

    var diffance = Random.nextInt(0, 3)

    return Pair(damage, diffance)
}

fun Ground(){
    val len = 30
    val wid =30
    var x_position = 15
    var y_position = 10

    val newPosition = Movement(x_position, y_position)

    x_position = newPosition.first
    y_position = newPosition.second

    for (i in 1..len) {
        for (j in 1..wid) {
            if ((i == 1 || j==1) || (i==30  || j==30) || (i==1 || j==30) || (i==30 || j==1)){
                print("\uD83C\uDF33")// tree emoji
            }

            print("\uD83D\uDFE9 ") //green block
            if (i==x_position && j == y_position) {
                print("X ")
            }
        }
        println()
    }
}

fun Movement(x_position: Int, y_position: Int): Pair<Int, Int> {
    var x = x_position
    var y = y_position

    println("Enter w to move forward ,\ns to backward ,\na to move left ,\nd to right")

    var input = readLine()!!.toString()
    var working = true
    print(x)
    if (working) {
        if (input.equals("w",ignoreCase = true)) x++
        else if (input.equals("d",ignoreCase = true)) y++
        else if (input.equals("a", ignoreCase = true)) y--
        else if (input.equals("s", ignoreCase = true)) x--
    }
    print(x)
    return Pair(x, y)
}