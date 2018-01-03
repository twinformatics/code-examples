package simulations

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._

class StressSimulation extends Simulation {
  val httpProtocol = http
    .baseURL("http://localhost:8080/test/")

  val testRun = scenario("stress test")
    .exec(http("testData").get("testData"))

  setUp(
    testRun.inject( rampUsersPerSec(10) to 1000 during(60 seconds),
    )
  ).protocols(httpProtocol)

}