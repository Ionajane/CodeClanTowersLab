import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Booking booking;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;
    DiningRoom diningRoom;
    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before(){
        hotel = new Hotel();

        bedroom1 = new Bedroom(2, 1, "Double", 80);
        bedroom2 = new Bedroom(1, 2, "Single", 50);
        bedroom3 = new Bedroom(4, 3, "Family", 100);
        bedroom4 = new Bedroom(2, 4, "Twin", 80);

        diningRoom = new DiningRoom();
        conferenceRoom = new ConferenceRoom(20);
        guest = new Guest();

        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        hotel.addBedroom(bedroom4);

        hotel.addConferenceRoom(conferenceRoom);
        hotel.addDiningRoom(diningRoom);
    }

    @Test
    public void checkBedroomCollectionStartsFull() {
        assertEquals(4, hotel.checkNumberOfBedrooms());
    }

    @Test
    public void checkDiningRoomCollectionStartsFull(){
        assertEquals(1, hotel.checkNumberOfDiningRooms());
    }

    @Test
    public void checkConferenceRoomCollectionStartsFull(){
        assertEquals(1, hotel.checkNumberOfConferenceRooms());
    }

    //add rooms to the arraylist
    @Test
    public void canAddBedroomToArrayList() {
        hotel.addBedroom(bedroom1);
        assertEquals(5, hotel.checkNumberOfBedrooms());
    }

    @Test
    public void canAddDiningRoomToArrayList() {
        hotel.addDiningRoom(diningRoom);
        assertEquals(2, hotel.checkNumberOfDiningRooms());
    }

    @Test
    public void canAddConferenceRoomToArrayList() {
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(2, hotel.checkNumberOfConferenceRooms());
    }

    @Test
    public void canCheckInGuestBedroom() {
        hotel.checkInGuestBedroom(guest, bedroom2);
        assertEquals(1, bedroom2.checkIfOccupied());

    }

    @Test
    public void canCheckInGuestDiningRoom() {
        hotel.checkInGuestDiningRoom(guest, diningRoom);
        assertEquals(1, diningRoom.guestsDining());
    }

    @Test
    public void canCheckInGuestConferenceRoom() {
        hotel.checkInGuestConferenceRoom(guest, conferenceRoom);
        assertEquals(1, conferenceRoom.checkAttendance());
    }

    @Test
    public void canCheckOutGuestBedroom() {
        hotel.checkInGuestBedroom(guest, bedroom2);
        hotel.checkOutGuestBedroom(guest, bedroom2, 2);
        assertEquals(0, bedroom2.checkIfOccupied());
    }

    @Test
    public void canCheckOutGuestDiningRoom() {
        hotel.checkInGuestDiningRoom(guest, diningRoom);
        hotel.checkOutGuestDiningRoom(guest, diningRoom);
        assertEquals(0, diningRoom.guestsDining());
    }

    @Test
    public void canCheckOutGuestConferenceRoom() {
        hotel.checkInGuestConferenceRoom(guest, conferenceRoom);
        hotel.checkOutGuestConferenceRoom(guest, conferenceRoom);
        assertEquals(0, conferenceRoom.checkAttendance());
    }

    @Test
    public void canMakeBookingBedroom() {
        Booking actualBooking = hotel.makeBedroomBooking(bedroom1, 3, guest);
        assertEquals(bedroom1, actualBooking.getBedroom());
        assertEquals(3, actualBooking.getNumberOfNights());
        assertEquals(guest, actualBooking.getGuest());
    }

    @Test
    public void canLookForAllEmptyBedrooms(){
        assertEquals(4, hotel.findEmptyBedrooms());
    }

    @Test
    public void cannotCheckInIfBedroomFull() {
        hotel.checkInGuestBedroom(guest, bedroom2);
        hotel.checkInGuestBedroom(guest, bedroom2);
        assertEquals(1, bedroom2.checkIfOccupied());
    }




}
