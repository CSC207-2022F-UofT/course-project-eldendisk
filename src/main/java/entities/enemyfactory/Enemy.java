package entities.enemyfactory;

import entities.combat.Move;
import entities.player.Character;
import entities.player.Player;

import java.util.ArrayList;

public abstract class Enemy implements Character {
    // Enemy class implements Character interface in which contains methods need for Combat.
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
        this.enemyName = "";
        this.className = enemyType;
        this.player = player;

        this.HP = setInitialEnemyHP();
        this.attackDamage = setAttackDmg();
        this.damageMultiplier = setDamageMultiplier();

        this.enemyMoves = setMoves();

    }

    // use the following abstract methods to set the attributes of Enemy object.
    // implementation depends on the enemyType.
    abstract void setName();

    abstract int setInitialEnemyHP();

    abstract int setAttackDmg();

    abstract double setDamageMultiplier();

    public Player getPlayer() {
        return this.player;
    }


    //abstract methods from Character interface
    @Override
    public String getName() {
        return this.enemyName;
    }

    @Override
    public int getHP() {
        return this.HP;
    }

    @Override
    public void changeHP(int change) {
        this.HP = this.getHP() - change;
    }

    @Override
    public void receiveDamage(int damage) {changeHP(damage); }

    @Override
    public void setHP(int HP) {
        this.HP = HP;
    }

    @Override
    public boolean isDead() {
        // enemy is dead when enemy's healthPoint less than or equal to 0.
        return this.HP <= 0;
    }


    @Override
    public String pickMove(String selection) {
        return getMoves().get(Integer.valueOf(selection) - 1).toString();
    }

    @Override
    public ArrayList<Move> getMoves() {
        return this.enemyMoves;
    }

    @Override
    public abstract ArrayList<Move> setMoves();


    @Override
    public abstract boolean attack(String move, Character characterBeingAttacked);

}
