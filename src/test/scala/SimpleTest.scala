import org.scalatest._
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class SimpleTest extends FlatSpec with Matchers {
  "A correct test" should "succeed" in {
    1 should be (1)
  }

  "An incorrect test" should "fail" in {
    1 should not be (0)
  }
}
