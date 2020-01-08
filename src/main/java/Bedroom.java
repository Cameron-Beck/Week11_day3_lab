import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;
    private double nightlyRate;


    public Bedroom(int roomNumber, int capacity, String type, double nightlyRate){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<Guest>();
        this.nightlyRate = nightlyRate;
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

    public int checkCapacity() {
        return capacity - guests.size();
    }

    public void removeGuest(Guest guest) {
        guests.remove(guest);
    }

    public double getRates() {
        return nightlyRate;
    }
}
