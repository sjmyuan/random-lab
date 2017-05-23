package com.random
import scala.util.Random._
import Util._

/**
  * Created by jiaming.shang on 5/23/17.
  */
case class Normal(seed:Long) {

  def nextCentralLimit(n:Int):Double ={
     return (mean(uniform(seed,n)) - 0.5)*Math.sqrt(n*12)
  }

  def nextBoxMuller():Double ={
    val x::y::Nil = uniform(seed,2)
    return Math.cos(2*Math.PI*x)*Math.sqrt(-2*Math.log(1-y))
  }

}
