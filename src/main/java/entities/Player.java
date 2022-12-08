package entities;
import Combat.Move;

import Item.Equip;
import Item.Item;

import java.util.ArrayList;

public abstract class Player implements Character, Equip{

    //TODO implement interface for combat, death, and any other things that each player would do.

    /* This class initializes all the general player stats and creates the player object,
    * constructor, getters, setters, and other respective methods.*/
    public String name = "";
    public int HP = 100;
    public int attackDamage = 10;
    public int damageMultiplier = 0;
    public int money = 0;
    public int XP = 0;
    //Should we increment the max_XP as the player levels up?
    public int max_XP = 2;

    public int player_level = 1;

    public boolean player_alive = false;

    public ArrayList<Object> inventory = new ArrayList<Object>(); //Object will be replaced by item

    public ArrayList<Move> moves;



    public Player(String name) {
        this.name = name;
        this.damageMultiplier = 1;

        this.XP = 1;
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


    @Override
    public void changeHP(int change) {
        this.HP = this.HP - change;
    }

    @Override
    public boolean isDead() {
        return this.player_alive;
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




    public void increaseMoney(int numberToIncrease){
        this.money = this.money + numberToIncrease;
    }

    public void decreaseMoney(int numberToDecrease){
        this.money = this.money + numberToDecrease;
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

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getDamageMultiplier() {
        return damageMultiplier;
    }

    public void setDamageMultiplier(int damageMultiplier) {
        this.damageMultiplier = damageMultiplier;
    }



    public int getXP() {
        return XP;
    }

    public Object setXP(int XP) {
        this.XP = XP;
        return null;
    }

    @Override
    public int getMax_XP(){return this.max_XP;}
    public int get_XP(){return this.XP;}
    public int getPlayer_level(){return this.player_level;}

    public void dies(){
        this.player_alive = false;
    }


    // Should we make an XP calculation method to give player different XP everytime?

    public void add_XP(){this.XP += 2;}

    // This is used in the EldenDisk file. Condition: method is called when XP exceeds max_XP.f
    public void level_up(){
        this.player_level += 1;
        this.XP = 0;
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
