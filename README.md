# Scala 03 - OOP

1. Make a trait Queue which performs two functions of enqueue and dequeue.
* Two classes: DoubleQueue and SquareQueue mix in this trait.
* You may use List for the implementation and keep both the classes in the same file with proper packaging.

DoubleQueue enqueues the element after doubling them
SquareQueue enqueues the element after squaring them
dequeue method will remove the first element from the queue(having concrete definition in trait Queue).

2. Define a class named Person and mix it with Ordered Trait to do the comparison.
First, check if the name parameter of both objects is equal. If yes, then do the comparison according to age.
If name is not equal then do the comparison based on name length.
```
class Person(val name: String, val age: Int) extends Ordered[Person] {
}

// For example:
// Input: 
personOne = new Person("Test", 24)
personTwo = new Person("Test", 25)
personOne < personOne // Output: true

//Input: 
personOne = new Person("TestAgain", 24)
personTwo = new Person("Test", 25)
personOne < personOne // Output: false
```


## To run locally

`sbt test`