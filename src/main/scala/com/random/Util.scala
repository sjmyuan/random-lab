package com.random

/**
  * Created by jiaming.shang on 5/23/17.
  */
object Util {
  def mean(v:List[Double]):Double = sum(v)/v.length
  def sum(v:List[Double]):Double = v.reduce(_+_)
  def uniform(seed:Long,n:Int):List[Double] = {
    scala.util.Random.setSeed(seed)
    Range(0,n).map(_=>scala.util.Random.nextDouble()).toList
  }
}
