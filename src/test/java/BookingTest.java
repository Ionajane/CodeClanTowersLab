import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Bedroom bedroom;
    Booking booking;
    Guest guest;


    @Before
    public void before() {
        bedroom = new Bedroom(2, 1, "Double", 80);
        guest = new Guest();
        booking = new Booking(bedroom, 3, guest);
    }

    // check has number of nights
    @Test
    public void checkNumberOfNights() {
        assertEquals(3, booking.getNumberOfNights());
    }

    //check has bedroom
    @Test
    public void checkHasBedroom() {
        assertEquals(bedroom, booking.getBedroom());
    }

}
