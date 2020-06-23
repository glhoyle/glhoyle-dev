import org.scalajs.dom

import slinky.core._
import slinky.web.ReactDOM
import slinky.web.html._

object ScalaJSExample {
  def main(args: Array[String]): Unit = {
    println("Call the ScalaJS stuff.")
    if (dom.document.getElementById("mainDiv") != null) {
      glhoyleDevJS.init()
    }
  }
}
