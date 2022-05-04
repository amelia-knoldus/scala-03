class Person(val name: String, val age: Int) extends Ordered[Person] {

    override def equals(that: Any): Boolean = that match{
        case that: Person if this.name == that.name => this.age == that.age 
        case that: Person => this.name.length == that.name.length 
        case _ => false
    }

    override def compare(that: Person): Int = {
        if (this.name == that.name) this.age - that.age 
        else this.name.length - that.name.length 
    }
} 