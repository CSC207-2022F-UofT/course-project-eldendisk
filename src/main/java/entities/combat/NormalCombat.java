package entities.combat;

import entities.enemyFactory.Enemy;
import entities.enemyFactory.EnemyFactory;
import entities.Player;



public class NormalCombat extends Combat {
    // this class represents a Normal, subclass of Combat.
    // Instance of this class will be created via CombatFactory.
    Enemy combatEnemy;


    public NormalCombat(Player player, int gameLevel) {
        super(player, "Normal", gameLevel);
        this.combatEnemy = EnemyFactory.createEnemy(player, "Normal", gameLevel);

    }
}
