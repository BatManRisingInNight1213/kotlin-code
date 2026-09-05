fun main() {
    println("Enter 1 to Add task")
    println("Enter 2 to Show task")
    println("Enter 3 to Complete task")
    println("Enter 4 to Delete task")
    println("Enter 5 to Exit")

    var taskList = mutableListOf<String>()
    var option = readLine()!!.toInt()
    var isRunning = true

    while (isRunning) {
        if (option == 1) {
            println("Enter task")
            var task = readLine()!!.toString()
            taskList.add(task)
            println("task added")
            option = readLine()!!.toInt()
        } else if (option == 2) {
            println("task list =$taskList")
            option = readLine()!!.toInt()
        } else if (option == 3) {
            println("which task is complete")
            var taskNo = readLine()!!.toInt()
            taskList.removeAt(taskNo - 1)
            println("task removed")
            option = readLine()!!.toInt()
        } else if (option == 4) {
            println("Which task to del")
            var taskNo = readLine()!!.toInt()
            taskList.removeAt(taskNo - 1)
            println("task deleted")
            option = readLine()!!.toInt()
        } else if (option == 5) {
            isRunning = false
            println("We r out")
        }
    }
}