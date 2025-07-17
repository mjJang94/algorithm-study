package 스택_큐_덱_1.오키도키간식드리미

fun main() {
    val n = readln().toInt()

    val queue = ArrayDeque(readln().split(" ").map { it.toInt() })
    val stack = ArrayDeque<Int>()

    var currentOrder = 1

    while (queue.isNotEmpty()) {
        if (queue.first() == currentOrder) {
            queue.removeFirst()
            currentOrder++
        }else if (stack.isNotEmpty() && stack.first() == currentOrder) {
            stack.removeFirst()
            currentOrder++
        }else {
            stack.addFirst(queue.removeFirst())
        }
    }

    while (stack.isNotEmpty()) {
        if (currentOrder == stack.removeFirst()) {
            currentOrder++
        }else {
            break
        }
    }

    print(if (stack.isEmpty()) "Nice" else "Sad")
}