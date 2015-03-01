package com.typesafe.training.scalatrain

import com.typesafe.training.scalatrain.TestData._
import org.scalatest.{ Matchers, WordSpec }

/**
 * Created by scottdierbeck on 3/1/15.
 */
class JourneyPlannerSpec extends WordSpec with Matchers {

  "stations" should {
    "be initialized correctly" in {
      planner.stations shouldEqual Set(munich, nuremberg, cologne, essen)
    }
  }

  "Calling trainsAt" should {
    "return the matching Trains " in {
      planner.trainsAt(munich) shouldEqual Set(ice724, ice726)
      planner.trainsAt(cologne) shouldEqual Set(ice724)
    }
  }
}
