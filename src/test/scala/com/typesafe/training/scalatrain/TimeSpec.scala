package com.typesafe.training.scalatrain

import org.scalatest.{ Matchers, WordSpec }

/**
 * Created by scottdierbeck on 2/28/15.
 */
class TimeSpec extends WordSpec with Matchers {

  "Creating time" should {
    "throw IllegalArgumentException" in {
      evaluating(Time(hours = 24)) should produce[Exception]
      evaluating(Time(hours = -1)) should produce[Exception]
      evaluating(Time(minutes = -1)) should produce[Exception]
      evaluating(Time(minutes = 60)) should produce[Exception]
    }
  }
}
