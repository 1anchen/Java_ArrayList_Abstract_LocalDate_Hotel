package Guest;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Guest extends ArrayList<Guest> {

    String name;
    int wallet;
    static ArrayList<Guest>guestList;

    public Guest(String name, int wallet){
        this.name = name;
        this.wallet = wallet;
        guestList = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int getWallet(){
        return this.wallet;
    }

    public static void addGuestToGuestList(Guest guest){
      guestList.add(guest);
    }

    public static ArrayList<Guest> checkGuestList(){
      return guestList;
    }


    @Override
    public Stream<Guest> stream() {
        return null;
    }
}
