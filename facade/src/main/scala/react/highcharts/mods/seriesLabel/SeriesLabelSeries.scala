package react.highcharts.mods.seriesLabel

import scalajs.js
import js.|
import typings.highcharts.mod.Series
import typings.highcharts.mod.Point
import typings.highcharts.mod.SVGElement
import typings.highcharts.mod.BBoxObject
import typings.highcharts.mod.PositionObject

// https://github.com/highcharts/highcharts/blob/master/ts/modules/series-label.src.ts

@js.native
trait LabelClearPointObject extends PositionObject {
  val connectorPoint: js.UndefOr[Point]
  val weight: Double
}

@js.native
trait SeriesLabelSeries extends Series {
  val interpolatedPoints: js.UndefOr[js.Array[Point]]
  val labelBySeries: js.UndefOr[SVGElement]
  val sum: js.UndefOr[Double]
  def checkClearPoint(x: Double, y: Double, bBox: BBoxObject, checkDistance: js.UndefOr[Boolean] = js.undefined): Boolean | LabelClearPointObject
  def drawSeriesLabels(): Unit
  def getPointsOnGraph(): js.UndefOr[js.Array[Point]]
  def labelFontSize(minFontSize: Double, maxFontSize: Double): String
}
