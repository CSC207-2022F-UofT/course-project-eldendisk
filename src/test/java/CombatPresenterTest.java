import presenters.CombatPresenter;

import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CombatPresenterTest {
    /*
    Test cases for some CombatPresenter methods. Tested a few methods for correct console outputs.
     */
    @Test
    public void TestDisplayVS() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CombatPresenter p = new CombatPresenter();
        p.displayVS("a", "b", 1, 2);

        Assertions.assertTrue(outContent.toString().contains("\na (1 HP) VS b (2 HP)"));
    }

    @Test
    public void TestDisplayCombatWin() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CombatPresenter p = new CombatPresenter();
        p.displayCombatWin("a");

        Assertions.assertTrue(outContent.toString().contains("a has died! You won!\n"));
    }
    @Test
    public void TestDisplayLevelUp() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        CombatPresenter p = new CombatPresenter();
        p.displayLevelUp(5);

        Assertions.assertTrue(outContent.toString().contains("Congratulation! You have leveled up! You are now level 5!\n"));
    }
}
