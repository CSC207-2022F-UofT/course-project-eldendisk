package Combat;

import entities.EnemyFactory.EnemyFactory;
import entities.Player;
import entities.Character;

public class Combat {
    private Player player;
    private Character enemy;

    public Combat(Player player, String combatType) {
        this.player = player;
        this.enemy = EnemyFactory.createEnemy(player, combatType);
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



