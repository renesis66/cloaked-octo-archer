package com.typesafe.training.scalatrain

case class Train(kind: String, number: Int, schedule: Seq[(Time, Station)]) {

  require(schedule.length >= 2, "Schedule must contain at least two entries.")
  // TODO : Verify that schedule is strictly increasing in time

  // Could also be expressed in short notation: schedule map (_._2)
  val stations: Seq[Station] = schedule map (timeAndStation => timeAndStation._2)
}
