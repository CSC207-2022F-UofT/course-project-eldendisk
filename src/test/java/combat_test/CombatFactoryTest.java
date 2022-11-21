package combat_test;

import Combat.Combat;
import Combat.BossCombat;
import Combat.NormalCombat;
import Combat.CombatFactory;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

public class CombatFactoryTest {
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