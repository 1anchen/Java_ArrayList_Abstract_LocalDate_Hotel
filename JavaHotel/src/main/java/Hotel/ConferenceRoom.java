package Hotel;

import Guest.Guest;
import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;

public class ConferenceRoom extends Room{
    String roomName;
    double dailyRate;
    double price;
    ArrayList<Guest> conferenceRoomGuestList;


    public ConferenceRoom(int capacity, String roomName, double dailyRate ){
        super(capacity);
        this.roomName = roomName;
        this.dailyRate = dailyRate;
        this.conferenceRoomGuestList = new ArrayList<>();

    }

    public String getRoomName() {
        return this.roomName;
    }

    public double getDailyRate() {
        return this.dailyRate;
    }

    public double chargeGuest(int days){
        return price = days * this.dailyRate;
    }



    public void checkInMultipleGuests(int numberOfGuests,ArrayList<Guest> guests){
        for (int i=0; i<numberOfGuests; i++){
            addGuest(guests.get(i));
        }
        changeVacentToFull();

    }

    public void addGuest(Guest guest){
        if (checkCapacity()) {
            this.conferenceRoomGuestList.add(guest);
        }
    }

    public ArrayList checkNumberOfGuests(){
        return this.conferenceRoomGuestList;
    }

    public void removeGuests(Guest guest){
        this.conferenceRoomGuestList.remove(guest);
    }

    public int getCapacity(){
        return this.capacity;
    }
}
