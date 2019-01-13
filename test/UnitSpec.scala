import controllers.CountController
import org.scalatestplus.play._
import play.api.test.FakeRequest
import play.api.test.Helpers._
import services.Counter

/**
  * Unit tests can run without a full Play application.
  */
class UnitSpec extends PlaySpec {

  "CountController" should {

    "return a valid result with action" in {
      val counter: Counter = () => 49
      val controller = new CountController(stubControllerComponents(), counter)
      val result = controller.count(FakeRequest())
      contentAsString(result) must equal("49")
    }
  }
}
