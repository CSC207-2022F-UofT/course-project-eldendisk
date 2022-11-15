package EnemyFactory;

public class NormalEnemy implements Enemy {
    private String enemyName;
    private int enemyHP;
    private int enemyStats;
    private int enemyAttackDmg;
    private String enemyType;

    public NormalEnemy(String player, String enemyType) { // String player -> Player player;
        // creating enemy with 70%
        this.enemyName = ""; // might not need this
        this.enemyHP = 100; //player.getPlayerMaxHP * 0.7;
        this.enemyStats = 9; //player.getPlayerStats * 0.7;
        this.enemyAttackDmg = 10; // maybe constant for this?
    }

    //getter methods
    @Override
    public int getEnemyStats() {
        return enemyStats;
    }

    @Override
    public int getEnemyAttackDmg() {
        return enemyAttackDmg;
    }

    @Override
    public int getEnemyDmgMultiplier() {
        return 0; //something here
    }

    @Override
    public String getEnemyName() {
        return enemyName;
    }

    @Override
    public int getEnemyHP() {
        return enemyHP;
    }

    @Override
    public String getEnemyType() {
        return enemyType;
    }

    @Override
    public void setEnemyStats(int enemyStats) {
        this.enemyStats = enemyStats;
    }

    //setter methods
    @Override
    public void setEnemyAttackDmg(int enemyAttackDmg) {
        this.enemyAttackDmg = enemyAttackDmg;
    }

    @Override
    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    @Override
    public void setEnemyDmgMultiplier(int enemyDmgMultiplier) {

    }

    @Override
    public void setEnemyHP(int enemyHP) {
        this.enemyHP = enemyHP;
    }

    @Override
    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
    }
}
