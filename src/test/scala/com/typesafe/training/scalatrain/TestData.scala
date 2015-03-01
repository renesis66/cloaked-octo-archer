package com.typesafe.training.scalatrain

import com.typesafe.training.scalatrain.TrainInfo.InterCityExpress

/**
 * Created by scottdierbeck on 3/1/15.
 *
 * Import TestData._ into any Spec you'd like pre-test setup data
 */
object TestData {

  val munich = Station("Munich")

  val nuremberg = Station("Nuremberg")

  val cologne = Station("Cologne")

  val essen = Station("Essen")

  val ice724MunichTime = Time(8, 50)

  val ice724NurembergTime = Time(10)

  val ice724CologneTime = Time(13, 39)

  val ice726MunichTime = Time(7, 50)

  val ice726NurembergTime = Time(9)

  val ice726CologneTime = Time(13, 2)

  val info724: TrainInfo = InterCityExpress(724)
  val info722: TrainInfo = InterCityExpress(722)

  val ice724 = Train(
    info724,
    Vector(ice724MunichTime -> munich, ice724NurembergTime -> nuremberg, ice724CologneTime -> cologne)
  )

  val ice726 = Train(
    info722,
    Vector(ice726MunichTime -> munich, ice726NurembergTime -> nuremberg, ice726CologneTime -> essen)
  )

  val planner = new JourneyPlanner(Set(ice724, ice726))

}
