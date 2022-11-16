package Player_Types;

public interface Character {
    String getName();
    void receiveDamage(String attack);
    String getClassName();
    public int getHP();
    public void changeHP(int change);
    boolean isDead();
    boolean attack(String move, Character characterBeingAttacked);

}
