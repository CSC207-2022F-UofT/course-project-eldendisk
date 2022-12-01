/* This is our main class where the meat and potatoes of the program is executed */
import UI.EldenDisk;
import Entities.Player;
import Entities.EnemyFactory.BossEnemy;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Main {


    public static void main(String[] args) {

        BossEnemy boss1 = new BossEnemy("player", "boss_one");
        Player user = new Player("player1");

        EldenDisk.LargeText("ELDEN RING");

        EldenDisk game = new EldenDisk(user, boss1);
        game.startFight();

        EldenDisk.EndGameDialogue();
        EldenDisk.LargeText("THE END");

        game.bossFight1();
    }
}
