package EnemyFactory;

import Combat.Moves;
import Player_Types.Character;
import Player_Types.Player;

public class BossEnemy extends Enemy {
    private String enemyName;
    private String className; // either Boss or Normal
    //enemy stats
    private int HP;
    private int attackDamage;
    private double damageMultiplier;
    //moves
    private Moves enemyMoves;

    public BossEnemy(Player player) {
        super(player, "Boss");
    }

    // method - read off from the external file based on player.getgamelvl()
    // implement following based on the method above
    @Override
    public String setEnemyName() {
        return "enemyName";
    }

    @Override
    public int setInitialEnemyHP() {
        return 100;
    }

    @Override
    public int setEnemyAttackDmg() {
        return 100;
    }
    @Override
    public double setEnemydamageMultiplier() {
        return 1;
    }

    @Override
    Moves setEnemyMoves() {
        return null;
    }
    // need to implement the moves first

    @Override
    public boolean attack(String move, Character characterBeingAttacked) {
        // need to implement this method
        return true;
    }
}
