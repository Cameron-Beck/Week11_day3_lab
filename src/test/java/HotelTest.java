import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class HotelTest {

    Hotel hotel;
    Hotel hotel2;
    Bedroom room1;
    Bedroom room2;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    Guest guest1;
    Guest guest2;
    Guest guest3;


    @Before
    public void before(){
        hotel = new Hotel("CodeClan Towers");
        hotel2 = new Hotel("CodeClan Towers2");
        room1 = new Bedroom(101, 2, "Double", 10.00);
        room2 = new Bedroom(102, 1, "Single", 5.00);
        conferenceRoom1 = new ConferenceRoom(10, "The Funky Sweet Suite");
        conferenceRoom2 = new ConferenceRoom(2, "De Svunky Zveet Seewite");
        guest1 = new Guest("Steven", 'M');
        guest2 = new Guest("Stephen", 'M');
        guest3 = new Guest("Stefan", 'F');
        hotel2.addBedroom(room1);
        hotel2.addBedroom(room2);
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

    @Test
    public void canCheckGuestInToConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom1);
        hotel.checkInGuestToConferenceRoom(guest1, conferenceRoom1);
        assertEquals(1, conferenceRoom1.getGuests().size());
    }

    @Test
    public void doesNotCheckGuestInIfConferenceRoomFull(){
        hotel.addConferenceRoom(conferenceRoom2);
        hotel.checkInGuestToConferenceRoom(guest1, conferenceRoom2);
        hotel.checkInGuestToConferenceRoom(guest2, conferenceRoom2);
        hotel.checkInGuestToConferenceRoom(guest3, conferenceRoom2);
        assertEquals(2, conferenceRoom2.getGuests().size());
    }

    @Test
    public void doesNotCheckGuestInIfBedroomFull(){
        hotel.addBedroom(room2);
        hotel.checkInGuestToBedroom(guest2, room2);
        hotel.checkInGuestToBedroom(guest3, room2);
        assertEquals(1, room2.getGuests().size());
    }

    @Test
    public void canCheckGuestOutOfBedroom(){
        hotel.addBedroom(room2);
        hotel.checkInGuestToBedroom(guest2, room2);
        hotel.checkOutGuestFromBedroom(guest2, room2);
        assertEquals(0, room2.getGuests().size());
    }

    @Test
    public void canCheckGuestOutOfConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom2);
        hotel.checkInGuestToConferenceRoom(guest1, conferenceRoom2);
        hotel.checkInGuestToConferenceRoom(guest2, conferenceRoom2);
        hotel.checkOutGuestFromConferenceRoom(guest1, conferenceRoom2);
        assertEquals(1, conferenceRoom2.getGuests().size());
        assertTrue(conferenceRoom2.getGuests().contains(guest2));
    }

    @Test
    public void checkInFailsIfRoomDoesNotExistInHotel(){
        hotel.checkInGuestToBedroom(guest1, room2);
        hotel.checkInGuestToConferenceRoom(guest2, conferenceRoom2);
        assertEquals(0, room2.getGuests().size());
        assertEquals(0, conferenceRoom2.getGuests().size());
    }

    @Test
    public void canCheckIfBedroom(){
        hotel.addBedroom(room2);
        assertTrue(hotel.checkIfBedroom(room2));
    }

    @Test
    public void canCheckIfConferenceRoom(){
        hotel.addConferenceRoom(conferenceRoom2);
        assertTrue(hotel.checkIfConferenceRoom(conferenceRoom2));
    }

    @Test
    public void canCreateBooking(){
        hotel2.createBooking(room2, 3);
        assertEquals(1, hotel2.getBookings().size());
    }

    @Test
    public void canGetTotalBill(){
        hotel2.createBooking(room2, 3);
        assertEquals(15.00, hotel2.calculateTotal(booking), 0.01);
    }


}
