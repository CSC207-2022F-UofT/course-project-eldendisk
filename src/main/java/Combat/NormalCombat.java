package Combat;

import EnemyFactory.Enemy;
import EnemyFactory.EnemyFactory;
import Player_Types.Player;

public class NormalCombat extends Combat {
    Enemy combatEnemy;
    String player;
    int gameLevel;

    public NormalCombat(Player player) {
        super(player, "Normal");
        this.combatEnemy = EnemyFactory.createEnemy(player, "Normal");

    }
}
