package com.random
import org.scalatest._
import org.scalatest.FunSpec
import Util._

/**
  * Created by jiaming.shang on 5/23/17.
  */
class UtilSpec extends FunSpec with Matchers {

  describe("Util"){
    describe("sum"){
      it("should return the sum of list"){
        val result= sum(List(1,2,3))
        result should be (6)
      }
    }

    describe("mean"){
      it("should return the mean of list"){
        val result= mean(List(1,2,3))
        result should be (2)
      }
    }
  }

}
