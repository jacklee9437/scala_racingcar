package model

class Position(private var value: Int) extends Ordered[Position] {
  def increase(): Unit = {
    value = value + 1
  }

  def current: String = "-".repeat(value)

  override def compare(that: Position): Int = this.value - that.value

  override def equals(that: Any): Boolean = {
    if (!that.isInstanceOf[Position]) {
      throw new IllegalArgumentException
    }
    this.value == that.asInstanceOf[Position].value
  }
}
