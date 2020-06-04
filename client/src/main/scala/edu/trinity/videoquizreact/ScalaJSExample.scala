package edu.trinity.videoquizreact

import org.scalajs.dom

import slinky.core._
import slinky.web.ReactDOM
import slinky.web.html._

object ScalaJSExample {

  def main(args: Array[String]): Unit = {
    // dom.document.getElementById("scalajsShoutOut").textContent = SharedMessages.itWorks
    println("Call the react stuff.")
    ReactDOM.render(
      h1(""),
      dom.document.getElementById("root")
    )

  }
}
