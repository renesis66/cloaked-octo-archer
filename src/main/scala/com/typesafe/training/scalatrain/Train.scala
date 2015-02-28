package com.typesafe.training.scalatrain

case class Train(number: Int, kind: String, schedule: Seq[Station]) {

  require(schedule.length >= 2, "Schedule must contain at least two entries.")

}
