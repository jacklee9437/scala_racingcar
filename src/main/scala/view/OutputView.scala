package view

import model.{Car, Result}

object OutputView {
  def printRacingStart(): Unit = println("실행결과")

  def printResultPerRound(carPositions: List[String]): Unit = {
    for (carPosition <- carPositions) println(carPosition)
    println()
  }

  def printResultOfRacing(result: Result): Unit = {
    println(s"${result}가 최종 우승했습니다.")
  }
}
