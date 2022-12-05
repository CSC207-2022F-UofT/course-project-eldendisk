package Combat;

import entities.EnemyFactory.Enemy;
import entities.EnemyFactory.EnemyFactory;
import entities.Player;


public class NormalCombat extends Combat {
    /// kept this class in case we implement normal combats
public class NormalCombat implements Combat {
    Enemy combatEnemy;
    String player;
    int gameLevel;

    public NormalCombat(Player player) {
        super(player, "Normal");
        this.combatEnemy = EnemyFactory.createEnemy(player, "Normal");

    }
}
