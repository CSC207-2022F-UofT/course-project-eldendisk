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
    Test cases for some CombatPresenter methods. Tested a few methods for inputs and outputs.
     */
    @Test
    public void TestGetInput() {
        String input = "input";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        CombatPresenter p = new CombatPresenter();

        Assertions.assertEquals("input", p.getInput());
    }

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

}
