package Player_Types;
import java.util.ArrayList;

public class Player implements Death{
    //TODO implement interface for combat, death, and any other things that each player would do.

    /* This class initializes all the general player stats and creates the player object,
    * constructor, getters, setters, and other respective methods.*/
    public String name = "";
    public int HP = 100;
    public int attackDamage = 10;
    public int damageMultiplier = 0;
    public int money = 0;
    public int XP = 0;
    public ArrayList<Object> inventory = new ArrayList<Object>(); //Object will be replaced by item

    public Player(String name, int HP, int attackDamage, int damageMultiplier, int money, int XP,
                  ArrayList<Object> inventory) {
        this.name = name;
        this.HP = HP;
        this.attackDamage = attackDamage;
        this.damageMultiplier = damageMultiplier;
        this.money = money;
        this.XP = XP;
        this.inventory = inventory;
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

    public void setXP(int XP) {
        this.XP = XP;
    }
    public void dies(){
        //TODO fill in everything that happens when the player dies.
    }
}
