package shop.domain

import io.estatico.newtype.macros.newtype
import java.{util => ju}
import shop.domain.cart._
import shop.domain.item._

object order {
  @newtype case class OrderId(uuid: ju.UUID)

  case class Order(
    id: OrderId,
    items: Map[ItemId, Quantity],
    total: USD
  )
}