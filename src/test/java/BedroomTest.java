import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
