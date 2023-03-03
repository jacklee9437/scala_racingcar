package view

import scala.io.StdIn.readLine

object InputView {
  def getCarNames(): List[String] = {
    println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    val input = readLine()
    for (car <- input.split(",").toList) yield car.trim
  }

  def getTryCount(): Int = {
    println("시도할 회수는 몇회인가요?")
    readLine().toInt
  }
}
