package entities.combat;

import entities.enemyFactory.EnemyFactory;
import entities.player.Player;
import entities.player.Character;

public class Combat {
    // This class is a super class of BossCombat and NormalCombat.
    // Each Combat instance has Player player and Character enemy. (contains getter methods for player and enemy)
    private Player player;
    private Character enemy;

    public Combat(Player player, String combatType, int gameLevel) {
        // Constructor of Combat takes Player player, conbatType and gameLevel.
        // Combat calls EnemyFactory to create enemy instance, using combatType and gameLevel.
        this.player = player;
        this.enemy = EnemyFactory.createEnemy(player, combatType, gameLevel);
    }

    // getter methods
    public Player getPlayer() {
        return player;
    }

    public Character getEnemy() {
        return enemy;
    }

}



