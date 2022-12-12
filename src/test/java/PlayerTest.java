import entities.player.Player;
import entities.player.Gunslinger;
import entities.player.Mage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    @Test
    public void TestSetName() {
        Player p1 = new Mage("Mage", 50, 10, 2, 0, 0, 5, 1);
        String newName = "Keren";
        p1.setName(newName);

        Assertions.assertEquals(newName, p1.getName());
    }

    @Test
    public void TestSetXP() {
        Player p2 = new Gunslinger("Gunslinger", 50, 10, 2, 0, 0, 5, 1);
        int newXP = 500;
        p2.setXP(newXP);

        Assertions.assertEquals(newXP, p2.get_XP());
    }
}
