package entities;
import Combat.Move;

import Item.Equip;
import Item.Item;

import java.util.ArrayList;

public abstract class Player implements Character, Equip{

    //TODO implement interface for combat, death, and any other things that each player would do.

    /* This class initializes all the general player stats and creates the player object,
    * constructor, getters, setters, and other respective methods.*/
    public String name;
    public int HP;
    private int max_HP;
    public int attackDamage;
    public double damageMultiplier;

    public int XP = 0;

    public int max_XP = 2;

    public int player_level = 1;

    public boolean player_alive = false;

    public ArrayList<Object> inventory; // = new ArrayList<Object>(); //Object will be replaced by item

    public ArrayList<Move> moves;



    public Player(String name) {
        this.name = name;

        this.HP = 9;
        this.max_HP = 9;
        this.damageMultiplier = 1;

        this.XP = 0;
        this.max_XP = 2;
        this.inventory = new ArrayList<>();
        this.moves = setMoves();
    }
    // following methods are the methods in Character interface.
    @Override
    public abstract boolean attack(String move, Character characterBeingAttacked);

    @Override
    public void receiveDamage(int damage) {
        changeHP(damage);
    }

    @Override
    public void setCharacterHP(int HP) {
        this.HP = HP;
    }

    public void setCharacterMaxHP(int HP) {this.max_HP = HP;}

    public int getCharacterMaxHP() {return this.max_HP;}


    @Override
    public void changeHP(int change) {
        this.HP = this.HP - change;
    }

    @Override
    public boolean isDead() {
        return getHP() <= 0;
    }

    @Override
    public String pickMove(String selection) {
        // pre condition : selection is either 1, 2, 3, 4
        return getMoves().get(Integer.valueOf(selection) - 1).toString();
    }

    @Override
    public abstract ArrayList<Move> setMoves();
    // this sets character's moves according to its class (or type)
    @Override
    public ArrayList<Move> getMoves() {return this.moves;}


    public void printMoves()  {
        for (int i = 0 ; i < 4 ; i++) {
            System.out.println((i+1) + " : " + getMoves().get(i).toString());
        }
    }



    @Override

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getHP() {
        return HP;
    }

    @Override
    public void setHP(int HP) {this.HP = HP;}

    public void setDamageMultiplier(double damageMultiplier) {
        this.damageMultiplier = damageMultiplier;
    }

    public double getDamageMultiplier() {return this.damageMultiplier;}

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }



    // XP System - Player's XP and max_XP values to determine whether player had leveled up.
    // As Player levels up, player gain 1 extra max HP and heals its HP.

    public void setXP(int XP) {
        this.XP = XP;
    }

    public void setMaxXP(int XP) {
        this.max_XP = XP;
    }
    public int get_XP(){return this.XP;}

    public int getMax_XP(){return this.max_XP;}

    public int getPlayer_level(){return this.player_level;}

    public void add_XP(int obtainedXP){this.XP += obtainedXP;}

    // This is used in the EldenDisk file. Condition: method is called when XP exceeds max_XP.f
    public void level_up(){
        this.player_level += 1;
        setXP(get_XP() - getMax_XP());
        setMaxXP(getMax_XP() + 2);
        setCharacterMaxHP(getCharacterMaxHP() + 3);
        setCharacterHP(getCharacterMaxHP());
    }


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
