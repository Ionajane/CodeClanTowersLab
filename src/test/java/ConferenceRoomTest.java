import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(20);
        guest = new Guest();
    }

    //check room is empty
    @Test
    public void roomStartsEmpty() {
        assertEquals(0, conferenceRoom.checkAttendance());
    }

    //check has capacity
    @Test
    public void roomHasCapacity() {
        assertEquals(20, conferenceRoom.getCapacity());
    }

    //
    @Test
    public void canCheckIn() {
        conferenceRoom.checkIn(guest);
        assertEquals(1, conferenceRoom.checkAttendance());
    }

    @Test
    public void canCheckOut() {
        conferenceRoom.checkIn(guest);
        conferenceRoom.checkOut(guest);
        assertEquals(0, conferenceRoom.checkAttendance());
    }

}
