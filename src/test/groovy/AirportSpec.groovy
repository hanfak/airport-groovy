import spock.lang.*

class AirportSpec extends Specification {
    def airport
    def plane

    def setup() {
      airport = new Airport()
      plane = Mock(Plane)
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
}
