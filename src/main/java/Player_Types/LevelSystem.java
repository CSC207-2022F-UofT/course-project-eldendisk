package Player_Types;

public interface LevelSystem {
    int getCurrExp();
    int getMaxExp();

    void addExp(int gainedExp);
    void setCurrExp(int remainingExp);
    void incrementMaxExp();

    void statGrowth();
    void levelUp();

}
