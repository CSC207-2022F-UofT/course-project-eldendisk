package entities;

import entities.combat.Move;

import java.util.ArrayList;

public interface Character {
    // Character interface contains methods needed for combat system.
    // Player and Enemy implement this interface.

    String getName();
    // for both Enemy and Player, this returns name of the Character.

    boolean attack(String move, Character characterBeingAttacked);
    // this must be implemented differently among classes that implements Character.

    void receiveDamage(int damage);
    // Use changeHP method to apply the damage received.

    int getHP();
    // Get CURRENT HP of the Character.
    // Note that Player also has MaxHP attribute. (This method does not deal with MaxHP)
    void setHP(int HP);
    // Set CURRENT HP of the Character.
    // Note that Player also has MaxHP attribute. (This method does not deal with MaxHP)
    void changeHP(int change);
    // Set Character's HP to (original HP - change).
    // If it is a case of damaging, change  > 0, and if it is a case of healing, change < 0.

    boolean isDead();
    // return True iff Character's HP is less than or equal to 0. (returns False otherwise.)
    // This method is used to determine when to terminate a combat and what the result of the combat is.

    String pickMove(String selection);
    // Method that select a corresponding Move from Characters' set of moves based on the user input selection.


    ArrayList<Move> setMoves();
    // Setter method to set the set of Move instances of Character.
    // As each Player type has different moves, each Player type must implement differently based on the moves.
    // Normal enemies have same moves, but different Boss Enemies must have different moves.

    ArrayList<Move> getMoves();
    // Getter method to access the all Move instances of Character.


}
