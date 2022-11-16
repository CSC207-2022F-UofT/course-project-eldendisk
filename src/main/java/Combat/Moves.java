package Combat;

import java.util.List;

public class Moves {
    /*
     * This class represents lists of all Move objects of Character. All characters(Player and Enemy) can
     * pick one Move from their Moves during their turn while in combat.
     */

    // display all moves
    // pick a move
    private List<Move> allMoves;
    private Move selectedMove;

    public Moves() {
        //this.allMoves = generateMoves()
        this.selectedMove = pickMove();
    }

    private List<Move> generateMoves(Character character) {
        return null;
    }
    private Move pickMove() {
        return null;
    }
}
