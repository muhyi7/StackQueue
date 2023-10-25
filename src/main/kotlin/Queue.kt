import java.util.LinkedList

class Queue {
    private val queue = LinkedList<Int>()

    fun enqueue(element: Int) {
        queue.add(element)
    }

    fun dequeue(): Int? {
        if (!isEmpty()) {
            return queue.removeFirst()
        }
        return null
    }

    fun peek(): Int? {
        if (!isEmpty()) {
            return queue.first
        }
        return null
    }

    fun isEmpty(): Boolean {
        return queue.isEmpty()
    }
}

fun main() {
    val queue = Queue()

    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)

    println("Front of the queue: ${queue.peek()}")  // Output: 1
    println("Dequeued element: ${queue.dequeue()}")  // Output: 1
    println("Is the queue empty? ${queue.isEmpty()}")  // Output: false
}
