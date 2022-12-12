package entities.player;
import entities.combat.Move;

import java.util.ArrayList;


public class Mage extends Player {
    /* This class creates the mage class. The values of the class will be changed depending on the
    * enemy the player encounters*/

    public Mage(String name, int HP, int attackDamage, int damageMultiplier, int money, int XP
            , int max_XP, int player_level) {
        // manual setting. Used for Loading game.
        // Note that money attribute is not in use due to the Shop feature drop out.
        super(name);
        setHP(HP);
        setAttackDamage(attackDamage);
        setDamageMultiplier(damageMultiplier);
        setXP(XP);
        setMaxXP(max_XP);
        setMaxHP(player_level * 2 + 7);
    }

    public Mage(String name) {
        super(name);
    }

    @Override
    public ArrayList<Move> setMoves() {
        // Mage has 4 Moves.
        Move first = new Move("Flame of the Fell God", 2, 3, "Opponent");
        Move second = new Move("Comet Azur", 1, 4, "Opponent");
        Move third = new Move("Stars of Ruin", 0, 5, "Opponent");
        Move fourth = new Move("Execution", 100, 1, "Opponent");

        ArrayList<Move> moves = new ArrayList();
        moves.add(first);
        moves.add(second);
        moves.add(third);
        moves.add(fourth);

        return moves;
    }

    @Override
    public boolean attack(String move, Character characterBeingAttacked) {

        switch (move) {
            case "Flame of the Fell God":
                return flameOfTheFellGod(characterBeingAttacked);
            case "Comet Azur":
                return cometAzur(characterBeingAttacked);
            case "Stars of Ruin":
                return startsOfRuins(characterBeingAttacked);
            case "Execution":
                return execution(characterBeingAttacked);
            default:
                System.out.println("\n" + move + " is not a valid move you skip your turn doofus! \n");
                return true;
        }
    }

    private boolean flameOfTheFellGod(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(3 * (2 + getAttackDamage()) * getDamageMultiplier());
        return true;
    }

    private boolean cometAzur(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(4 * (1 + getAttackDamage()) * getDamageMultiplier());
        return true;
    }

    private boolean startsOfRuins(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(5 * getAttackDamage() * getDamageMultiplier());
        return true;
    }

    private boolean execution(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(100);
        return true;
    }



}
