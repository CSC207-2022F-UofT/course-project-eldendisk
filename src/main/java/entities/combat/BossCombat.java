package entities.combat;

import entities.enemyFactory.Enemy;
import entities.enemyFactory.EnemyFactory;
import entities.player.Player;


public class BossCombat extends Combat{
    Enemy combatEnemy;
    Player player;
    int gameLevel;

    public BossCombat(Player player, int gameLevel) {
        super(player, "Boss", gameLevel);
        this.combatEnemy = EnemyFactory.createEnemy(player, "Boss", gameLevel);

    }
}
