object TestData {
    // DoubleQueue test data

    val q0 = new DoubleQueue

    val q1 = new DoubleQueue

    q1.enqueue(1)
    q1.enqueue(2)
    q1.enqueue(3) // List(6, 4, 2)

    val q2 = new DoubleQueue

    q2.enqueue(1)
    q2.enqueue(2)
    q2.enqueue(3)
    q2.enqueue(4)
    q2.enqueue(5) // List(10, 8, 6, 4, 2)

    val q3 = new DoubleQueue

    q3.enqueue(1)
    q3.enqueue(2) // List(4, 2)

    val q4 = new DoubleQueue

    q4.enqueue(10) // List(20)


    /* ------------------------------------ */


    // SquareQueue test data

    val dq0 = new SquareQueue

    val dq1 = new SquareQueue

    dq1.enqueue(1)
    dq1.enqueue(2)
    dq1.enqueue(3) // List(9, 4, 1)

    val dq2 = new SquareQueue

    dq2.enqueue(1)
    dq2.enqueue(2)
    dq2.enqueue(3)
    dq2.enqueue(4)
    dq2.enqueue(5) // List(25, 16, 9, 4, 1)

    val dq3 = new SquareQueue

    dq3.enqueue(1)
    dq3.enqueue(2) // List(4, 1)

    val dq4 = new SquareQueue

    dq4.enqueue(10) // List(100)


    /* ------------------------------------ */


    // Person test data

    val john = new Person("John", 25)
    val john2 = new Person("John", 25)
    val john3 = new Person("John", 1)
    val john4 = new Person("John", 100)

    val mary = new Person("Mary", 37)

    val kate = new Person("Kate", 14)

    val rodney = new Person("Rodney", 65)

    val annabeth = new Person("Annabeth", 22)

}