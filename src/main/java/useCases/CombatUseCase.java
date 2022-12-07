package useCases;

import java.util.Random;

import Combat.Combat;
import presenters.CombatPresenter;
import entities.Character;

public class CombatUseCase {
    /*
    CobmatUseCase use case. Contains all the core game logic for combat.
     */
    private Combat combat;
    private CombatPresenter presenter;
    private Character player;
    private Character enemy;
    static int selection;
    static Random random;

    public CombatUseCase(Combat combat, CombatPresenter presenter) {
        this.combat = combat;
        this.presenter = presenter;
    }

    public Character getPlayer() {
        return player;
    }

    public Character getEnemy() {
        return enemy;
    }
    public void startCombat() {
        presenter.displayMessage(combat.getPlayer().getName() +" VS "
                + combat.getEnemy().getName());
        presenter.displayMessage("-------------------------------------------------------");

        while (!combat.getEnemy().isDead() && !combat.getPlayer().isDead() ) {
            //Ask first player what he wants to do;
            presenter.displayMessage(combat.getPlayer().getName() + ", it is your turn.");
            presenter.displayMessage("-------------------------------------------------------");
            //input
            if (presenter.hasInput()) {
                combat.getPlayer().printMoves();
                String playerMove = presenter.getInput();


                if (playerMove.equals("quit")) {
                    presenter.displayMessage("You quit!");
                    break;
                } else if (playerMove.equals("1") || playerMove.equals("2") || playerMove.equals("3")||playerMove.equals("4"))
                    // (combat.getPlayer().checkMove(goodMove) after adding implementation of move in players
                    combat.getPlayer().attack(combat.getPlayer().pickMove(playerMove), combat.getEnemy());
            } else {
                presenter.displayMessage("Not a valid input, you skip your turn");
            }

            if (combat.getEnemy().isDead()) {
                break;
            }

            presenter.displayMessage("Now " + combat.getEnemy().getName() + " moves..." );
            presenter.displayMessage("-------------------------------------------------------");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            selection = new Random().nextInt(4) + 1; // bound by number of moves in Moves

            // remove switch, implement pick corresponding move method and enemy use attack method to attack.
            switch (selection) { // this is about the attack moves (implement moves and attack first then come back to this)
                case 1:
                    presenter.displayMessage("Enemy's move1");
                    combat.getEnemy().attack(combat.getEnemy().pickMove(Integer.toString(selection)), combat.getPlayer());
                    break;
                case 2:
                    presenter.displayMessage("Enemy's move2");
                    combat.getEnemy().attack(combat.getEnemy().pickMove(Integer.toString(selection)), combat.getPlayer());
                    break;
                case 3:
                    presenter.displayMessage("Enemy's move3");
                    combat.getEnemy().attack(combat.getEnemy().pickMove(Integer.toString(selection)), combat.getPlayer());
                    break;
                case 4:
                    presenter.displayMessage("Enemy's move4");
                    combat.getEnemy().attack(combat.getEnemy().pickMove(Integer.toString(selection)), combat.getPlayer());
            }
            if (combat.getPlayer().isDead()) {
                break;
            }

        }

        if (combat.getEnemy().isDead()) {
            presenter.displayMessage(combat.getEnemy().getName() + " has died! You won!");
        }

        if (combat.getPlayer().isDead()) {
            presenter.displayMessage(combat.getPlayer().getName() + " have died!");
        }
    }

}