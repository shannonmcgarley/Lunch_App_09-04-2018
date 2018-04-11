package controllers

import Services.GreetingService
import play.api.mvc.{Action, Controller}
import com.google.inject.Inject

class WelcomeController @Inject()(greeter : GreetingService) extends Controller {
  def welcome() = Action {
    val greeting = greeter.greeting
  Ok(views.html.welcome(greeting))
  }
}
