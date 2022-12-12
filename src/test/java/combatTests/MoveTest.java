package combatTests;

import entities.combat.Move;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoveTest {
    @Test
    public void TestToString() {
        Move move = new Move("attack", 10, 2, "enemy");
        Assertions.assertEquals("attack", move.toString());
    }

    @Test
    public void TestSetMoveName() {
        Move move = new Move("a", 1, 2, "enemy");
        move.setMoveName("b");
        Assertions.assertEquals("b", move.getMoveName());
    }

    @Test
    public void TestSetMoveDamage() {
        Move move = new Move("a", 1, 2, "enemy");
        move.setMoveDamage(2);
        Assertions.assertEquals(2, move.getMoveDamage());
    }

    @Test
    public void TestSetMoveMultiplier() {
        Move move = new Move("a", 1, 2, "enemy");
        move.setMoveMultiplier(3);
        Assertions.assertEquals(3, move.getMoveMultiplier());
    }

    @Test
    public void TestSetMoveTarget() {
        Move move = new Move("a", 1, 2, "enemy");
        move.setMoveTarget("enemy2");
        Assertions.assertEquals("enemy2", move.getMoveTarget());
    }
}