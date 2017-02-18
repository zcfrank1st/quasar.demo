package com.chaos.async.demo

import scala.concurrent.{Await, Future}
import scala.concurrent.duration.Duration

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

    println(Await.result(future, Duration.Inf))


    val future1 = Future {
      Thread.sleep(5000L)
      1
    }

    val future2 = Future {
      1
    }

    val futureList = List(future1, future2)

    println(Await.result(Future.sequence(futureList), Duration.Inf))

  }
}
