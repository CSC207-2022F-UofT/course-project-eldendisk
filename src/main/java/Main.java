/* This is our main class where the meat and potatoes of the program is executed */
import entities.combat.Combat;
import entities.enemyFactory.BossEnemy;
import ui.CombatStarts;
import ui.EldenDisk;
import entities.combat.CombatFactory;
import entities.TempEldenDisk;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {

        EldenDisk.LargeText("ELDEN DISK");

        TempEldenDisk game = new TempEldenDisk();

        while (game.getGameLvl() < 4) {
            Combat combat;

            switch (game.getPlayer().getPlayer_level()) {
                case 3:
                case 6:
                case 9:
                    combat = CombatFactory.createCombat(game.getPlayer(), "Boss", game.getGameLvl());
                    break;

                default :
                    combat = CombatFactory.createCombat(game.getPlayer(), "Normal", game.getGameLvl());
            }

            CombatStarts.startCombat(combat);

            // depending on the result (player alive = victory / player dead = defeat),
            // game level increase or player gets recovery.
            if (combat.getEnemy().isDead()) {
                if (combat.getEnemy() instanceof BossEnemy) {
                    game.increaseGameLvl();
                }
            } else {

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
