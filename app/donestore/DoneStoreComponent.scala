package donestore

import donestore.dao.connection.Defaults
import donestore.dao.{ChestDao, ChestDaoComponent}

trait DoneStoreComponent
    extends Defaults.keySpace.Connector
    with ChestDaoComponent {
  override val chestDao: ChestDao = ChestDaoImpl
}
