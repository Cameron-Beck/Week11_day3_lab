import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BedroomTest {

    Bedroom room;

    @Before
    public void before(){
        room = new Bedroom(101,2, "Double");
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
}
