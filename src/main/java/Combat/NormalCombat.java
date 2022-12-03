package Combat;

import entities.EnemyFactory.Enemy;
import entities.EnemyFactory.EnemyFactory;

public class NormalCombat implements Combat {
    Enemy combatEnemy;
    String player;
    int gameLevel;

    public NormalCombat(String player) {
        this.combatEnemy = EnemyFactory.createEnemy(player, "Normal");

    }
}
