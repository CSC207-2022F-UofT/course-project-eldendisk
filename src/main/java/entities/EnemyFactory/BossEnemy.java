package entities.EnemyFactory;
import Combat.Move;
import entities.Player;
import entities.Character;

import java.util.ArrayList;

public class BossEnemy extends Enemy {
    public BossEnemy(Player player) {
        super(player, "Boss");
    }

    @Override
    public String setName(String name) {
        return name;
    }

    @Override
    public int setInitialEnemyHP() {
        return 5;
    }

    @Override
    public int setAttackDmg() {
        return 1;
    }
    @Override
    public double setDamageMultiplier() {
        return 1.0;
    }

    @Override
    public ArrayList<Move> setMoves() {
        ArrayList<Move> moves = new ArrayList<Move>();
        Move first = new Move("Roar", 1, 1, "Opponent");
        Move second = new Move("Kick", 1, 1, "Opponent");
        Move third = new Move("Punch", 1, 1, "Opponent");
        Move fourth = new Move("Charge", 1, 1, "Opponent");

        moves.add(first);
        moves.add(second);
        moves.add(third);
        moves.add(fourth);

        return moves;
    }

    @Override
    public boolean attack(String move, Character characterBeingAttacked) {

        switch (move) {
            case "Roar":
                return roar(characterBeingAttacked);
            case "Kick":
                return kick(characterBeingAttacked);
            case "Punch":
                return punch(characterBeingAttacked);
            case "Charge":
                return charge(characterBeingAttacked);
            default:
                System.out.println("\n" + move + " is not a valid move you skip your turn doofus! \n");
                return true;
        }
    }

    @Override
    public void setHP(int HP) {
        this.setHP(HP);
    }

    private boolean roar(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(2);
        return true;
    }

    private boolean kick(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(2);
        return true;
    }

    private boolean punch(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(1);
        return true;
    }

    private  boolean charge(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(0);
        return true;
import entities.Death;

public class BossEnemy implements Enemy, Death {
    private String enemyName;
    private int enemyHP;
    private int enemyStats;
    private int enemyAttackDmg;

    private String enemyType;

    public boolean enemy_alive = true;

    public BossEnemy(String player, String enemyType) { // String player -> Player player;
        // implementation on creating fixed stats
        this.enemyName = "";
        this.enemyHP = 100; //player.getPlayerMaxHP * 0.7;
        this.enemyStats = 9; //player.getPlayerStats * 0.7;
        this.enemyAttackDmg = 10; // player.getPlayer
    }
    //getter methods
    @Override
    public int getEnemyStats() {
        return enemyStats;
    }

    @Override
    public int getEnemyAttackDmg() {
        return enemyAttackDmg;
    }

    @Override
    public int getEnemyDmgMultiplier() {
        return 0;
    }

    @Override
    public String getEnemyName() {
        return enemyName;
    }

    @Override
    public int getEnemyHP() {
        return enemyHP;
    }

    @Override
    public String getEnemyType() {
        return enemyType;
    }

    @Override
    public void setEnemyStats(int enemyStats) {
        this.enemyStats = enemyStats;
    }

    //setter methods
    @Override
    public void setEnemyAttackDmg(int enemyAttackDmg) {
        this.enemyAttackDmg = enemyAttackDmg;
    }

    @Override
    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    @Override
    public void setEnemyDmgMultiplier(int enemyDmgMultiplier) {

    }

    @Override
    public void setEnemyHP(int enemyHP) {
        this.enemyHP = enemyHP;
    }

    @Override
    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
    }

    public void dies(){
        this.enemy_alive = false;
    }
}
