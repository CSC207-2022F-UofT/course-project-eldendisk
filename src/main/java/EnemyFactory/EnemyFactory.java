package EnemyFactory;

import Player_Types.Player;

import java.util.Objects;

public class EnemyFactory {
    public static Enemy createEnemy(Player player, String enemyType) {
        switch (enemyType) {
            case "Boss":
                return new BossEnemy(player);
            case "Normal":
                return new NormalEnemy(player);
            default:
                System.out.println("Wrong enemyType. Please Check");
                return null;
        }
    }
}

