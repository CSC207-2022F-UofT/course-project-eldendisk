package Combat;

import Entities.EnemyFactory.Enemy;
import Entities.EnemyFactory.EnemyFactory;

//import EnemyFactory.Enemy;
//import EnemyFactory.EnemyFactory;



public class BossCombat implements Combat{
    Enemy combatEnemy;
    String player;
    int gameLevel;

    public BossCombat(String player) {
        this.combatEnemy = EnemyFactory.createEnemy(player, "Boss");

    }
}
