package entities.enemyFactory;

public class EnemySetters {
    String enemyName;
    int enemyHP;
    int enemyStats;
    int enemyAttackDmg;
    double enemyDmgMultiplier;  //Shouldn't damage multiplier by a double? It was int and I changed it to double
    String enemyType;

    public int getEnemyAttackDmg() {
        return enemyAttackDmg;
    }
    public int getEnemyHP() {
        return enemyHP;
    }
    public double getEnemyDmgMultiplier() {
        return enemyDmgMultiplier;
    }
    public int getEnemyStats() {
        return enemyStats;
    }
    public String getEnemyName() {
        return enemyName;
    }
    public String getEnemyType() {
        return enemyType;
    }


    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }
    public Object setEnemyHP(int enemyHP) {
        this.enemyHP = enemyHP;
        return null;
    }
    public void setEnemyStats(int enemyStats) {
        this.enemyStats = enemyStats;
    }
    public void setEnemyAttackDmg(int enemyAttackDmg) {
        this.enemyAttackDmg = enemyAttackDmg;
    }
    public void setEnemyDmgMultiplier(double enemyDmgMultiplier) {
        this.enemyDmgMultiplier = enemyDmgMultiplier;
    }
    public Object setEnemyType(String enemyType) {
        this.enemyType = enemyType;
        return null;
    }


}
