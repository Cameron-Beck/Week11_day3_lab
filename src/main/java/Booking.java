import java.util.ArrayList;

public class Booking {

    private Bedroom bedroom;
    private int numberOfNights;
    private ArrayList<Guest> guests;

    public Booking(Bedroom bedroom, int numberOfNights, ArrayList<Guest> guests){
        this.bedroom = bedroom;
        this.numberOfNights = numberOfNights;
        this.guests = new ArrayList<Guest>(guests);
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public double calculateTotal() {
        return bedroom.getRates() * numberOfNights;
    }

    public ArrayList<Guest> getGuests(){
        return new ArrayList<Guest>(guests);
    }
}
