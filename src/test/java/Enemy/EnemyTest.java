package Enemy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(timeout = 500)
    public void testSetEnemyName() {
        Enemy e1 = new Enemy();
        String newName = "Keren";
        e1.setEnemyName(newName);

        assertEquals("the Enemy's name variable should have been set to \"Keren\"!", newName, e1.toString());

    }

    @Test (timeout = 500)
    public void testSetEnemyHP() {
        Enemy e2 = new Enemy();
        int newHP = 10;
        e2.setEnemyHP(newHP);

        assertEquals("the Enemy's HP variable should have been set to 10!", newHP, e2.setEnemyHP(newHP));
    }

    @Test (timeout = 500)
    public void testSetEnemyStats() {
        Enemy e3 = new Enemy();
        int newStats = 100;
        e3.setEnemyStats(newStats);

        assertEquals("the Enemy's Stats variable should have been set to 100!", newStats, e3.setEnemyHP(newStats));
    }

    @Test (timeout = 500)
    public void testSetEnemyAttackDmg() {
        Enemy e4 = new Enemy();
        int AttackDmg = 15;
        e4.setEnemyAttackDmg(AttackDmg);

        assertEquals("the Enemy's Attack Damage variable should have been set to 100!", AttackDmg, e4.setEnemyHP(AttackDmg));
    }

    @Test (timeout = 500)
    public void testSetEnemyDmgMultiplier() {
        Enemy e5 = new Enemy();
        double DmgMultiplier = 1.5;
        e5.setEnemyDmgMultiplier(DmgMultiplier);

        assertEquals("the Enemy's Damage Multiplier variable should have been set to 100!", DmgMultiplier, e5.setEnemyHP((int) DmgMultiplier));
    }

    @Test (timeout = 500)
    public void testSetEnemyType() {
        Enemy e6 = new Enemy();
        String EnemyType = "Boss";
        e6.setEnemyType(EnemyType);

        assertEquals("the Enemy's Type variable should have been set to \"Boss\"!", EnemyType, e6.toString());
    }
}
