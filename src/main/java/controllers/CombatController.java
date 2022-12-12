package controllers;

import usecases.CombatInterface;

public class CombatController {
    /*
    Connects the CombatStarts UI to the CombatUseCase use case.
     */
    private CombatInterface combatUseCase;

    public CombatController(CombatInterface combatUseCase) {
        this.combatUseCase = combatUseCase;
    }

    public void startCombat() {
        this.combatUseCase.startCombat();
    }
}
