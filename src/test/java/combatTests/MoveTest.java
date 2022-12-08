package combatTests;

import entities.combat.Move;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoveTest {
    //
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testToString() {
        Move move = new Move("attack", 10, 2, "enemy");
        assertEquals("attack : 10 / x 2 to enemy", move.toString());
    }

    @Test
    public void testSetMoveName() {
        Move move = new Move("a", 1, 2, "enemy");
        move.setMoveName("b");
        assertEquals("b", move.getMoveName());
    }

    @Test
    public void testSetMoveDamage() {
        Move move = new Move("a", 1, 2, "enemy");
        move.setMoveDamage(2);
        assertEquals(2, move.getMoveDamage());
    }

    @Test
    public void testSetMoveMultiplier() {
        Move move = new Move("a", 1, 2, "enemy");
        move.setMoveMultiplier(3);
        assertEquals(3, move.getMoveMultiplier());
    }

    @Test
    public void testSetMoveTarget() {
        Move move = new Move("a", 1, 2, "enemy");
        move.setMoveTarget("enemy2");
        assertEquals("enemy2", move.getMoveTarget());
    }
}