package entities;
import Combat.Move;

import java.util.ArrayList;


public class Mage extends Player{
    /* This class creates the mage class. The values of the class will be changed depending on the
    * enemy the player encounters*/
    //TODO implement combat methods

    public Mage(String name, int HP, int attackDamage, int damageMultiplier, int money, int XP
            , int max_XP, int player_level) {
        super(name);
    }

    public Mage(String name) {
        super(name);
    }

    @Override
    public ArrayList<Move> setMoves() {
        Move first = new Move("Flame of the Fell God", 1, 1, "Opponent");
        Move second = new Move("Comet Azur", 1, 1, "Opponent");
        Move third = new Move("Stars of Ruin", 1, 1, "Opponent");
        Move fourth = new Move("Execution", 1, 1, "Opponent");

        ArrayList<Move> moves = new ArrayList<Move>();
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
        characterBeingAttacked.receiveDamage(2);
        return true;
    }

    private boolean cometAzur(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(2);
        return true;
    }

    private boolean startsOfRuins(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(1);
        return true;
    }

    private boolean execution(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(10);
        return true;
    }

}
