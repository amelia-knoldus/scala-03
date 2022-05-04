import TestData._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PersonSpec extends AnyFlatSpec with Matchers {

    "Two people with the same name and same age" should "be equal" in {
        
        john == john2 shouldEqual true
   
    }

    "Two people with the same name" should "be compared based on age" in {

        john == john3 shouldEqual false
        john >= john3 shouldEqual true
        john > john3 shouldEqual true
        john <= john3 shouldEqual false
        john < john3 shouldEqual false
        
        john == john4 shouldEqual false
        john >= john4 shouldEqual false
        john > john4 shouldEqual false
        john <= john4 shouldEqual true
        john < john4 shouldEqual true

    }

    "Two people with different names of the same length" should "be equal" in {

        john == mary shouldEqual true
        john >= mary shouldEqual true
        john > mary shouldEqual false
        john <= mary shouldEqual true
        john < mary shouldEqual false

        john == kate shouldEqual true
        john >= kate shouldEqual true
        john > kate shouldEqual false
        john <= kate shouldEqual true
        john < kate shouldEqual false
    
    }

    "Two people with different names of different length" should "be compared based on name length" in {

        john == rodney shouldEqual false
        john >= rodney shouldEqual false
        john > rodney shouldEqual false
        john <= rodney shouldEqual true
        john < rodney shouldEqual true

        john == annabeth shouldEqual false
        john >= annabeth shouldEqual false
        john > annabeth shouldEqual false
        john <= annabeth shouldEqual true
        john < annabeth shouldEqual true

    }

}