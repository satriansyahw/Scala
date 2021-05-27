package controllers

import play.api.mvc._

import javax.inject._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok("Welcome to Scala")
  }
  def printSum(first: Long, second: Long) = Action { implicit request: Request[AnyContent] =>
    val sum = first + second
    Ok(sum.toString)
  }
  def balance(id: String) = Action { implicit request: Request[AnyContent] =>
    Ok("latest balance for "+id+" = 1000")
  }
  def getAddMoney(from: String, amount: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("Money from "+from+" amount = "+amount.toString())
  }
  def addMoney(from: String, amount: Long) = Action { implicit request: Request[AnyContent] =>
    Ok("Put Money from "+from+" amount = "+amount.toString())
  }
  def add(from: String, amount: Long) = Action { implicit request: Request[AnyContent] =>

    Ok("Post Money from "+from+" amount = "+amount.toString())
  }
}
