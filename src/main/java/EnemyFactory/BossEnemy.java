package EnemyFactory;

public class BossEnemy implements Enemy {
    private String enemyName;
    private int enemyHP;
    private int enemyStats;
    private int enemyAttackDmg;

    private String enemyType;

    public BossEnemy(String player, String enemyType) { // String player -> Player player;
        // implementation on creating fixed stats
        this.enemyName = "";
        this.enemyHP = 100; //player.getPlayerMaxHP * 0.7;
        this.enemyStats = 9; //player.getPlayerStats * 0.7;
        this.enemyAttackDmg = 10; // player.getPlayer
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
        return 0;
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
