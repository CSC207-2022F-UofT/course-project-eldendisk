package Player_Types;
import java.util.ArrayList;

public class Samurai extends Player{
    /* This class creates the Samurai class. The values of the class will be changed depending on the
     * enemy the player encounters*/
    //TODO implement combat methods

    public Samurai(String name, int HP, int attackDamage, int damageMultiplier, int money, int XP
            , ArrayList<Object> inventory, int max_XP, int player_level) {
        super(name, HP, attackDamage, damageMultiplier, money, XP, inventory, max_XP, player_level);
    }

}
