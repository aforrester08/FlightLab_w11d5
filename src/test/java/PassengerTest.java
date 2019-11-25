import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Alex", 2);
    }

    @Test
    public void canGetName() {
        assertEquals("Alex", passenger.getPassengerName());
    }
    @Test
    public void canGetBags() {
        assertEquals(2, passenger.passengerNumBags());
    }
    @Test
    public void canGetIfOnFlight() {
        assertEquals(false, passenger.isOnFlight());
    }


}
