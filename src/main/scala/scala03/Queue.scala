trait Queue {

    var queue: List[Int] = List()
    var front: Option[Int] = None
    var rear: Option[Int] = None
    var size: Int = 0

    def enqueueFunc(input: Int): Int = input

    def isEmpty: Boolean = queue.isEmpty


    def enqueue(element: Int): List[Int] = {

        val elementToAdd = enqueueFunc(element)
        
        front = if (isEmpty) Some(elementToAdd) else front
        rear = Some(elementToAdd)
        
        size += 1

        queue = elementToAdd +: queue

        queue
    
    }

    def dequeue: List[Int] = {
    
        require(!isEmpty, "Queue is empty! Cannot dequeue.")
    
        front = {
            if (queue.size >= 3) Some(queue.drop(size - 2).head)
            else if (queue.size == 2) Some(queue.head)
            else None
        }

        rear = if (queue.size > 1) rear else None

        size -= 1

        queue = queue.take(size - 1)

        queue

    }

}

class DoubleQueue extends Queue {
    override def enqueueFunc(input: Int): Int = input * 2

}

class SquareQueue extends Queue {
    override def enqueueFunc(input: Int): Int = input * input

}