package entities.EnemyFactory;

import Combat.Move;
import entities.Character;
import entities.Player;

import java.util.ArrayList;

public class NormalEnemy extends Enemy {

    private String enemyName;
    private int enemyHP;
    private int enemyStats;
    private int enemyAttackDmg;
    private String enemyType;

    public NormalEnemy(Player player) { // String player -> Player player;
        super(player, "Normal");

    }

    //setter methods
    @Override
    public int setInitialEnemyHP() {
        return this.getPlayer().getAttackDamage();
    }

    ;

    @Override
    public int setAttackDmg() {
        return this.getPlayer().getAttackDamage();
    }

    @Override
    public double setDamageMultiplier() {
        return this.getPlayer().getDamageMultiplier();
    }

    @Override
    public ArrayList<Move> setMoves() {
        return null; /// Since not we are not using Normal Enemy at this point, didn't implement this
    }

    @Override
    public boolean attack(String move, Character characterBeingAttacked) {
        return false; /// Not needed
    }


    @Override
    public String setName(String enemyName) {
        return enemyName;
    }


    @Override
    public void setHP(int enemyHP) {
        this.enemyHP = enemyHP;
    }


    @Override
    public void level_up(){
    }

    public void add_XP(){}
    public int getMax_XP(){return 1;}
    public int get_XP(){return 1;}
    public int getPlayer_level(){return 1;}
    public void dies(){}


}
