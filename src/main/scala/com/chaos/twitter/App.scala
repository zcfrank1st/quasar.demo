package com.chaos.twitter

import com.twitter.app.Flags

/**
  * Created by zcfrank1st on 21/02/2017.
  */
object HH extends App {
  val flags = new Flags("hh_app", true)
  val dev = flags("dev", 100, "help")
  val prd = flags("prd", 111, "help")
  flags.parseArgs(args)

  println(dev())
  println(prd())
}

object MM extends com.twitter.app.App {
  val dev = flag("dev", 100, "hh")

  def main() {
    println(dev())
  }
}