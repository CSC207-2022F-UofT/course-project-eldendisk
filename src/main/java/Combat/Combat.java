package Combat;

import Entities.EnemyFactory.EnemyFactory;
import Entities.Player;
import Entities.Character;

public class Combat {
    private Character player;
    private Character enemy;

    public Combat(Player player, String combatType) {
        this.player = (Character)player;
        this.enemy = (Character) EnemyFactory.createEnemy((Player)player, combatType);
    }
    //    public Scanner getScanner() {return this.scanner;}
    public Character getPlayer() {
        return player;
    }
    public Character getEnemy() {
        return enemy;
    }
    public void applyDamage(Character caster, Move move) {

    }

}



