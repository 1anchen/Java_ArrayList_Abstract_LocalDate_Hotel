package Hotel;
import Guest.Guest;

import java.util.ArrayList;


    public class Hotel {

//      ArrayList<Bedroom>allTheBedrooms;
//      ArrayList<DiningRoom>allTheDiningRooms;
//      ArrayList<ConferenceRoom>allTheConferenceRooms;
        ArrayList<Room>allTheRooms;


    public Hotel(){
//        allTheBedrooms = new ArrayList<>();
//        allTheDiningRooms= new ArrayList<>();
//        allTheConferenceRooms = new ArrayList<>();
          allTheRooms = new ArrayList<>();
    }

    public ArrayList getAllTheRooms(){
        return this.allTheRooms;
    }

    public void addRoomsToAllTheRooms(Room room){
        allTheRooms.add(room);
    }

    public ArrayList<Room> checkAllVacentRooms(){
        ArrayList<Room> vacantRoom = new ArrayList<>();
        for(int i=0; i<allTheRooms.size(); i++){
           if (this.allTheRooms.get(i).vacant == true){
               vacantRoom.add(this.allTheRooms.get(i));

           }
        }
        return vacantRoom;
    }


}
