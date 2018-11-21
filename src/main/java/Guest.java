import java.util.ArrayList;

public class Guest {

    private ArrayList<Guest> guests;

    public Guest() {
        guests = new ArrayList<>();
    }

    public void addToGroup(Guest guest) {
        guests.add(guest);
    }


}