import entities.Player;
import entities.Gunslinger;
import entities.Mage;
import entities.Samurai;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(timeout = 500)
    public void testSetName() {
        Player p1 = new Mage("Mage", 50, 10, 2, 0, 0, 5, 1);
        String newName = "Keren";
        p1.setName(newName);

        // assertion
        assertEquals("the player's name variable should have been set to \"Keren\"!", newName, p1.toString());
    }

    @Test(timeout = 500)
    public void testSetXP() {
        Player p2 = new Gunslinger("Gunslinger", 50, 10, 2, 0, 0, 5, 1);
        int newXP = 500;
        p2.setXP(newXP);

        // assertion
        assertEquals("the player's XP variable should have been set to 500!", newXP, p2.get_XP());
    }
}
