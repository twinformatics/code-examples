package simulations;

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._

class JsonBodySimulation extends Simulation {
  val httpProtocol = http
    .baseURL("http://localhost:8080/test/")

  val testRun = scenario("stress test")
    .exec(http("testData").get("testAddNumbers").body(RawFileBody("example.json")).asJSON.check(bodyString.is("12")))

  setUp(
    testRun.inject( rampUsersPerSec(1) to 5 during(10 seconds),
    )
  ).protocols(httpProtocol)

}