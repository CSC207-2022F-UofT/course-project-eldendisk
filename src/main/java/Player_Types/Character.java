package Player_Types;

public interface Character {
    String getName();
    String getClassName();
    boolean attack(String move, Character characterBeingAttacked);
    void receiveDamage(String attack);
    public int getHP();
    public void changeHP(int change);
    boolean isDead();


}
