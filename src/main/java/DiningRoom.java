import java.util.ArrayList;

public class DiningRoom {

    private int capacity;
    private ArrayList<Guest> guests;
    private ArrayList<Integer> tables;


    // 6 tables to sit 8 guests
    public DiningRoom() {
        this.capacity = 42;
        this.guests = new ArrayList<>();
        this.tables = new ArrayList<>();
        this.tables.add(8);
        this.tables.add(8);
        this.tables.add(8);
        this.tables.add(8);
        this.tables.add(8);
        this.tables.add(8);
    }

    public int getCapacity() {
        return capacity;
    }

    public int tablesAvailable() {
        return this.tables.size();
    }

    public int guestsDining(){
        return this.guests.size();
    }

    public void checkIn(Guest guest) {
        this.guests.add(guest);
    }

    public void checkOut(Guest guest) {
        this.guests.remove(guest);
    }
}
