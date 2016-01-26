package donestore.dao

import scala.concurrent.{ExecutionContext, Future}

import com.websudos.phantom.dsl.UUID

import donestore.dao.dto.Chest

trait ChestDao {

  def get(id: UUID)(implicit ec: ExecutionContext): Future[Option[Chest]]

}
