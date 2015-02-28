package com.typesafe.training.scalatrain

class Time(val hours: Int = 0, val minutes: Int = 0) {
  val asMinutes: Int = hours * 60 + minutes

  def minus(that: Time): Int = this.asMinutes - that.asMinutes

  def -(that: Time): Int = this minus that

  // TODO : Verify that hours is within 0 and 23
  // TODO : Verify that minutes is within 0 and 59
}
