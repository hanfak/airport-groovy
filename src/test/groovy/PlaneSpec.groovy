import spock.lang.*

class PlaneSpec extends Specification {
  def plane

  def setup() {
    plane = new Plane()
  }

  def 'plane is initially not at the airport'() {
    expect:
    plane.isAtAirport() == false
  }

  def 'plane is at airport after landing'() {
    when:
    plane.land()

    then:
    plane.isAtAirport() == true
  }

  def 'plane is not at airport after take off'() {
    when:
    plane.land()
    plane.takeOff()

    then:
    plane.isAtAirport() == false
  }
}
