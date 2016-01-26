package donestore.controllers

import java.util.UUID

import scala.concurrent.ExecutionContext.Implicits.global

import play.api.mvc._

import donestore.DoneStoreComponent

class Application extends Controller with DoneStoreComponent {

  def index() = Action.async {
    chestDao.get(UUID.randomUUID())
      .map(_.map(_.description).getOrElse("No description here"))
      .map(Ok(_))
  }


}
