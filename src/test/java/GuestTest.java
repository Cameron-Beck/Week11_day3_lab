import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;


    @Before
    public void before(){
        guest = new Guest("Steven", 'M');

    }

    @Test
    public void hasName(){
        assertEquals("Steven", guest.getName());
    }

    @Test
    public void hasGender(){
        assertEquals('M', guest.getGender());
    }

}
