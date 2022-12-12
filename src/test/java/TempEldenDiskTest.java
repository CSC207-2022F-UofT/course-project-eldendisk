import entities.player.Player;
import entities.player.Mage;
import entities.TempEldenDisk;

import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TempEldenDiskTest {
    @Test
    public void TestLvlMethods() throws IOException {
        String input = "1\na";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        TempEldenDisk t = new TempEldenDisk();

        t.SetLvl(5);
        Assertions.assertEquals(5, t.getGameLvl());

        t.increaseGameLvl();
        Assertions.assertEquals(6, t.getGameLvl());
    }

    @Test
    public void TestSetPlayer() throws IOException {
        String input = "1\na";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        TempEldenDisk t = new TempEldenDisk();

        Player mage = new Mage("nathan", 1, 1, 1, 1, 1, 1, 1);
        t.setPlayer(mage);

        Assertions.assertEquals(new Mage("nathan", 1, 1, 1, 1, 1, 1, 1), t.getPlayer());
    }

    @Test
    public void TestSetId() throws IOException {
        String input = "1\na";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        TempEldenDisk t = new TempEldenDisk();


        t.SetId(5);
        Assertions.assertEquals(5, t.GetId());
    }
}