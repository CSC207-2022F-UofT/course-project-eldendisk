/* This is our main class where the meat and potatoes of the program is executed */
import Combat.Combat;
import ui.CombatStarts;
import ui.EldenDisk;
import Combat.CombatFactory;
import entities.TempEldenDisk;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {

//        BossEnemy boss1 = new BossEnemy("player", "boss_one");

        EldenDisk.LargeText("ELDEN DISK");


        TempEldenDisk game = new TempEldenDisk();
        int gameLvl = 1;
        while (gameLvl < 4) {
            Combat combat = CombatFactory.createCombat(game.getPlayer(), "Boss");
            CombatStarts.startCombat(combat);
            gameLvl++;
            System.out.println("Current Level is " + gameLvl);


//        EldenDisk.EndGameDialogue();
//        EldenDisk.LargeText("THE END");

        }
}
}
