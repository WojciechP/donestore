package donestore.dao

import com.websudos.phantom.dsl._

import donestore.dao.dto.Chest

trait ChestTable extends CassandraTable[ChestTable, Chest] {
  object user_id extends UUIDColumn(this) with PartitionKey[UUID]
  object id extends UUIDColumn(this) with ClusteringOrder[UUID]
  object name extends StringColumn(this)
  object description extends StringColumn(this)
  object created_date extends DateTimeColumn(this)

  override def fromRow(r: Row): Chest = Chest(
    user_id(r),
    id(r),
    name(r),
    description(r),
    created_date(r)
  )
}
