/*
 * Copyright (C) 2018 Lightbend Inc. <https://www.lightbend.com>
 */

package akka.remote.transport

import akka.actor.Address

trait StaticAddressBinding { self: Transport ⇒

  private[akka] def boundAddress: Address

}
