import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HotelTest {

    Hotel hotel;

    @Before
    public void before(){
        hotel = new Hotel("CodeClan Towers");
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan Towers", hotel.getName());
    }
}
