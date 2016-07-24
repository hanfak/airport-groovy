class Airport {
  def planes

  def Airport() {
    this.planes = []
  }

  def instructToLand(plane) {
    planeAtAirport(plane)
    plane.land()
    this.planes.push(plane)
  }

  def instructTakeOff(plane) {
    planeNotAtAirport(plane)
    plane.takeOff()
    this.planes.remove(plane)
  }


  private def planeAtAirport(plane) {
    if( this.planes.contains(plane) ) {
      throw new PlaneAtAirportException('Plane cannot land: Plane already at airport')
    }
  }

  private def planeNotAtAirport(plane) {
    if( !this.planes.contains(plane) ) {
      throw new PlaneNotAtAirportException('Plane cannot take off: Plane not at airport')
    }
  }
}

class PlaneAtAirportException extends Exception {
  PlaneAtAirportException(String message) {
    super(message)
  }
}

class PlaneNotAtAirportException extends Exception {
  PlaneNotAtAirportException(String message) {
    super(message)
  }
}
