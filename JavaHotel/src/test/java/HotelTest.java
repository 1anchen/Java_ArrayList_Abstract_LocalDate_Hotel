import Guest.Guest;
import Hotel.Bedroom;
import Hotel.ConferenceRoom;
import Hotel.DiningRoom;
import Hotel.Hotel;
import Hotel.RoomType.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel CCTower;
    Bedroom bedroom1;
    ConferenceRoom conferenceRoom1;
    DiningRoom diningRoom1;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before(){
      CCTower = new Hotel();
      bedroom1 = new Bedroom(2, 101, RoomType.SINGLE,10.00);
      conferenceRoom1 = new ConferenceRoom(10, "AT&T",10.00);
      diningRoom1 = new DiningRoom(10);
      guest1 = new Guest("Kawhi", 200);
      guest2 = new Guest("James", 300);
      guest3 = new Guest("Kevin", 500);
    }

     @Test
     public void canAddOneRoomToAllTheRooms(){
        CCTower.addRoomsToAllTheRooms(bedroom1);
        assertEquals(1,CCTower.getAllTheRooms().size());
     }

     @Test
     public void canAddMoreRoomToAllTheRooms(){
        CCTower.addRoomsToAllTheRooms(bedroom1);
        CCTower.addRoomsToAllTheRooms(conferenceRoom1);
        CCTower.addRoomsToAllTheRooms(diningRoom1);
        assertEquals(3,CCTower.getAllTheRooms().size());
     }

     @Test
    public void canCheckVacantRoomsAllRoomsAreVacant(){
         CCTower.addRoomsToAllTheRooms(bedroom1);
         CCTower.addRoomsToAllTheRooms(conferenceRoom1);
         CCTower.addRoomsToAllTheRooms(diningRoom1);
         assertEquals(3,CCTower.checkAllVacentRooms().size());
     }

    @Test
    public void canCheckVacantRoomsOneRoomsIsOccupiedTwoRoomsAreVacant(){
        bedroom1.addGuest(guest1, LocalDate.of(2018,5,22));
        CCTower.addRoomsToAllTheRooms(bedroom1);
        CCTower.addRoomsToAllTheRooms(conferenceRoom1);
        CCTower.addRoomsToAllTheRooms(diningRoom1);
        assertEquals(2,CCTower.checkAllVacentRooms().size());
    }





}
