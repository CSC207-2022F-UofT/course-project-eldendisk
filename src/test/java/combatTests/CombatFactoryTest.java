package combatTests;

import entities.combat.Combat;
import entities.combat.BossCombat;
import entities.combat.NormalCombat;
import entities.combat.CombatFactory;
import entities.player.Player;
import entities.player.Mage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CombatFactoryTest {
    @Test
    public void TestCreateCombat() {
        Player mage = new Mage("nathan", 1, 1, 1, 1, 1, 1, 1);
        Combat boss = CombatFactory.createCombat(mage, "Boss", 1);
        Assertions.assertTrue(boss instanceof BossCombat);

        Combat normal = CombatFactory.createCombat(mage, "Normal", 1);
        Assertions.assertTrue(normal instanceof NormalCombat);
    }
}