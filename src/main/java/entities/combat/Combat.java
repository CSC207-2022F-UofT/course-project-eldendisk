package entities.combat;

import entities.enemyFactory.EnemyFactory;
import entities.player.Player;
import entities.player.Character;

public class Combat {
    private Player player;
    private Character enemy;

    public Combat(Player player, String combatType, int gameLevel) {
        this.player = player;
        this.enemy = EnemyFactory.createEnemy(player, combatType, gameLevel);
    }
    //    public Scanner getScanner() {return this.scanner;}
    public Player getPlayer() {
        return player;
    }
    public Character getEnemy() {
        return enemy;
    }
    public void applyDamage(Character caster, Move move) {

    }

}



