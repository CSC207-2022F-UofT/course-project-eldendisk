package entities.EnemyFactory;

import java.util.Objects;

public class EnemyFactory {
    public static Enemy createEnemy(String player, String enemyType) {
        if (Objects.equals(enemyType, "Boss")) {
            return new BossEnemy(player, enemyType);
        } else if (Objects.equals(enemyType, "Normal")) {
            return new NormalEnemy(player, enemyType);
        } //might need else statement to open up some space for the exceptions
        return null;
    }
}

