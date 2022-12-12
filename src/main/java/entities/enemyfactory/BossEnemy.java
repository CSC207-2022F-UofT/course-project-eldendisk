package entities.enemyfactory;
import entities.combat.Move;
import entities.player.Player;
import entities.player.Character;

import java.util.ArrayList;

public abstract class BossEnemy extends Enemy {

    private String enemyName;
    private int HP;

    private String enemyType;

    public boolean enemy_alive = true;
    public BossEnemy(Player player) {
        super(player, "Boss");
    }


    public void setName(String name) {this.enemyName = name;}


    abstract int setInitialEnemyHP();

    @Override
    public int setAttackDmg() {
        return 1;
    }

    @Override
    public double setDamageMultiplier() {
        return 1.0;
    }

    @Override
    public ArrayList<Move> setMoves() {
        ArrayList<Move> moves = new ArrayList<Move>();
        Move first = new Move("Roar", 1, 1, "Opponent");
        Move second = new Move("Kick", 1, 1, "Opponent");
        Move third = new Move("Punch", 1, 1, "Opponent");
        Move fourth = new Move("Charge", 1, 1, "Opponent");

        moves.add(first);
        moves.add(second);
        moves.add(third);
        moves.add(fourth);

        return moves;
    }

    @Override
    public boolean attack(String move, Character characterBeingAttacked) {

        switch (move) {
            case "Roar":
                return roar(characterBeingAttacked);
            case "Kick":
                return kick(characterBeingAttacked);
            case "Punch":
                return punch(characterBeingAttacked);
            case "Charge":
                return charge(characterBeingAttacked);
            default:
                System.out.println("\n" + move + " is not a valid move you skip your turn doofus! \n");
                return true;
        }
    }

    @Override
    public void setHP(int HP) {
        this.setHP(HP);
    }

    // enemy moves

    protected abstract boolean roar(Character characterBeingAttacked);

    protected abstract boolean kick(Character characterBeingAttacked);


    protected abstract boolean punch(Character characterBeingAttacked);


    protected abstract boolean charge(Character characterBeingAttacked);
}
