package com.typesafe.training.scalatrain

object Time {
  def fromMinutes(minutes: Int): Time = Time(minutes / 60, minutes % 60)
}

case class Time(hours: Int = 0, minutes: Int = 0) {
  val asMinutes: Int = hours * 60 + minutes

  def minus(that: Time): Int = this.asMinutes - that.asMinutes

  def -(that: Time): Int = this minus that

  override lazy val toString: String = {
    f"$hours%02d:$minutes%02d"
  }
  // Predef validation
  require(hours >= 0 && hours <= 23, "Hours must be within 0 and 23.")
  require(minutes >= 0 && minutes <= 59, "Minutes must be within 0 and 59.")
}
