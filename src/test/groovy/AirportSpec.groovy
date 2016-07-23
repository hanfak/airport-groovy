import spock.lang.*

class AirportSpec extends Specification {
    def airport

    def setup() {
      airport = new Airport()
    }

    def 'return airport is empty when created'() {
        when: 'Checking number of planes'
        def result = airport.planes

        then: 'size of planes is 0'
        result.size() == 0
    }
}
