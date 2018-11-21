public class Booking {

    private Bedroom bedroom;
    private int numberOfNights;
    private Guest guest;

    public Booking(Bedroom bedroom, int numberOfNights, Guest guest) {
        this.bedroom = bedroom;
        this.numberOfNights = numberOfNights;
        this.guest = guest;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public Guest getGuest() {
        return guest;
    }
}