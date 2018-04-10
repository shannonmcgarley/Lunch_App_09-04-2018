package controllers

import org.scalatestplus.play.PlaySpec
import org.scalatestplus.play.guice.GuiceOneAppPerTest
import play.api.test.FakeRequest


class WelcomeControllerSpec extends PlaySpec with GuiceOneAppPerTest {

"WelcomeController Get" should{
  "return a successful response" in {
    val controller = new WelcomeController
    val result = controller.welcome.apply(FakeRequest())
    status(result) mustBe OK
  }
}

}
