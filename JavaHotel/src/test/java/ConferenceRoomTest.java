import Guest.Guest;
import Hotel.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    ConferenceRoom conferenceRoom3;
    Guest guest1;
    Guest guest2;
    Guest guest3;




    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom(10, "AT&T",10.00);
        conferenceRoom2 = new ConferenceRoom(20, "Toyota",20.00);
        conferenceRoom3 = new ConferenceRoom(30, "Oracle",30.00);
        guest1 = new Guest("Kawhi", 200);
        guest2 = new Guest("James", 300);
        guest3 = new Guest("Kevin", 500);

    }

    @Test
    public void canGetCapacity(){
        assertEquals(10,conferenceRoom1.getCapacity());
    }

    @Test
    public void canCheckInGuest(){
        conferenceRoom2.addGuest(guest1);
        assertEquals(1,conferenceRoom2.checkNumberOfGuests().size());
    }

    @Test
    public void canRemoveGuest(){
        conferenceRoom2.addGuest(guest2);
        conferenceRoom2.removeGuests(guest2);
        assertEquals(0,conferenceRoom2.checkNumberOfGuests().size());
    }

    @Test
    public void canGetRoomName(){
        assertEquals("Oracle",conferenceRoom3.getRoomName());
    }

    @Test
    public void canGetDailyRate(){
        assertEquals(10.00,conferenceRoom1.getDailyRate(),0.00);
    }

    @Test
    public void canChargeGuest(){
        assertEquals(60.00,conferenceRoom2.chargeGuest(3),0.00);
    }


    @Test
    public void canCheckInMultipleGuests(){
        Guest.addGuestToGuestList(guest1);
        Guest.addGuestToGuestList(guest2);
        Guest.addGuestToGuestList(guest3);
        conferenceRoom1.checkInMultipleGuests(3,Guest.checkGuestList());
        assertEquals(3, conferenceRoom1.checkNumberOfGuests().size());
    }





}
