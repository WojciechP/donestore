package donestore.dao

import scala.concurrent.{ExecutionContext, Future}

import com.websudos.phantom.connectors.Connector
import com.websudos.phantom.dsl.UUID

import donestore.dao.dto.Chest

trait ChestDaoComponent { self: Connector =>
  val chestDao: ChestDao

  object ChestDaoImpl extends ChestDao {
    override def get(id: UUID)(implicit ec: ExecutionContext): Future[Option[Chest]] = Future(None)
  }

}
