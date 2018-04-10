package controllers

import play.api.mvc.Controller

class WelcomeController extends Controller {
  def welcome() = Action {
    OK
  }
}
