package controllers

import play.api.data.Form
import play.api.data.Forms._
import play.api.mvc._

object Application extends Controller {

  case class FormData(input: String)

  val form1 = Form(mapping("input" -> text)(FormData.apply)(FormData.unapply))

  def index = Action {
    Ok(views.html.index("フォームを送信", form1))
  }

  def send = Action {
    implicit request =>
      val resform = form1.bindFromRequest
      val res = "you typed: " + resform.get.input
      Ok(views.html.index(res, resform))
  }
}