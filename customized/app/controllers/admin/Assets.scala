package controllers.admin

import javax.inject._

import controllers.AssetsBuilder
import play.api.http.HttpErrorHandler

@Singleton
class Assets @Inject() (errorHandler: HttpErrorHandler) extends AssetsBuilder(errorHandler)
