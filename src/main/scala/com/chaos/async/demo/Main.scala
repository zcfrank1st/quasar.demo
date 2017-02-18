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


    val t = for {
      a <- Some(1)
      b <- Some(2)
    } yield {
      true
    }

  }
}
