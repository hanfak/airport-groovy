class Airport {
  def planes

  def Airport() {
    this.planes = []
  }

  def instructToLand(plane) {
    if( this.planes.contains(plane) ) {
      throw new PlaneAtAirportException('Plane cannot land: Plane already at airport')
    }
    plane.land()
    this.planes.push(plane)
  }

  def instructTakeOff(plane) {
    plane.takeOff()
    this.planes.remove(plane)
  }
}

class PlaneAtAirportException extends Exception {
  PlaneAtAirportException(String message) {
    super(message)
  }
}
