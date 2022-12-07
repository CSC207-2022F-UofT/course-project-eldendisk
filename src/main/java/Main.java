import Combat.Combat;
import ui.CombatStarts;
import ui.EldenDisk;
import Combat.CombatFactory;
import entities.TempEldenDisk;
import controllers.CombatController;
import presenters.CombatPresenter;
import useCases.CombatUseCase;
import useCases.CombatInterface;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {

//        BossEnemy boss1 = new BossEnemy("player", "boss_one");

        EldenDisk.LargeText("ELDEN DISK");


        TempEldenDisk game = new TempEldenDisk();
        int gameLvl = 1;
        while (gameLvl < 4) {
            Combat combat = CombatFactory.createCombat(game.getPlayer(), "Boss");

            CombatPresenter combatPresenter = new CombatPresenter();
            CombatInterface combatUseCase = new CombatUseCase(combat, combatPresenter);
            CombatController combatController = new CombatController(combatUseCase);
            CombatStarts.startCombat(combatController);

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