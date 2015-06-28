package org.heju.jkk.view

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

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.TextField

/**
 * Created by Henrik Brauer on 27.06.2015.
 */
class ConnectionDialogController {


  @FXML
  private var url: TextField = null

  @FXML
  def ok(event: ActionEvent ): Unit =  {

  }

  @FXML
  def cancel(event: ActionEvent ): Unit =  {

  }


}
