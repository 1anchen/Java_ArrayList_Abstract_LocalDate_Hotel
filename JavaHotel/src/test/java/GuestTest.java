import Guest.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    Guest guest1;
    Guest guest2;
    Guest guest3;


    @Before
    public void before(){
        guest1 = new Guest("Kawhi", 200);
        guest2 = new Guest("James", 300);
        guest3 = new Guest("Kevin", 500);
    }

    @Test
    public void canGetName(){
        assertEquals("Kawhi",guest1.getName());
    }

    @Test
    public void canGetWallet(){
        assertEquals(300,guest2.getWallet());
    }

    @Test
    public void canCheckGuestLists(){
        Guest.addGuestToGuestList(guest1);
        Guest.addGuestToGuestList(guest2);
        Guest.addGuestToGuestList(guest3);
        assertEquals(3,Guest.checkGuestList().size());
    }
}
