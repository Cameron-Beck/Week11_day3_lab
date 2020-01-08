import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class BookingTest {

    Booking booking1;
    Bedroom room1;
    Bedroom room2;

    @Before
    public void before(){
        room1 = new Bedroom(101, 2, "Double", 10.00);
        room2 = new Bedroom(102, 1, "Single", 5.00);
        booking1 = new Booking(room1, 3);
    }

    @Test
    public void hasBedroom(){
        assertEquals(room1, booking1.getBedroom());
    }

    @Test
    public void hasNights(){
        assertEquals(3, booking1.getNumberOfNights());
    }



}
