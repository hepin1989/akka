/*
 * Copyright (C) 2016-2018 Lightbend Inc. <https://www.lightbend.com>
 */

package akka.stream.scaladsl

//#prepend

//#prepend
import akka.stream.{ ActorMaterializer, ActorMaterializerSettings }
import akka.testkit.AkkaSpec

class FlowPrependSpec extends AkkaSpec {

  val settings = ActorMaterializerSettings(system)

  implicit val materializer = ActorMaterializer(settings)

  "An Prepend flow" should {

    "work in entrance example" in {
      //#prepend
      val ladies = Source(List("Emma", "Emily"))
      val gentlemen = Source(List("Liam", "William"))

      gentlemen.prepend(ladies).runWith(Sink.foreach(println))
      // this will print "Emma", "Emily", "Liam", "William"
      //#prepend
    }
  }
}
