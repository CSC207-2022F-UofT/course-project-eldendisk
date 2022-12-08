package entities.enemyFactory;
import entities.Player;
import java.util.Objects;

public class EnemyFactory {
    public static Enemy createEnemy(Player player, String enemyType) {
        // Create Enemy based on the enemyType and Player
        if (Objects.equals(enemyType, "Boss")) {
            return new BossEnemy(player);
        } else if (Objects.equals(enemyType, "Normal")) {
            return new NormalEnemy(player);
        } else {
            return null;
        }

    }
}

