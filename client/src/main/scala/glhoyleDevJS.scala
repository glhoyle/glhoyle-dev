import org.scalajs.dom
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.document
import org.scalajs.dom.html
import org.scalajs.dom.experimental.Headers
import org.scalajs.dom.experimental.Fetch
import org.scalajs.dom.experimental.HttpMethod
import org.scalajs.dom.experimental.RequestMode
import org.scalajs.dom.experimental.RequestInit
import scala.scalajs.js.Thenable.Implicits._
import play.api.libs.json.JsError
import play.api.libs.json.JsSuccess
import scala.scalajs.js.annotation.JSExportTopLevel
import scalajs.js
import scala.concurrent.duration._
import slinky.web.svg.d

import slinky.core._
import slinky.web.ReactDOM
import slinky.web.html._

object glhoyleDevJS {

  def init(): Unit = {
        document.getElementById("home").asInstanceOf[js.Dynamic].hidden = false
        document.getElementById("about").asInstanceOf[js.Dynamic].hidden = true
        document.getElementById("projects").asInstanceOf[js.Dynamic].hidden = true
        document.getElementById("resume").asInstanceOf[js.Dynamic].hidden = true
        document.getElementById("contact").asInstanceOf[js.Dynamic].hidden = true
  }

    @JSExportTopLevel("showHome")
    def showHome(): Unit = {
        document.getElementById("home").asInstanceOf[js.Dynamic].hidden = false
        document.getElementById("about").asInstanceOf[js.Dynamic].hidden = true
        document.getElementById("projects").asInstanceOf[js.Dynamic].hidden = true
        document.getElementById("resume").asInstanceOf[js.Dynamic].hidden = true
        document.getElementById("contact").asInstanceOf[js.Dynamic].hidden = true
  }

    @JSExportTopLevel("showAbout")
    def showAbout(): Unit = {
        document.getElementById("home").asInstanceOf[js.Dynamic].hidden = true
        document.getElementById("about").asInstanceOf[js.Dynamic].hidden = false
        document.getElementById("projects").asInstanceOf[js.Dynamic].hidden = true
        document.getElementById("resume").asInstanceOf[js.Dynamic].hidden = true
        document.getElementById("contact").asInstanceOf[js.Dynamic].hidden = true
  }

    @JSExportTopLevel("showProjects")
    def showProjects(): Unit = {
        document.getElementById("home").asInstanceOf[js.Dynamic].hidden = true
        document.getElementById("about").asInstanceOf[js.Dynamic].hidden = true
        document.getElementById("projects").asInstanceOf[js.Dynamic].hidden = false
        document.getElementById("resume").asInstanceOf[js.Dynamic].hidden = true
        document.getElementById("contact").asInstanceOf[js.Dynamic].hidden = true
  }

    @JSExportTopLevel("showResume")
    def showResume(): Unit = {
        document.getElementById("home").asInstanceOf[js.Dynamic].hidden = true
        document.getElementById("about").asInstanceOf[js.Dynamic].hidden = true
        document.getElementById("projects").asInstanceOf[js.Dynamic].hidden = true
        document.getElementById("resume").asInstanceOf[js.Dynamic].hidden = false
        document.getElementById("contact").asInstanceOf[js.Dynamic].hidden = true
  }

    @JSExportTopLevel("showContact")
    def showContact(): Unit = {
        document.getElementById("home").asInstanceOf[js.Dynamic].hidden = true
        document.getElementById("about").asInstanceOf[js.Dynamic].hidden = true
        document.getElementById("projects").asInstanceOf[js.Dynamic].hidden = true
        document.getElementById("resume").asInstanceOf[js.Dynamic].hidden = true
        document.getElementById("contact").asInstanceOf[js.Dynamic].hidden = false
  }
  
}

