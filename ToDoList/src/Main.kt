fun main() {
    println("Enter 1 to Add task")
    println("Enter 2 to Show task")
    println("Enter 3 to Complete task")
    println("Enter 4 to Delete task")
    println("Enter 5 to Exit")
    var taskList = mutableListOf<String>()
    var option = readLine()!!.toIntOrNull()
    var isRunning = true
    var completeTasks = mutableListOf<String>()
    while (isRunning) {
        if (option == 1) {
            println("Enter task")
            var task = readLine()!!.toString()
            if (task != null) {
                taskList.add(task)
                println("task added")
            }
            println("What do you want to do next?")
            option = readLine()!!.toIntOrNull()

        } else if (option == 2) {
            println("task list =$taskList")
            println("What do you want to do next?")
            option = readLine()!!.toIntOrNull()

        } else if (option == 3) {
            println("which task is complete")
            var taskNo = readLine()!!.toInt()
           // taskList.removeAt(taskNo - 1)
            if (taskList != null) {completeTasks.add(taskList.removeAt(taskNo - 1))}

            println("Task completed :$completeTasks")
            println("What to do next:$taskList")
            println("What do you want to do next?")
            option = readLine()!!.toIntOrNull()

        } else if (option == 4) {
            println("Which task to del")
            var taskNo = readLine()!!.toInt()
            if (taskList != null) {println("We are deleting [${taskList.removeAt(taskNo - 1)}]")}
            //taskList.removeAt(taskNo - 1)

            println("task deleted")
            println("Remaning tasks $taskList")
            println("What do you want to do next?")
            option = readLine()!!.toIntOrNull()

        } else if (option == 5) {
            isRunning = false
            println("We r out")
        } else {
            println("Invalid input")
            option = readLine()!!.toIntOrNull()
        }
    }
}

fun checkType(option: Any):Boolean {
    if (option is Int) {
        return true
    } else println("Enter valid number")
    return false
}