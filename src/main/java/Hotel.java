import java.util.ArrayList;
import java.util.BitSet;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private String name;

    public Hotel(String name){
        this.name = name;
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public String getName() {
        return name;
    }


    public ArrayList<Bedroom> getBedrooms() {
        return new ArrayList<Bedroom>(bedrooms);
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return new ArrayList<ConferenceRoom>(conferenceRooms);
    }

    public void addBedroom(Bedroom bedroom) {
        bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        conferenceRooms.add(conferenceRoom);
    }

    public void checkInGuestToBedroom(Guest guest, Bedroom room) {
        if ( room.checkCapacity() > 0) {
            room.addGuest(guest);
        }

    }

    public void checkInGuestToConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        if ( conferenceRoom.checkCapacity() > 0) {
            conferenceRoom.addGuest(guest);
        }
    }

    public void checkOutGuestFromBedroom(Guest guest, Bedroom room) {
        room.removeGuest(guest);
    }
}
