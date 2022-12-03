package Entities;

public interface Character {
    String getName();

    String getClassName();

    boolean attack(String move, Character characterBeingAttacked);

    void receiveDamage(int damage);

    void setCharacterHP(int HP);

    public int getHP();

    public void changeHP(int change);

    boolean isDead();

    public boolean checkMove(String move);

}
