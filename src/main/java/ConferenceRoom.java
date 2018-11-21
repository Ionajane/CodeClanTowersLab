import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private ArrayList<Guest> guests;

    public ConferenceRoom(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int checkAttendance() {
        return this.guests.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public void checkIn(Guest guest){
        this.guests.add(guest);
    }

    public void checkOut(Guest guest){
        this.guests.remove(guest);
    }
}
