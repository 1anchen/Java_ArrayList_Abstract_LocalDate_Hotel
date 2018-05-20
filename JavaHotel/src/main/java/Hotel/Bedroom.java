package Hotel;

import Hotel.RoomType.RoomType;

public class Bedroom extends Room{

    int roomNumber;
    RoomType type;
    double nightlyRate;
    double price;


    public Bedroom(int capacity, int roomNumber, RoomType type, double nightlyRate ){
      super(capacity);
      this.roomNumber = roomNumber;
      this.type = type;
      this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public RoomType getRoomType(){
        return this.type;
    }

    public double getNightlyRate(){
        return this.nightlyRate;
    }

    public double chargeGuest(int days){
        return price = days * this.nightlyRate;
    }
}
