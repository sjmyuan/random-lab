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

}
