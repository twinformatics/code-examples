package simulations;

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._

// https://gatling.io/docs/2.3/session/feeder/
class FeederSimulation extends Simulation {

  val csvFeeder = csv("data.csv").random

  val httpProtocol = http
    .baseURL("http://localhost:8080/test/")

  val testRun = scenario("load test")
      .feed(csvFeeder)
    .exec(http("testData").get("testData?id=" + "${id}"))

  setUp(
    testRun.inject(rampUsers(100) over(5 seconds)
    )
  ).protocols(httpProtocol)

}