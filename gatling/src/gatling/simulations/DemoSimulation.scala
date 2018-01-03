package simulations

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class DemoSimulation extends Simulation {
  val httpProtocol = http
    .baseURL("http://localhost:8080/test/")

  val testRun = scenario("load test")
    .exec(http("testData").get("testData"))
    .exec(http("testDataWithoutFlux").get("testDataWithoutFlux"))

  setUp(
    // https://gatling.io/docs/2.3/general/simulation_setup/
    testRun.inject(rampUsers(100) over(5 seconds)
    )
  ).protocols(httpProtocol)

}