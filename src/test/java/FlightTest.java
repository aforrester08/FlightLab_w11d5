import org.junit.Before;
import org.junit.Test;

import java.sql.Time;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Passenger passenger;

    @Before
    public void before() {
        flight = new Flight(
                new Plane(PlaneType.BOEING747),
                "DW233",
                "Mali",
                "Edinburgh",
                "15:00 21/11/19"
                );
        passenger = new Passenger("Alex", 2);
        flight.checkIn(passenger);

    }

    @Test
    public void canGetPlaneType() {
        assertEquals(PlaneType.BOEING747, flight.getPlane());
    }
    @Test
    public void canGetFlightNumber() {
        assertEquals("DW233", flight.getFlightNUmber());
    }
    @Test
    public void canGetFlightDestination() {
        assertEquals("Mali", flight.getDestination());
    }
    @Test
    public void canGetFlightDeparure() {
        assertEquals("Edinburgh", flight.getDepartureAirport());
    }
    @Test
    public void canGetFlightTime() {
        assertEquals("15:00 21/11/19", flight.getFlightTime());
    }
    @Test
    public void CanGetCapacity() {
        assertEquals(2, flight.getCapacity());
    }
    @Test
    public void canAddPassenger() {
        assertEquals(1, flight.getPassengers().size());
    }
    @Test
    public void canGetVacancies() {
        assertEquals(1, flight.spacesLeft());
    }
    @Test
    public void canChangePassengerStatus() { assertEquals(true, passenger.isOnFlight()); }
    @Test
    public void passengerAssignedNumber () { assertEquals(2, passenger.getSeatNumber()); }
}
