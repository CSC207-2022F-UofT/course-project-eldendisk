package entities;
import entities.combat.Move;

import java.util.ArrayList;

public class Gunslinger extends Player {

    /* This class creates the Gunslinger class. The values of the class will be changed depending on the
     * enemy the player encounters*/

    public Gunslinger(String name, int HP, int attackDamage, int damageMultiplier, int money, int XP
            , int max_XP, int player_level) {
        super(name);
        setHP(HP);
        setAttackDamage(attackDamage);
        setDamageMultiplier(damageMultiplier);
        setXP(XP);
        setMaxXP(max_XP);
        setMaxHP(player_level * 2 + 7);
        // money attribute is not in use due to the shop feature drop out.
    }

    public Gunslinger(String name) {
        super(name);
    }

    @Override
    public ArrayList<Move> setMoves() {
        Move first = new Move("Go Go Glock", 6, 1, "Opponent");
        Move second = new Move("gun-fu", 0, 3, "Opponent");
        Move third = new Move("360 NoScope", 3, 2, "Opponent");
        Move fourth = new Move("Execution", 100, 2, "Opponent");

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
            case "Go Go Glock":
                return gogoGlock(characterBeingAttacked);
            case "gun-fu":
                return gunfu(characterBeingAttacked);
            case "360 NoScope":
                return noScope(characterBeingAttacked);
            case "Execution":
                return execution(characterBeingAttacked);
            default:
                System.out.println("\n" + move + " is not a valid move you skip your turn doofus! \n");
                return true;
        }
    }

    private boolean gogoGlock(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage((6 + getAttackDamage()) * getDamageMultiplier());
        return true;
    }

    private boolean gunfu(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(3 * getAttackDamage() * getDamageMultiplier());
        return true;
    }

    private boolean noScope(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(2 * (getAttackDamage() + 3) * getDamageMultiplier());
        return true;
    }

    private boolean execution(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(100);
        return true;
    }


}
