import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    Guest guest;

    @Before
    public void before() {
        diningRoom = new DiningRoom();
        guest = new Guest();
    }

    // test that the capacity is 42
    @Test
    public void roomHasCapacityOf42() {
        assertEquals(42, diningRoom.getCapacity());
    }

    @Test
    public void roomStartsWith6Tables() {
        assertEquals(6, diningRoom.tablesAvailable());
    }

    @Test
    public void guestsStartsEmpty(){
        assertEquals(0, diningRoom.guestsDining());
    }

    @Test
    public void canCheckIn() {
        diningRoom.checkIn(guest);
        assertEquals(1, diningRoom.guestsDining());
    }

    @Test
    public void canCheckOut() {
        diningRoom.checkIn(guest);
        diningRoom.checkOut(guest);
        assertEquals(0, diningRoom.guestsDining());
    }

}
