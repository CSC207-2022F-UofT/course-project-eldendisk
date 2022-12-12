/* This is our main class where the game is set up and run. */
import entities.combat.Combat;
import entities.enemyfactory.BossEnemy;
import ui.CombatStarts;
import ui.EldenDisk;
import entities.combat.CombatFactory;
import entities.TempEldenDisk;
import controllers.CombatController;
import presenters.CombatPresenter;
import usecases.CombatUseCase;
import usecases.CombatInterface;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        EldenDisk.LargeText("ELDEN DISK");

        TempEldenDisk game = new TempEldenDisk();

        while (game.getGameLvl() < 4) {
            Combat combat;
            // combat creation based on the game level and player level
            // First Boss appears when game level is 1 and player level is greater than or equal to 3.
            // Second Boss appears when game level is 2 and player level is greater than or equal to 6.
            // Third Boss appears when game level is 3 and player level is greater than or equal to 9.
            // Otherwise, mini monster appears.
            switch (game.getGameLvl()) {
                case 1:
                    if (game.getPlayer().getPlayerLevel() >= 3) {
                        combat = CombatFactory.createCombat(game.getPlayer(), "Boss", game.getGameLvl());
                        break;
                    }
                case 2:
                    if (game.getPlayer().getPlayerLevel() >= 6) {
                        combat = CombatFactory.createCombat(game.getPlayer(), "Boss", game.getGameLvl());
                        break;
                    }
                case 3:
                    if (game.getPlayer().getPlayerLevel() >= 9) {
                        combat = CombatFactory.createCombat(game.getPlayer(), "Boss", game.getGameLvl());
                        break;
                    }
                default:
                    combat = CombatFactory.createCombat(game.getPlayer(), "Normal", game.getGameLvl());

            }

            CombatPresenter combatPresenter = new CombatPresenter();
            CombatInterface combatUseCase = new CombatUseCase(combat, combatPresenter);
            CombatController combatController = new CombatController(combatUseCase);
            CombatStarts.startCombat(combatController);

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

                game.getPlayer().setHP(game.getPlayer().getMaxHP());
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
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        EldenDisk.LargeText("THE END");
    }
}

