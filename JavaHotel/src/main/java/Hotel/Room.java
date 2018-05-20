package Hotel;
import Guest.Guest;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import static java.time.temporal.ChronoUnit.DAYS;


public abstract class Room {
    int capacity;
    ArrayList<Guest> guests;
    boolean vacant;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private long daysOfStay;



    public Room(int capacity){
        this.capacity = capacity;
        this.guests = new ArrayList<>();
        this.vacant = true;
        this.daysOfStay = 0;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void addGuest(Guest guest, LocalDate checkOutDate){
        if (checkCapacity()) {
            this.guests.add(guest);
            changeVacentToFull();
            this.checkInDate = LocalDate.now();
            this.checkOutDate = checkOutDate;
            this.daysOfStay = DAYS.between(checkInDate, checkOutDate);
        }
    }

    public long checkNumberOfDays(){
        return this.daysOfStay;

    }



    public ArrayList checkNumberOfGuests(){
        return this.guests;
    }

    public void removeGuests(Guest guest){
        this.guests.remove(guest);
        this.vacant = true;
    }



    public boolean checkCapacity(){
        if (this.capacity > this.guests.size()){
            return true;
        }
        return false;
    }

    public boolean roomIsVacent(){
        return this.vacant;
    }

    public void changeVacentToFull(){
        this.vacant = false;
    }

}
