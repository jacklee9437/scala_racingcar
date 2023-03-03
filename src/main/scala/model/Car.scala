package model

class Car(val name: String, private val position: Position) {
  require(name != null || !name.isBlank || name.nonEmpty)
  require(position != null)

  def this(name: String, position: Int) = this(name, new Position(position))

  def this(name: String) = this(name, 0)

  def move(movable: Boolean): Unit = {
    if (movable) position.increase()
  }

  def current: String = s"$name : ${position.current}"

  def vs(that: Car): Car = {
    if (this.position >= that.position) this else that
  }

  def isSamePositionWith(that: Car): Boolean = this.position == that.position
}
