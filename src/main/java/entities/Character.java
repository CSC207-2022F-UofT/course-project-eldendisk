package entities;

import entities.combat.Move;

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




}
