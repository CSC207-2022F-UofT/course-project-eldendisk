/* This is our main class where the meat and potatoes of the program is executed */
import Combat.Combat;
import UI.CombatStarts;
import UI.EldenDisk;
import Entities.Player;
import Entities.EnemyFactory.BossEnemy;
import Combat.CombatFactory;
import UI.TempEldenDisk;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Main {


    public static void main(String[] args) {

//        BossEnemy boss1 = new BossEnemy("player", "boss_one");

        EldenDisk.LargeText("ELDEN DISK");


        TempEldenDisk game = new TempEldenDisk();
        int gameLvl = 1;
        while (gameLvl < 4) {
            Combat combat = CombatFactory.createCombat(game.getPlayer(), "Boss");
            CombatStarts.startCombat(combat);
            if (!game.getPlayer().isDead()) {
                gameLvl++;
                game.getPlayer().setHP(1);
            }
            System.out.println("Current Level is " + gameLvl);


//        EldenDisk.EndGameDialogue();
//        EldenDisk.LargeText("THE END");

        }
}
}
