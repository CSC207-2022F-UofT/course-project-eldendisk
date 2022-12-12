package presenters;

import ui.CombatStarts;

public class CombatPresenter {
    /*
    Returns the information from the CombatUseCase to the CombatStartsUI.
     */

    public CombatPresenter() {
    }

    public String getInput() {
        return CombatStarts.getInput();
    }

    public void displayDelay() {
        CombatStarts.displayDelay(2000);
    }
    public void displayEnemyEncounter() {
        CombatStarts.displayMessage("You encountered a new Enemy...\n");
    }

    public void displayVS(String playerName, String enemyName, int playerHP, int enemyHP) {
        CombatStarts.displayMessage("\n" + playerName + " (" + playerHP + " HP) VS " + enemyName + " (" + enemyHP + " HP)");
        displayLine();
    }

    public void displayPlayerTurn(String playerName, int playerHP) {
        CombatStarts.displayMessage(playerName + ", it is your turn.");
        CombatStarts.displayMessage("You have " + playerHP + " HP now...");
        this.displayLine();
        CombatStarts.displayMessage("Give us your move...");
    }

    public void displayEnemyTurn(String enemyName, int enemyHP) {
        CombatStarts.displayMessage("Now " + enemyName + " moves...");
        CombatStarts.displayMessage("Enemy has " + enemyHP + " hp");
        displayLine();
    }

    public void displayEnemyMove(String move) {
        CombatStarts.displayMessage("Enemy's " + move + "!\n");
        displayLine();
    }

    public void displayQuit() {
        CombatStarts.displayMessage("You quit the game... Maybe next time...");
        CombatStarts.quitGame();
    }

    public void displayAttack(String move) {
        CombatStarts.displayMessage(move + "\n");
    }

    public void displayMissed() {
        CombatStarts.displayMessage("You missed your shot...\n");
    }

    public void displayCombatWin(String enemyName) {
        CombatStarts.displayMessage(enemyName + " has died! You won!\n");
    }

    public void displayCombatLose(String playerName) {
        CombatStarts.displayMessage(playerName + ", you have died...\n");
    }

    public void displayCombatOver() {
        CombatStarts.displayMessage("This combat is Over...\n");
    }

    public void displayLevelUp(int level) {
        CombatStarts.displayMessage("Congratulation! You have leveled up! You are now level " + level + "!\n");
    }

    public void displayPrepare() {
        CombatStarts.displayMessage("Prepare for the next battle...\n");
    }
    public void displayLine() {
        CombatStarts.displayMessage("-------------------------------------------------------");
    }
}