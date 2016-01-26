package donestore.dao.connection

import com.websudos.phantom.connectors.ContactPoint

object Defaults {
  val keySpace = ContactPoint.local.keySpace("donestore")
  // val Connector = ContactPoints(Seq("localhost", "10.4.2.2"), 9042)
}
