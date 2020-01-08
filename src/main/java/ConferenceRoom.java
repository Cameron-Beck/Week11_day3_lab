import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;

public class ConferenceRoom {

    private int capacity;
    private String name;
    private ArrayList<Guest> guests;

    public ConferenceRoom(int capacity, String name){
        this.capacity = capacity;
        this.name = name;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity(){
        return capacity;
    }

    public String getName() {
        return name;
    }

    public int checkCapacity(){
        return capacity - guests.size();
    }

    public ArrayList<Guest> getGuests() {
        return new ArrayList<Guest>(guests);
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        guests.remove(guest);
    }
}
