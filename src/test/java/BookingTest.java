import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class BookingTest {

    Booking booking1;
    Bedroom room1;
    Bedroom room2;
    Guest guest1;
    Guest guest2;
    ArrayList<Guest> guests;

    @Before
    public void before(){
        room1 = new Bedroom(101, 2, "Double", 10.00);
        room2 = new Bedroom(102, 1, "Single", 5.00);
        guest1 = new Guest("Steven", 'M');
        guest2 = new Guest("Stephen", 'M');
        guests = new ArrayList<Guest>();
        guests.add(guest1);
        guests.add(guest2);
        booking1 = new Booking(room1, 3, guests);
    }

    @Test
    public void hasBedroom(){
        assertEquals(room1, booking1.getBedroom());
    }

    @Test
    public void hasNights(){
        assertEquals(3, booking1.getNumberOfNights());
    }

    @Test
    public void hasTotalBill(){
        assertEquals(30.00, booking1.calculateTotal(), 0.01);
    }

    @Test
    public void hasGuests(){
        assertEquals(2, booking1.getGuests().size());
    }




}
