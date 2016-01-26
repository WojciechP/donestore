package donestore.dao.dto

import com.websudos.phantom.dsl.UUID

import org.joda.time.DateTime

case class Chest(
  user_id: UUID,
  id: UUID,
  name: String,
  description: String,
  created_date: DateTime
)
