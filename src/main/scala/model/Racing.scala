package model

import scala.util.Random

object Racing {
  private val MOVABLE_VAL = 1

  def of(carNames: List[String]) = new Racing(carNames.map(new Car(_)))
}

class Racing(private val cars: List[Car]) {

  import Racing._

  def runARound(): Unit = {
    for (car <- cars) car.move(movable)
  }

  private def movable: Boolean = {
    Random.nextInt(2) == MOVABLE_VAL
  }

  def current: List[String] = {
    for (car <- cars) yield car.current
  }

  def result: Result = {
    val winningCar = this.winningCar
    new Result(
      for (car <- cars if car isSamePositionWith winningCar) yield car.name
    )
  }

  private def winningCar: Car = {
    cars.foldRight(new Car("default", 0))(_ vs _)
  }
}
