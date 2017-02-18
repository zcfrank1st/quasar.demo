package com.chaos.async.demo

import java.util.concurrent.TimeUnit

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}

/**
  * Created by zcfrank1st on 18/02/2017.
  */
object Main {
  def main(args: Array[String]): Unit = {
    import scala.async.Async._
    import scala.concurrent.ExecutionContext.Implicits.global

    val future = async {
      val f1 = async {
        Thread.sleep(2000L)
        true
      }

      val f2 = async {
        Thread.sleep(3000L)
        2
      }

      if (await(f1)) await(f2) else 0
    }

    println(Await.result(future, Duration(10, TimeUnit.MINUTES)))

  }
}
