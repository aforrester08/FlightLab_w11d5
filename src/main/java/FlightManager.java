import java.util.ArrayList;

public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public int weightPerPassenger() {
        return (flight.getPlane().getWeight() / 2) / flight.getPassengers().size();
    }

    public int totalWeightOfBags() {
        Integer result = 0;
        for (Passenger passenger : flight.getPassengers()) {
            result += (passenger.passengerNumBags());
        }
        int bagWeight = 20;
        return bagWeight * result;
    }

    public int weightAvailable() {
        return flight.getPlane().getWeight()/2 - totalWeightOfBags();
    }
}
