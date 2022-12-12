package enemyTest;

import entities.enemyFactory.EnemySetters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EnemyTest {
    @Test
    public void TestSetEnemyName() {
        EnemySetters e1 = new EnemySetters();
        String newName = "Keren";
        e1.setEnemyName(newName);

        Assertions.assertEquals(newName, e1.getEnemyName());
    }

    @Test
    public void TestSetEnemyHP() {
        EnemySetters e2 = new EnemySetters();
        int newHP = 10;
        e2.setEnemyHP(newHP);

        Assertions.assertEquals(newHP, e2.getEnemyHP());
    }

    @Test
    public void TestSetEnemyStats() {
        EnemySetters e3 = new EnemySetters();
        int newStats = 100;
        e3.setEnemyStats(newStats);

        Assertions.assertEquals(newStats, e3.getEnemyStats());
    }

    @Test
    public void TestSetEnemyAttackDmg() {
        EnemySetters e4 = new EnemySetters();
        int AttackDmg = 15;
        e4.setEnemyAttackDmg(AttackDmg);

        Assertions.assertEquals(AttackDmg, e4.getEnemyHP());
    }

    @Test
    public void TestSetEnemyDmgMultiplier() {
        EnemySetters e5 = new EnemySetters();
        double DmgMultiplier = 1.5;
        e5.setEnemyDmgMultiplier(DmgMultiplier);

        Assertions.assertEquals(DmgMultiplier, e5.getEnemyDmgMultiplier());
    }

    @Test
    public void testSetEnemyType() {
        EnemySetters e6 = new EnemySetters();
        String EnemyType = "Boss";
        e6.setEnemyType(EnemyType);

        Assertions.assertEquals(EnemyType, e6.getEnemyType());
    }
}
