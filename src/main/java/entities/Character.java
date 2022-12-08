package entities;

import Combat.Move;

import java.util.ArrayList;

public interface Character {
    String getName();

    boolean attack(String move, Character characterBeingAttacked);

    void receiveDamage(int damage);

    void setCharacterHP(int HP);

    public int getHP();
    public void setHP(int HP);

    public void changeHP(int change);

    boolean isDead();

    String pickMove(String selectoin);
    public void printMoves();

    public ArrayList<Move> setMoves();
    public ArrayList<Move> getMoves();


    public int getMax_XP();
    public int get_XP();
    public int getPlayer_level();

    public void dies();


    // Should we make an XP calculation method to give player different XP everytime?

    public void add_XP();

    // This is used in the EldenDisk file. Condition: method is called when XP exceeds max_XP.
    public void level_up();


}
