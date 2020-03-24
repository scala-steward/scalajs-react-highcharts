package react.highcharts

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._

import org.scalajs.dom.html
import typings.highcharts.TypeofHighcharts
import typings.highcharts.mod.HTMLDOMElement
import typings.highcharts.mod.Options
import scala.scalajs.js.annotation.JSName
import typings.highcharts.mod.Chart_

// import typings.highcharts.seriesLabelMod.Highcharts

@js.native
/*trait WrapProceed extends js.Object {
  // ThisFunction? What This?
  def apply(chart: Chart_, array: js.Array[js.Any]): Unit = js.native
}*/
trait WrapProceed extends js.ThisFunction0[Chart_, Unit]

@js.native
@JSImport("highcharts", JSImport.Default)
private object Highcharts extends TypeofHighcharts {
  @JSName("wrap")
  def wrapThis(obj: js.Any, method: String, func: js.ThisFunction1[Chart_, WrapProceed, Unit]): Unit = js.native
}

final case class Props(highcharts: TypeofHighcharts, options: Options)

/*@js.native
@JSImport("highcharts/modules/series-label", JSImport.Default)
private object SeriesLabelMod extends js.Object {
  def apply(hc: TypeofHighcharts): Unit = js.native
}*/


object Chart {
 
  class Backend($: BackendScope[Props, Unit]) {
    private val containerRef = Ref[html.Element]

    def render(props: Props) = 
      <.div.withRef(containerRef)

    def init(props: Props): Callback =
      containerRef.foreach{element =>
        props.highcharts.chart(element.asInstanceOf[HTMLDOMElement], props.options)
        ()
      }
  }

  private val component =
    ScalaComponent
      .builder[Props]("Chart")
      .renderBackend[Backend]
      .componentDidMount($ => $.backend.init($.props))
      .build

  def apply(options: Options) = component(Props(Highcharts, options))

  def apply(highcharts: TypeofHighcharts, options: Options) = component(Props(highcharts, options))
}
