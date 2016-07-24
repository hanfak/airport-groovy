class Airport {
  def planes

  def Airport() {
    this.planes = []
  }

  def instructToLand(plane) {
    plane.land()
    this.planes.push(plane)
  }

  def instructTakeOff(plane) {
    this.planes.remove(plane)
  }
}
