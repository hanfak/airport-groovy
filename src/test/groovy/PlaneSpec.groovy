import spock.lang.*

class PlaneSpec extends Specification {
  def plane

  def setup() {
    plane = new Plane()
  }

  def 'plane is initially not at the airport'() {
    expect:
    plane.at_airport() == false
  }

  def 'plane is at airport after landing'() {
    when:
    plane.land()

    then:
    plane.at_airport() == true
  }
}
