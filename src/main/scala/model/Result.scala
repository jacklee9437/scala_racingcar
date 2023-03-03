package model

class Result(private val winners: List[String]) {
  override def toString: String = winners.mkString(",")
}
