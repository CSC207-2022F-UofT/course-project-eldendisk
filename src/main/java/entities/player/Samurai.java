package entities.player;
import entities.combat.Move;
import entities.player.Character;
import entities.player.Player;

import java.util.ArrayList;


public class Samurai extends Player {
    /* This class creates the Samurai class. The values of the class will be changed depending on the
     * enemy the player encounters*/

    public Samurai(String name, int HP, int attackDamage, int damageMultiplier, int money, int XP
            , int max_XP, int player_level) {
        super(name);
    }

    public Samurai(String name) {
        super(name);
    }
    @Override
    public ArrayList<Move> setMoves() {
        Move first = new Move("Seppuku", 1, 1, "Opponent");
        Move second = new Move("Storm Blade", 1, 1, "Opponent");
        Move third = new Move("Bloody Slash", 1, 1, "Opponent");
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
        characterBeingAttacked.receiveDamage(3);
        return true;
    }

    private boolean stormBlade(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(1);
        characterBeingAttacked.receiveDamage(1);
        characterBeingAttacked.receiveDamage(1);
        return true;
    }

    private boolean bloodyStash(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(2);
        return true;
    }

    private boolean execution(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(100);
        return true;
    }


}