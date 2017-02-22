package com.chaos.twitter.util

import scala.concurrent.Future
import scala.util.{Failure, Success, Try}


/**
  * Created by zcfrank1st on 18/02/2017.
  */
object Main {
  case class Address(no: String, street: String, city: String,
                     state: String, zip: String)

  def main(args: Array[String]): Unit = {
    val a = Address("B-12", "Monroe Street", "Denver", "CO", "80231")
    val na = a.copy(no = "B-56")
    println(a == Address("B-12", "Monroe Street", "Denver", "CO", "80231"))
    println(na == Address("B-56", "Monroe Street", "Denver", "CO", "80231"))
  }

}

class Test {
  private[util] def hello (): Unit = {}
}
