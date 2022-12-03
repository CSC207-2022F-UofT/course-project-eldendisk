package Entities.EnemyFactory;

public interface Enemy { //this should be an interface
    public int getEnemyAttackDmg();
    public int getEnemyHP();
    public int getEnemyDmgMultiplier();
    public int getEnemyStats();
    public String getEnemyName();
    public String getEnemyType();

    public void setEnemyName(String enemyName);
    public void setEnemyHP(int enemyHP);
    public void setEnemyStats(int enemyStats);
    public void setEnemyAttackDmg(int enemyAttackDmg);
    public void setEnemyDmgMultiplier(int enemyDmgMultiplier);
    public void setEnemyType(String enemyType);
}

