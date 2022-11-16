package Combat;

import EnemyFactory.Enemy;
import EnemyFactory.EnemyFactory;
import Player_Types.Player;

public class BossCombat extends Combat{
    Enemy combatEnemy;
    String player;
    int gameLevel;

    public BossCombat(Player player) {
        super(player, "Boss");
        this.combatEnemy = EnemyFactory.createEnemy(player, "Boss");

    }
}
