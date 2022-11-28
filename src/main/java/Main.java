/* This is our main class where the meat and potatoes of the program is executed */
import UI.EldenDisk;
import Entities.Player;
import Entities.EnemyFactory.BossEnemy;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Main {
    Player user = new Player("player1");
    public static void main(String[] args) {
        EldenDisk.LargeText("ELDEN RING");
        EldenDisk.startFight();

        EldenDisk.EndGameDialogue();
        EldenDisk.LargeText("THE END");
    }
    BossEnemy boss1 = new BossEnemy("player", "boss_one");
    EldenDisk fight_one = new EldenDisk(user, boss1);
    fight_one.bossFight1();

    }
}
