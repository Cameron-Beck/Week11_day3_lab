import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;

    public Bedroom(int roomNumber, int capacity, String type){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<Guest>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity(){
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return new ArrayList<Guest>(guests);
    }

    public String getType() {
        return type;
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }
}
