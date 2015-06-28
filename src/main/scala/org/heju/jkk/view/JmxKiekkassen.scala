package org.heju.jkk.view

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.{Scene, Parent}
import javafx.stage.Stage

/*
 *
 * JMXKiekkassen - The Simple JMX Monitoring Tool
 *
 * Copyright (C) 2015 Henrik Brauer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

/**
 * Created by Henrik Brauer on 28.06.2015.
 */

object JmxKiekkassen {
  def main(args: Array[String]) {
    Application.launch(classOf[JmxKiekkassen], args: _*)
  }
}

class JmxKiekkassen  extends Application {
  override def start(stage: Stage) {
    val root = FXMLLoader.load[Parent](getClass().getResource("/org/heju/jkk/view/MainView.fxml"))
    stage.setScene(new Scene(root))
    stage.show
  }
}


