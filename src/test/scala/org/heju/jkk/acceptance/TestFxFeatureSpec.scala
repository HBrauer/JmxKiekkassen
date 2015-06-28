package org.heju.jkk.acceptance

import javafx.fxml.FXMLLoader
import javafx.scene.{Parent, Scene}
import javafx.stage.Stage

import org.scalatest.{BeforeAndAfterEach, FeatureSpecLike, GivenWhenThen}
import org.testfx.framework.junit.ApplicationTest


/**
 * Created by Henrik on 27.06.2015.
 */

abstract class TestFxFeatureSpec extends  ApplicationTest with FeatureSpecLike with GivenWhenThen with BeforeAndAfterEach{

  override def beforeEach(): Unit = {
    internalBefore()
  }

  override def afterEach(): Unit = {
    internalAfter()
  }

  override def start(stage: Stage): Unit = {
    val root = FXMLLoader.load[Parent](getClass().getResource("/org/heju/jkk/view/MainView.fxml"))
    stage.setScene(new Scene(root))
    stage.show
  }

}
