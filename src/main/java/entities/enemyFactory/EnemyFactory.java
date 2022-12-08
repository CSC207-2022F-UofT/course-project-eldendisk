package entities.enemyFactory;
import entities.Player;
import java.util.Objects;

public class EnemyFactory {
    public static Enemy createEnemy(Player player, String enemyType, int gameLevel) {
        // Create Enemy based on the enemyType and Player
        if (Objects.equals(enemyType, "Boss")) {
            switch (gameLevel) {
                case 1:
                    return new FirstBoss(player);
                case 2:
                    return new SecondBoss(player);
                case 3:
                    return new ThirdBoss(player);
            }
        } else {
            return new NormalEnemy(player);
        }
        return new NormalEnemy(player);
    }

}