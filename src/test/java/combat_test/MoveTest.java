package combat_test;

import Combat.Move;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MoveTest {
    @Test
    public void testCreateCombat() {
        Move move = new Move("attack", 10, 2, "enemy");
        assertEquals("attack : 10 / x 2 to enemy", move.toString());
    }
}