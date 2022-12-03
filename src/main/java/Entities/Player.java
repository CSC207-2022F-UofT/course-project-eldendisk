package Entities;
import Item.Equip;
import Item.Item;

import java.util.ArrayList;

public class Player implements Death, Equip{
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
    public int max_XP = 10;
    public int player_level = 1;

    public boolean player_alive = true;

    public ArrayList<Object> inventory = new ArrayList<Object>(); //Object will be replaced by item


    public Player(String name) {
        this.name = name;
        this.damageMultiplier = 1;
        this.money = 10;
        this.XP = 1;
        this.inventory = new ArrayList<>();
    }

    public void increaseMoney(int numberToIncrease){
        this.money = this.money + numberToIncrease;
    }

    public void decreaseMoney(int numberToDecrease){
        this.money = this.money + numberToDecrease;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getXP() {
        return XP;
    }

    public Object setXP(int XP) {
        this.XP = XP;
        return null;
    }


    public int getMax_XP(){return this.max_XP;}
    public int getPlayer_level(){return this.player_level;}

    public void dies(){
        this.player_alive = false;
    }

    // Should we make an XP calculation method to give player different XP everytime?
    public void add_XP(){this.XP += 5;}

    // This is used in the EldenDisk file. Condition: method is called when XP exceeds max_XP.
    public void level_up(){
        this.level_up();
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
