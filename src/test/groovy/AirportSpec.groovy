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
      airport.instruct_to_land(plane)
      def result = airport.planes

      then:
      result.size() == 1
      result[0] == plane
    }

    def 'plane lands'() {
      when:
      airport.instruct_to_land(plane)

      then:
      1 * plane.land()
    }
}
