class Stack {
    private val stack = mutableListOf<Int>()

    fun push(element: Int) {
        stack.add(element)
    }

    fun pop(): Int? {
        if (!isEmpty()) {
            return stack.removeAt(stack.size - 1)
        }
        return null
    }

    fun peek(): Int? {
        if (!isEmpty()) {
            return stack.last()
        }
        return null
    }

    fun isEmpty(): Boolean {
        return stack.isEmpty()
    }
}

fun main() {
    val stack = Stack()

    stack.push(1)
    stack.push(2)
    stack.push(3)

    println("Top of the stack: ${stack.peek()}")  // Output: 3
    println("Popped element: ${stack.pop()}")      // Output: 3
    println("Is the stack empty? ${stack.isEmpty()}")  // Output: false
}
