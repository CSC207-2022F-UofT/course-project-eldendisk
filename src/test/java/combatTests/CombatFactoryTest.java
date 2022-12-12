package combatTests;

import entities.combat.Combat;
import entities.combat.BossCombat;
import entities.combat.NormalCombat;
import entities.combat.CombatFactory;
import entities.player.Player;
import entities.player.Mage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CombatFactoryTest {
    //
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCreateCombat() {
        Player mage = new Mage("nathan", 1, 1, 1, 1, 1, 1, 1);
        Combat boss = CombatFactory.createCombat(mage, "Boss", 1);
        assertTrue(boss instanceof BossCombat);

        Combat normal = CombatFactory.createCombat(mage, "Normal", 1);
        assertTrue(normal instanceof NormalCombat);
    }
}