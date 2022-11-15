package Enemy;

public class Enemy {
    String enemyName;
    int enemyHP;
    int enemyStats;
    int enemyAttackDmg;
    int enemyDmgMultiplier;
    String enemyType;

    public int getEnemyAttackDmg() {
        return enemyAttackDmg;
    }
    public int getEnemyHP() {
        return enemyHP;
    }
    public int getEnemyDmgMultiplier() {
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
    public void setEnemyHP(int enemyHP) {
        this.enemyHP = enemyHP;
    }
    public void setEnemyStats(int enemyStats) {
        this.enemyStats = enemyStats;
    }
    public void setEnemyAttackDmg(int enemyAttackDmg) {
        this.enemyAttackDmg = enemyAttackDmg;
    }
    public void setEnemyDmgMultiplier(int enemyDmgMultiplier) {
        this.enemyDmgMultiplier = enemyDmgMultiplier;
    }
    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
    }


}
