package controller

import model.Racing
import view.{InputView, OutputView}

object RacingCar extends App {
  private val carNames = InputView.getCarNames()
  private val tryCount = InputView.getTryCount()
  private val racing = Racing.of(carNames)

  OutputView.printRacingStart()
  for (_ <- 0 until tryCount) {
    racing.runARound()
    OutputView.printResultPerRound(racing.current)
  }

  OutputView.printResultOfRacing(racing.result)
}
