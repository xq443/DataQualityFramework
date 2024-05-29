package DQMetrics

class DataQualityMetricsCheck {
  def percentChangeWithinRange(percentChanges: Seq[Double], min: Double, max: Double): Boolean = {
    percentChanges.forall(change => change >= min && change <= max)
  }

  def countWithinRange(count: Int, min: Int, max: Int): Boolean = {
    count >= min && count <= max
  }

  def columnNullCheck(columnValues: Seq[String]): Boolean = {
    !columnValues.contains(null)
  }
}
