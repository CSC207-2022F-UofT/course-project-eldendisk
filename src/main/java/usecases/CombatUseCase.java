package usecases;

import java.util.Random;

import entities.combat.Combat;
import presenters.CombatPresenter;

public class CombatUseCase implements CombatInterface {
    /*
    CobmatUseCase use case. Contains all the core game logic for combat.
     */
    private Combat combat;
    private CombatPresenter presenter;
    static int selection;

    public CombatUseCase(Combat combat, CombatPresenter presenter) {
        this.combat = combat;
        this.presenter = presenter;
    }

    public void startCombat() {
        presenter.displayDelay();
        presenter.displayEnemyEncounter();
        presenter.displayDelay();
        presenter.displayVS(combat.getPlayer().getName(), combat.getEnemy().getName(), combat.getPlayer().getHP(), combat.getEnemy().getHP());
        presenter.displayDelay();

        while (!combat.getEnemy().isDead() && !combat.getPlayer().isDead()) {
            //Ask first player what he wants to do;
            presenter.displayPlayerTurn(combat.getPlayer().getName(), combat.getPlayer().getHP());
            combat.getPlayer().printMoves();
            //input
            String playerMove = presenter.getInput();

            if (playerMove.equals("quit")) {
                presenter.displayQuit();
                break;

            } else if (playerMove.equals("1") || playerMove.equals("2") || playerMove.equals("3") || playerMove.equals("4")) {
                combat.getPlayer().attack(combat.getPlayer().pickMove(playerMove), combat.getEnemy());
                presenter.displayAttack(combat.getPlayer().pickMove(playerMove));
            } else {
                presenter.displayMissed();
            }
            presenter.displayDelay();

            if (combat.getEnemy().isDead()) {
                break;
            }

            presenter.displayEnemyTurn(combat.getEnemy().getName(), combat.getEnemy().getHP());
            presenter.displayDelay();
            selection = new Random().nextInt(4) + 1; // bound by number of moves in Moves

            String selectedMove = combat.getEnemy().pickMove(Integer.toString(selection));
            presenter.displayEnemyMove(selectedMove);
            presenter.displayDelay();
            combat.getEnemy().attack(selectedMove, combat.getPlayer());

            if (combat.getPlayer().isDead()) {
                break;
            }
        }

        // result

        if (combat.getEnemy().isDead()) {
            presenter.displayCombatWin(combat.getEnemy().getName());
            combat.getPlayer().add_XP(2);
            while (combat.getPlayer().getXP() >= combat.getPlayer().getMaxXP()) {
                combat.getPlayer().level_up();
                presenter.displayLevelUp(combat.getPlayer().getPlayerLevel());
            }
        }

        if (combat.getPlayer().isDead()) {
            presenter.displayCombatLose(combat.getPlayer().getName());
        }

        presenter.displayDelay();
        presenter.displayCombatOver();
        presenter.displayDelay();
        presenter.displayPrepare();
        presenter.displayDelay();
    }

}