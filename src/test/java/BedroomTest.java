import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BedroomTest {

    Bedroom room;
    Guest guest1;
    Guest guest2;


    @Before
    public void before(){
        room = new Bedroom(101,2, "Double", 10.00);
        guest1 = new Guest("Steven", 'M');
        guest2 = new Guest("Stephen", 'M');
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(101, room.getRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, room.getCapacity());
    }

    @Test
    public void hasType(){
        assertEquals("Double", room.getType());
    }

    @Test
    public void hasGuests(){
        assertEquals(0, room.getGuests().size() );
    }

    @Test
    public void canAddGuests(){
        room.addGuest(guest1);
        assertEquals(1, room.getGuests().size());
    }

    @Test
    public void canCheckCapacityAfterAddingGuest(){
        room.addGuest(guest1);
        assertEquals(1, room.checkCapacity());
    }

    @Test
    public void canRemoveGuests(){
        room.addGuest(guest1);
        room.addGuest(guest2);
        room.removeGuest(guest1);
        assertEquals(1, room.getGuests().size());
        assertTrue(room.getGuests().contains(guest2));
    }

    @Test
    public void canGetRates(){
        assertEquals(10.00, room.getRates(), 0.01);
    }


}

