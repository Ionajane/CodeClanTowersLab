import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<DiningRoom> diningRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        bedrooms = new ArrayList<>();
        diningRooms = new ArrayList<>();
        conferenceRooms = new ArrayList<>();
    }

    public int checkNumberOfBedrooms(){
        return this.bedrooms.size();
    }

    public int checkNumberOfDiningRooms(){
        return this.diningRooms.size();
    }

    public int checkNumberOfConferenceRooms(){
        return this.conferenceRooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        this.diningRooms.add(diningRoom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void checkInGuestBedroom(Guest guest, Bedroom bedroom) {
        bedroom.checkIn(guest);
    }

    public void checkInGuestDiningRoom(Guest guest, DiningRoom diningRoom) {
        diningRoom.checkIn(guest);
    }

    public void checkInGuestConferenceRoom(Guest guest, ConferenceRoom conferenceRoom){
        conferenceRoom.checkIn(guest);
    }

    public void checkOutGuestBedroom(Guest guest, Bedroom bedroom, int numberOfNights) {
        bedroom.checkOut(guest, numberOfNights);
    }

    public void checkOutGuestDiningRoom(Guest guest, DiningRoom diningRoom) {
        diningRoom.checkOut(guest);
    }

    public void checkOutGuestConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.checkOut(guest);
    }

    public Booking makeBedroomBooking(Bedroom bedroom, int numberOfNights, Guest guest) {
        Booking booking = new Booking(bedroom, numberOfNights, guest);
        return booking;
    }




}
