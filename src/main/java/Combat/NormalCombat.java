package Combat;

import Entities.EnemyFactory.Enemy;
import Entities.EnemyFactory.EnemyFactory;
import Entities.Player;


public class NormalCombat extends Combat {
    /// kept this class in case we implement normal combats
    Enemy combatEnemy;
    String player;
    int gameLevel;

    public NormalCombat(Player player) {
        super(player, "Normal");
        this.combatEnemy = EnemyFactory.createEnemy(player, "Normal");

    }
}
