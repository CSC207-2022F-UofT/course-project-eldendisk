package entities;
import entities.combat.Move;

import entities.item.Equip;
import entities.item.Item;

import java.util.ArrayList;

public abstract class Player implements Character, Equip{
    /* This class initializes all the general player stats and creates the player object,
    * constructor, getters, setters, and other respective methods.*/
    public String name;
    public int HP;
    private int max_HP;
    public int attackDamage;
    public int damageMultiplier;

    public int XP;

    public int max_XP;

    public int player_level;


    public ArrayList<Object> inventory; // = new ArrayList<Object>(); //Object will be replaced by item

    public ArrayList<Move> moves;



    public Player(String name) {
        // When Player is created with its name, it has the following attributes;
        // initial max_HP and HP of 9, damage
        this.name = name;

        this.HP = 9;
        this.max_HP = 9;
        this.damageMultiplier = 1;
        this.attackDamage = 1;

        this.player_level = 1;
        this.XP = 0;
        this.max_XP = 2;
        this.inventory = new ArrayList<>();
        this.moves = setMoves();
    }

    // Methods from Character interface.
    @Override
    public abstract boolean attack(String move, Character characterBeingAttacked);
    // this methods need to be implemented differently among different player classes.

    @Override
    public void receiveDamage(int damage) {
        // use changeHP to apply the damage received.
        changeHP(damage);
    }

    // Extra MaxHP attributes of Player class.
    public void setMaxHP(int HP) {this.max_HP = HP;}

    public int getMaxHP() {return this.max_HP;}

    @Override
    public int getHP() {
        return this.HP;
    }

    @Override
    public void setHP(int HP) {this.HP = HP;}

    @Override
    public void changeHP(int change) {
        this.HP = this.HP - change;
    }

    @Override
    public boolean isDead() {
        return getHP() <= 0;
    }

    // Move related methods from Character interface overrided.
    @Override
    public String pickMove(String selection) {
        // pre-condition : selection is either "1", "2", "3", "4"
        // returns a String representation of selected Move using player's selection of move.
        return getMoves().get(Integer.parseInt(selection) - 1).toString();
    }

    @Override
    public abstract ArrayList<Move> setMoves();
    // this sets character's moves according to its class (or type)
    // need to be implemented differently among different player classes.
    @Override
    public ArrayList<Move> getMoves() {return this.moves;}

    // This is for displaying the Player's moves.
    public void printMoves()  {
        for (int i = 0 ; i < 4 ; i++) {
            System.out.println((i+1) + " : " + getMoves().get(i).toString());
        }
    }


    // More getter and setter methods for Player.
    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamageMultiplier(int damageMultiplier) {
        this.damageMultiplier = damageMultiplier;
    }
    public int getDamageMultiplier() {return this.damageMultiplier;}

    public int getAttackDamage() {
        return this.attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }



    // XP System - Player's XP and max_XP values to determine whether player had leveled up.

    // When Player's current xp exceeds its MaxpXP, it levels up and gains 3 extra max HP and heals its HP.
    // Moreover, Player's XP reduces by current MaxXP and then its MaxXP increase by 2.
    // For the variety, Player's attackDamage increase by 1 for every level up.

    // setter (Level related values)
    public void setXP(int XP) {
        this.XP = XP;
    }

    public void setMaxXP(int XP) {this.max_XP = XP; }

    public void setPlayer_level(int level) {this.player_level = level; }

    // getter (Level related values)
    public int getXP(){return this.XP; }

    public int getMaxXP(){return this.max_XP;}

    public int getPlayer_level(){return this.player_level;}


    public void add_XP(int obtainedXP){
        // new XP is set to a value of (current XP + obtainedXP)
        setXP(obtainedXP + getXP());
    }

    public void level_up(){
        // PreCondition: Player's XP >= max_XP
        // level increase by 1, current XP decreases by max_XP and max_XP increase by 2.
        // max_HP increase by 3 and HP is set to new max_XP(heal)
        // Also, attackDamage increase by 1
        setPlayer_level(getPlayer_level() + 1);
        setXP(getXP() - getMaxXP());
        setMaxXP(getMaxXP() + 2);
        setMaxHP(getHP() + 3);
        setHP(getMaxHP());
        setAttackDamage(getAttackDamage() + 1);
    }

    // Equipment System - Not included function.
    public void equipItem(Item item){
        this.HP += item.defend_pwr;
        this.attackDamage += item.attack_pwr;
        this.inventory.add(item);

    }

    public void removeItem(Item item){
        this.HP -= item.defend_pwr;
        this.attackDamage -= item.attack_pwr;
        this.inventory.remove(item);

    }

}
