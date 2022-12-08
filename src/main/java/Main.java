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
            // combat creation based on the game level and player level
            // First Boss appears when game level is 1 and player level is greater than or equal to 3.
            // Second Boss appears when game level is 1 and player level is greater than or equal to 6.
            // Third Boss appears when game level is 1 and player level is greater than or equal to 9.
            // Otherwise, mini monster appears.
            switch (game.getGameLvl()) {
                case 1:
                    if (game.getPlayer().getPlayer_level() >= 3) {
                        combat = CombatFactory.createCombat(game.getPlayer(), "Boss", game.getGameLvl());
                        break;
                    }
                case 2:
                    if (game.getPlayer().getPlayer_level() >= 6) {
                        combat = CombatFactory.createCombat(game.getPlayer(), "Boss", game.getGameLvl());
                        break;
                    }
                case 3:
                    if (game.getPlayer().getPlayer_level() >= 9) {
                        combat = CombatFactory.createCombat(game.getPlayer(), "Boss", game.getGameLvl());
                        break;
                    }
                default:
                    combat = CombatFactory.createCombat(game.getPlayer(), "Normal", game.getGameLvl());

            }

            CombatStarts.startCombat(combat);

            // depending on the result (enemy alive = defeat , enemy dead = victory),
            // if player won the combat and the enemy was a boss enemy, game level increase by one.
            // If player lost the combat, player gets recovery.

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
