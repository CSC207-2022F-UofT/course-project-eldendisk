import entities.player.Player;
import entities.player.Mage;
import entities.TempEldenDisk;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestTempEldenDisk {
    @Test
    public void TestLvlMethods() throws IOException {
        TempEldenDisk t = new TempEldenDisk();

        t.SetLvl(5);
        assertEquals(5, t.getGameLvl());

        t.increaseGameLvl();
        assertEquals(6, t.getGameLvl());
    }

    @Test
    public void testSetPlayer() throws IOException {
        TempEldenDisk t = new TempEldenDisk();
        Player mage = new Mage("nathan", 1, 1, 1, 1, 1, 1, 1);
        t.setPlayer(mage);

        assertEquals(new Mage("nathan", 1, 1, 1, 1, 1, 1, 1), t.getPlayer());
    }

    @Test
    public void testSetId() throws IOException {
        TempEldenDisk t = new TempEldenDisk();
        t.SetId(5);
        assertEquals(5, t.GetId());
    }
}