package combatTests;

import entities.combat.Combat;
import entities.combat.BossCombat;
import entities.combat.NormalCombat;
import entities.combat.CombatFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

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
        Combat boss = CombatFactory.createCombat("nathan", "Boss");
        assertTrue(boss instanceof BossCombat);

        Combat normal = CombatFactory.createCombat("nathan", "Normal");
        assertTrue(normal instanceof NormalCombat);

        Combat invalidCombatType = CombatFactory.createCombat("nathan", "something");
        assertNull(invalidCombatType);
    }
}