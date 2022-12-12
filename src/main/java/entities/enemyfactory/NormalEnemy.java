package entities.enemyfactory;

import entities.combat.Move;
import entities.player.Character;
import entities.player.Player;

import java.util.ArrayList;

public class NormalEnemy extends Enemy {

    private String enemyName;
    private int enemyHP;
    private int enemyStats;
    private int enemyAttackDmg;
    private String enemyType;

    public NormalEnemy(Player player) { // String player -> Player player;
        super(player, "Normal");
        setName();


    }
    @Override
    void setName() {
        this.enemyName = "mini monster";
    }
    @Override
    public String getName() {
        return this.enemyName;
    }
    //setter methods
    @Override
    public int setInitialEnemyHP() {
        return 20;
    }

    ;

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

    private boolean roar(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(1);
        return true;
    }

    private boolean kick(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(3);
        return true;
    }

    private boolean punch(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(5);
        return true;
    }

    private boolean charge(Character characterBeingAttacked) {
        characterBeingAttacked.receiveDamage(5);
        return true;
    }


    @Override
    public void setHP(int enemyHP) {
        this.enemyHP = enemyHP;
    }


}
