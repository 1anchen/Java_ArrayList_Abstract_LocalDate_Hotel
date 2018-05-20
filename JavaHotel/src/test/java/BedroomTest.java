import Guest.Guest;
import Hotel.Bedroom;
import Hotel.RoomType.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom singleRoom;
    Bedroom doubleRoom;
    Bedroom familyRoom;
    Guest guest1;
    Guest guest2;
    Guest guest3;


    @Before
    public void before(){
         singleRoom = new Bedroom(2, 101,RoomType.SINGLE,10.00);
         doubleRoom = new Bedroom(3, 201,RoomType.DOUBLE,20.00);
         familyRoom = new Bedroom(5, 301,RoomType.FAMILY,30.00);
         guest1 = new Guest("Kawhi", 200);
         guest2 = new Guest("James", 300);
         guest3 = new Guest("Kevin", 500);
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2,singleRoom.getCapacity());
    }

    @Test
    public void canCheckInGuest(){
        doubleRoom.addGuest(guest2, LocalDate.of(2018,5,22));
        assertEquals(1,doubleRoom.checkNumberOfGuests().size());
        assertEquals(false,doubleRoom.roomIsVacent());
        assertEquals(2,doubleRoom.checkNumberOfDays());

    }

    @Test
    public void canRemoveGuest(){
        doubleRoom.addGuest(guest2,LocalDate.of(2018,5,22));
        doubleRoom.removeGuests(guest2);
        assertEquals(0,doubleRoom.checkNumberOfGuests().size());
        assertEquals(true,doubleRoom.roomIsVacent());
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(301,familyRoom.getRoomNumber());
    }

    @Test
    public void canGetRommType(){
        assertEquals(RoomType.SINGLE,singleRoom.getRoomType());
    }

    @Test
    public void canGetNightlyRate(){
        assertEquals(20.00,doubleRoom.getNightlyRate(),0.00);
    }

    @Test
    public void canChargeGuest(){
        assertEquals(60.00,doubleRoom.chargeGuest(3),0.00);
    }

    @Test
    public void canCheckIfRoomIsVacant(){
        assertEquals(true,doubleRoom.roomIsVacent());
    }

    @Test
    public void canCheckIfRoomIsNotVacant(){
        doubleRoom.changeVacentToFull();
        assertEquals(false,doubleRoom.roomIsVacent());
    }

    @Test
    public void canCheckNumberOfDays(){
        assertEquals(0,doubleRoom.checkNumberOfDays());
    }


}
