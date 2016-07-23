class Airport {
  def planes

  def Airport() {
    this.planes = []
  }

  def instruct_to_land(plane) {
    plane.land()
    this.planes.push(plane)
  }
}
