package org.heju.jkk.acceptance

import org.testfx.api.FxAssert
import org.testfx.matcher.base.NodeMatchers

/**
 * Created by Henrik Brauer on 26.06.2015.
 */
class JmxConnectionTest extends TestFxFeatureSpec {

  val serverUrl = "localhost:8080"

  info("As a User I want to enter a IP address and connect to a JMX server")

  feature("Connect to Server"){
    scenario("A User sets a server address to which he will connect"){
      Given("A JMX server to connect to")

      When("A IP address is set")

      clickOn("File")
      clickOn("New Connection")
      clickOn("#url")
      write(serverUrl)
clickOn("#ok")


      Then("The client should be connected to the JMX server and appear under connect servers")
      FxAssert.verifyThat( "#connections", NodeMatchers.hasChild(serverUrl) );
    }

    scenario("A User sets a ip address to a offline server which he will connect"){
      Given("")

      When("A IP address is set")

      Then("The client should be display a error message that the JMX server is not reachable")

    }
  }


}
