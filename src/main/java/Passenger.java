import java.util.Random;

public class Passenger {

    private String name;
    private int numberOfBags;
    private boolean onFlight;
    private int seatNumber;

    public Passenger(String name, int numberOfBags) {
        this.name = name;
        this.numberOfBags = numberOfBags;
        this.onFlight = false;
        this.seatNumber = 0;

    }

    public String getPassengerName() {
        return this.name;
    }

    public int passengerNumBags() {
        return this.numberOfBags;
    }

    public boolean isOnFlight() {
        return this.onFlight;
    }

    public void changeFlightStatus() {
        onFlight = true;
    }

    public void assignSeatNum(int seatNum) {
        this.seatNumber = seatNum;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

}
