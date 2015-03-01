package com.typesafe.training.scalatrain

import org.scalatest.{ Matchers, WordSpec }

/**
 * Created by scottdierbeck on 2/28/15.
 */
class TimeSpec extends WordSpec with Matchers {

  "Creating time" should {
    "set default hours and minutes to zero" in {
      val time = Time()
      time.hours shouldEqual 0
      time.minutes shouldEqual 0
      time.asMinutes shouldEqual 0
    }
    "throw IllegalArgumentException" in {
      evaluating(Time(hours = 24)) should produce[Exception]
      evaluating(Time(hours = -1)) should produce[Exception]
      evaluating(Time(minutes = -1)) should produce[Exception]
      evaluating(Time(minutes = 60)) should produce[Exception]
    }
  }
  "asMinutes" should {
    "be initialized correctly" in {
      val time = Time(hours = 1, minutes = 30)
      time.asMinutes shouldEqual 90
    }
  }
  "Subtracting two Times with minus" should {
    "return correct difference in minutes" in {
      Time(1, 30).minus(Time(minutes = 30)) shouldEqual 60
    }
  }
  "Subtracting two Times with -" should {
    "return correct difference in minutes" in {
      Time(1, 30) - Time(minutes = 30) shouldEqual 60
    }
  }
  "calling toString" should {
    "return formatted time" in {
      Time(8, 45).toString shouldEqual "08:45"
    }
  }
}
