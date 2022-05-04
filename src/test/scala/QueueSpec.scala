import TestData._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class QueueSpec extends AnyFlatSpec with Matchers {
    "new DoubleQueue" should "initialize empty DoubleQueue" in {
        
        q0.size shouldEqual 0
        q0.front shouldEqual None
        q0.rear shouldEqual None
        q0.isEmpty shouldEqual true

    }

    "Calling enqueue on an empty DoubleQueue" should "add to the front and rear of the queue and increase size by 1" in {
        
        q0.enqueue(1)
        
        q0.size shouldEqual 1
        q0.front shouldEqual Some(2)
        q0.rear shouldEqual Some(2)
        q0.isEmpty shouldEqual false

    }

    "Calling enqueue(4) on a non-empty DoubleQueue" should "add 8 to rear of the queue and increase size by 1" in {

        q1.enqueue(4)

        q1.size shouldEqual 4
        q1.rear shouldEqual Some(8)

    }

    "Calling dequeue on an empty DoubleQueue" should "throw IllegalArgumentException" in {
        val emptyDoubleQueue = new DoubleQueue

        intercept[IllegalArgumentException] {
            emptyDoubleQueue.dequeue
        }
    }

    "Calling dequeue on a non-empty DoubleQueue" should "change front of queue and decrease size by 1" in {
        
        q2.dequeue

        q2.size shouldEqual 4
        q2.front shouldEqual Some(4)
        q2.rear shouldEqual Some(10)

    }

    "Calling dequeue on a DoubleQueue with size 2" should "change front and rear of queue and decrease size by 1" in {
        
        q3.dequeue

        q3.size shouldEqual 1
        q3.front shouldEqual Some(4)
        q3.rear shouldEqual Some(4)
        
    }

    "Calling dequeue on a DoubleQueue with size 1" should "return empty queue" in {
        
        q4.dequeue

        q4.size shouldEqual 0
        q4.front shouldEqual None
        q4.rear shouldEqual None
        
    }

    // SquareQueue

    "new SquareQueue" should "initialize empty SquareQueue" in {
        
        dq0.size shouldEqual 0
        dq0.front shouldEqual None
        dq0.rear shouldEqual None
        dq0.isEmpty shouldEqual true

    }

    "Calling enqueue on an empty SquareQueue" should "add to the front and rear of the queue and increase size by 1" in {
        
        dq0.enqueue(1)
        
        dq0.size shouldEqual 1
        dq0.front shouldEqual Some(1)
        dq0.rear shouldEqual Some(1)
        dq0.isEmpty shouldEqual false

    }

    "Calling enqueue(4) on a non-empty SquareQueue" should "add 16 to rear of the queue and increase size by 1" in {

        dq1.enqueue(4)

        dq1.size shouldEqual 4
        dq1.rear shouldEqual Some(16)

    }

    "Calling dequeue on an empty SquareQueue" should "throw IllegalArgumentException" in {
        val emptySquareQueue = new SquareQueue

        intercept[IllegalArgumentException] {
            emptySquareQueue.dequeue
        }
    }

    "Calling dequeue on a non-empty SquareQueue" should "change front of queue and decrease size by 1" in {
        
        dq2.dequeue

        dq2.size shouldEqual 4
        dq2.front shouldEqual Some(4)
        dq2.rear shouldEqual Some(25)

    }

    "Calling dequeue on a SquareQueue with size 2" should "change front and rear of queue and decrease size by 1" in {
        
        dq3.dequeue

        dq3.size shouldEqual 1
        dq3.front shouldEqual Some(4)
        dq3.rear shouldEqual Some(4)
        
    }

    "Calling dequeue on a SquareQueue with size 1" should "return empty queue" in {
        
        dq4.dequeue

        dq4.size shouldEqual 0
        dq4.front shouldEqual None
        dq4.rear shouldEqual None
        
    }
}