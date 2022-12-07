package presenters;

import ui.CombatStarts;

public class CombatPresenter {
    /*
    Returns the information from the CombatUseCase to the CombatStartsUI.
     */

    public CombatPresenter() {
    }

    public boolean hasInput() {
        return CombatStarts.hasInput();
    }

    public String getInput() {
        return CombatStarts.getInput();
    }

    public void displayMessage(String message) {
        CombatStarts.displayMesssage(message);
    }
}