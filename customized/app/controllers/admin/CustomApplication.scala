package controllers.admin

import javax.inject._
import play.api.Configuration
import play.api.mvc._

import scala.concurrent.ExecutionContext

@Singleton
class CustomApplication @Inject()(configuration: Configuration)
                                 (implicit ec: ExecutionContext) extends Controller {
  def index() = Action {
     Ok(views.html.admin.index(
       configuration.getString("csr.custom").getOrElse("Some default csr custom setting")
      )
     )
  }

}
