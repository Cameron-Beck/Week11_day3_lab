import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest1;
    Guest guest2;

    @Before
    public void before(){
      conferenceRoom = new ConferenceRoom(10, "The Funky Sweet Suite");
      guest1 = new Guest("Steven", 'M');
        guest1 = new Guest("Stephen", 'M');
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, conferenceRoom.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("The Funky Sweet Suite", conferenceRoom.getName());
    }

    @Test
    public void hasGuests(){
        assertEquals(0, conferenceRoom.getGuests().size());
    }

    @Test
    public void canAddGuest(){
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.getGuests().size());
    }

    @Test
    public void canCheckCapacity(){
        conferenceRoom.addGuest(guest1);
        assertEquals(9, conferenceRoom.checkCapacity());
    }

    @Test
    public void canRemoveGuests(){
        conferenceRoom.addGuest(guest1);
        conferenceRoom.addGuest(guest2);
        conferenceRoom.removeGuest(guest1);
        assertEquals(1, conferenceRoom.getGuests().size());
        assertTrue(conferenceRoom.getGuests().contains(guest2));
    }
}
