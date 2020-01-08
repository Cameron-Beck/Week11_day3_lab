import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom room1;
    Bedroom room2;

    @Before
    public void before(){
        hotel = new Hotel("CodeClan Towers");
        room1 = new Bedroom(101, 2, "Double");
        room2 = new Bedroom(102, 1, "Single");
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void hasBedrooms(){
        assertEquals(0, hotel.getBedrooms().size());
    }

    @Test
    public void hasConferenceRooms(){
        assertEquals(0, hotel.getConferenceRooms().size());
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(room1);
        assertEquals(1, hotel.getBedrooms().size());
    }
}
