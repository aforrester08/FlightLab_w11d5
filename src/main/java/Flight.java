import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String time;
    private ArrayList<Integer> seatArray;

    public Flight(
            Plane plane,
            String flightNumber,
            String destination,
            String departureAirport,
            String time
    ) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.time = time;
        this.passengers = new ArrayList<Passenger>();
        this.seatArray = new ArrayList<Integer>();
        seatArray.add(1);seatArray.add(2);
    }

    public PlaneType getPlane() {
        return this.plane.getPlaneType();
    }

    public String getFlightNUmber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getFlightTime() {
        return this.time;
    }

    public int getCapacity() {
        return this.plane.getPlaneCapacity();
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void checkIn(Passenger passenger) {
        if (this.passengers.size() < this.plane.getPlaneCapacity()) {
            passengers.add(passenger);
            passenger.changeFlightStatus();
            Collections.shuffle(seatArray);
            int seatNum = seatArray.get(0);
            passenger.assignSeatNum(seatNum);
            seatArray.remove(0);
        }
    }

    public int spacesLeft() {
        return plane.getPlaneCapacity() - passengers.size();
    }

}
