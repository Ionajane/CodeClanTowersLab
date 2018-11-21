import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;

    Guest guest;

    @Before
    public void before() {
        bedroom1 = new Bedroom(2, 1, "Double", 80);
        bedroom2 = new Bedroom(1, 2, "Single", 50);
        bedroom3 = new Bedroom(4, 3, "Family", 100);
        bedroom4 = new Bedroom(2, 4, "Twin", 80);

        guest = new Guest();
    }

    //check arraylist is empty
    @Test
    public void bedroomStartsEmpty() {
        assertEquals(0, bedroom1.checkIfOccupied());
    }

    //check room type
    @Test
    public void bedroomHasType() {
        assertEquals("Twin", bedroom4.getType());
    }

    //check someone into room
    @Test
    public void canCheckIn() {
        bedroom2.checkIn(guest);
        assertEquals(1, bedroom2.checkIfOccupied());
    }

    //check someone out
    @Test
    public void canCheckOut() {
        bedroom2.checkIn(guest);
        bedroom2.checkOut(guest, 2);
        assertEquals(0, bedroom2.checkIfOccupied());
    }

    @Test
    public void canCheckNightlyRate(){
        assertEquals(100, bedroom3.getNightlyRate());
    }

    @Test
    public void canGiveBillForBooking(){
        assertEquals(300, bedroom3.getTotalBill(3));
    }

}
