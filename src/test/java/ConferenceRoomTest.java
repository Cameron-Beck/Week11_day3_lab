import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
      conferenceRoom = new ConferenceRoom(10, "The Funky Sweet Suite");
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, conferenceRoom.getCapacity());
    }

}
