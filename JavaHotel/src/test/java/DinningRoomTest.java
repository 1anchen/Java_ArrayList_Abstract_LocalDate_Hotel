import Guest.Guest;
import Hotel.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class DinningRoomTest {

  DiningRoom roomWest;
  DiningRoom roomEast;
  Guest guest1;
  Guest guest2;
  Guest guest3;

    @Before
    public void before(){
        roomWest = new DiningRoom(10);
        roomEast = new DiningRoom(10);
        guest1 = new Guest("Kawhi", 200);
        guest2 = new Guest("James", 300);
        guest3 = new Guest("Kevin", 500);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(10,roomEast.getCapacity());
    }

    @Test
    public void canCheckGuests(){
        roomWest.addGuest(guest2, LocalDate.of(2018,5,22));
        assertEquals(1,roomWest.checkNumberOfGuests().size());
    }

    @Test
    public void canRemoveGuest(){
        roomWest.addGuest(guest2,LocalDate.of(2018,5,22));
        roomWest.removeGuests(guest2);
        assertEquals(0,roomWest.checkNumberOfGuests().size());
    }




}
