package simulations

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._

class EnduranceSimulation extends Simulation {
  val httpProtocol = http
    .baseURL("http://localhost:8080/test/")

  val testRun = scenario("endurance test")
    .exec(http("testData").get("testData"))

  setUp(
    testRun.inject(constantUsersPerSec(20) during (120 minutes)
    )
  ).protocols(httpProtocol)

}