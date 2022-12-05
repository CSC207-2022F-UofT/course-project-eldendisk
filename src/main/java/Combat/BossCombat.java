package Combat;

import entities.EnemyFactory.Enemy;
import entities.EnemyFactory.EnemyFactory;
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
