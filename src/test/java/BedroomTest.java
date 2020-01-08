import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BedroomTest {

    Bedroom room;
    Guest guest;

    @Before
    public void before(){
        room = new Bedroom(101,2, "Double");
        guest = new Guest("Steven", 'M')
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
        room.addGuest(guest);
        assertEquals(1, room.getGuests().size());
    }
}

