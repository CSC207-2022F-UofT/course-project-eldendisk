package entities.combat;

import entities.enemyFactory.Enemy;
import entities.enemyFactory.EnemyFactory;
import entities.Player;


public class BossCombat extends Combat{
    Enemy combatEnemy;
    Player player;
    int gameLevel;

    public BossCombat(Player player) {
        super(player, "Boss");
        this.combatEnemy = EnemyFactory.createEnemy(player, "Boss");

    }
}
