import kotlin.random.Random

fun main() {
    println("Enter a no. b/w 1 - 100")
    var noOfGuess = 0
    val randomNo = Random.nextInt(0, 100)
    var answer = readLine()!!.toInt()
    var doWeFoundAnwer = false
    while (!doWeFoundAnwer) {
        if (randomNo == answer) {
            noOfGuess++
            println("U have tried $noOfGuess guesses.")
            doWeFoundAnwer = true
        } else if (randomNo > answer) {
            noOfGuess++
            println("U have tried $noOfGuess guesses.")
            println("type larger no")
            answer = readLine()!!.toInt()
        } else if (randomNo < answer) {
            noOfGuess++
            println("U have tried $noOfGuess guesses.")
            println("type smaller no")
            answer = readLine()!!.toInt()
        }
    }
    var playAgain =false
    if (playAgain) {}
}