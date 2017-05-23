# Random Lab ![build](https://travis-ci.org/sjmyuan/random-lab.svg)
Use different algorithm to generate random number following some distribution

## Normal Distribution
### Central Limit Theorem
+ [Theorem](https://en.wikipedia.org/wiki/Central_limit_theorem)
+ Usage
  ```scala
  val random = Normal(1000)
  val number = random.nextCentralLimit(100000)
  ```
