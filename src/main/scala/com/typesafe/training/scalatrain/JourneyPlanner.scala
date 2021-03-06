package com.typesafe.training.scalatrain

/**
 * Created by scottdierbeck on 3/1/15.
 */
class JourneyPlanner(trains: Set[Train]) {

  val stations: Set[Station] =
    trains flatMap (train => train.stations)

  def trainsAt(station: Station): Set[Train] =
    // Could also be expressed in short notation: trains filter (_.stations contains station)
    trains filter (train => train.stations contains station)

  def stopsAt(station: Station): Set[(Time, Train)] = {
    for {
      train <- trains
      timeAndStation <- train.schedule if timeAndStation._2 == station
    } yield (timeAndStation._1, train)
  }
}
