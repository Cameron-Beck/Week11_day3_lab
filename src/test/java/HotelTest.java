import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom room1;
    Bedroom room2;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    Guest guest1;

    @Before
    public void before(){
        hotel = new Hotel("CodeClan Towers");
        room1 = new Bedroom(101, 2, "Double");
        room2 = new Bedroom(102, 1, "Single");
        conferenceRoom1 = new ConferenceRoom(10, "The Funky Sweet Suite");
        conferenceRoom2 = new ConferenceRoom(16, "De Svunky Zveet Seewite");
        guest1 = new Guest("Steven", 'M');
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

    @Test
    public void canAddConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom1);
        assertEquals(1, hotel.getConferenceRooms().size());
    }

    @Test
    public void canCheckInGuestToBedroom(){
        hotel.addBedroom(room1);
        hotel.checkInGuestToBedroom(guest1, room1);
        assertEquals(1, room1.getGuests().size());
    }
}
