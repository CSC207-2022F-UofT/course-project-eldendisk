package Combat;

import Entities.EnemyFactory.Enemy;
import Entities.EnemyFactory.EnemyFactory;
import Entities.Player;

public class BossCombat extends Combat{
    Enemy combatEnemy;
    Player player;
    int gameLevel;

    public BossCombat(Player player) {
        super(player, "Boss");
        this.combatEnemy = EnemyFactory.createEnemy(player, "Boss");

    }
}
