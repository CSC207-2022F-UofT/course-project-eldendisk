package entities.EnemyFactory;

import Combat.Move;
import entities.Character;
import entities.Player;

import java.util.ArrayList;

public abstract class Enemy implements Character {
    private String enemyName;
    private String className; // either Boss or Normal
    private Player player;
    //enemy stats
    private int HP;
    private int attackDamage;
    private double damageMultiplier;
    //moves
    private ArrayList<Move> enemyMoves;

    public Enemy(Player player, String enemyType) {
        this.enemyName = setName("Enemy");
        this.className = enemyType;
        this.player = player;

        this.HP = setInitialEnemyHP();
        this.attackDamage = setAttackDmg();
        this.damageMultiplier = setDamageMultiplier();

        this.enemyMoves = setMoves();

    }
    // use the following abstract methods to set the attributes of Enemy object.
    // implementation depends on the enemyType.
    abstract String setName(String name);
    abstract int setInitialEnemyHP();
    abstract int setAttackDmg();
    abstract  double setDamageMultiplier();

    public Player getPlayer() {return this.player;}




    //abstract methods from Character interface
    @Override
    public String getName() {
        return this.enemyName;
    }

    @Override
    public int getHP() {
        return HP;
    }

    @Override
    public void changeHP(int change) {
        this.HP = this.getHP() - change;
    }
    @Override
    public void receiveDamage(int damage) {
        changeHP(damage); //value should be damage of attack * dmg mult
    }
    @Override
    public void setCharacterHP(int HP) {this.HP = HP;}

    @Override
    public boolean isDead() {
        // enemy dead when enemy's healthPoint less than or equal to 0.
        return this.HP <= 0;
    }


    @Override
    public String pickMove(String selectoin) {
        return null;
    }

    @Override
    public ArrayList<Move> getMoves() {
        return this.enemyMoves;
    }
    @Override
    public abstract ArrayList<Move> setMoves();
    @Override
    public void printMoves() { ;}
    @Override
    public abstract boolean attack(String move, Character characterBeingAttacked);

public interface Enemy { //this should be an interface
    public int getEnemyAttackDmg();
    public int getEnemyHP();
    public int getEnemyDmgMultiplier();
    public int getEnemyStats();
    public String getEnemyName();
    public String getEnemyType();

    public void setEnemyName(String enemyName);
    public void setEnemyHP(int enemyHP);
    public void setEnemyStats(int enemyStats);
    public void setEnemyAttackDmg(int enemyAttackDmg);
    public void setEnemyDmgMultiplier(int enemyDmgMultiplier);
    public void setEnemyType(String enemyType);
}

