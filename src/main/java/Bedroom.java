import java.util.ArrayList;

public class Bedroom {

    private int capacity;
    private int roomNumber;
    private String type;
    private ArrayList<Guest> guests;
    private int nightlyRate;

    public Bedroom(int capacity, int roomNumber, String type, int nightlyRate){
        this.capacity = capacity;
        this.roomNumber = roomNumber;
        this.type = type;
        this.guests = new ArrayList<>();
        this.nightlyRate = nightlyRate;
    }

    public int checkIfOccupied() {
        return this.guests.size();
    }

    public String getType() {
        return type;
    }

    public void checkIn(Guest guest) {
        if (guests.size() < capacity)
        this.guests.add(guest);
    }

    public void checkOut(Guest guest, int numberOfNights) {
        this.guests.remove(guest);
        this.getTotalBill(numberOfNights);
    }

    public int getNightlyRate() {
        return nightlyRate;
    }

    public int getTotalBill(int numberOfNights){
        return this.nightlyRate * numberOfNights;
    }
}
