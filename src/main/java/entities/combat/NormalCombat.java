package entities.combat;

import entities.enemyFactory.Enemy;
import entities.enemyFactory.EnemyFactory;
import entities.player.Player;



public class NormalCombat extends Combat {
    /// kept this class in case we implement normal combats
    Enemy combatEnemy;
    String player;
    int gameLevel;

    public NormalCombat(Player player, int gameLevel) {
        super(player, "Normal", gameLevel);
        this.combatEnemy = EnemyFactory.createEnemy(player, "Normal", gameLevel);

    }
}
