package com.typesafe.training.scalatrain

case class Train(info: TrainInfo, schedule: Seq[(Time, Station)]) {

  require(schedule.length >= 2, "Schedule must contain at least two entries.")
  // TODO : Verify that schedule is strictly increasing in time

  // Could also be expressed in short notation: schedule map (_._2)
  val stations: Seq[Station] = schedule map (timeAndStation => timeAndStation._2)
}

object TrainInfo {

  case class InterCityExpress(number: Int, hasWifi: Boolean = false) extends TrainInfo

  case class RegionalExpress(number: Int) extends TrainInfo

  case class BavarianRegional(number: Int) extends TrainInfo
}

sealed abstract class TrainInfo {

  def number: Int
}
