package entities.combat;

import entities.enemyfactory.Enemy;
import entities.enemyfactory.EnemyFactory;
import entities.player.Player;


public class BossCombat extends Combat{
    // this class represents a BossCombat, subclass of Combat.
    // Instance of this class will be created via CombatFactory.
    Enemy combatEnemy;


    public BossCombat(Player player, int gameLevel) {
        super(player, "Boss", gameLevel);
        this.combatEnemy = EnemyFactory.createEnemy(player, "Boss", gameLevel);

    }
}
