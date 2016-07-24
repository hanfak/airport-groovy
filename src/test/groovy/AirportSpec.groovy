import spock.lang.*

class AirportSpec extends Specification {
    def airport
    Plane plane

    def setup() {
      plane = GroovyMock()

      airport = new Airport()

    }

    def 'return airport is empty when created'() {
        when:
        def result = airport.planes

        then:
        result.size() == 0
    }

    def 'plane stored in airport after landing'() {
      when:
      airport.instructToLand(plane)
      def result = airport.planes

      then:
      result.size() == 1
      result[0] == plane
      notThrown PlaneAtAirportException
    }

    def 'plane can land after being instructed'() {
      when:
      airport.instructToLand(plane)

      then:
      1 * plane.land()
    }

    def 'plane cannot land if already at airport'() {
      when:
      airport.instructToLand(plane)
      airport.instructToLand(plane)

      then:
      def exception = thrown(PlaneAtAirportException)
      exception.message == 'Plane cannot land: Plane already at airport'
    }

    def 'instructs plane to take off'() {
      when:
      airport.instructToLand(plane)
      airport.instructTakeOff(plane)
      def result = airport.planes

      then:
      result.size == 0
      airport.planes.contains(plane) == false
    }

    def 'plane can take off after being instructed'() {
      when:
      airport.instructTakeOff(plane)

      then:
      1 * plane.takeOff()
    }
}
