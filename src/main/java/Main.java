/* This is our main class where the meat and potatoes of the program is executed */
import UI.EldenDisk;
import entities.Player;
import entities.EnemyFactory.BossEnemy;

public class Main {


    public static void main(String[] args) {

        BossEnemy boss1 = new BossEnemy("player", "boss_one");

        EldenDisk.LargeText("ELDEN DISK");

        EldenDisk game = new EldenDisk(boss1);
        Player user = game.startFight();

//        EldenDisk.EndGameDialogue();
//        EldenDisk.LargeText("THE END");

        game.bossFight1(user);
    }
}
