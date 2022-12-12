package entities;
import entities.combat.Move;

import java.util.ArrayList;


public class Samurai extends Player{
    /* This class creates the Samurai class. The values of the class will be changed depending on the
     * enemy the player encounters*/

    public Samurai(String name, int HP, int attackDamage, int damageMultiplier, int money, int XP
            , int max_XP, int player_level) {
        // This constructor is used in case of loading game.
        // money attribute is not in use due to the Shop feature drop.
        super(name);
        setHP(HP);
        setAttackDamage(attackDamage);
        setDamageMultiplier(damageMultiplier);
        setXP(XP);
        setMaxXP(max_XP);
        setMaxHP(player_level * 2 + 7);
    }

    public Samurai(String name) {
        super(name);
    }
    @Override
    public ArrayList<Move> setMoves() {
        Move first = new Move("Seppuku", 3, 2, "Opponent");
        Move second = new Move("Storm Blade", 1, 3, "Opponent");
        Move third = new Move("Bloody Slash", 5, 1, "Opponent");
        Move fourth = new Move("Execution", 100, 3, "Opponent");

        ArrayList<Move> moves = new ArrayList<>();
        moves.add(first);
        moves.add(second);
        moves.add(third);
        moves.add(fourth);

        return moves;
    }

    @Override
    public boolean attack(String move, Character characterBeingAttacked) {

        switch (move) {
            case "Seppuku":
                return seppuku(characterBeingAttacked);
            case "Storm Blade":
                return stormBlade(characterBeingAttacked);
            case "Bloody Slash":
                return bloodyStash(characterBeingAttacked);
            case "Execution":
                return execution(characterBeingAttacked);
            default:
                System.out.println("\n" + move + " is not a valid move you skip your turn doofus! \n");
                return true;
        }
    }

    private boolean seppuku(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(2 * (3 + getAttackDamage()) * getDamageMultiplier());
        return true;
    }

    private boolean stormBlade(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(3 * (1 + getAttackDamage()) * getDamageMultiplier());
        return true;
    }

    private boolean bloodyStash(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage((5 + getAttackDamage()) * getDamageMultiplier());
        return true;
    }

    private boolean execution(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(100);
        return true;
    }


}
