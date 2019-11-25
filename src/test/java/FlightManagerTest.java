import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FlightManagerTest {

    private FlightManager manager;
    private Flight flight;
    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void before() {
        flight = new Flight(
                new Plane(PlaneType.BOEING747),
                "DW233",
                "Mali",
                "Edinburgh",
                "15:00 21/11/19"
        );
        passenger1 = new Passenger("Alex", 2);
        passenger2 = new Passenger("Darcey", 4);
        manager = new FlightManager(flight);

        flight.checkIn(passenger1);
        flight.checkIn(passenger2);
    }
    @Test
    public void getsWeightPerPassenger() {
        assertEquals(250, manager.weightPerPassenger());
    }
    @Test
    public void getsTotalWeightofBags() {
        assertEquals(120, manager.totalWeightOfBags());
    }
    @Test
    public void weightLeft() {
        assertEquals(380, manager.weightAvailable());
    }
}
