package Player_Types;
import java.util.ArrayList;

public class Gunslinger extends Player{
    /* This class creates the Gunslinger class. The values of the class will be changed depending on the
     * enemy the player encounters*/
    //TODO implement combat methods

    public Gunslinger(String name, int HP, int attackDamage, int damageMultiplier, int money, int XP
            , ArrayList<Object> inventory) {
        super(name, HP, attackDamage, damageMultiplier, money, XP, inventory);
    }
}
