/* This is our main class where the meat and potatoes of the program is executed */
import entities.combat.Combat;
import ui.CombatStarts;
import ui.EldenDisk;
import entities.combat.CombatFactory;
import entities.TempEldenDisk;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {

//        BossEnemy boss1 = new BossEnemy("player", "boss_one");

        EldenDisk.LargeText("ELDEN DISK");


        TempEldenDisk game = new TempEldenDisk();

        while (game.getGameLvl() < 4) {
            Combat combat = CombatFactory.createCombat(game.getPlayer(), "Boss");
            CombatStarts.startCombat(combat);

            // depending on the result (player alive = victory / player dead = defeat),
            // game level increase or player gets recovery.
            if (combat.getEnemy().isDead()) {
                game.increaseGameLvl();
            } else {

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("...");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("...");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                game.getPlayer().setCharacterHP(game.getPlayer().getCharacterMaxHP());
                System.out.println("You are recovered.");
                System.out.println("");
            }

            if (game.getGameLvl() < 4) {
                System.out.println("Current Game Level is " + game.getGameLvl());
                System.out.println("");
            }
        }

        System.out.println("Congratulation! You won the game!");


        EldenDisk.EndGameDialogue();
        EldenDisk.LargeText("THE END");

}
}
