package entities.item;

public class Item {
    public String name;
    public int buy_price;
    public int sell_price;
    public int attack_pwr;
    public int defend_pwr;
    public boolean consumable;

    public Item(String name, int buy, int sell, int attack, int defend, boolean consumable){
        this.name = name;
        this.buy_price = buy;
        this.sell_price = sell;
        this.attack_pwr = attack;
        this.defend_pwr = defend;
        this.consumable = consumable;
    }

    @Override
    public String toString(){
        return this.name;
    }

    public int getBuy_price(){return this.buy_price;}
    public int getSell_price(){return this.sell_price;}
    public int getAttack_pwr(){return this.attack_pwr;}
    public int getDefend_pwr(){return this.defend_pwr;}

}
