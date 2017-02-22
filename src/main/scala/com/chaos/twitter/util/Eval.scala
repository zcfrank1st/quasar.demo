package com.chaos.twitter.util

import com.twitter.util.Eval

/**
  * Created by zcfrank1st on 22/02/2017.
  */
object Eva extends App {
  println((new Eval).apply[Int]("1 + 1"))
}
