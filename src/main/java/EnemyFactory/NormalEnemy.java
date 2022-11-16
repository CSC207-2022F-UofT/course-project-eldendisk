package EnemyFactory;

import Combat.Moves;
import Player_Types.Character;
import Player_Types.Player;

public class NormalEnemy extends Enemy {
    private String enemyName;
    private String className; // either Boss or Normal
    private Player player;
    //enemy stats
    private int healthPoint;
    private int attackDamage;
    private int damageMultiplier;
    //moves
    private Moves enemyMoves;

    public NormalEnemy(Player player) {
        super(player, "Normal");
    }

    @Override
    public String setEnemyName() {
        return "Mini Monster";
    }

    @Override
    public int setInitialEnemyHP() {
        return (int)Math.round(player.getHP() * 0.7);
    }

    @Override
    public int setEnemyAttackDmg() {
        return (int)Math.round(player.getAttackDamage() * 0.7);
    }
    @Override
    public double setEnemydamageMultiplier() {
        return (int)Math.round(player.getDamageMultiplier() *0.7);
    }

    @Override
    Moves setEnemyMoves() {
        //need implementation after Moves
        return null;
    }

    @Override
    public boolean attack(String move, Character characterBeingAttacked) {
        return true;
    }
}
